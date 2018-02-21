function boxClick()
{
  //prompt('hey');
  var el = document.getElementById('box');
  el.textContent = 'Oh, my! You clicked right on me, didn't you!?';
}

var element = document.getElementById('box');
element.onclick = boxClick;
