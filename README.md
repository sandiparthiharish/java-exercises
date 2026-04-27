# Java Exercises

Small Java practice project (Maven + JUnit) with a few self-contained exercises.
Each exercise class has methods marked `TODO` that you implement, and unit tests you can run to verify behavior.

## Requirements

- Java 25 (see `pom.xml`)
- Maven 3.x

## Project Layout

- `src/main/java/com/harish/java/`
  - `controlflow/`
    - `NumberAnalyzer.java` (Exercise 1)
    - `GradeCalculator.java` (Exercise 2)
  - `strings/`
    - `StringProcessor.java` (Exercise 3)
  - `collections/`
    - `ShoppingCart.java` (Exercise 4)
- `src/test/java/com/harish/java/` (tests grouped by Java concept)
  - `controlflow/`
    - `NumberAnalyzerTest.java`
    - `GradeCalculatorTest.java`
  - `strings/`
    - `StringProcessorTest.java`
  - `collections/`
    - `ShoppingCartTest.java`

## Build / Test

Run all tests:
```sh
mvn test
```

Run a single test class (useful when other exercises are still unimplemented):
```sh
mvn -Dtest=GradeCalculatorTest test
mvn -Dtest=StringProcessorTest test
mvn -Dtest=ShoppingCartTest test
```

Run multiple specific test classes:
```sh
mvn -Dtest=GradeCalculatorTest,StringProcessorTest test
```

## How To Work Through The Exercises

1. Create a new branch for your work:
   ```sh
   git checkout -b your-name/exercises
   ```
2. Open the exercise file in `src/main/java/com/harish/java/`.
3. Implement the methods that currently throw `UnsupportedOperationException`.
4. Re-run the matching unit test class until it passes.

Notes:
- Many methods require a specific Java construct (for-loop, for-each, while, do-while, switch expression, etc.). Those requirements are in the Javadoc for each method.
- Some constants/inner classes are intentionally `private` to encourage using the public APIs.
