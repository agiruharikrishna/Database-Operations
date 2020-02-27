# 🗄️🗄️🖥️ Two-Tier Client-Server Application With MySQL and JDBC 🖥️🗄️🗄️
## Introduction
### Objectives
> To develop a two-tier Java based client-server application interacting with a MySQL
database utilizing JDBC for the connectivity. The project is designed to utilise
various features of JDBC and its interaction with a MySQL DB Server environment.
#### Gui
<image src="Resources/screenshots/mainGui.png">

### Description
* It is a Java-based GUI front-end (client-side) application that will connect to your MySQL server via JDBC.<br>
* The database contains two users; the root user(having all privileges) and client user(having only select privileges)
* To generate database run the script [script](Resources/script1.sql) in MySQL workbench
## Resources and packages used
>The application utilises the following resources and packages
* [Java Swing][1] -for building the graphical user inteface
* [MySQL workbench][2] - Database creation and Management
* [DbUtils][3] -populate result in table form. utilises the [net.proteanit.sql.DbUtils](https://commons.apache.org/proper/commons-dbutils/) package.First add [rs2xml.jar](https://hacksmile.com/wp-content/uploads/2019/06/rs2xml.zip) file in the project libraries
* [Sql][3] -Database queries
* [MySQL server][4] - Connection to localhost

[1]: https://www.javatpoint.com/java-swing
[2]: https://www.mysql.com/products/workbench/
[3]: https://docs.oracle.com/javase/tutorial/jdbc/basics/processingsqlstatements.html
[4]: https://www.mysql.com/