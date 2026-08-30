var searchRange = function(nums, target) {
    let res=[]
    let flag=true
    for(let i=0;i<nums.length;i++){
        if(nums[i]==target){
            res[0]=i
            flag=false
            break;
        }
    }
    if(flag==true){
        return [-1,-1]
    }
    for(let i=-1;i>=(-1*nums.length);i--){
        if(nums.at(i)==target){
            let n=nums.length+i
            res[1]=n
            break;
        }
    }
    return res
};
let nums = [5,7,7,8,8,10]
let target = 2
let res=searchRange(nums,target)
console.log(res)