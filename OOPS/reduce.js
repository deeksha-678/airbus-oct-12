const numbers=[2,4,6];
const sum=numbers.reduce(function(sum,number) {
    const updatedSum=sum+numbers;
    return updatedSum;
}, 0);
sum;
console.log(sum);
