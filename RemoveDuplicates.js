var removeDuplicates = function (nums) {
    let n =nums.length
    let i = 0
    for (let j = 1; j <n;j++){
        if(nums[j]!=nums[i]){
            i++
            nums[i]=nums[j]
        }
    }
    return i+1
};
let nums = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]
res = removeDuplicates(nums)
console.log(res)