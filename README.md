# GraphQL


# Create database
```bash
$ sudo /bin/bash
[sudo] password for bvpelt: 
$ root@pluto:/home/bvpelt# su postgres
$ postgres@pluto:/home/bvpelt$ createdb graphql
$ psql graphql
psql (12.1 (Ubuntu 12.1-1.pgdg19.10+1), server 11.6 (Ubuntu 11.6-1.pgdg19.10+1))
Type "help" for help.

graphql=# GRANT ALL PRIVILEGES ON DATABASE graphql TO testuser WITH GRANT OPTION;
GRANT
```
In another session:
```bash
$ psql -h localhost -U testuser graphql
Password for user testuser: 
Pager usage is off.
psql (12.1 (Ubuntu 12.1-1.pgdg19.10+1), server 11.6 (Ubuntu 11.6-1.pgdg19.10+1))
SSL connection (protocol: TLSv1.3, cipher: TLS_AES_256_GCM_SHA384, bits: 256, compression: off)
Type "help" for help.

```
Via endpoint http://localhost:8080/h2-console data can be examined

Via endpoint http://localhost:8080/graphiql data can be stored

```
mutation { 
    createVehicle(type: "car", modelCode: "XYZ0192", brandName: "XYZ", launchDate: "2016-08-16") 
    { id } 
}

mutation { 
    createVehicle(type: "car", modelCode: "mustang", brandName: "ford", launchDate: "2016-08-16") 
    { id } 

query {
    vehicle(id: 1) {
      type
      modelCode
      brandName
      launchDate
    }
}

query {
    vehicles(count: 10) {
      type
      modelCode
      brandName
      launchDate
    }
}
```

Query
``` 
{
  books(count: 10) {
    id
    name
    pageCount
    authors {
      id
      firstName
      lastName
    }
  }
}

{
  book(id: 1) {
    id
    name    
    authors {      
      firstName
      lastName
    }
  }
}

```
Mutation
``` 
mutation {
  createBook(name: "Jip en Janneke", pageCount: 125, authors: [
    {firstName: "Jan", lastName: "de Vries"},
    {firstName:"Karel", lastName:"de Grootte"},
    {firstName:"Peter", lastName:"Jansen"}
  ]) {
    id
  }
}
```

# References
See 
- https://dzone.com/articles/a-beginners-guide-to-graphql-with-spring-boot
- https://www.graphql-java.com/tutorials/getting-started-with-spring-boot/
- https://www.baeldung.com/spring-graphql
- https://www.howtographql.com/
- https://www.pluralsight.com/guides/building-a-graphql-server-with-spring-boot
- https://karl.run/2018/09/05/spring-boot-schema-first-graphql/
- https://www.baeldung.com/sql-logging-spring-boot
- https://repository.sonatype.org/