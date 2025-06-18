fun main() {
    val rating = mapOf("A+" to 4.5, "A0" to 4.0, "B+" to 3.5, "B0" to 3.0, "C+" to 2.5, "C0" to 2.0, "D+" to 1.5, "D0" to 1.0, "F" to 0.0)
    var sum = 0.0
    var ratingSum = 0.0
    for(i in 0 until 20) {
        var tmp = readln().split(" ")
        if(tmp[2] == "P") {continue}
        sum += tmp[1]!!.toDouble() * rating[tmp[2]]!!.toDouble()
        ratingSum += tmp[1]!!.toDouble()
    }
    println(sum / ratingSum)
}

