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

The current mappings are [Custom Converters](http://dozer.sourceforge.net/documentation/customconverter.html) based.
Dozer provides (at least) two ways to integrate custom converters. Via XML file or the API. Although the API is the
newer one and recommended, the converters must be implemented via XML file because the API does not work (see
[#242](https://github.com/DozerMapper/dozer/issues/242). Regarding the
[documentation](http://dozer.sourceforge.net/documentation/customconverter.html) the custom converters must be specified
in the global configuration block. The current library comes with a corresponding configuration which can be enabled by
the code snippet below, if a configuration block does not already exist, because Dozer does not allow to specify
multiple configuration blocks. In this case the configuration block of the
[dozerJdk8Converters.xml](src/main/resources/dozerJdk8Converters.xml) file must be taken over.

```java
List<String> mappingFiles = new ArrayList();
mappingFiles.add("dozerJdk8Converters.xml");

DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();
dozerBeanMapper.setMappingFiles(mappingFiles);
```

## License

[MIT License](LICENSE.md)
