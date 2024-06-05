#### Simple project for showing the usage of the Java 9 Platform Module System (JPMS)

Compiling and running the project:
- compiling on Linux/Mac: `javac -d out --module-source-path "./*/src/" $(find . -name "*.java")`
- compiling on Windows: 
  - `javac -d out/entity entity/src/module-info.java^ entity/src/com/great/project/entity/Product.java`
  - `javac --module-path out out/repository repository/src/module-info.java repository/src/com/great/project/repository/ProductRepository.java`
  - `javac --module-path out out/service service/src/module-info.java repository/src/com/great/project/service/ProductService.java`
  - `javac --module-path out out/client client/src/module-info.java client/src/com/great/project/client/Main.java`
- running the project: `java --module-path out -m client/com.great.project.client.Main`