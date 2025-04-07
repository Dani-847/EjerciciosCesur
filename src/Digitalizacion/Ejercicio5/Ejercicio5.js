document.addEventListener("DOMContentLoaded", function () {
    document.querySelector(".desplegable").addEventListener("click", function () {
        document.querySelector(".menu").classList.toggle("activo");
    });
});
