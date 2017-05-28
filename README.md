# log-param-spring-boot-starter
log param spring boot starter

## Usage

### pom.xml

```xml
<dependency>
    <groupId>com.github.ztmark</groupId>
    <artifactId>log-param-spring-boot-starter</artifactId>
    <version>0.0.1-SNAPSHOT</version>
</dependency>
```

### Annotation

```java
class DemoService {
    @LogParam
    public String greeting(Person person) {
        return "Hello " + person.getName();
    }
}
```

### properties

disable log param

```properties
log-param.disable=true
```