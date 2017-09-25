# rest-example
A sample Java application which stores data in an in-memory database that serves it back in a JSON format

# How to Run
  1) Clone this repositiory
  2) Make sure you have Java and Maven installed
  3) You can build the project using `mvn clean package`
  4) Once successfully built you can run the project using `mvn spring-boot:run`
  
# How to add data in Database
  1) Use curl to check server content
  2) Using the command `curl localhost:8080` will show you the contents
  3) Use POST to add data in database using command `curl -i -X POST -H "Content-Type:application/json" -d '{ "firstName" : "Shriram", "lastName" : "Kulkarni", "employeeId" : "101" }' localhost:8080/employees`
  
# How to access the Server and Database contents
  1) When we call GET on the server it will display links
  2) `http://localhost:8080/profile` is a link to ourself
  3) `http://localhost:8080/employees` is the link to database in which we can add data
  4) To see existing data in the database use `curl http://localhost:8080/employees`
  5) When you POST the data it will give a url `http://localhost:8080/employees/1` which is the link using which we can assess      the data
  6) To see the contents of database use `curl http://localhost:8080/employees`
  7) To see a specific content in database use `curl http://localhost:8080/employees/1`
