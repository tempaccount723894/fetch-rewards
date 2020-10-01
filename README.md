# fetch-rewards

To get this working I used Spring Boot and Java

# Usage

1. Java installed and accesible from the command line
2. git installed
3. ``` git clone https://github.com/tempaccount723894/fetch-rewards.git ```
4. ``` java -jar target/fetch-rewards-0.0.1-SNAPSHOT.jar ```
5. Open a web browser
6. For example enter: ``` http://localhost:8080/version?first=1.3&second=1.3 ``` and you should see a JSON output

# Examples

### Equal
``` http://localhost:8080/version?first=1.3&second=1.3 ```

### Before
``` http://localhost:8080/version?first=1&second=2 ```

### After
``` http://localhost:8080/version?first=2.1&second=1.2 ```

# Notes
If you have something running on port 8080 you will have to close it
