const reverseString = (message) => {
  var str = "";

  for (var i = message.length - 1; i >= 0; i--) {
    str = str + message[i];
  }
  console.log(str);
};

let message = "Hello World";
reverseString(message);
