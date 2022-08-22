# Employee Management Service Application

##Employee Management Application is a Spring Boot RESTful service app built using Spring Boot, Spring MVC, CRUD, and MySQL database.
**Project Type: Maven--

Download Spring Boot project as a zip file, unzip it, and import it into SpringToolSuite4.

#DATABASE: Configure MySQL Database.
## MySql database where 2 tables were created: Department & Employee. 
## To generate a datebase please use the following comand in MySql Workbrench:
```
create database n01454607_assignment2;
use n01454607_assignment2;
  
CREATE TABLE department(
  id int primary key,
  dep_name VARCHAR(70)
);
CREATE TABLE employee (
  id INT primary key,
  name VARCHAR(50),
  position VARCHAR(50),
  salary DECIMAL(7,2),
  dep_id INT
);
```
#Starting the App from your IDE:
> to run the Assignment2Application.main() method as a standalone Java class that will start the embedded Tomcat server on port 8080 and 
point the browser to [localhost:8080](http://localhost:8080/empRest).

#Testing CRUD REST APIs using Postman:
** Generating departments first **
To add, view all, delete or update a department using POST, GET, DELETE and PUt Http methods with the folloing paths:
```
http://localhost:8080/deptRest/addDepartment
http://localhost:8080/deptRest/departments
http://localhost:8080/deptRest/deleteDepartment/1
http://localhost:8080/deptRest/updateDepartment/2
```
** Then creating employees **
To add, view all, find one, delete or update an employee using POST, GET, DELETE and PUt Http methods with the folloing paths:
```
http://localhost:8080/empRest/addEmployee
http://localhost:8080/empRest/employees
http://localhost:8080/empRest/getEmployeeById/3
http://localhost:8080/empRest/deleteEmployee/3
http://localhost:8080/empRest/updateEmployee/3
```



