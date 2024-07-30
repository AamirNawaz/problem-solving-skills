const findFactorial = (number) => {
  if (number < 1) {
    console.log("number must be greater then 1");
  }

  let factorial = 1;
  for (let i = 1; i <= number; i++) {
    factorial = factorial * i;
  }
  console.log(factorial);
};

let number = 5;
findFactorial(number);
