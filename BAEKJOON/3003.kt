fun main() {
    val default = listOf(1, 1, 2, 2, 2, 8)
    val input = readln().split(" ").map { it.toInt() }
    
    val diff = default.zip(input).map { (default, input) -> default - input }
    println(diff.joinToString(" "))
}
