# Displaying User Feedback -- HCL ASSESSMENT

## Description
Create a Spring Boot project that will capture user feedback using a REST endpoint. The REST resource will take in parameters using HTTP POST. The feedback data will be then added to a database table.

## Steps
1. Run the DisplayFeedbackApplication.java file located in the src/main/java/com/hcl/displayFeedback folder.
2. Open your browser and go to http://localhost:8083/feedback to view any feedback objects you may have
3. Go the folder 'frontendCode' and run the index.html file. Go to the localhost (Easy to use through VSCode) and you'll see the feedback form.
4. Input a String description and a Number rating, then press Submit!
5. You can go to http://localhost:8083/feedback to see you're newly added feedback object

## Requirements
- Eclipse as the IDE
- Apache Tomcat as the web server
- Spring Boot with Hibernate
- Create a MySQL table named feedback for storing feedback data
- An entity class Feedback should be made with annotations to link it with the - feedback table
- A repository class should then map the entity class to the CrudRepository - interface
- Create a REST controller class to create the REST endpoint. It should take in - parameters using the POST protocol
- Data received in the REST controller will be then saved into the database
- Create a test form in HTML to submit data to the REST endpoint to ensure it’s - working
- The step-by-step process involved in completing this task should be documented