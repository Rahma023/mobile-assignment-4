import java.util.*

fun main() {
    var names=family("grace","stella","fatma")
    println(Arrays.toString(names))



var namesarray=arrayOf("school","library","compound","classroom")
    println(Arrays.toString(namesarray))

    var cities=arrayOf("harare","mumbai","dodoma","jakarta")
    println(cities[0].capitalize()+" "+cities[1].capitalize()+" "+cities[2].capitalize()+" "+cities[3].capitalize())

    var numbersarray=arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var sum=numbersarray[2]+numbersarray[5]
    println(sum)

    var index=numbersarray.indexOf(158)
    println(index)

    var sortedNums=numbersarray.sortedArray()
    println(Arrays.toString(sortedNums))



}
fun family(name1:String, name2:String, name3:String,):Array<String>{
    var names=arrayOf(name1, name2, name3)
    return names
}