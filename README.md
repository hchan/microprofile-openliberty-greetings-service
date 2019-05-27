# microprofile-openliberty-greetings-service
See also 
* [spring-boot-greetings-service](https://github.com/hchan/spring-boot-greetings-service)
* [microprofile-thorntail-greetings-service](https://github.com/hchan/microprofile-thorntail-greetings-service)

## Build
`mvn package`

## Run
`java -jar target\*.jar`

## View in Browser
`http://localhost:9080/api/greeting`

## TODO
* get `GreetingGenerator` to use `ConfigProperty` properly
* figure out how to change the port from `9080` to `8080`
* add tests
