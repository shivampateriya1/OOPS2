class Difference(var name: String, var age: Int) extends Ordered[Difference] {
  def compare(that: Difference): Int = {
    this.name compare that.name match {
      case 0 => {
        if (this.age.equals(that.age))
          println("True\n Name and Age are same.. ")
        else
          println("False\n Name are same but age has difference");
        0
      }
      case other => {
        if (this.name.length.equals(that.name.length) && this.age.equals(that.age))
          println("True");
        else
          println("False");
        1
      }
    }
  }
}

object Difference extends App {
  var personOne = new Difference("SHivam pateriya", 23)
  var personTwo = new Difference("Girish Kumar Goyal", 21)
  personOne compare personTwo
}