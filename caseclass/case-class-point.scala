case class Point(x : Int , y : Int)
{

  // add two given points
  def + ( i : Point)  = Point(this.x +i.x , this.y + i.y)

  // move a point by a given distance dx and dy
  def move ( dx : Int , dy : Int) = Point(this.x + dx , this.y + dy)

  //  distance between two given points
  def distance ( p : Point): Double = scala.math.sqrt((scala.math.pow((p.x - this.x),2) + scala.math.pow((p.y - this.y),2) ))
  
  // invert switches the x and y coordinates.
  def invert()  = Point(this.y , this.x)


}
object caseClass extends App {

  val A = Point(10,20)
  val B = Point(100,200)

  val sum = A + B;
  val move = A.move(15,15)
  val distanceAB = A.distance(B)
  val invertAB =  A.invert()

  println("Addition of A and B  : " + sum )
  println("Move A by 15,15 :" + move)
  println("Distance between A and B :" +distanceAB)
  println("Invert of A :" + invertAB)



}