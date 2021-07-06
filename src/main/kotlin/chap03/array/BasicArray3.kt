package chap03.array
//2021.07.06 화
//배열의 정렬

//정렬된 배열을 반환
//sortedArray,sortedArrayDescending()  -> 새로 저장  => 반환(변수)배열!
//원본 배열에 대한 정렬을 진행
//sort() , sortDescening()

//원본영향을 끼치는것  :Unit   arr.sort() ,sortDescending()이 자체로 출력
//           리스트형으로 반환 sorted(),sortedDescending()
//                         sortBy{array -> array.알파}

//원본영향을 끼치지 않는것 -> 반환을 하므로! -> 변수를 쓰거나 바로 출력해서 사용
// sortedArray,sortedArrayDescending: Array<T>


//---------------------------------------------------------------[sortwith 보류!]
fun main() {
    val arr = arrayOf(8, 4, 3, 2, 5, 9, 1)

    arr.sortedArray()
    println(arr.contentToString())    //오름차순
    println(arr.sortedArrayDescending().contentToString()) //내림차순
    println(arr.contentToString())
    arr.sort() //범위 설정 가능,원본 배열에 대한 정렬! ,반환 Unit!
    arr.sortDescending()
    println(arr.contentToString())


    val arr2 = arrayOf(3, 4, 5, 1, 2)
    println(arr2.sorted())              //리스트형이라 바로 출력가능!,원본은 바뀌치 않음,자체적으로 출력
    println(arr2.contentToString())
    println(arr2.sortedDescending())

    val arr3 = arrayOf<String>("Dog", "Cat", "Lion", "KangRoo", "po", "a")
    arr3.sortBy { arr3 -> arr3.length }  //길이대로 반환 ,원본 배열에 영향 ,sortBy는 기준을 잡고 정렬가능
    println(arr3.contentToString())

    val arr4 = arrayOf(1, -3, 4, 5, 6, 0, -3)
//    arr4.filter { it -> it > 0 }
    arr4.filter { it -> it > 0 }            //반환은 리스트! 원본 영향
        .forEach{it -> println("${it}")}  //출력

}

