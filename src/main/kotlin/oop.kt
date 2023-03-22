class Hesabu{
    // data member\
    private var number:Int=9
    private var number1:Int=84

    //member function
    fun calculateSquare():Int{
        return number*number
        return number1*number1

    }

}
class Brad() {
    var name = "Emobilis"
    fun myname() {
        println(name)

    }
}
class weather(){
    var name="It is a rainy season"
    fun weather(){
        println(name)
    }
}
class car{

    var name="He drives a Bentley Continental"
    fun car(){
        println(name)
    }
}





fun main(args: Array<String>) {
    // create an object
    val myobject=Hesabu()
    println(myobject.calculateSquare())

     val myobject2=Brad()
    println(myobject2.myname())

    val myobject3=weather()
    println(myobject3.weather())

    val myobject4=car()
    println(myobject4.car())

}