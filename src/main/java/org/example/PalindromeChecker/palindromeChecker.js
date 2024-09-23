//Palindrome checker in javaScript - Node.js
const palindromeChecker=(message)=>{
    let reverseString = message.split("").reverse().join("");
    if(message === reverseString){
        return (message + " is palindrome!")
    }else {
        return (message + " is not palindrome!")
    }
}

const result  = palindromeChecker('ala');
console.log(result);