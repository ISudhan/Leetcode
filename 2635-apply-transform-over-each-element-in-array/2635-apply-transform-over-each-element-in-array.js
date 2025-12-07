/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    var n = [];
    for(let i = 0;i<arr.length;i = i+1){
        console.log(fn(arr[i]));
        n.push(fn(arr[i],i));
    }
    return n;
};