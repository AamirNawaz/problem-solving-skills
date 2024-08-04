// find duplicate elements in Array

function findDuplicates(arr){
    let duplicate =[];
    let seen ={};

    for(let i =0; i<arr.length; i++){
        if(!seen[arr[i]]){
            seen[arr[i]] = true;
        }else{
            duplicate.push(arr[i]);
        }

    }
    return duplicate;

}


let arr =[8,1,4,3,2,6,9,4,8,7];
let result = findDuplicates(arr);
console.log(result);