var divide = function (dividend, divisor) {
    if(dividend==divisor){
        return 1;
    }
     if(dividend==-2147483648 & divisor==-1){
        return 2147483647
    }
    let m = dividend
    let n = divisor
   
    dividend = Math.abs(m)
    divisor = Math.abs(n)
    var quotient = 0
    let i;
    while (dividend >= divisor) {
        i=0;
        while(dividend>=(divisor*(Math.pow(2, i)))){
            i++;
        }
        quotient+=Math.pow(2, i-1)
        dividend-=divisor*(Math.pow(2, i-1))
    }
 
     if (m < 0 && n < 0) {
        return quotient
    }
    else if (m < 0 || n < 0) {
        return -1 * quotient
    }
    else {
        return quotient
    }
};
let res = divide(-2147483648,-1)
console.log(res)