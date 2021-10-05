fun main(args: Array<String>) {
    var na= arrayOf("ard","naam","sith","garp","ace","bart","homer","quak")
    var teams= arrayOf("bears","eagles","ducks","lost")
    var team= ArrayList<Player>()
    var avgskill: Float
    var avghieght:Float
    while(team.size<20){
        var n= na[(0 until na.count()).random()]
        var te=teams[(0 until na.count()).random()]
        var a={ n: String, te:String -> team.add(Player(na[(0 until na.count()).random()], teams[(0 until teams.count()).random()], (18..40).random(), (100..200).random(),),)}
    }
    var n=0f
    avghieght= run { for (i in team) n += i.height;n / team.size - 1 }
    avgskill= run { for (i in team) n += i.skillrate;n / team.size - 1 }
    println("byskill ")
    ///i give up i hate lambda i will just stick with functions
}