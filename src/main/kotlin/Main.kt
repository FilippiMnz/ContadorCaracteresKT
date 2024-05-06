import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)

    println("Insira uma palavra: ")
    val palavraUser = scanner.nextLine()
    val tamanho = palavraUser.length

    println("A palavra que voce digitou Contém $tamanho letras ")
}