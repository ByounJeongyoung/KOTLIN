package chap03.section1
//21.07.04 Sun
// 3.제네릭 함수
// 해당 함수나 메서드 앞쪽에서 <T>지정
// 자료형의 결정은 함수가 호출될때 컴파일러가 자료형 추론

fun <T> find(a: Array<T>, Target: T): Int {
    for (i in a.indices) {
        if (a[i] == Target) return i
    }
    return -1
}

fun main() {
    val arr1: Array<String> = arrayOf("Apple", "Banana", "Cherry", "Durian")
    val arr2: Array<Int> = arrayOf(1, 2, 3, 4)

    println("arr.indices =  ${arr1.indices}")
    println(find<String>(arr1,"Cherry"))
    println(find<Int>(arr2,2))
}