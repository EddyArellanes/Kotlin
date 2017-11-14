fun main(args: Array<String>) {
val persona = Persona2(name= "Rogelio", edad= 30)
println(persona)
}

//Simple declaration of class
class Person{
	fun greet():Unit{
	println("¡Hello!")
	}
}
//Declare constructor
class Animal constructor(val name:String){
	fun greet():Unit{
		println("Rawwwwr!")
	}
}
//Constructor shorter
class Animal2(val name:String){
	init{
		println("Nombre: $name")
	}
}

class Persona2 (val name:String ){
	init{
	println("Nombre $name")
	}

	constructor(name:String, edad:Int) :this(name){
	    println("Nombre $name, edad $edad")
	}
}

