from flask import Flask
from flask_mail import Mail, Message
from flask import jsonify, request, Response
from werkzeug.security import generate_password_hash, check_password_hash
from flask_pymongo import PyMongo


app = Flask(__name__)
app.config['MAIL_SERVER']='smtp.gmail.com'
app.config['MAIL_PORT'] = 465
app.config['MAIL_USERNAME'] = 'sapo@gmail.com'
app.config['MAIL_PASSWORD'] = '**********************'
app.config['MAIL_USE_TLS'] = False
app.config['MAIL_USE_SSL'] = True
# connection with Mongodb
app.config['MONGO_URI'] = 'mongodb://localhost:27017/CarCompany'
mongo = PyMongo(app)
mail = Mail(app)


# route to login
@app.route("/", methods=['POST'])
def index():
    
    if request.method = 'POST':
        
        username = request.json['Username']
        password = request.json['Password']
        
        try:
            if username  and password:
                
                


            else:
                pass
        except Exception as e:

            return jsonify({
                    'status': str(e)
                })
    else:
        pass


# route to signup
@app.route("/signup", methods=['POST'])
def signup():
    
    if request.method == 'POST':

        try:
            credentials = request.json['Credentials']
            name = request.json['Name']
            last_name = request.json['LastName']
            email = request.json['Email']
            phone_number = request.json['PhoneNumber']
            address = request.json['Address']
            username = request.json['Username']
            password = generate_password_hash(request.json['Password']) # Saved password into the database
            object_id = mongo.db.users.insert({
                'identification':credentials,
                'names':name,
                'last_name':last_name,
                'email': email,
                'phone_number':phone_number,
                'address': address,
                'username':username,
                'password':password
                })


            # after this one, the data will be saved into the db Mongo
            # object response
            response.jsonify({'message': 'saved successfully'})
            response.status_code = 200
            return reponse


        except Exception as e:
            
            return jsonify({'status':str(e)})
    else:
        return jsonify({'status': 'bad request'})





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
