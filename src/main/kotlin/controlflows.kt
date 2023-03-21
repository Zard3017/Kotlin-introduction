fun main(args: Array<String>) {
    var num=6
    var num1=-78
    // if statement
    if (num>12){
        println("Its true")
        var r=14
        var g=13

        println(r+g)
    }
    // if..else statement
    else{
        println("Its false")
    }
    // if..elseif..else statement
    if (num1<0) {
        println("The number is negative")
    } else if (num1 >0 && num1<10){
        println("This is a single digit number")

    }
    else if (num1>=10 && num1<100){
        println("This is a double digit number")
    }
    else
        println("It has three or more digits")

}