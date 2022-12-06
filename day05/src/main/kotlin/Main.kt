import java.io.File fun main(): Unit = println(File("input.txt").readLines().let { inp ->
    if (System.getenv("part") != "part2")
        (inp.takeWhile { !it.trim().startsWith("1") }.map { it.windowed(4,4, true) }.map { it.map { it.replace("[", "").replace("]", "").replace(" ", "") } }.toMutableList() to inp.takeLastWhile { it.isNotBlank() }.map { it.split(" ").filter { it.toIntOrNull() != null }.map { it.toInt() } })
            .let { (i, ops) -> println(i); ops.fold(i) { acc, op -> println(acc); println(op); acc[op[2]-1] = acc[op[2]-1] + acc[op[1]-1].take(op[0]); acc[op[1]-1] = acc[op[1]-1].drop(op[0]); acc } }
    else inp.map { 0 }
} )