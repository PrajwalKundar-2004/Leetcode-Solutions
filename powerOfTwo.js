var isPowerOfTwo = function(n) {
    while(n>1){
        n=n/2
    }
    if(n==1){
        return true
    }
    return false
    
};
let res=isPowerOfTwo(1073741824)
console.log(res)