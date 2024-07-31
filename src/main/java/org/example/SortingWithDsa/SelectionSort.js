// In selection sort - sorting start from smallest to highest element in the array.
const selectionSort = (numbers) => {
  for (let i = 0; i < numbers.length - 1; i++) {
    let minIndex = i;
    for (let j = i + 1; j < numbers.length; j++) {
      if (numbers[minIndex] > numbers[j]) {
        minIndex = j;
      }
    }
    let temp = numbers[minIndex];
    numbers[minIndex] = numbers[i];
    numbers[i] = temp;
  }
  return numbers;
};

let numbers = [7, 8, 3, 1, 2];
let result = selectionSort(numbers);
console.log(result);
