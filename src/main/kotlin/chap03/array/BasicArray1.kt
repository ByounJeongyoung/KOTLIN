package chap03.array

import java.util.*
//2021.07.05.Mon
//배열에서의 get() ,set() 속성을 알 수 있었습니다

/* Array 클래스의 속성  읽어보기!
public class Array<T> {

     초기값으로 람다식 함수로 정의!
   1.public inline constructor(size: Int, init: (Int) -> T)

     * Returns the array element at the specified [index]. This method can be called using the
     * index operator.
     * value = arr[index]
   2.public operator fun get(index: Int): T


     * Sets the array element at the specified [index] to the specified [value]. This method can
     * be called using the index operator.
     * arr[index] = value
   3.public operator fun set(index: Int, value: T): Unit                   //인덱스와 값이 기본 매개 변수!

     * Returns the number of elements in the array.
   4.public val size: Int
     * Creates an iterator for iterating over the elements of the array.
   5.public operator fun iterator(): Iterator<T>
}
*/
fun main() {
    val arr = arrayOf(1, 2, 3, 4, 5)

    //get -> 가져오기
    println(arr.get(2))
    println(arr[2])

    println(arr.size)

    for (ele in arr) {
        println(ele)
    }

    println(Arrays.toString(arr))   //괄호 쳐서 정렬
    println(arr.sum())

    //set 설정하기  -> index , value
    arr.set(1,8)
    println(Arrays.toString(arr))
}