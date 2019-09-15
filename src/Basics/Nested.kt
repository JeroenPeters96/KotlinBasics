package Basics

fun main(args: Array<String>) {
    val demo = Outer1.Nested().foo() // calling nested class method
    print(demo)
}
class Outer1 {
    class Nested {
        fun foo() = "Welcome to The TutorialsPoint.com"
    }
}