Devo Coding Exercise - Palindromes
==================================

### Requirements
+ java 8
+ maven 3 
### Assumptions
+ Only letters (either alphabet symbols or numbers) are relevant for palindrome existance. 
+ One letter words are palindromes.
### How to build the app
+ Go to app root directory and execute:
```
mvn clean package
```
+ Move to target directory and execute:
```
java -jar palindromes-1.0-SNAPSHOT.jar
``` 
+ Introduce sentences to check if they are palindromes
+ Enjoy!

Big O running time for this algorithm is O(n) (assuming that replaceAll and toLowerCase methods performs at least as O(n))