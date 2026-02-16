console.log("1"); // synchronus task; 
setTimeout(()=>{
    console.log("2"); //Asynchronus task;
},1000);
setTimeout(()=>{
    console.log("4"); // Asynchronus task;
},(500));
console.log("3"); //Synchronus task;
