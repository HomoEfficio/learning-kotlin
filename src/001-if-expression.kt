fun main(args: Array<String>) {

    fun ifExpression() {

        // ifExpression() 을 여기에서 호출하면 컴파일에러

        // 조건식
        fun ifExpression() {
            println("===== if expression =====")

            val a = 1
            val b = 2

            println( if (a > b) a else b )

            // 대신 3항연산자가 없다..
//        println( a > b ? a : b)  // 컴파일에러
        }
        ifExpression()
    }

}