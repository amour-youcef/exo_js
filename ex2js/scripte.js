var photo = document.getElementsByClassName("photo")[0];

photo.style.bottom = "50px";
photo.style.left = "50px";



document.addEventListener("keydown", function (event) {

    var top = photo.offsetTop;
    var topdepart = top;

    if (event.keyCode == "39") {
        photo.style.left = parseInt(photo.style.left) + 10 + "px";

    }
    if (event.keyCode == "40") {
        photo.style.bottom = parseInt(photo.style.bottom) - 10 + "px";

    }
    if (event.keyCode == "38") {
        if (top > 0) {
            top = top - 10;
            photo.style.top = top + "px";
        } else {

        }

    }
    if (event.keyCode == "37") {
        photo.style.left = parseInt(photo.style.left) - 10 + "px";

    }
})