fun main(args: Array<String>) {
    // for loop
    // write a kotlin program that uses a for loop yo print out even numbers between 1 and 10
    for (i in 10..20){
        println("Loop $i")
    }
    var myarray= arrayOf("Brad","Donda","Kodak")
    for (jina in myarray){
        println(jina)
    }
    //while loop
    var nambari=23
    while (nambari<=5){
        println("Loop $nambari")
        nambari+=2
    }
    var mynumber=37
    while (mynumber>=16){
        println("Loop $mynumber")
        mynumber--
    }

    //do..while loop
    var numloop=100
    do {
        println("loop $numloop")
        numloop+=2
    }while (false)

    for (i in 1..20){
        if (i%2==0)
        println(" $i")}




}