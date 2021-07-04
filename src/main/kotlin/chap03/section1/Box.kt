package chap03.section1

//자료형이 결정되지 않음
class Inform<T>( var name: T) //주 생성자는 바로 프로퍼티 정의 가능
class Inform2<T>{
    val myAge: T
    constructor(myAge: T) {
        this.myAge = myAge
    }
}
//ctrl + shift + p  형식 볼수있다
fun main() {
    //주 생성자 사용
    val person:Inform<Int> = Inform<Int>(1) //val box1 = Box(1)  추론 가능하므로 생략가능
    val person2 = Inform("jeongyoung")
    println(person.name)
    println(person2.name)

    //부 생성자 사용
    val person3 = Inform2(23)
    val person4 = Inform2("스물셋")
    println(person3.myAge)
    println(person4.myAge)
}