import java.io.File fun main(): Unit = println(File("input.txt").readLines().let { if(System.getenv("part") == "part2") it.map { inp -> inp.split(",").let { p -> p.map { IntRange(it.split('-')[0].toInt(), it.split('-')[1].toInt()) }.let { range -> range[0].union(range[1]).let { it.size == range[0].count() || it.size == range[1].count() } } } }.count { it } else it.map { inp -> inp.split(",").let { p -> p.map { IntRange(it.split('-')[0].toInt(), it.split('-')[1].toInt()) }.let { range -> range[0].intersect(range[1]) } } }.count { it.size > 0 } } )