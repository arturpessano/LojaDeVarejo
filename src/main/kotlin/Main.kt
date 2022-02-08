fun main(){
    val artur = Vendedor()
    artur.nome = "Artur"
    artur.telefone = "51999771785"

    val joao = Cliente()
    joao.nome = "Joao"
    joao.email = "joao1212@gmail.com"


    val marcelo = Fornecedor()
    marcelo.transporte = "Sedex 10"
    marcelo.produtos = " Arroz"

    val numero = Produto()
    numero.quantidade = 100
    numero.preco = 12

    val entrega = Transportadora()
    entrega.data = "14/09/23"
    entrega.endereco = "Rua das Flores,150"

    val produto = Venda()
    produto.quantidade = 98
    produto.preco =  50


    println(artur)
    println(joao)
    println(marcelo)
    println(numero)
    println(entrega)
    println(produto)


    println("Nome do Vendedor é ${artur.nome} e o nome do  cliente é ${joao.nome}")


}