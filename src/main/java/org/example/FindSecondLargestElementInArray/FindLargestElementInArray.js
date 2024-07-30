// Write a program which find the largest element in the array

function LargestElement(numbersArray) {
  let max = 0;
  for (let i = 0; i < numbersArray.length; i++) {
    if (numbersArray[i] > max) {
      max = numbersArray[i];
    }
  }
  console.log(max);
}

let numbersArray = [2, 3, 4, 8, 7, 9, 12, 1];
LargestElement(numbersArray);
