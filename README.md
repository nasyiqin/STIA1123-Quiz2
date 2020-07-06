#### 1. What will be the output when running the above code?
<img src="https://user-images.githubusercontent.com/55252513/86572186-2f29d080-bfa5-11ea-8ef0-fbd4dd250a60.png" height="150" width="420">

#### 2. What is meant by polymorphism ?
polymorphism has two type: overriding & overloading. 

• overriding is method name in subclass has same name with method in superclass.

• overloading is a class has several methods with same name but different parameter types.

#### 3. How does polymorphism work in the above program?
Cat class and Dog class override method introduceYourself() from Animal class.

#### 4. The method introduceYourself of Animal appears to be never called? Why not?
method introduceYourself() never called in main method of Lab1Stage1. none.

#### 5.Comment out the method introduceYourself in Dog. What happens now when you run the program?

```java 
Dog d = new Dog();
d.introduceYourself();
```

##### output

<img src="https://user-images.githubusercontent.com/55252513/86570287-44e9c680-bfa2-11ea-9d59-0c52ed58742d.png" height="150" width="350">

#### 6. Where is the name stored for the instances of Cat and Dog? (In what / which classes did you put the instance variable that refers to the name of the animal? Both Cat and Dog, or just in Animal?)
stored in array allAnimals[3] in Animal class.

#### 7. How does the code in the test program work?



#### 8. How does an array work?
to store datas of name for cats and dog.


#### 9. In the above programs we have used a while loop to step through the array and to get information about the animals. But there is a more appropriate loop statement here. What is it?
for loop.


