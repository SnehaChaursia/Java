// There are 2 new employees in an organization in the month of August. The HR is
// preparing a report of all the employees and wants to print the important information of
// every employee. We are required to declare variables to store the information and then
// print the details of these new employees.
// The details of an employee are
// First name
// Last name
// Date of birth (Think of a string like this - ‘01/02/2002’)
// Aadhar number ( Again a string like - ‘661123123001’)
// Date of joining (‘13/08/2023’)
// Designation (‘Software Engineer’ or ‘Quality Assurance Engineer’ or ‘Product Manager’)
// Role (‘Intern’ or ‘Full time employee’)
// a) Solve this problem without using objects
// b) Solve the above problem using objects

var firstName="sneha";
var lastName="chaurasia";
var DOB="30-09-2004";
var adharNumber=7648726892;
var joiningDate="10-05-2025";
var designation="software engineer";
var role="intern";
console.log(firstName);
console.log(lastName);
console.log(DOB);
console.log(adharNumber);
console.log(joiningDate);
console.log(designation);
console.log(role)

function printDetail(firstName, lastName,DOB,adharNumber,joiningDate,designation,role){
    console.log(`firstName:${firstName}`);
    console.log(`lastName:${lastName}`);
    console.log(`DOB:${DOB}`);
    console.log(`adharNumber:${adharNumber}`);
    console.log(`joiningDate:${joiningDate}`);
    console.log(`designation:${designation}`);
    console.log(`role:${role}`)
}
printDetail("Sneha","Chaurasia","30-09-2024","66539898","10-05-2025","Software engineer","Intern");
printDetail("Riya","JHA","01-05-2014","76879878","01-06-2025","Software engineer","Intern")

//using without object
 const Employee1={                      // created object:Employee1
 firstName:"sneha",
 lastName:"chaurasia",
 DOB:"30-09-2004",
 adharNumber:7648726892,
 joiningDate:"10-05-2025",
 designation:"software engineer",
 role:"intern",
 }
console.log(Employee1);
//output:{
//   firstName: 'sneha',
//   lastName: 'chaurasia',
//   DOB: '30-09-2004',
//   adharNumber: 7648726892,
//   joiningDate: '10-05-2025',
//   designation: 'software engineer',
//   role: 'intern'
// }

const Employee2={           
firstName:"Riya",                    //created object:Employee2
lastName:"JHA",
DOB:"01-05-2014",
adharNumber:76879878,
joiningDate:"01-06-2025",
designation:"Software engineer",
role:"Intern",
 }
 console.log(Employee2)
 //output:{
//   firstName: 'Riya',
//   lastName: 'JHA',
//   DOB: '01-05-2014',
//   adharNumber: 76879878,
//   joiningDate: '01-06-2025',
//   designation: 'Software engineer',
//   role: 'Intern'
// }

// let student={
//     fullName:"Bat Man",
//     gender:"male",
//     rollNumebr:1,
//     graduationYear:2027,
//     marks:[75,80,85,69,74]
// }
// // let sum=0;
// for(let i=0;i<student.marks.length;i++){       //using for loop to calculate sum
//     // sum+=student.marks[i];  

// }
// const average=sum/student.marks.length;      // sum/no of subject(student.mark.length=5)
// console.log(student);
// console.log(`Average Marks:${average}`);

//output:
// {
//     fullName: 'Bat Man',
//     gender: 'male',
//     rollNumebr: 1,
//     graduationYear: 2027,
//     marks: [ 75, 80, 85, 69, 74 ]
//   }
//   Average Marks:76.6

// Write an array of 5 numbers then find the sum of all the numbers. Print this sum
// value.
// Also show the use case of push by pushing a new value to this array and printing
// the new length of the array.
// Also pop a value from this array and print that value
// Point to remember: Use  indexes and the length method in your solution to find
// average.

const array=[50,48,49,49,48];
let sum=0;
for(let i=0;i<array.length;i++){
    sum+=array[i];                   //using for loop to add elemnt of array
}
console.log(sum);                   //output :244

 array.push(49);                  //push method: add eleemnt in the last
 console.log(array);              // output:[ 50, 48, 49, 49, 48, 49 ]

 array.pop();                     //pop method : delete element from last 
 console.log(array)             // output:[ 50, 48, 49, 49, 48 ]

 var average=sum/array.length;
//  console.log(average);

//  Write a program that determines the monthly cost of a subscription plan based on the
// user's choice. The options are:
// a. Basic Rs.9.99 per month
// b. Standard Rs.14.99 per month
// c. Premium Rs.19.99 per month
// The user inputs a number corresponding to their choice, and the "switch" case
// statement displays the monthly cost. If the number is not between 1 and 3, display
// "Invalid plan."

let num=3;
 switch(num){
    case 1:console.log("You chose the Basic plan. Monthly cost: Rs.9.99");
    break;
    case 2: console.log("You chose the Standard plan. Monthly cost: Rs.14.99");
    break;
    case 3: console.log("You chose the Premium plan. Monthly cost: Rs.19.99")
    break;
    default:console.log("Invalid input");
 }

 // You chose the Premium plan. Monthly cost: Rs.19.99

//  . Create a constructor function called Book that takes title and author as parameters and
// assigns them as properties to the book object. Then, create two book objects using the
// Book constructor and display their details on the console.

// function Book (title,author){
//     this.title=title;
//     this.author=author;
//     this.display=function displayinfo(){
//         console.log(`Title:${this.author} Author:${this.author}`)
//     }

// // }
// // const book1=new Book("Atomic Habit","sneha")
// console.log(book1)
// book1.display()

// Constructor function
function Book(title, author) {
    this.title = title;   // Assign the title parameter to the object
    this.author = author; // Assign the author parameter to the object
}

// Create two book objects using the constructor
const book1 = new Book("The Alchemist", "Paulo Coelho");
const book2 = new Book("To Kill a Mockingbird", "Harper Lee");

// Display their details on the console
console.log(book1)
console.log(`Book 1: "${book1.title}" by ${book1.author}`);
console.log(`Book 2: "${book2.title}" by ${book2.author}`);
//output:
// Book 1: "The Alchemist" by Paulo Coelho
// Book 2: "To Kill a Mockingbird" by Harper Lee

// Array of product objects
const products = [
    { name: "Laptop", price: 800 },
    { name: "Phone", price: 600 },
    { name: "Tablet", price: 300 }
];

// Function to calculate total value
function calculateTotalValue(inventory) {
    return inventory.reduce((total, product) => total + product.price, 0);
}

// Calculate and display the total value
const totalValue = calculateTotalValue(products);
console.log(`Total inventory value: Rs.${totalValue}`);
//output:
// Total inventory value: Rs.1400
