// Write a program which find the second largest element in the array

function secondLargestElement(numbersArray) {
  //!!!!!!!!!!!!!!!!!!!!!! with Buit-in method and pass second index !!!!!!!!!!!!!!!
  let newSortedArray = numbersArray.sort((a, b) => a - b);
  let element = newSortedArray[numbersArray.length - 2];
  console.log(element);

  //!!!!!!!!!!!!!!!!!!!!!! with For Loop method start for loop with array length -2 !!!!!!!!!!!!!!!
  let sortedArray = numbersArray.sort((a, b) => a - b);
  let n = sortedArray.length;
  let secondLargest = 0;
  for (let i = n - 2; i >= 0; i--) {
    if (sortedArray[i] != sortedArray[n - 1]) {
      secondLargest = sortedArray[i];
      break;
    }
  }
  console.log(secondLargest);
}

//!!!!!!!!!!!!!!!!!!!!!! Invocing function !!!!!!!!!!!!!!!
let numbersArray = [2, 3, 4, 8, 7, 9, 12, 1];
secondLargestElement(numbersArray);
