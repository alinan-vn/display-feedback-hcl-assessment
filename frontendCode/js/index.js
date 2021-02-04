window.onload=function(){
    const clickyBtn = document.querySelector(".clicky");
    const unList = document.querySelector(".unordered-list");

    clickyBtn.addEventListener('click', addListItem);


    
    let counter = 1;
    function addListItem() {
        counter++
        const text = document.createTextNode(`Item ${counter}`)
        const li = document.createElement("li");

        li.appendChild(text)
        unList.appendChild(li)
        
    }







}


