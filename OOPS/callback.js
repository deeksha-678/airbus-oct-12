function greet(name, myFunction)
{
    console.log('hello world');
    myFunction(name);
}
function sayName(name)
{
    console.log('hello' + ' ' +name);
}
setTimeout(greet,2000,'john',sayName);