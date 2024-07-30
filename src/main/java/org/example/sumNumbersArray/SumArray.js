const sumArray = (numbers) => {
  let sum = 0;
  for (let i = 0; i < numbers.length; i++) {
    sum = sum + numbers[i];
  }
  return sum;
};

let numbers = [2, 4, 5, 6, 7, 8, 10];
let result = sumArray(numbers);
console.log(result);
