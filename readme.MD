# Quarkus simple customers api

### This project has the objective to help me understand more aboute the quarkus framework

## Tech

- Java 17
- maven
- quarkus
- resteasy-reactive-jackson 
- jdbc-h2
- panache
- hibernate orm
- lombok

## Controller

The controller package contain the logic of the api
endpoints

## Entity

The entity package contain the model used to mirror the h2 table used to store data in memory

## Repository

The repository package contain the implementation of panache repository, used to
do operations in the customers table

## Service

The service package contain the functions that call the repository injected in the class

## Endpoints

- `GET` localhost:8080/api/customers
- `POST` localhost:8080/api/customers

To call the post endpoint you'll have to give the json body that contains the customer data

```
{
    "id": 1,
    "name": "Joe",
    "lastName": "Doe",
    "age": 25,
    "email": "jondoe@email.com"
}
```

## Running the api

Aftter install the dependencies with `mvn install` type `mvn quarkus:dev` to run the api.</n>

By default it will run on port 8080 at `localhost`

