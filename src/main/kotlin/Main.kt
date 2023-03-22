fun main() {
val toyo = Car("Toyota","Prado","KDG 112B",0)
    val audi = Car("Audi","A4","KCT 300F",0)
    audi.start()
    println(audi.speed)
    audi.accelerate(acceleration =60)
    println(audi.speed)
    audi.accelerate(acceleration=35)
    println(audi.speed)

    audi.start()
    println(audi.speed)
    audi.decelerate(decelerate =40)
    println(audi.speed)
    audi.decelerate(decelerate =20)
    println(audi.speed)

    audi.stop()
        println(audi.speed)
var myBook = Book("Born a crime","Trevor Noah",288,2017)
    println(myBook.title)
    println(myBook.pages)



}
class Car(var make:String,var model:String,var registration:String,var speed: Int) {
    fun start() {
        println("chagio gio vuuuum")
    }
    fun accelerate(acceleration: Int):Int{
        speed += acceleration
        return speed
    }
    fun decelerate(decelerate: Int):Int{
        speed -= decelerate
        return speed
    }
    fun hoot(){
     println("beep beep")
    }
    fun stop(){
        speed = 0
        println("krichhuiy")
    }
}
data class Book(var title:String,var author:String,var pages:Int,var year:Int)
data class AgeStatus(var max:Int,var min:Int,var mean:Double,var medium:Double)

