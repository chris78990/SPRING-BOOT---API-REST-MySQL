# JAVA-SPRING---API-REST-MySQL

This Spring boot project allows to create a RESTFull API using MySQL database.<br>
The database instance name is ems and the login is root with no password.<br>

There are 1 unit test and 2 integration tests. 
The firstName of the first line must be Christophe.
The lastName  of the third line must be Bouvry.

2 tables are created.
The Person    table has 3 columns: id, first_name, last_name
The Employees table has 4 columns: id, first_name, last_name, mail, password


The <b>StudentController</b> class allows to discover the @GetMapping feature.
It uses ArrayList, @PathVariable and @RequestParam.

You can use these EndPoints with your browser:
http://localhost:9000/hello-world
http://localhost:9000/Student
http://localhost:9000/Students
http://localhost:9000/Student/bouvry/christophe
http://localhost:9000/Student/Qry?firstName=Christophe&lastName=Bouvry


The <b>ProductServiceController</b> allows to manage a simple RESTFull API.
At the startup, there are 2 lines with 2 fields ()


The RestFull API using MySQL is managed via the <b>EmployeeController</b> class.
4 actions can be done with <b>Employees</b> table with Postman :

Add a new employee
POST - http://localhost:9000/employee
Body JSON with 4 parameters: firstName, lastName, mail, password

Read an employee if he exists
GET - http://localhost:9000/employee/10

Read all employees
GET - http://localhost:9000/employees

Delete an employee
DELETE - http://localhost:9000/employee/10

Update an employee
PUT - http://localhost:9000/employee/4
Body JSON with 4 parameters: firstName, lastName, mail, password



There is no security yet (authentication).
