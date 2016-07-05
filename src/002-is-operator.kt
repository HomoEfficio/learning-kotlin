import java.util.*

fun main(args: Array<String>) {

    fun is_operator(obj: Any) {
        println("===== Smart Cast =====")

        if (obj is Int) { // is 연산자가 true를 반환하면 자동으로 캐스팅 됨
            println(obj * 7)
//            println(obj + " is Int")  // 숫자 + 문자열은 컴파일에러
        }
        else if (obj is String && obj.length > 0) { // && 에 진입한다는 것은 is 연산자가 true라는 의미므로 자동으로 캐스팅됨
            println(obj + " is String")
        }
        else {
            println("obj is still of Type `Any` : " + obj is Any)  // 앞의 문자열은 출력되지 않고 Boolean만 출력됨
        }
    }
    is_operator(3)
    is_operator("abc")
    is_operator(Date())
}
