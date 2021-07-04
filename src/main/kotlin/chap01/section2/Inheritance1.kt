package chap01

//21.07.03 Sat
//상속
//open 키워드를 통한 선언
////부모클래스(기본클래스)에선 생성자 가 있으면 다 써줘야한다
////기본적으로 파생클래스는 파생 불가!
////코틀린은 묵시적으로 Any를 상속!
//class  ChildClass : ParentClass(){

open class Bird(var name: String, var wing: Int, var beak: String) {
    open fun fly() {
        println("Bird의 fly")
    }
}

class Lark(name: String, wing: Int, beak: String,var smile : String) : Bird(name, wing, beak) {
    fun singHiTone() {
        println("sing HiTone")
    }

    override fun fly() {    //오버라이드 정의
        println("Lark의 오버라이드된 fly")
    }
}

class Parrot : Bird {
    var language: String

    constructor(name: String, wing: Int, beak: String, language: String) : super(name, wing, beak) {
        this.language = language

    }

    fun speak() {
        println("Speak ${language}")
    }
}

fun main() {

    val lark = Lark("myLark", 2, "short", "smile")
    val lark_: Bird = Lark("myLark", 2, "short", "smile")

    lark.fly()
    lark_.fly()  //Bird의 Fly메소드 호출을 위해선 그냥 Bird()를 호출해야한다
}