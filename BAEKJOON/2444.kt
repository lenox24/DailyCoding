fun main() {
    var n = readln().toInt()

    var x = n * 2 - 1
    for(i in 0 until x) {
        var space:Int = (x - 1 - (i * 2)) / 2
        if(space < 0) space *= -1
        for(j in 1 .. space) {
            print(" ")
        }
        var star = x - (space * 2)
        for(j in 1 .. star) {
            print("*")
        }
        println("")
    }
}
