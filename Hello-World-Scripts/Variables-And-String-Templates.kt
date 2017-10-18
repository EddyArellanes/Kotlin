fun main(args:Array<String>){
	
	/*
	This is a Explicit type of variable but is not needed, Kotlin recognize the type
	val name:String= "Eddy"
	var age:Int= 99
	*/
	//Val is equals to const in other languages
	val name= "Eddy"
	//Normal Variable
	var age=99	
	//Normal Method to Print
	println("This is a old method to print text + variables:")
	println("My name is "+name+" and I'm "+age+" years old")
	println("And this is the new with Template String:")
	//String Templates Here
	println("My Name is $name and I'm $age years old")
	//Add Operations into Brackets
	println("Now with Operations included");
	println("My Name is $name and I'm now ${age+1} years old")
}