# MHP Developer Boot Camp
Hello and welcome to our coding challenges! 

All of these challenges will build on each other, 
so when you finish the first that will be your starting point for the second one :)

I have provided some instructions if you want to start from where you should have ended the last challenge. 
That way we should all be starting each challenge at the same point!

So let's go ahead and get started!!

## Coding Challenge #1 Setup
These are the steps you need to take to go ahead and get started with this challenge.
1. First you will need to go ahead and clone the project. <br/>
   <code>git clone https://github.com/AlexAichinger/mhp-grow.git </code>
2. Go ahead and checkout the tag I have created to get you to the initial setup. <br/>
   <code>git checkout tags/challenge1 -b <branch_name></code>

Our challenge will be to setup the controller needed for our application. The application will be able to take a list of names and go ahead and 
split the list into groups of a given size. Therefore, we will need a controller to accept a list of strings and an integer. Go 
ahead and get started!

If you need some extra help on how to do it go ahead and follow the step by step bellow:

3. Next throw the code in your IDE of choice, and you are ready to get started.
4. Go ahead and after the project is imported, try and run the project. 
   You should see that the application starts up without any issues.
5. Next we will add some Spring magic to go ahead and create a REST endpoint for us to play with.
We will need a new class that will act as our controller.
6. Afterward annotate the new class with the following. <br/>
   <code>@RestController</code>
7. Create a new method we with the name of your choice, 
   returning a String, "Hello World", and the following annotation <code>@GetMapping</code>
8. Now go ahead and use Postman to call your application, or use the following command <code>curl localhost:8080</code>. <br />
   You should see our hello world as a response.
   
### Example Controller
```
@RestController
public class HelloWorldController { 
  @GetMapping
  public String helloWorld() { 
    return "Hello World";
  } 
}
```

<b>Bonus:</b> I have added swagger into the base project, so you should be able to see your endpoint if you go to localhost:8080/swagger-ui/

## Coding Challenge #2 Unit Testing
These are the steps you need to take to go ahead and get started with this challenge.
1. Go ahead and checkout the tag I have created to get you to the initial setup. <br/>
   <code>git checkout tags/challenge2 -b <branch_name></code>
   
Here we will be testing some existing logic. We have built the service to include a little bit of logic, and you are tasked to write some unit 
tests. What exactly the unit tests will be testing is up to you. 

Some suggestions are:
- testing the number of groups returned
- testing the controller to ensure it returns the expected results

For help reach out to us or go ahead and ask your virtual neighbor if they could help.

If you finish early go ahead and see what new unit tests you can come up with, or help any people that may be having trouble.

## Coding Challenge #3 Fix the Bug
These are the steps you need to take to go ahead and get started with this challenge.
1. Go ahead and checkout the tag I have created to get you to the initial setup. <br/>
   <code>git checkout tags/challenge3 -b <branch_name></code>

In this challenge the application has gotten a bit more confusing. There are a couple failing unit tests within the project that you have to go 
ahead fix. Teak the logic of the application to return the value that the unit test expects.

For help reach out to us or go ahead and ask your virtual neighbor if they could help.

<b>Disclaimer:</b> this code does not follow any best practices and was created to make for an interesting challenge.