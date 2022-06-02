# Testcontainers with Spring Boot

## Depends on
* JDK11
* SpringBoot (Web, SpringDataJPA)
* MySQL5.7
* Docker & docker-compose

## Usage
### Run

```shell
# We assume you are in the top directory of the project.

# startup Mysql
cd infrastructure
docker-compose up -d

# startup SpringBoot app
cd ..
mvn spring-boot:run
```

### Test

```shell
# We assume you are in the top directory of the project.
mvn test
```

or 
Please run the test from IDE.