var containsDuplicate = function(nums) {
    let nums2=new Set()
    for(let i=0;i<nums.length;i++){
        if(nums2.has(nums[i])){
            return true
        }else{
            nums2.add(nums[i])
        }
    }
    return false
};
let nums=[1,2,3,1]
let res=containsDuplicate(nums)
console.log(res)