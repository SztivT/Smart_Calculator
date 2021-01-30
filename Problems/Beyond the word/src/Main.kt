import java.util.*

fun main() {
    // put your code here
    val scanner = Scanner(System.`in`)
    val word = scanner.next()
    for (c in 97..122) {

        if (!word.contains(c.toChar())) print(c.toChar())
    }
}