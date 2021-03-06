package one.digitalinnovation.collections

fun main(){
    val joao = Funcionario(nome = "João", salario = 2000.0, "CLT")
    val pedro = Funcionario(nome = "Pedro", salario = 1500.0, "PJ")
    val maria = Funcionario(nome = "Maria", salario = 4000.0, "CLT")

    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach{println(it)}

    println("--------------")
    val funcionarios3 = setOf(joao, pedro, maria)
    val resultSubtraction = funcionarios3.subtract(funcionarios2)
    resultSubtraction.forEach{println(it)}

    println("--------------")
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach{println(it)}
}