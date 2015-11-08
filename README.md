dozer-jdk8-support
==================

A library that provides the missing Java 8 type mappers for the [Dozer](https://github.com/DozerMapper/dozer) Java Bean
Mapper.

## Usage

The library is not yet published on a common maven repository for what reason the repository below must be added to the
POM file of the project.

```xml
<repositories>
  <repository>
    <id>git-GeBeater</id>
    <name>GeBeater\'s Git based repo</name>
    <url>https://github.com/GeBeater/maven-repository/raw/master/</url>
  </repository>
</repositories>
```

If the repository has been added, the maven dependency can be used in the affected project like below.

```xml
<dependency>
  <groupId>io.craftsman</groupId>
  <artifactId>dozer-jdk8-support</artifactId>
  <version>1.0-SNAPSHOT</version>
</dependency>
```

## License

[MIT License](LICENSE.md)
