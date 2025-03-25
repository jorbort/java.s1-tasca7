# java.s1-task7
seventh task of the first sprint of the java bootcamp
this is meant to work as an introduction to annotations in java
## Exercises

### Level 1

#### Exercise 1

Create a hierarchy of objects with three classes: `Treballador`, `TreballadorOnline`, and `TreballadorPresencial`.

- The `Treballador` class has the attributes `name`, `surname`, and `hourlyRate`, as well as the method `calculateSalary()`, which takes the number of hours worked as a parameter and multiplies it by `hourlyRate`.
- The child classes must override this method using `@Override`.
- In the `main()` method of the `Principal` class, perform the necessary calls to demonstrate the functionality of the `@Override` annotation.
- For `TreballadorPresencial`, the salary calculation method should receive the number of hours worked per month and add a static attribute `gasoline` to the calculation.
- For `TreballadorOnline`, the salary calculation method should receive the number of hours worked per month and add a constant `internetFee` from the `TreballadorOnline` class.

#### Exercise 2

- Add some deprecated methods to the child classes and use the corresponding annotation.
- Invoke these deprecated methods from an external class while suppressing the warnings using the appropriate annotation.

### Level 2

#### Exercise 1

Create a custom annotation that allows serializing a Java object into a JSON file. The annotation should take as a parameter the directory where the resulting file will be placed.

### Level 3

#### Exercise 1

Modify the annotation created in the previous level so that it is registered by the Virtual Machine at runtime. Demonstrate its execution using Java Reflection to read the annotation.

## Getting Started

1. Clone this repository:
   ```sh
   git clone https://github.com/your-repo/java-exercises.git
2. Open the project in your preferred IDE (Eclipse or IntelliJ).

3. Compile and run the programs to test your implementations.
