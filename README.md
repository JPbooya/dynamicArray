# dynamicArray

An assignment to understand how dynamic arrays work. Have one partner fork this repo and invite the other as a collaborator. When you are finished, make a PR against the original repository and have BOTH PARTNERS submit a link to the PR on Canvas.

## Instructions

For this assignment you will make a new class `DynamicStringList` that implements the provided `StringList` **interface AND WRITE JUnit TESTS FOR IT**. You will need to make a new file for your class! Do NOT edit `StringList.java`

Use a static backing array to implement your solution. DO NOT USE ANY COLLECTIONS METHODS OR CLASSES (e.g. do not use `ArrayList`).

Write JUnit tests to verify the functionality of your list. You can use the below command to run your tests.

## JUnit Command

```
javac -cp lib/junit-platform-console-standalone-1.11.2.jar src/*.java && java -jar lib/junit-platform-console-standalone-1.11.2.jar --class-path src --scan-class-path
```