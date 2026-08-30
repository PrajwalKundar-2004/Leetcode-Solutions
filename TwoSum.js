var twoSum = function(nums, target) {
    let sum=0
    for(let i=0;i,nums.length;i++){
        for(let j=i+1;j<nums.length;j++){
            if((nums[i]+nums[j])==target){
                return [i,j]
            }
        }
    }return false
};
let nums =[3,3]
let target = 6
let res=twoSum(nums,target)
console.log(res)