//Rodrigo Queiroz Vieira Freire
//Lista de Exercícios 2
//Exercício 5
programa {
  funcao inicio() {
    real preco_alemanha, preco_portugal, preco_italia, preco_total
    inteiro pessoas
      escreva("Insira o preço da viagem para alemanha:")//printa o que o usuário deve inserir
        leia(preco_alemanha)//le o que o usuário inseriu
      
      escreva("Insira o preço da viagem para portugal:")//printa o que o usuário deve inserir
        leia(preco_portugal)//le o que o usuário inseriu

      escreva("Insira o preço da viagem para itália:")//printa o que o usuário deve inserir
        leia(preco_italia)//le o que o usuário inseriu

      escreva("Insira a quantidade de pessoas que irão para essa viagem:")//printa o que o usuário deve inserir
        leia(pessoas)//le o que o usuário inseriu

      preco_total = (preco_alemanha + preco_italia + preco_portugal) * pessoas//faz a operação matemática para o preço total

      escreva("O preço total da viagem para " + pessoas + " pessoas é:", preco_total)//printa o preço total para N pessoas

      


    


    
   
    
  }
}
