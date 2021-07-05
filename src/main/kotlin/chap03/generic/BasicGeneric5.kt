package chap03.generic
//2021.07.05.Mon

/*가변성의 3가지 유형
무변성 :서로 관계가 없다 ,따로 지정하지 않으면 기본적으로 무변성,공변성 ,반 공병성 */


//무변성
class Box<T>(val size : Int)

//공변성(상속과 비슷)(상위 클래스 자료형을 하위클래스의 자료형이 허용)
class Box1<out T>(val size: Int)

//반 공병성 (하위 클래스의 자료형을 상위 를래스의 자료형이 허용)
class Box2<in T>(val size: Int)

fun main(args:Array<String>){
//    val anys : Box<Any> = Box<Int>(10)          //자료형 불일치   Erorr
//    val nothing : Box<Nothing> = Box<Int>(20)   //자료형 불일치   Erorr

//    공변성
//    val anys : Box1<Any> = Box1<Int>(10)        //관계 성립 가능

//    반  공변성
//    val anys : Box2<Any> = Box2<Int>(10)        //자료형 불일치   Erorr
//    val nothing:Box2<Nothing> = Box2<Int>(20)   //관계 성립 가능
}

