fun emobilis(){
    println("eMobilis Mobile Technology")
    println("This is a user defined function")


}
fun students(fnma:String, age:Int){
    println(fnma  + " is " + age + " years old")

}
fun cars( model:String,numberplate:String, year:Int){
    println(model + " with numberplate " +numberplate+ " was made in the year "+ year )
}


fun main(args: Array<String>) {
    emobilis()
    students(fnma = "Zard", age = 78)
    cars(model = "Subaru Impreza", numberplate = "KDK894H", year = 2012)
    cars(model = "Mercedes S500", numberplate = "KCU674D" , year = 2015)

}