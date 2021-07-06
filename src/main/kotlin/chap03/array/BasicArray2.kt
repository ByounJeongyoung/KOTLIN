package chap03.array

import java.util.*

// 중요1.[표현식을 통한 생성]
//       ex) val arr3 = Array(5(요소갯수), { i -> i * 2}(초깃값))
//       Array는 생성자를 통한(표현식으로) 배열 생성으로 초깃값을 만들수 있다  arrayOf() -> fun! 와는 다르다

// 공부 => 기존 배열에 변화가있다면 contentToString()으로 변화 시켜서 출력해야한다는것!

fun main() {

    val b = Array<Any>(10, { 0 })   //10개 0으로 초기화
    //Array<Any>를 통해 기존의 Int형을 변화 할수있다 <Any>로 하지 않으면 변경 불가
    b[0] = "Hello World"
    b[1] = 1.1
    println(Arrays.toString(b))

    val c = Array<Int>(10) { i -> i + 2 }
    println(c.contentToString())  //i = index
    //API사용
    println("${c.first()}")
    println("${c.last()}")
    println("${c.indices}")     //index값 범위  0..9
    println("${c.indexOf(1)}")  //값이 인덱스에 없으면 -1
    println("${c.average()}")
    println("${c.count()}")


    //위 의 API는 기존의 값 자체를 두고 get하는것이라고 보면 될것이다
    with(c) {
        reversedArray().apply {
            println(this.contentToString())               //반대 정렬
            sortedArrayDescending().apply {
                println(this.contentToString())               //내림 차순 정렬
            }
        }
    }


    val letters = arrayOf("i", "o", "k", "l", "t", "n")
//    val letters2 = arrayOf("i", "o", "k", "l", "t", "n")
//    val letters3 = arrayOf("i", "o", "k", "l", "t", "n")
//    letters.reverse(0, 3)
//    println("12. ${letters.reverse(0, 3)}")
//    for(i in letters){
//        println(i)
//    }
//    println("11. ${letters2.reversedArray()}")
//    for(i in letters2){
//        print(i)
//    }
//    println("12. ${letters3.reversed()}")
//    for(i in letters3){
//        println("222222${i}")
//    }

    //값 꺼내는 방법 1    -> 정수 형
    for (num in letters) {
        print(num)
    }
    //값 꺼내는 방법 2    ->리스트나 컬렉션에 좋음
    letters.forEachIndexed { index, s -> println("${index}, ${s}") }  //인덱스와 값을 함께 볼수있다

    //값 꺼내는 방법 3
    println(letters.contentToString())
}