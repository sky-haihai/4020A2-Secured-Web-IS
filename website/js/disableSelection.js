function disableSelection() {
  if (typeof document.onselectstart != "undefined") {
    document.onselectstart = new Function("return false");
  } else {
    document.onmousedown = function () {
      return false;
    };
    document.onmouseup = function () {
      return true;
    };
  }
}

disableSelection();
