fun main(args: Array<String>) {

    // 확장 함수 기본
    fun extensionFunctionBasic() {

        println("===== extension function for String =====")

        fun String.toMarkdownInclined(): String {
            return "*" + this + "*"
        }

        fun String.toMarkdownBold(): String {
            return "**" + this + "**"
        }

        val txt1 = "ABCDE"
        println("original : " + txt1)
        println("inclined : " + txt1.toMarkdownInclined())
        println("bold : " + txt1.toMarkdownBold())

        println("===== extension function for String? null =====")
        fun String?.toMarkdownInclined(): String {
            return "*" + this + "*"
        }

        fun String?.toMarkdownBold(): String {
            return "**" + this + "**"
        }

        val txt2 = null
        println("original : " + txt2)
        println("inclined : " + txt2.toMarkdownInclined())
        println("bold : " + txt2.toMarkdownBold())

    }
    extensionFunctionBasic()

    // 확장 함수는 다형성 없이 정적 바인딩으로 동작한다
    fun extensionFunctionStaticBinding() {

        println("===== extension function for String =====")

        open class A

        class B: A()

        fun A.msg() = "This is A"

        fun B.msg() = "This is B"

        fun msg(a: A) {
            println(a.msg())
        }

        msg(B())  // 다형성이 있다면 "This is B"가 출력되겠지만 확장함수는 정적 바인딩이므로 "This is A"가 출력됨
    }
    extensionFunctionStaticBinding()

    // 확장 함수는 리시버의 private에 접근 가능할까?
    fun extensionFunctionAccessingPrivatePropertyOfReceiver() {

        println("===== extension function accessing private =====")

        class A {
            val a = "public"
            private val b = "private"
        }

        fun A.toUpper1(): String = this.a.toUpperCase()
//        fun A.toUpper2(): String = this.b.toUpperCase()  // 컴파일 에러. 즉 확장 함수는 리시버의 private에 접근 불가

        println(A().toUpper1())
    }
    extensionFunctionAccessingPrivatePropertyOfReceiver()
}
