/**
 * @param {string} s
 * @return {string}
 */
var reverseWords = function(s) {
let ans = s
  .split(" ")
  .filter(word => word !== "")
  .reverse()
  .join(" ");

return ans;
};