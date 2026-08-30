var numSquares = function(n) {
    let arr=[]
    let j=0
    for(let i=1;i<10000;i++){
        arr[j]=i*i
        j++
    }
    console.log(arr)
};
let res=numSquares(12)
console.log(res)