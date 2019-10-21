
var hu = document.getElementById("hu").innerHTML;
var mots = hu.split(' ');

var text = document.getElementById('texte');

for (let index = 0; index < mots.length; index++) {
    //  if (mots[index] !== "") {
    // console.log(mots[index]);

    // on créé une balise p
    var element = document.createElement("span");

    element.setAttribute("class", "p");
    element.style.color = '#551743';

    // on créé du texte
    var texte = document.createTextNode(mots[index]);


    // on ajoute le texte dans l'élément p
    element.innerText = mots[index] + " ";

    // on ajoute la balise p et son texte dans un div présent dans le DOM
    document.querySelector("div").appendChild(element);

}

var words = document.getElementsByClassName("p");
console.log(words[13]);

for (let index = 0; index < words.length; index++) {

    words[index].addEventListener("click", function () {

        if (words[index].style.fontWeight === 'normal') {

            words[index].style.fontWeight = 'bold';

        } else {
            words[index].style.fontWeight = 'normal';
        }

    })
}


/* ex02 */