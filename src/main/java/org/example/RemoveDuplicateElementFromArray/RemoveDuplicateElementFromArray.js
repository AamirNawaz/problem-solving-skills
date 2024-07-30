const removeDuplication = (arr) => {
  //!!!!!!!!!!!!!!!!!!! with Set !!!!!!!!!!!!!!!!!!!!!!
  //Removing with  Set
  let mySet = new Set();
  for (let i = 0; i < arr.length; i++) {
    mySet.add(i);
  }
  console.log(mySet);

  //!!!!!!!!!!!!!!!!!!! with for loop !!!!!!!!!!!!!!!!!!!!!!
  let j = 0;
  for (let i = 0; i < arr.length; i++) {}
};

let duplicateArray = [1, 2, 5, 3, 5, 6, 7, 3, 8];
removeDuplication(duplicateArray);
