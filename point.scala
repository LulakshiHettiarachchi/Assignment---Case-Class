

object point  extends App{
  case class  Point(a:Int,b:Int){
    def x:Int=a
    def y:Int=b
    
     def +(c:Point) = Point(this.x + c.x, this.y + c.y)
     def move(dx:Int=0,dy:Int=0)=Point(this.x+dx,this.y+dy)
     def distance(d:Point)=math.sqrt(math.pow((this.x - d.x),2) + math.pow((this.y - d.y),2))
     def invert()=Point(this.y,this.x)
    
}
  
  val p1=Point(2,5)
  val p2=Point(3,4)
  println("p1")
  println(p1)
  println("p1")
  println(p2)
  println("Add p1 , p2")
  val p3=p1+p2

  println(p3)
  println("Move p1 by a given distance dx=2 and dy=3")
  val p4=p1.move(2,3)
  println(p4)
  println("Invert (switch the x and y coordinates)")
  val p5=p1.invert()
  println(p5)
  println("Distance between p1 , p2")
  val p6=p1.distance(p2)
  println(p6)
}