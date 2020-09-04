open class Person(var name : String,
                var age : Int)

class Student(name: String, age : Int, var grade: String) : Person(name, age)

class Teacher(name: String, age : Int, var salary : Int) : Person(name, age)