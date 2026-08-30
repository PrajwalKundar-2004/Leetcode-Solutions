var threeSum = function(nums) {
    let results = [];
    // 1. Sort the array to handle duplicates and use pointers
    nums.sort((a, b) => a - b);

    for (let i = 0; i < nums.length - 2; i++) {
        // 2. Skip the same number to avoid duplicate triplets
        if (i > 0 && nums[i] === nums[i - 1]) continue;

        let left = i + 1;
        let right = nums.length - 1;

        while (left < right) {
            let sum = nums[i] + nums[left] + nums[right];

            if (sum === 0) {
                results.push([nums[i], nums[left], nums[right]]);
                
                // 3. Skip duplicate values for left and right pointers
                while (left < right && nums[left] === nums[left + 1]) left++;
                while (left < right && nums[right] === nums[right - 1]) right--;
                
                left++;
                right--;
            } else if (sum < 0) {
                left++; // We need a larger sum
            } else {
                right--; // We need a smaller sum
            }
        }
    }
    return results;
};
let nums = [-1, 0, 1, 2, -1, -4]
let res = threeSum(nums)
console.log(res)