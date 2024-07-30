const reverseString = (message) => {
  let splitString = message.split("");
  return splitString.reverse();
};

let message = "Hello world";
let result = reverseString(message);
console.log(result);
