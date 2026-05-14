# ai_java_starter

AI管家创建的 Java 基础项目模板。

## 项目结构

```
ai_java_starter/
├── pom.xml
└── src/
    ├── main/
    │   └── java/com/ai/starter/
    │       └── Main.java
    └── test/
        └── java/com/ai/starter/
            └── MainTest.java
```

## 环境要求

- Java 17+
- Maven 3.8+

## 运行

```bash
mvn compile exec:java -Dexec.mainClass="com.ai.starter.Main"
```

## 测试

```bash
mvn test
```
