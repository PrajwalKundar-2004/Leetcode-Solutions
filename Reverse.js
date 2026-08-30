var reverse = function (n) {
    let num = n
    let digit = 0
    let rev = 0
    while (num != 0) {
        digit = num % 10
        rev = (rev * 10) + digit
        num = parseInt(num / 10)

    }
    if (rev > Math.pow(2, 31) || rev < (-1 * (Math.pow(2, 31)))) {
        return 0
    }
    return rev
};
let res = reverse(21479)
console.log(res)