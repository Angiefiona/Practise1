fun main(){
    school()
    place()
    specific()
    var statement = nameAnnabel ("Annabel", 20)
    println(statement)
    var identity = nameStacy("Stacy", 23)
    println(identity)
    var output = nameMwihaki("Mwihaki", 25, "1997")
    println(output)
    hername("Jayden")
    hisName("Jayson")
    text("Marakwet")
    word()
    var stmt = nameTed("Ted", 30)
    println(stmt)
    digits("o768214929")
    myName("Denzel")
    our("Shayen")





}
fun school(){
    var school = "AkiraChix"
    println(school[0]+" "+ school[2]+ " "+ school[3])

}
fun place(){
  var country = "Kampala"
    println(country[3]+ " "+ country[4]+ " "+ country[5])
}
fun specific(){
    var building = "laboratory"
    println(building[2]+ " "+ building[3]+ " "+ building[4]+" "+building[5])
}
fun nameAnnabel(name: String, Age: Int): String{
    var statement = "Hi my name is $name, I'm $Age years old."
    return(statement)
}
fun nameStacy(name:  String, Age: Int):String{
    var identity = "Hi my name is $name, I,m 23 years old."
    return(identity)

}
fun nameMwihaki(name: String, Age: Int, year: String): String{
    var output = "Hi, my name is $name, I,m $25 years old, Born in $year."
    return(output)
}
fun hername(name: String){
    if(name.equals("Trizah")) {
        println("That's me")
    } else
        println("I don't know who that is!")


}
fun hisName(name: String){
    if(name.equals("Jayson")){
        println("that's me")
    } else
        println("I don't know who that is!")
}
fun text(word:String) {
    word.length
    println(word.length)

}
fun word (){
    var county = "Machakos"
    println(county[2]+ " "+ county[3]+ " "+ county[4]+ " "+ county[6]+ " "+ county[7])
}

fun nameTed(name: String, Age: Int): String{
    var stmt = "Hello. My name is $name, I'm $Age years old."
    return stmt
}
fun digits(number: String){
    number.length
    println(number.length)
}


fun myName(name: String){
    if (name.equals("Denroy")){
        println("That's me")
    } else
        println("I don't know who that is.")
}
fun our(name: String){
    if (name.equals("Shayen")){
        println("That's my name")
    } else
        println("I don't know who that is!")
}