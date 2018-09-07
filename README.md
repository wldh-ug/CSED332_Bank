# Homework 1
> **[Jio Gim](mailto:jio.gim@postech.edu)**, Creative IT Engineering, POSTECH  
> **Student ID:** 20160087, **Povis ID:** iknowme

## Answers

Answers to questions in [homework1.pdf](homework1.pdf).

1. I can auto-format code in Eclipse by pressing buttons below.  
    <kbd>&#8984;(Ctrl)</kbd> + <kbd>&#8679;(Shift)</kbd> + <kbd>F</kbd>
  
2. In Eclipse, I can quickly comment/uncomment a chunk of code using shortcuts after select code. Without selecting code, only single line where the caret positions will be comment/uncommented.  
    - **Line Comment (//):** <kbd>&#8984;(Ctrl)</kbd> + <kbd>/</kbd>
    - **Block Comment (/\*\*/):** <kbd>&#8984;(Ctrl)</kbd> + <kbd>&#8679;(Shift)</kbd> + <kbd>/</kbd>

3. <kbd>&#8984;(Ctrl)</kbd> + <kbd>&#8679;(Shift)</kbd> + <kbd>T</kbd> shortcut is *Open Type* command. This opens reference codes about specified types.  

## Specificites

#### Strange Limitation: "The balance of HighInterest account should always bigger or equal to 1000."

The comment introduction on [HighInterest.java](src/edu/postech/csed332/homework1) says "The balance of HighInterest account should always bigger or equal to 1000." So how about when create high interest account with initial balance lower than 1000? Unfortunately, in test main code, there was no any exception handler on *createAccount* function. **So, in my code, when if the initial value is lower than 1000 in creating high interest account, it will modified to 1000 to meet the limitation.**

#### Floating Point Problem

The test code from skeleton code says that the result of `100000. * Math.pow(1.01, 20)` is **122019.0039947967**<b><u>2</u></b>. But in my execution, the result was **122019.0039947967**. I still does not know how that <b><u>2</u></b> comes.
