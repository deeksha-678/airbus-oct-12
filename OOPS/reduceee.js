const euros=[29,76,41,85,46,5];
const doubled=euros.reduce((total,amount)=> {
    total.push(amount*2);
    return total;
}, []);
console.log(doubled);
