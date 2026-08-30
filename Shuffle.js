var shuffle = function(nums, n) {
    let nums2=[]
    let len=n*2;
    let j=0;
    for(let i=0;i<len;i+=2,n++,j++){
        console.log(i)
        nums2[i]=nums[j];
        nums2[i+1]=nums[n];
    }
    return nums2;
};
let nums = [2,5,1,3,4,7]
let n = 3
let res=shuffle(nums,n)
console.log(res)
