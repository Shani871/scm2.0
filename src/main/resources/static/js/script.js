console.log("Script loaded ")


let currentTheme = getTheme();
changeTheme();
//TODO:
function changeTheme(){
   document.querySelector("html").classList.add(currentTheme);


   // set the listener to chage theme button 
  const changeThemeButton= document.querySelector("#theme_change_button");
  changeThemeButton.addEventListener("click", (event) => {
    console.log("change theme button");
const oldTheme = currentTheme;
    // theme ko light 
    if(currentTheme=="dark"){
        currentTheme = "light";

        // theme ko dark 
    }else{
        currentTheme = "dark";
    }
    // local storage  mein update karege
    setTheme(currentTheme);

    // remove current theme 
    document.querySelector("html").classList.remove(oldTheme);
//set current theme 
    document.querySelector("html").classList.add(currentTheme);
  });
}


//set theme to localStorage
 function setTheme(theme){
    localStorage.setItem("theme",theme)
 }



// get theme from local storage
function getTheme(){
    let theme = localStorage.getItem("theme");
        return theme ? theme : "light";
    
}