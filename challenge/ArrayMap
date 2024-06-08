
function hasSubarrayWithSum(arr, target) {
    let n = arr.length;
    let currentSum = 0;
    let start = 0;

    for (let end = 0; end < n; end++) {
        currentSum += arr[end];

        while (currentSum > target && start <= end) {
            currentSum -= arr[start];
            start++;
        }

        if (currentSum == target) {
            console.log(`Subarray with the target sum found from index ${start} to ${end}`);
            return true;
        }
    }

    return false;
}

// Function to get user input and execute the subarray sum check
function main() {
    const prompt = require('prompt-sync')();

    const n = parseInt(prompt('Enter the number of elements in the array: '));
    let arr = [];

    console.log('Enter the elements of the array:');
    for (let i = 0; i < n; i++) {
        arr.push(parseInt(prompt()));
    }

    const target = parseInt(prompt('Enter the target sum: '));

    const result = hasSubarrayWithSum(arr, target);
    if (!result) {
        console.log('No subarray with the target sum found.');
    }
}

// Execute the main function
main();
