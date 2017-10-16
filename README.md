# Todolist-Spring Project!

* To start the Database Server: `docker run --rm -i -p 5432:5432 --name todolist-postgres-test -e POSTGRES_PASSWORD=todolist -e POSTGRES_USER=todolist -e POSTGRES_DB=todolist postgres:9.6.5-alpine`
* To build the project: `./gradlew clean build`
* To start the Project: `./gradlew bootRun`
