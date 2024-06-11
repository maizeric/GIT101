"use strict";//To disable hoisting
var x=3;
console.log(typeof x);
var y="Srikanth";
var z =false;
var a =Symbol('symbol');
var b=undefined;
var c=null;
//All these are primitive data types -> number,string,bigint,boolean,undefined
console.log(typeof y);
console.log(typeof z);
console.log(typeof a);

console.log(typeof b);
console.log(typeof c);

//Non Primitive data types -> object
var employee = {
    id:1,
    name:'Srikanth'
}
console.log(typeof employee);

//Hoisting->variable and function declarations are moved to top
d=5;
console.log("The value of d is ",d);
var d;

hoistedFunction();

function hoistedFunction() {
    var x=5;
    console.log("the value of x is ",x);
}

//debugger->to stop at a certain point and check certain values.
//== -> compares value only
//=== -> compares value and type as well

//var->it is having function scope
//let->it is having block scope


//Type Coercion
//1.String Coercion -> Takes place using '+' operator
var x=3;
var y='Hello';
var z=x+y;
console.log("The value after string coercion is ",z);

//2.When using '-' it converts to number
var x=3;
var y='3';
var z = x-y;
console.log("The value of z is ",z)

var x=3;
var y='Sri';
console.log("The value of z is ",(x-y));//Gives Nan(Not a number) error
//3.Boolean Coercion->
var x=0;//->falsy
var y=23;//->truthy
if(x) console.log(x);
if(y) console.log(y);

//Logical operators
var z = x||y
var a=x&&y
console.log("teh value of z is ",z);
console.log("the value of a is " ,a);

//In JS primitive data types are passed by value and non-primitive by reference

//Immediately Invoked function in JS
//Syntax is 

(function(){
    console.log("Hi this in IIFE")
})()
//while executing JS code, whenever the compiler sees the word "function", it assumes that
//we are declaring a function in code.if we dont use first set of paranthesis the compiler
//throws a error that function should always has a name
//Second set of paranthesis->our code should as soon as it is defined

//What is meant by Strict mode in JS

//Higher Order functions in JS -> Functions that operate on other functions either by taking them
//as arguments or by returning them, are called higher-order functions
function higherOrder2(){
    return function(){
        return 'Do SOmething'
    }
} 

var x = higherOrder2();
console.log(x());

//This keyword in JS -> the value of "this" keyword will always dependon hte object that is getting invoking the function
function doSomething() {
    console.log(this);//since this is invoked from global context it belongs to global scope
}

doSomething();

var obj = {
    name:  "vivek",
    getName: function(){
    console.log(this.name);
  }
     
}
       
var getName = obj.getName;
       
var obj2 = {name:"akshay", getName };
obj2.getName();//akshay
//The silly way to understand the “this” keyword is, whenever the function is invoked, 
//check the object before the dot. The value of this . keyword will always be the object before the dot.


//Self Invoking Functions : Without being requested , it is automatically invoked. if the fn expression is foolowed by (),
//it will execute automatically.


//Call()->A predefined method in JS.It invokes a method by specifying the owner object
function sayHello(){
    return "Hello " +this.name;
}

var obj={name:"Sandy"}
console.log(sayHello.call(obj));

function saySomething(message){
    return this.name + " is " + message;
  }     
  var person4 = {name:  "John"};     
  saySomething.call(person4, "awesome");
  // Returns "John is awesome"    

  //Call() method takes arguments seperately whereas apply() method takes arguments as an array

  function saySomethingBind(message1,message2) {
    return this.name+" is "+message1 + " "+message2;
  }
  var person5={name:"John"};
  console.log(saySomethingBind.apply(person5, ["awesome","Nice"]));

  //Use call() method to invoke a function immediately and provide a specific this value
  //Its commonly used when you want to borrow a method from another objecet and invoke it with a specific value
  //Its also useful when working with constructor functions to set this value explicitly

  function greet(name) {
    console.log(`Hello, ${name}! I'm ${this.name}.`);
  }
  
  const person = { name: 'Alice' };
  greet.call(person, 'Bob'); // Output: Hello, Bob! I'm Alice.

  
  //Use bind() when you want to create a new function with a specific this value taht can be invoked later
  //Its useful when you want to create a function with pre-specified this value to be used in event handlers or callback functions
  //Its also commonly used to create a function with a specific this value to be used in object methods
  function greet(name) {
    console.log(`Hello, ${name}! I'm ${this.name}.`);
  }
  
  const person1 = { name: 'Alice' };
  const boundGreet = greet.bind(person1);
  boundGreet('Bob'); // Output: Hello, Bob! I'm Alice.
  

  //test() and exec() are 2 Regular expression methods used in javascript
  //exec() -> to search a string for a specific pattern and if it finds it, it will return that string, else returns empty
  //test() -> to find a string for a specific pattern and it will return the boolean value 'true' on finding the given text otherwise, it will retunr 'false'



  //Currying-> advanced technique to tranform a function of arguments n, to n functions of one or fewer arguments
  function currying(fn){
    return function(a){
      return function(b){
        return fn(a,b);
      }
    }
  }