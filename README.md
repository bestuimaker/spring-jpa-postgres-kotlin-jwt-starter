# spring-jpa-postgres-kotlin-jwt-starter

This is a sample spring-boot kotlin and JWT starter kit with postgres as a database. 

## Before you start
This starter kit is using
- Java 17
- Spring-boot 3.0.4
- Postgres 13

## Database setup
Please create a database in postgres and update the database name and password in the ``application.property`` file.
```
spring.datasource.url=jdbc:postgresql://localhost:5432/bestuimaker
spring.datasource.username=postgres
spring.datasource.password=root
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=create-drop
```


## Start the application

Please run following command to clone the repo

```
git clone https://github.com/bestuimaker/spring-jpa-postgres-kotlin-jwt-starter.git
cd spring-jpa-postgres-kotlin-jwt-starter
mvn clean install 
```

Once the above all commands are successfully executed please up the application 

``mvn clean spring-boot:run``

This will launch the application in the default port ``8090`` specified in ``application.property`` file . You can modify this port anytime according to your need.

Once everything is up and running you please open the below URL in your browser and you will see the response ``Welcome to Spring-boot, Kotlin, JWT, Postgres starter kit by BestUIMaker``

``http://localhost:8090/``

To use the application let's save some of the sample roles in to the database so that we can use them while Signup for new login

``http://localhost:8090/save-roles``

``Server Response : 'Saved sample roles to database'``

Good Job!, 

### To Signup

``http://localhost:8090/api/auth/signup``

``Request type post``

Post body payload
```aidl
{
    "employeename" : "Tom",
    "email":"tom@gmail.com",
    "password": "tompassword",
    "roles": ["admin"]
}
```
```aidl
Server reponse

{
    "message": "Employee registered successfully!"
}
```

### To Login and get JWT 

``http://localhost:8090/api/auth/signin``

``Request type post``

Post body payload
```aidl
{
    "employeename" : "Tom",
    "password": "tompassword"
}
```
```aidl
Server reponse

{
    "accessToken": "<Generated_JWT_Token>",
    "id": 1,
    "employeename": "Tom",
    "email":"tom@gmail.com",
    "roles": [
        "ROLE_ADMIN"
    ],
    "tokenType": "Bearer"
}
```

For Details you can refer the detailed tutorial created by :

``https://www.knowledgefactory.net/2021/09/how-to-set-up-kotlin-spring-security-jwt.html
``

and

``https://www.bezkoder.com/spring-boot-security-postgresql-jwt-authentication/
``

