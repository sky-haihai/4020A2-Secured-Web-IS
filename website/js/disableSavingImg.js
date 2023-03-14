function disableSavingImg() {
  document.addEventListener(
    "contextmenu",
    function (e) {
      e.preventDefault();
    },
    false
  );
}

disableSavingImg();
