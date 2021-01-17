from flask import Flask
from flask_mail import Mail, Message
from flask import jsonify, request, Response
from werkzeug.security import generate_password_hash, check_password_hash



app = Flask(__name__)
app.config['MAIL_SERVER']='smtp.gmail.com'
app.config['MAIL_PORT'] = 465
app.config['MAIL_USERNAME'] = 'sapo@gmail.com'
app.config['MAIL_PASSWORD'] = '**********************'
app.config['MAIL_USE_TLS'] = False
app.config['MAIL_USE_SSL'] = True
mail = Mail(app)




@app.route("/", methods=['GET','POST'])
def index():
    
    if request.method = '':
        
        username = request.json['Username']
        password = request.json['Password']
        
        try:
            if username and password:
                pass
            else:
        except Exception as e:

            return jsonify({
                    'status': str(e)
                })



    else:
        pass








@app.route("/android", methods=['GET','POST'])
def index():
    
    if request.method == "POST":
        print(request.json)
        msg = Message('CAR SERVICE. Detail service', sender = 'sapo@gmail.com', recipients = [request.json['Email']])
        msg.body = "Purchase: "+str(request.json['service'])+", by: "+str(request.json['Fullname'])
        mail.send(msg)
        return jsonify({
            
                'status':'email sended'
            })
    else:
        '''msg = Message('Hello', sender = 'sapo@gmail.com', recipients = ['sapo@outlook.com'])
        msg.body = "Purcahse confirmed"
        mail.send(msg)'''
        return "Hello android"



if __name__ == "__main__":
    app.run(port= 4000, debug=True)
