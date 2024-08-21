const number = [1, 5, 4, 8, 5, 6, 4, 6, 5, 8, 7, 8, 9, 3, 1, 2, 2, 4, 8, 8, 7];

const string = ["Banana", "Pera", "Banana", "Maça", "Pera", "Pitaia", "Pitaia"];

const uniqueNum = [... new set(number)];
const uniqueStr = [... new set(string)];

console.log(uniqueNum);
console.log(uniqueStr);