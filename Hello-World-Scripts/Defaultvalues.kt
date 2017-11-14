//It's default value is Hello everyone, but if you send a string it will be replaced :D
fun greet(saludo: String = "Hello everyone"):Unit{
    println(saludo)
}
//Other great thing for default value is, that is we specify the exact name of our variables, we cand send the 
//Parameters in disorder like this
fun showPersonInfo(name: String = "NoName", phone: Int = 0, isAdult: Boolean = true){
    println("Your name is: $name, your phone is: $phone, if your are adult is : $isAdult")
}

fun main(args: Array<String>) {
    greet("Hola que paso")
    greet()
    //No parameters
    showPersonInfo()
    //In order
    showPersonInfo("Eddy A.B" , 555555 , false)
    //In disorder but with exact names
    showPersonInfo(isAdult = true, phone = 555555, name="Eddy A.B")
        

}