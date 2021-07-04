package chap03.section1

class GenericNull<T>{
    fun EqualityFunc(arg1:T, arg2: T){
        println(arg1?.equals(arg2))
    }
}

fun main(args:Array<String>){
     val  obj = GenericNull<String>()
    obj.EqualityFunc("Hello","world")

    val obj2 = GenericNull<Int?>()
    obj2.EqualityFunc(null, 10)

    //String 과 String?는 다르다 널이 가능하려면 String? 해야한다
   //특정 자료형 제한시 <T:Int> 이렇게 해야한다
}