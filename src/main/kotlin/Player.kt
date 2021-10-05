class Player {
    var name: String = ""
    var Team: String = ""
    var age: Int =0
    var height: Int =0
    var skillrate = (0..100).random().toFloat()/(0..100).random().toFloat()

    constructor(name: String,Team: String, age: Int, height: Int) {
        this.name = name
        this.Team=Team
        this.age = age
        this.height = height

    }
}