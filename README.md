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
http://localhost:9000/students/hello-world
http://localhost:9000/students/owner
http://localhost:9000/students
http://localhost:9000/students/bouvry/christophe
http://localhost:9000/students/Fadatare/ramesh
http://localhost:9000/students/Qry?firstName=Christophe&lastName=Bouvry


The <b>ProductServiceController</b> allows to manage a simple RESTFull API.
At the startup, there are 2 lines with 2 fields (id, name).
In Postman, we can see a feebback like "Product is delete successfully".

Read all products (2 lines)
GET - http://localhost:9000/products

Add one product
POST - http://localhost:9000/products

Update one product (the second line)
PUT - http://localhost:9000/products/2

Delete one product
DELETE - http://localhost:9000/products/3
	
	
The RestFull API using MySQL is managed via the <b>EmployeeController</b> class.
4 actions can be done with <b>Employees</b> table with Postman :

Add a new employee
POST - http://localhost:9000/employee
Body JSON with 4 parameters: firstName, lastName, mail, password

Read an employee if he exists
GET - http://localhost:9000/employee/1

Read all employees
GET - http://localhost:9000/employees

Delete an employee
DELETE - http://localhost:9000/employee/5

Update an employee
PUT - http://localhost:9000/employee/1
Body JSON with 4 parameters: firstName, lastName, mail, password


The error management and security (authentication) is not managed yet.
