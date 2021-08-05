# SpringBootEmail
implementing Email Service by using Spring boot


**First We need to create an email app password**

To create an email password we need to go to email settings and create an app password by choosing another option and give the name of the application and it will generate a 16 digit code we can use in the email password to work for our application.

if you didn't see the app password in the email setting create 2 step verification for your Gmail then it shows to you then create app password 



To work with Email service we need to declare some application config properties 

**properties file**


```
## SERVER ##
server.port=8083 //i am yosing different port for my application
server.servlet.context-path=/email
## WEB MVC ##
spring.mvc.view.prefix=/WEB-INF/jsp/
spring.mvc.view.suffix=.jsp

spring.datasource.url=jdbc:mysql://localhost:3306/mydb
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.properties.hibernate.dailect=org.hibernate.dialect.MySQL5InnoDBDialect

spring.jpa.hibernate.ddl-auto=update

logging.level.org.hibernate.SQL=DEBUG
logging.level.org.hibernate.type=TRACE

## Email ##
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=babasadiq3950@gmail.com
spring.mail.password=ibdpjckekgfmtiho
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
spring.mail.properties.mail.smtp.starttls.required=true


```

We need to create an object for 'MimeMessage' which is similar to the new Message in the mail application

spring provided one helper class 'MineMessageHelper' to construct object for 'Minemessage'


To send files we uesd FileResource class


