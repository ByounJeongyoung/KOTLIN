
//클래스의 정의와 주 생성자의 사용
class Bird(var name: String,var wing: Int,var beak : String, var color : String = "blue"){

    //프로퍼티(속성)추가 즉!고정된값을 넣고 싶을때

    fun fly() = println("Fly wing: $wing")   // 메서드들(함수) Line 23,24에서 호출
    fun sing(vol: Int) = println("Sing vol: $vol")
}
//객체를 만들때
fun main() {

    val coco = Bird("coco",2,"long")  // 주 생성자를 이용해 객체(instance 생성)
    println(coco.name)
    println(coco.wing)
    println(coco.beak)
    coco.color = "red"  //객체의 프로퍼티에 값을 변경 할 수있습니다

    println(coco.color)
    coco.fly()          //객체의 멤버 메서드의 사용
    coco.sing(3)
}
