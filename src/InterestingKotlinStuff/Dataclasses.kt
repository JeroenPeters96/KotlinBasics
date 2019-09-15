package InterestingKotlinStuff

data class Post(val message: String? = null, val description : String)
data class PostList(val posts: List<Post>) //Mogelijkheid om getters en setters aan te passen <- zoek dit nog op


//val postList1 = PostList(listOf(Post("seemsgood")))
//val postList2 = PostList(listOf(Post("seemsgood")))

val pstlist = PostList(emptyList())
fun main() {
    val lijst : List<String> = emptyList()
    val post = Post(null, "desc")
    var late : Int = 10 // mag gereassigned worden

    late = 12

//    lateinit var abc = "abc" //zoek lateinit op

    when(late) //Cases
    {
        10 -> println("aabc")
        12 -> println("nicememe")
    }

    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }



    when(MyInterface) //Kan ook gebruikt worden bij implementaties van interfaces
    {                   //Wanneer niet alle cases zijn afgevangen, compileert je code niet
        Impl1 -> println("Class1")
        Impl2 -> println("Class2")
    }

///     STREAM API
//    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
//    fruits
//        .filter { it.startsWith("a") }
//        .sortedBy { it }
//        .map { it.toUpperCase() }
//        .forEach { println(it) }

    post.message!!     //forceer een nullpointer

    pstlist.posts?.let {
        //check if not null

//    println(postList1 == postList2)
    }

    val post2  = post.copy( description = "heel mooi")
}

fun printDat(a: Post){
    println(a)
}

class Injecting {

    val ABC = 12

    companion object {
        fun injectThis(a : Int) : MyService?
        {
            val ABCD = 12
        }

    } //Zoek dit op
}

@Service
class MyService {

}

//voordelen:
// het draait in de JVM naast Java
// algemene leesbaarheid -> alles is vaak korter
// nullability, code compileert niet wanneer een null case niet is afgevangen etc
// VAL


//nadelen
// soms ook snel onleesbaar door onbekende termen als  let, "it", "run" etc
// niet alle libs zijn kotlin native
// het heeft geen package private -> kan opgelost worden door gradle modules
