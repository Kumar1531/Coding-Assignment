const arr = [1,2,3,4,5,6,7]; 

  
function arrSort(arr1) { 
    arr1.sort((a,b)=>a-b); 
    arr1.reverse(); 
    return arr1; 
} 
  
console.log(arrSort(arr)); 
