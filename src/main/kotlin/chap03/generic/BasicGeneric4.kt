package chap03.generic
//21.07.04 Sun
//1.제네릭을 활용한 연산 [숫자형만 받을수있게]
//2.상 하위 클래스 -> 하위 자료형은 상위 자료형으로 자연스럽게 형 변환이 이루워진다
//3.형식 매개변수로 선언된 함수의 매개변수 연산

//[1]제네릭을 활용한 연산 개념
class Calc<T : Number> {  //클래스의 형식 매개변수 제한

    fun plus(arg1: T, arg2: T): Double {
        return arg1.toDouble() + arg2.toDouble()
    }
}
//[3] 형식 매개변수 개념
//반환값에서 자료형을 결정할수 없다

fun <T> add(a: T, b: T, op: (T, T) -> T): T {
    return op(a, b)  // a + b 불가능 하직 자료형을 모르므로!
}

fun main(args: Array<String>) {

    val calc = Calc<Int>()
    println(calc.plus(10, 20))

    val calc2 = Calc<Double>()
    println(calc2.plus(3.22, 3.53))

    // val calc3 = Calc<String>() String 형식은 올수 없다

//[2] 상하위 클래스 개념
    val integer: Int = 1
    val number: Number = integer        //Number는 integer의 부모! 따라서 가능   반대 불가능
    val nullableInteger: Int? = integer //Int?는 널 포함 이므로 가능!            반대 불가능


//[3] 형식 매개변수

    val result = add(2, 3, { a, b -> a + b })  //둘다 가능
    val result1 = add(2, 3) { a, b -> a + b }  //둘다 가능 추천!

    print("${result} , ${result1}")
}




