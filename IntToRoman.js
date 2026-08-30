var intToRoman = function (num) {
    var str = ""
    let roman = {
        1000: "M",
        900: "CM",
        500: "D",
        400: "CD",
        100: "C",
        90: "XC",
        50: "L",
        40: "XL",
        10: "X",
        9: "IX",
        5: "V",
        4: "IV",
        1: "I"

    }
    let number = num
    while (number != 0) {
        if (number >= 1000) {
            n = Math.floor(number / 1000)
            for (let i = 0; i < n; i++) {
                str += roman[1000]
            }
            number %= 1000
        }
        else if (number < 1000 && number >= 100) {
            n = Math.floor(number / 100)
            if (n > 0 && n < 4) {
                for (let i = 0; i < n; i++) {
                    str += roman[100]
                }
                number %= 100

            } else if (n == 4) {
                str += roman[400]
                number %= 100

            } else if (n == 5) {
                str += roman[500]
                number %= 100

            } else if (n > 5 && n < 9) {
                n = n - 5
                str += roman[500]
                for (let i = 0; i < n; i++) {
                    str += roman[100]
                }
                number %= 100
            }else if (n == 9) {
                str += roman[900]
                number %= 100

            } 

        } else if (number < 100 && number >=10) {
            n = Math.floor(number / 10)
            if (n > 0 && n < 4) {
                for (let i = 0; i < n; i++) {
                    str += roman[10]
                }
                number %= 10
            }
            else if (n == 4) {
                str += roman[40]
                number %= 10
            }
            else if (n == 5) {
                str += roman[50]
                number %= 10
            }
            else if (n > 5 && n < 9) {
                n = n - 5
                str += roman[50]
                for (let i = 0; i < n; i++) {
                    str += roman[10]
                }
                number %= 10
            }else if (n == 9) {
                str += roman[90]
                number %= 10
            }
        } else if (number < 10 && number >= 0) {
            n = number
            if (n > 0 && n < 4) {
                for (let i = 0; i < n; i++) {
                    str += roman[1]
                }
                number = 0
            } else if (n == 4) {
                str += roman[4]
                number = 0
            } else if (n == 5) {
                str += roman[5]
                number = 0
            } else if (n > 5 && n < 9) {
                n = n - 5
                str += roman[5]
                for (let i = 0; i < n; i++) {
                    str += roman[1]
                }
                number = 0
            }else if (n == 9) {
                str += roman[9]
                number = 0
            }else{
                number = 0
            }
        }
    }
    return str


};
let str = intToRoman(43)
console.log(str)