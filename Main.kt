/******************************************************************************
Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

   
    // Questão 1 = 91
   
   
   
   
   // Questão 2 
   fun main() {
   
    val numero = 21
    if (verificarFibonacci(numero)) {
        println("O número $numero pertence à sequência de Fibonacci.")
    } else {
        println("O número $numero não pertence à sequência de Fibonacci.")
    }
    
    
    
    ///
    
    val input = "Hello, world!"
    val output = invertString(input)
    println(output)
}

fun verificarFibonacci(numero: Int): Boolean {
    var a = 0
    var b = 1
    var c: Int
    var pertence = false

    if (numero == a || numero == b) {
        pertence = true
    } else {
        c = a + b
        while (c <= numero) {
            if (c == numero) {
                pertence = true
                break
            }
            a = b
            b = c
            c = a + b
        }
    }

    return pertence
}

    
    //Questão 3
    
    /* a) 1, 3, 5, 7, 9

b) 2, 4, 8, 16, 32, 64, 128

c) 0, 1, 4, 9, 16, 25, 36, 49

d) 4, 16, 36, 64, 100

e) 1, 1, 2, 3, 5, 8, 13

f) 2, 10, 12, 16, 17, 18, 19, 20 */



// Questão 4

/* Ligue um interruptor e aguarde alguns minutos para que a lâmpada esquente.
Desligue esse interruptor e ligue outro interruptor.
Entre na sala.
Se a lâmpada estiver acesa, o interruptor que você ligou por último controla essa lâmpada.
Se a lâmpada estiver apagada e a lâmpada estiver quente, o interruptor que você ligou primeiro e depois desligou controla essa lâmpada.
Se a lâmpada estiver apagada e a lâmpada estiver fria, o interruptor que você nunca tocou controla essa lâmpada.

*/


//Questão 5 


fun invertString(input: String): String {
    val chars = input.toCharArray()
    var start = 0
    var end = chars.size - 1

    while (start < end) {
        val temp = chars[start]
        chars[start] = chars[end]
        chars[end] = temp
        start++
        end--
    }

    return String(chars)
}




