<!-- 
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.ahmadshadab/daata/badge.svg?style=plastic)](https://maven-badges.herokuapp.com/maven-central/com.github.ahmadshadab/daata)
-->
A simple Java library to generate test data of type String, Number and Boolean.

#### Dependency:
   ```xml     
        <dependency>
             <groupId>com.github.ahmadshadab</groupId>
             <artifactId>daata</artifactId>
             <version>${latest.version}</version>
         </dependency>
```

#### Usage:
```java
import com.github.ahmadshadab.daata.*;
// get a single random string value
String value = StringGenerator.getString();

// get a collection random numbers
Collection<Long> values = NumberGenerator.getNumbers();
```

#### License:
[APACHE LICENSE, VERSION 2.0](https://www.apache.org/licenses/LICENSE-2.0)
