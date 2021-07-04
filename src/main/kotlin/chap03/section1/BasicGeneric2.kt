package chap03.section1

//String 과 String?는 다르다 널이 가능하려면 String? 해야한다
//<T:Number> 이렇게 한정 할수있다
//상위 클래스는 하위 클래스로 캐스팅 가능하지만 하위 클래스는 상위 클래스에 캐스팅 할수 없다
class GenericNull<T> {
    fun EqualityFunc(arg1: T, arg2: T) {
        println(arg1?.equals(arg2))
    }
}

//<T:Number> 이렇게 한정 할수있다
class GenericNull2<T : Number> {
    fun Add1(arg1: T, arg2: T) {
        arg1?.let { arg1 -> print(arg1) }
        arg2?.let { arg2 -> println(arg2) }

        arg1?.apply {
            println(arg1)
            print(arg2)
        }
    }
}

fun main(args: Array<String>) {
    val obj = GenericNull<String>()
    obj.EqualityFunc("Hello", "world")

    val obj2 = GenericNull<Int?>()
    obj2.EqualityFunc(null, 10)

    val obj3 = GenericNull2<Float>()
    obj3.Add1(2.3F, 3.5F)
    val obj4 = GenericNull2<Int>()
    obj4.Add1(3, 5)
}