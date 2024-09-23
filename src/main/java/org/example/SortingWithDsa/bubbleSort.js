
const bubbleSort=()=>{
    for(let i =0; i <nums.length-1; i++){
        for(let j=0; j<nums.length-1-i; j++){
            if(nums[j]>=nums[j+1]){
                let temp = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = temp;
            }
        }
    }
    return nums;
}

let nums = [3,1,2,5,4,8,6,7,9];
const result  =bubbleSort(nums);
console.log(result);