class E {
    var name: String
    var age: Int = 1
    var height: Int = 2

    init {
        println("call Init Block!")
    }
    constructor(name: String) {
        this.name = name
        println("call Name Constructor!${name},${age},${height}")
    }

    constructor(name: String, age: Int) : this(name) {
        this.age = age
        println("call Age Constructor!${name},${age},${height}")
    }

    constructor(name: String, age: Int, height: Int) : this(name, age) {
        this.height = height
        println("call Name, Height Constructor!${name},${age},${height}")
    }
}
fun main(){
    val e = E("Young",100,200)
}