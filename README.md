[![CI/CD Pipeline](https://github.com/JhonUsuga/labFake/actions/workflows/build.yml/badge.svg)](https://github.com/JhonUsuga/labFake/actions/workflows/build.yml)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=JhonUsuga_labFake&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=JhonUsuga_labFake)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=JhonUsuga_labFake&metric=bugs)](https://sonarcloud.io/summary/new_code?id=JhonUsuga_labFake)
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=JhonUsuga_labFake&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=JhonUsuga_labFake)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=JhonUsuga_labFake&metric=coverage)](https://sonarcloud.io/summary/new_code?id=JhonUsuga_labFake)
[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=JhonUsuga_labFake&metric=ncloc)](https://sonarcloud.io/summary/new_code?id=JhonUsuga_labFake)
[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=JhonUsuga_labFake&metric=reliability_rating)](https://sonarcloud.io/summary/new_code?id=JhonUsuga_labFake)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=JhonUsuga_labFake&metric=security_rating)](https://sonarcloud.io/summary/new_code?id=JhonUsuga_labFake)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=JhonUsuga_labFake&metric=sqale_rating)](https://sonarcloud.io/summary/new_code?id=JhonUsuga_labFake)
[![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=JhonUsuga_labFake&metric=sqale_index)](https://sonarcloud.io/summary/new_code?id=JhonUsuga_labFake)
[![Known Vulnerabilities](https://snyk.io/test/github/dbotia/faker/badge.svg)](https://snyk.io/test/github/JhonUsuga/labFake)

Implementation of a Simple App with the next operations:

* Get random nations
* Get random currencies
* Get random Aircraft
* Get application version
* health check

Including integration with GitHub Actions, Sonarqube (SonarCloud), Coveralls and Snyk

### Folders Structure

In the folder `src` is located the main code of the app

In the folder `test` is located the unit tests

### How to install it

Execute:

```shell
$ mvnw spring-boot:run
```

to download the node dependencies

### How to test it

Execute:

```shell
$ mvnw clean install
```

### How to get coverage test

Execute:

```shell
$ mvwn -B package -DskipTests --file pom.xml
```
