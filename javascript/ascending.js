function sortarray(array)
{
    let temp=0;
    for(let i=0;i<array.length;i++)
    {
        for(let j=i; j<array.length;j++)
        {
            if(array[j]<array[i])
            {
                temp=array[j];
                array[j]=array[i];
                array[i]=temp;
            }
        }
    }
    return array;
}
console.log(sortarray([67,188,100]));