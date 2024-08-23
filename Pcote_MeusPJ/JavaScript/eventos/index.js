/*
onclick -› Disparado quando recebe um click. 
ondblclick -› Disparado quando clique duplo. 
onmouseover -› Disparado quando o mouse está sobre.
onmouseout -› Disparado quando o mouse é movido para fora do elemento.
onmousemove -› Disparado quando o mouse é movido no elemento. 
onmousedown -› Disparado quando o clique do botão foi pressionado. 
onmouseup -› Disparado quando o clique do botão é liberado 
onfocus › Disparado quando o elemento recebe o foco. Válido para input, s 
onchange -› Disparado quando existe uma mudança no conteudo. "Ao mudar" . 
onblur -› Disparado quando o elemento perde o foco. 
onkeydown -› Disparado quando uma tecla é pressionada. 
onkeypress -› Disparado quando uma tecla é pressionada e solta. 
onkeyup -› Disparado quando uma tecla é solta sobre um elemento. 
onload -> Disparado quando a página terminou de ser carregada. Body. 
onresize -› Disparado quando há um redimencionamento da janela. 
*/



function eventoClick(){
    //alert('acionou um evento de click');
    document.body.style.backgroundColor = "blue";
}
 
function eventoDblClick(){
    alert ('Evento click duplo');

}
function viraVermelho(){
    let div = document.getElementById("teste");
    div.style.backgroundColor = "red";
}
function viraAzul (){
    let div = document.getElementById("teste");
    div.style.backgroundColor = "blue";
}

/*function adicionaTexto(){
    let p = document.getElementById("texto");
    p.append('O mouse moveu<br>');
}*/

function limpaTexto(){
    document.getElementById("campoTexto").value = "";

}

function mudou(){
    console.log('Mundou');
}