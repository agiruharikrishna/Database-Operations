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
* To generate database run the script [script](Resources/scripts/script1.sql) in MySQL workbench
## Resources and packages
>The application utilises the following resources and packages
* [Java Swing][1] -for building the graphical user inteface
* [MySQL workbench][2] - Database creation and Management
* [DbUtils][3] -populate result in table form. utilises the [net.proteanit.sql.DbUtils](https://commons.apache.org/proper/commons-dbutils/) package.First add [rs2xml.jar](https://hacksmile.com/wp-content/uploads/2019/06/rs2xml.zip) file in the project libraries
* [Sql][4] -Database queries
* [MySQL server][5] - Connection to localhost

[1]: https://www.javatpoint.com/java-swing
[2]: https://www.mysql.com/products/workbench/
[3]: https://commons.apache.org/proper/commons-dbutils/
[4]: https://docs.oracle.com/javase/tutorial/jdbc/basics/processingsqlstatements.html
[5]: https://www.mysql.com/

### Screenshots
* From queris by root user in [script](Resourses/scripts/rootCalls.sql)
    * [select *](Resources/screenshots/root_select*.png)
    * [select specified](Resources/screenshots/root_selectSpecified.png)
    * [insert ](Resources/screenshots/root_insert.png)
    * [delete ](Resources/screenshots/root_delete.png)
    * [update](Resources/screenshots/root_update.png)
* From queris by client user in [script](Resourses/scripts/clientCalls.sql)
    * [select *](Resources/screenshots/client_select*.png)
    * [select specified](Resources/screenshots/client_selectSpecified.png)
    * [insert ](Resources/screenshots/client_insert.png)
    * [delete ](Resources/screenshots/client_delete.png)
    * [update](Resources/screenshots/client_update.png)
