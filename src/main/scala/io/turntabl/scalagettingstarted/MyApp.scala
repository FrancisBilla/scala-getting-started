package io.turntabl.scalagettingstarted

object MyApp extends App {
    print("Hello, World!")


    //2: printing first name with place of birth
    val firstName = "Francis"
    val pob = "Batama"
    print(s"$firstName was born in $pob")

    //3:
    def threeTimes(input: String)= input*3


    //4:
    def even(i: Int)= if(i % 2 == 0) print("Even") else print("")
    even(6)

    //5

    def odd(x: Int)=if(x % 2 != 0) print("odd number")else(even(x))

    odd(9)

    //6
    //def wordsToLower(word: String*)= word map(_.toLowerCase)

    def toLength(s: String) = {
        //val foo: java.lang.String = "hello"
        //sfoo
    }

    def wtl(words: String*) = words.map(_)
}

