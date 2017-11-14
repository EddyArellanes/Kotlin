/**/
object Validations{
	/*
	fun password(psw:String):Boolean{

		if(psw.length>0 && psw.length>10){
			return true
		}else{
			return false
		}
	}
	*/
	fun password(psw:String) =psw.isNotEmpty() && psw.length>10
	fun isNumeric(dato:Any)= dato is Int
	
}
class UniversalClass{
	companion object{
		fun create():UniversalClass= UniversalClass()
	}
}
fun main(args:Array<String>){
	println("Ingresa tu contraseña" )
	val pass:String= readLine()!! //!! = No importa si es nulo
	println(Validations.password(pass))	

	val number:Int= readLine()?.toInt() ?:0
	println(number)
	println(Validations.isNumeric(number))

	val universe:UniversalClass= UniversalClass.create()
}