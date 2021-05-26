data class PersonData(val name: String = "", val surname: String = "", val age: Int = 0)
{
    fun getPerson(): String = "$name $surname, Age: $age";
}

fun main() {
    val person: PersonData = PersonData("Joe", "Doe", 20)
    println(person.getPerson())
}

main()