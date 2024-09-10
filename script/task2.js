function removeLastElement(array) {
    // Check if the array is not empty
    if (array.length > 0) {
        // Reduce the length of the array by 1
        array.length = array.length - 1;
    }
    return array;
}

// Example usage
let myArray = [1, 2, 3, 4];
console.log("Before removing last element:", myArray);

removeLastElement(myArray);

console.log("After removing last element:", myArray);

