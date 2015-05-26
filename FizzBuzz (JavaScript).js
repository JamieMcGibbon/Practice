/* "FizzBuzz" program (JavaScript)
 * Author: Jamie McGibbon 
 * http://About.me/Jamiemcg
 * 
 * If a number is a multiple of 3, print "fizz"
 * If a number is a multiple of 5, print "buzz"
 * If a number is a multiple of both 3 and 5, print "fizzbuzz"
 * Else, print the regular number
 */

function myFunction(){

    //For loop to iterate over the numbers 0 - 100
    for(var i = 0; i <= 100; i++){
        
        //This program takes 0 into account, since 0 % any number will
        //always return a value of "0"
        if(i == 0){
            console.log(i + "<br />");        
        }
        //Check if number if divisible by both 3 and 5
        else if(i % 3 == 0 && i % 5 == 0){
            console.log("fizzbuzz <br />");
        }  
        //Check if number is divisible by 5
        else if(i % 5 == 0){
            console.log("buzz <br />");
        }
        //Check if number is divisible by 3
        else if(i % 3 == 0){
            console.log("fizz <br />");
        }
        //Else, print the number as it is
        else{
            console.log(i + "<br />");
        }
    }
}

myFunction();
