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

Regarding the [dozer custom bean configuration documentation](http://dozer.sourceforge.net/documentation/custombeanfactories.html)
, the current library can be enabled by specify the `Jdk8CompatibilityBeanFactory` as default bean factory like below.

```xml
<?xml version="1.0" encoding="UTF-8"?>
<mappings xmlns="http://dozer.sourceforge.net"
          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
          xsi:schemaLocation="http://dozer.sourceforge.net
          http://dozer.sourceforge.net/schema/beanmapping.xsd">
    <configuration>
        <bean-factory>io.craftsman.Jdk8CompatibilityBeanFactory</bean-factory>
    </configuration>
</mappings>
```

The mapping file above must be specified for usage like the code snippet below.

```java
List<String> mappingFiles = new ArrayList();
mappingFiles.add("dozerGlobalConfiguration.xml");

DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();
dozerBeanMapper.setMappingFiles(mappingFiles);
```

## License

[MIT License](LICENSE.md)
