#echoserver
To build and run the project run following commands in this sequence:
1. mvn install
2. java -jar target/echoserver-0.0.1-SNAPSHOT.jar

After this in order to see the result navigate to "localhost:8080/helloworld" in your browser.
You are expected to see a first entry of a db table called "entries".

In order to change the viewed message do following steps:
1. navigate to "localhost:8080/h2-console" in your browser.
2. set the login fields to: Driver Class = "org.h2.Driver", JDBC URL = "jdbc:h2:mem:testdb", User name = "sa", password = "password" and press connect
3. Update db entry with simple sql querry: "UPDATE ENTRIES SET TEXT = '*insert text here*'"
4. Refresh "localhost:8080/helloworld" to see updated message
