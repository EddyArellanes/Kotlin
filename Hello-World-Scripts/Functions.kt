fun main(args:Array<String>){
	println(maxFast(a=12,b=8))
}
//Unit equals to Void in Java, you can Skipped but is better if you put it.
fun hello():Unit{
	println("hola")
}
fun sum(a:Int,b:Int){
	println("La suma de $a y $b es igual a ${a+b}")
}
//What is the big number function
fun max(a:Int,b:Int):Int{

	if(a>b){
		return a
	}else{
		return b
	}
}
//Equals to max but simplified
fun maxFast(a:Int,b:Int)= if(a>b) a else b