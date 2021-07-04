package chap01.Section3


open class A

class B : A()


fun main() {

    val c: A = B()

    val d: B = B()
// 타입 미스패치
}