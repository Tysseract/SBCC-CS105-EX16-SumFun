## Exercise SumFun (18 Points)

The purpose of this assignment is to learn how to work with iteration as well as how to write all of your own code and Javadoc comments.

### Problem Description

This problem is inspired by the book's Problem R6.2, parts a, b, c and d on page 293.

You are going to write program that takes 3 numbers from the command line (i.e. the input is in `String args[]`) and then does some fun sums. For part a, add the sum of all the even numbers from 2 to 100. For part b, add all the squares for the numbers from 1 to 100. For part c, add all the numbers from `a` to `b`, which are the first two arguments in `String args[]`. Finally, for part d, add all the odd digits for a number given in `args[2]`.

### Getting Started

There is no code to copy for the assignment. You get to do it all! Don't forget to provide proper Javadoc documentation.

We are going to do this exercise by writing the object that solves the problem first (in a source file called TicketSeller.java) and then testing it using code we write into **SumFun.java**. Using the techniques shown on the web page titled [How to Start Every Project in this Class](http://crowd.cs.sbcc.edu:7990/projects/CS105F2016/repos/allan.knight/browse/HowToStartEveryProject.md) to create a source file called **SumFun.java**. This is where your code will go. 

### Testing Your Code

Your **SumFun.java** should contain code with your solution for SumFun. 

Your output should look something like this for the arguments `1 10 123456789`:

```
a. Sum of even = 2550
b. Sum of squares = 338350
c. Sum of odd numbers 1 to 10 = 25
d. Sum of odd digits in 123456789 = 25
```

Once you've written your code run the code by single clicking on **SumFun.java** in the package explorer and selecting **Run->Run** from the menu or using the keyboard shortcut. Remember to update the run configuration so you can pass the word on the command line (See the MontyHallParadox assignment if you forget). Examine the output. Does it do what you want? If not, how can you modify the code to do what you want?

### Running the Unit Tests

Next you'll want to run these unit tests. Start by right-clicking on the `unittest.cs105` package and selecting **Run As -> JUnit Test**. 

To go back to the project view, select the **Package Explorer** tab.

### How to turn in this exercise

The first step of turning in your code is to commit and push your code to GitHub. Once you've completed this step your code will be on GitHub in your repository, not the repository for the class. This will allow you to use all your projects later as a portfolio.

To start the process write click your project and select **Team -> Commit...** and follow the usual procedures.

#### Completing the turn-in process


Now to complete the turn-in process, once you confirmed that your code is on BitBucket, you need to create a **build plan** on Bamboo. This action will create a Bamboo build plan that will build and test your code every time you push code to your project. You can also run builds manually

Follow the directions in [How to Turn in Every Project in This Class](http://crowd.cs.sbcc.edu:7990/projects/CS105F2016/repos/allan.knight/browse/HowToTurnInEveryProjectInThisClass.md)

**NOTE** You do not need to anything on Canvas to turn-in your assignment, but your grade will be posted on there so that you may track your progress throughout the term.
