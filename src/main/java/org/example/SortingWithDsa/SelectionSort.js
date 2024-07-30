// In selection sort - sorting start from smallest to highist element in the array.
const selectionSort = (numbers) => {
  for (let i = 0; i < numbers.length - 1; i++) {
    let smallest = i;
    for (let j = i + 1; j < numbers.length; j++) {
      if (numbers[smallest] > numbers[j]) {
        smallest = j;
      }
    }
    let temp = numbers[smallest];
    numbers[smallest] = numbers[i];
    numbers[i] = temp;
  }
  return numbers;
};

let numbers = [7, 8, 3, 1, 2];
let result = selectionSort(numbers);
console.log(result);
