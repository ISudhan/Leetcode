/**
 * @param {Promise} promise1
 * @param {Promise} promise2
 * @return {Promise}
 */
var addTwoPromises = async function (promise1, promise2) {
    let a;
    let c = promise1.then(function (n1) {
        a = n1;
        return promise2;
    }).then(function(n2){
        return a+n2;
    })
    return new Promise(function(resolve,reject){resolve(c)});
};

/**
 * addTwoPromises(Promise.resolve(2), Promise.resolve(2))
 *   .then(console.log); // 4
 */