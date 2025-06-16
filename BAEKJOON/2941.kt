fun main() {
    var arr = arrayOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")
    var str = readln()
    for(i in arr) {
	    str = str.replace(i.toRegex(), "0")
    }

	println(str.length)
}
