fun main() {
    val p1 = Person("David", 42)

    val s1 = Student("Lois",
        22, "G")

    val t1 = Teacher("Susan", 30, 100)

    val listOfPerson = mutableListOf<Person>()

    listOfPerson.add(p1)
    listOfPerson.add(s1)
    listOfPerson.add(t1)

    for(p in listOfPerson) {
        println(p.name)
    }



}