from flask import Flask
from flask_mail import Mail, Message
from flask import jsonify, request, Response

app = Flask(__name__)
app.config['MAIL_SERVER']='smtp.gmail.com'
app.config['MAIL_PORT'] = 465
app.config['MAIL_USERNAME'] = 'negreirosarturo@gmail.com'
app.config['MAIL_PASSWORD'] = 'DreamOn1992'
app.config['MAIL_USE_TLS'] = False
app.config['MAIL_USE_SSL'] = True
mail = Mail(app)

@app.route("/android", methods=['GET','POST'])
def index():
    
    if request.method == "POST":
        print(request.json)
        msg = Message('CAR SERVICE. Detail service', sender = 'negreirosarturod@gmail.com', recipients = [request.json['Email']])
        msg.body = "Purchase: "+str(request.json['service'])+", by: "+str(request.json['Fullname'])
        mail.send(msg)
        return jsonify({
            
                'status':'email sended'
            })
    else:
        '''msg = Message('Hello', sender = 'negreirosarturo@gmail.com', recipients = ['anegreiross@outlook.com'])
        msg.body = "Purcahse confirmed"
        mail.send(msg)'''
        return "Hello android"



if __name__ == "__main__":
    app.run(port= 4000, debug=True)
