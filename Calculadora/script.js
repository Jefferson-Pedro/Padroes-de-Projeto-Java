//Concatena os numeros e as operações;
function display(value){
  Calculadora.visor.value = Calculadora.visor.value + value
}

//
function limparExpressão() {
  Calculadora.visor.value = limpar(Calculadora.visor.value)
}