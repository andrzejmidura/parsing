## Parsing to xml
Simple csv/xlsx to xml parser using JAXB

## How to run
- insert your csv/xml into ./main/src/main/java/resources (there is already faktury-sprzedazowe-test.csv)
- run maven<br>```mvn clean install``` 
- then ```java -jar .\main\target\main-1.0-SNAPSHOT.jar yourFile.csv output.xml```<br>or ```java -jar .\main\target\main-1.0-SNAPSHOT.jar yourFile.xlsx output.xml```<br><br>e. g.: ```java -jar .\main\target\main-1.0-SNAPSHOT.jar faktury-sprzedazowe-test.csv output.xml```