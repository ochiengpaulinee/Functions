fun main(){
    greetingPerson(name="Steven")
    greetingPerson(name="Elizabeth")
    var x = division(num1 =50, num2 =15)
    println(x)
    var sum= addition(num1 =24, num2 = 45, num3 = 42, num4 = 70 )
    println(sum)
    var String= "I am very good with numbers"
    println(String)
}
fun greetingPerson(name: String){
    println("Hello $name")
}
fun division( num1: Int, num2: Int):Int{
    return(num1%num2)
}
fun addition(num1:Int,num2: Int,num3:Int,num4: Int): Int{
    var sum=num1+num2+num3+num4
    return(sum)
}
fun statement(me:String):String{
    return(me)
}