package id.ac.polbeng.Nurul.test_kelas

class Employee(_id: Int, _name: String, _age: Int){
    val id: Int =_id
        get()=field

    var name: String = _name
        get() = field
        set(value){
            field = value
        }

    var age: Int = _age
        get() = field
        set(value) {
            field = value
        }
}
fun main(){
    val emp = Employee(1101, "jono", 25)
    println("Id :${emp.id}, Nama : ${emp.name}, Umur : ${emp.age}")
}