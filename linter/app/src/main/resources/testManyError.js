function and(a,b) {
  if (a === 1 && b === 1) {
    return 1
  } else {
    return 0
  }
}


console.log("xor 00", xor(0,0))
console.log("xor 01", xor(0,1))
console.log("xor 10", xor(1,0))
console.log("xor 11", xor(1,1))
console.log()