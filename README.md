# Test project Store
Store project backend in Java using Spring Boot. For storing products and checkout transaction
used H2 embedded database.

### To run project in developer mode
In Linux and macOS
```bash
./gradlew bootRun
```
In Windows
```bash
gradlew.bat bootRun
```
If you want to run only backend without client add -x buildClient e.g.  
In Linux and macOS
```bash
gradlew.bat bootRun -x buildClient
```
In Windows
```bash
gradlew.bat bootRun -x buildClient
```
### To build project
In Linux and macOS
```bash
./gradlew buildClient bootJar
```
In Windows
```bash
gradlew.bat buildClient bootJar
```
### To run jar in production mode
In Linux macOS and Windows 
```bash
java -jar build/libs/bookstore-0.0.1-SNAPSHOT.jar 
```

## Creator

**Talgat Akunsartov**

* <https://twitter.com/aktalgatt>
* <https://github.com/aktalgat>

## Copyright and license

The code is released under the [MIT license](LICENSE?raw=true).

---------------------------------------

Please feel free to send me some feedback or questions!
