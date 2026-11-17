/**
 * @param {string} s
 * @return {string}
 */
var reverseWords = function(s) {
    let word = s.split(" ");
    let rev = word.map(word =>word.split('').reverse().join(''));
    return rev.join(' ');
};