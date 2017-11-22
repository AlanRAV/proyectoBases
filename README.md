*********************************************
The purpose of this project is to give a recommendation of 5 games to play in Steam according to the time an user spends playing his games, right now it works by passing one game and gives recommendation with an algorithm that calculates a value form the coincidence of tags, the score rank given by the users and the players that have played a game since 2009.
*********************************************
Dependencies added on POM.xml file, using Maven
 <br>
Firebase Admin
  <dependencies>
        <dependency>
            <groupId>com.google.firebase</groupId>
            <artifactId>firebase-admin</artifactId>
            <version>5.2.0</version>
        </dependency>
 <br>
 GSON
        <dependency>
            <groupId>com.google.code.gson</groupId>
            <artifactId>gson</artifactId>
            <version>2.8.2</version>
        </dependency>
<br>
JSON
        <dependency>
            <groupId>com.googlecode.json-simple</groupId>
            <artifactId>json-simple</artifactId>
            <version>1.1</version>
        </dependency>
  <br>
 Google Services
        <dependency>
            <groupId>com.google.gms</groupId>
            <artifactId>google-services</artifactId>
            <version>3.0.0</version>
        </dependency>
 <br>   
Firebase Client
        <dependency>
            <groupId>com.firebase</groupId>
             <artifactId>firebase-client</artifactId>
             <version>2.2.4</version>
             <type>pom</type>
        </dependency>

        

    
 **************************************
 Execution
 To execute the project just import the project to your favorite IDE, make sure you have all the dependencies, run using the "lector" class as main, and click the button to have your recommendations 
***************************************
Customization
The project right now gives recommendation according to a given game from the top 100 games owned, you could choose a different game with its appid provided by Steam by changing the variable "juego" in NewJFrame class.
