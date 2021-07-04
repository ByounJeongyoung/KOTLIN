package chap01.Section3
//다형성
//
//이름이 동일한 것처럼 보이지만 매개변수가 서로 다른 형태를 취하거나 실행 결과를 다르게 가질 수 있는 것을 다형성(polymorphism) 이라고 합니다.
//
//예를 들어 버튼의 ‘누르다’라는 행위에 대해 생각해 봅시다. 메서드로 설계하면 push() 정도가 되겠죠? 하지만 이 누르는 행위가
// ‘취소’ 버튼에 적용되면 프로그램 종료를 수행하고, ‘저장’ 버튼에 적용하면 작업을 저장하는 일을 진행합니다. 즉, ‘누르다’라는 같은 이름의 push() 메서드로
// 서로 다른 동작을 하는 것이죠.
// 이처럼 상위와 하위 클래스에서 메서드나 프로퍼티의 이름은 같지만 기존의 동작이 다른 동작으로 재정의하는 것을 오버라이딩(overriding)이라고
// 부릅니다.
//
//이번에는 동작은 같지만 입력 인자가 다른 경우를 생각해 봅시다. 동일한 클래스에서 ‘출력한다’라는 행위를 print() 라는 같은 이름의 메서드로 여러 개를 만들 때
// print(123)과 같이 인자로 숫자를 사용해 출력하거나 print("hello")와 같이 문자를 사용해 출력할 수 있습니다.
// 출력의 동작은 동일하지만 인자의 형식만 달라지는 경우로 오버로딩(overloading) 이라고 부릅니다.

// 상속 가능한 클래스를 위해 open 사용
open class Bird(var name: String, var wing: Int, var beak: String, var color: String) {

    // 메서드
    fun fly() = println("Fly wing: $wing")
    open fun sing(vol: Int) = println("Sing vol: $vol") // 오버라이딩 가능한 메서드
}

class Parrot(
    name: String,
    wing: Int = 2,
    beak: String,
    color: String, // 마지막 인자만 var로 선언되어 프로퍼티가 추가되었음을 알 수 있다.
    var language: String = "natural"
) : Bird(name, wing, beak, color) {

    fun speak() = println("Speak! $language")  // Parrot에 추가된 메서드
    override fun sing(vol: Int) { // 오버라이딩된 메서드
        println("I'm a parrot! The volume level is  $vol")
        speak() // 달라진 내용!
    }
}

fun main() {

    val parrot = Parrot(name = "myparrot", beak = "short", color = "multiple")
    parrot.language = "English"

    println("Parrot: ${parrot.name}, ${parrot.wing}, ${parrot.beak}, ${parrot.color}, ${parrot.language}")
    parrot.sing(5) // 달라진 메서드 실행 가능
}

//오버 로딩의 예
fun add(x: Int, y: Int): Int {
 return x + y
}

fun add(x: Double, y: Double) : Double{
    return  x + y
}

fun add(x: Float, y :Float) : Float{
    return x + y
}