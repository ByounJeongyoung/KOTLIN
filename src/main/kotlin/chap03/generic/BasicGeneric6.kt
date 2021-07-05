package chap03.generic
//2021.07.05.Mon

open class Animal(val size : Int){
    fun feed() = println("Feeding..")
}

class Cat(val jump : Int) : Animal(50)

class Spider(val poison : Boolean): Animal(1)


//형식을 Animal로 제한한점
class Zoo<out T : Animal>(val element: T){
    fun getAnimal() : T = element   //An
}

fun main(){
    val c1 = Cat(10)
    val s1 = Spider(true)

    var a1: Animal = c1  //클래스의 상위 자료형 변환은 문제없음
    a1 = s1              //a1은 spider객체로 변환
    println(a1.size )
    println(a1.poison)   //스마트 캐스팅

    val c2 : Zoo<Cat> = Zoo(Cat(10))
    println(c2.element.jump)
    val c3 : Zoo<Animal> = Zoo(Cat(10)) //println(c2.element.jump) 불가능
}