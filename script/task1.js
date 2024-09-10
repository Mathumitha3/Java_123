function addElementToEnd(array, element) {
    array[array.length] = element;
    return array;
}

let myArray = [1, 2, 3];
console.log(addElementToEnd(myArray, 4)); 
