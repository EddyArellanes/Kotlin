
fun main(args:Array<String>){
	//int array
	val arrayNumbers= intArrayOf(1,2,3,99)
	/*--------Lists---------*/
	val listString:ArrayList<String> = arrayListOf("Java","Kotlin","Android")
	//Implicit form
	//val listString = arrayListOf("Java","Kotlin","Android")
	val kotlin= listString[1]
	//classic get element of an array
	val num:Int= arrayNumbers[0]

	//Replace values into array
	arrayNumbers[2]=999
	//Or
	//Position, Value
	arrayNumbers.set(2,10)

	/*-----Mutable Arrays :D -----*/
	val mutableList:MutableList<Int> = mutableListOf(1,2,3,4,5,6,7)	
	//add new element
	mutableList.add(8)
	//new element in index where you want, params(index, element)
	mutableList.add(0,10)
	//Replace value of an element
	mutableList[0]=0

	/*------------Maps-------------*/
	val map:MutableMap<String,Int> = mutableMapOf<String,Int>(Pair("id",999))
	map.put("id", 888)
}