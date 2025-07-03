fun main() {
    var n = readln().toInt()
    
    repeat(n) {
        var input = readln().toInt()
        print("${input/25} ")
        input %= 25
        print("${input/10} ")
        input %= 10
        print("${input/5} ")
        input %= 5
        println("${input/1}")
    }
}
