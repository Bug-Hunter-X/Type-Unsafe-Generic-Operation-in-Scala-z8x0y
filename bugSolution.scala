```scala
class MyClass[T](val value: T)(implicit num: Numeric[T]) {
  def myMethod(x: T): T = {
    num.plus(value, x) 
  }
}

val myIntInstance = new MyClass(5)
val sumInt = myIntInstance.myMethod(3)
println(sumInt) // Output: 8

// The following line will now result in a compile-time error
// because Numeric[String] is not defined.
// val myStringInstance = new MyClass("hello")
// val sumString = myStringInstance.myMethod(" world")
// println(sumString)
```