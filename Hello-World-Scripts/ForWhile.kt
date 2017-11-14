fun main(args:Array<String>){
	val numberList:IntArray= intArrayOf(1,2,3,4,5,6);
	for(i:Int in numberList.indices){
		print(numberList[i])
	}
	val fruits:List<String> = listOf("Apple","Banana","Pineapple","Graples")
	for(fruit:String in fruits){
		print(fruit)
	}
	var count=3
	while(count>0){
		count--
		print(count)
	}

	var sum:Int=0
	var input:String?="" //Nulleable
	do{
		print("Ingress a Number")
		input=readLine()
		sum= input?.toInt() ?: 0

	}while(input != "0")
	println("La suma es $sum")
}