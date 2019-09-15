package Basics


fun main(args: Array<String>) {
    val demo = Outer2().Nested().foo() // calling nested class method

    print(demo)
}

class Outer2 {
    private val welcomeMessage: String = "Welcome to the TutorialsPoint.com"
    inner class Nested {
        fun foo() = welcomeMessage
    }
}
