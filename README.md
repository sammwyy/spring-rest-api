<div align="center">
  <img src="https://raw.githubusercontent.com/sammwyy/spring-rest-api/main/docs/images/spring-icon.png" alt="Spring Logo" height="200px" />
  <img src="https://raw.githubusercontent.com/sammwyy/spring-rest-api/main/docs/images/spring-icon.png" alt="Java Logo" height="200px" />
  <h1>
</div>

<p align="center">
  <h1 align="center">Spring RestAPI</h1>
</p>

  <p align="center">A Rest API built with Java and Spring Framework.</p>
    <p align="center">
      <img alt="GitHub issues" src="https://img.shields.io/github/issues/sammwyy/spring-rest-api?color=FF0000&label=ISSUES&logo=gtihub&style=for-the-badge">
      <a href="https://paypal.me/samwy" target="_blank"><img src="https://img.shields.io/badge/Donate-PayPal-ff3f59.svg?style=for-the-badge&logo=paypal&color=00457C"/></a>
      <a href="https://twitter.com/sammwy" target="_blank"><img src="https://img.shields.io/twitter/follow/sammwy.svg?color=1DA1F2&style=for-the-badge&label=Follow&logo=twitter"></a>
      <img alt="GitHub contributors" src="https://img.shields.io/github/contributors/sammwyy/spring-rest-api?color=ff69b4&style=for-the-badge&logo=github%20sponsors">
      <img alt="GitHub Sponsors" src="https://img.shields.io/github/sponsors/sammwyy?color=EA4AAA&label=SPNSORS&logo=github%20sponsors&style=for-the-badge">
  </p>
</p>

<div align="center">
  <h3 align="center">🔨 Built with ⚙️</h3>
  <p align="center">
    <img height="42px" src=".." />
  </p>
</div>

### 📦 Build and Deploy

#### Compilation

To generate the jar file from source code and dependencies.

```bash
mvn package -f "c:\Users\Valen\Desktop\spring-rest\pom.xml"
```

#### Deployment

To run the jar file once compiled.

```bash
java -Xmx1G -Xms1G -jar ./target/springrest-1.0-SNAPSHOT.jar
```

### 🌐 Endpoints

#### GET /movies

Shows a list of current movies in the database.

#### POST /movies

Create a new movie entry and save it in memory.

#### GET /movies/{id}

Search for an existing entry by its ID.

#### PUT /movies/{id}

Modify an existing entry and update its values.

#### DELETE /movies/{id}

Delete an entry from the database.

### 🦴 Structures

#### Movie

```graphql
{
  id: Long?;
  name: String;
  description: String;
  category: String;
  release: int;
  rate: double
}
```

## ❤️ Support

If you want to get support you can do it via email (sammwy.dev@gmail.com) if what you want is to report a problem with the application then you can use the "issues" function.

## 📙 Stay in touch

- Author - [Valentina Avalos](https://twitter.com/sammwy)

## ⚠️ License

This project is [GPLv3 licensed](LICENSE)
