```scala
class MyClass[T](val value: T) {
  def myMethod(x: T): T = {
    // This line attempts to perform an operation on the type T, 
    // which might not be supported by all types.
    value + x 
  }
}

val myIntInstance = new MyClass(5)
val sumInt = myIntInstance.myMethod(3)
println(sumInt) // Output: 8

val myStringInstance = new MyClass("hello")
val sumString = myStringInstance.myMethod(" world")
println(sumString) // Output: Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 5
```