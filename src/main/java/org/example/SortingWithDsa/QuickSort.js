const quickSort = (arr, low, high) => {
  if (low < high) {
    let pivot = partition(arr, low, high);
    quickSort(arr, low, pivot - 1);
    quickSort(arr, pivot + 1, high);
  }
};

const partition = (arr, low, high) => {
  let pivot = arr[high];
  let i = low - 1;
  for (let j = low; j < high; j++) {
    if (arr[j] < pivot) {
      i++;
      let temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
  }
  i++;
  let temp = arr[i];
  arr[i] = pivot;
  arr[high] = temp;
  return i;
};

let arr = [9, 7, 8, 6, 1, 2, 4, 3, 5];
const lenghtOfArray = arr.length;

quickSort(arr, 0, lenghtOfArray - 1);

console.log(arr);
