fun main(args:Array<String>){
	val a:Boolean= isHigher(data:6)
	defineType(data:"Heyy Motherfucker")
}

fun isHigher(data:Int):Boolean=
	if(data>0){
		println("$data")
		"true"
	}
	else{
		println("$data")
		"false"
	}
fun defineType(data:Any){
	if(data is String){
		print(data.length)
	}else if(data is Int){
		print("${data*2 }")
	}else if(data  is Persona2){
		print("${data.name}")
	}
}