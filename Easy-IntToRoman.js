var intToRoman = function(num) {
    // 1. Map values to symbols in descending order
    const values = [
        { value: 1000, char: 'M' },
        { value: 900, char: 'CM' },
        { value: 500, char: 'D' },
        { value: 400, char: 'CD' },
        { value: 100, char: 'C' },
        { value: 90, char: 'XC' },
        { value: 50, char: 'L' },
        { value: 40, char: 'XL' },
        { value: 10, char: 'X' },
        { value: 9, char: 'IX' },
        { value: 5, char: 'V' },
        { value: 4, char: 'IV' },
        { value: 1, char: 'I' }
    ];

    let result = "";

    // 2. Iterate through the mapping
    for (let i = 0; i < values.length; i++) {
        // While the current number is bigger than the Roman value
        while (num >= values[i].value) {
            result += values[i].char; // Add the symbol
            num -= values[i].value;    // Subtract the value
        }
    }

    return result;
};

console.log(intToRoman(3749)); // Output: "MMMDCCXLIX"