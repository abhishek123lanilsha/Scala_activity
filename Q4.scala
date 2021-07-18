import scala.io.StdIn._
import scala.util.control.Breaks._

object Number{  
    def main(args:Array[String]){  
        var num:Int=0
        var result:String=""
        
        print("Enter number: ")
        num = scala.io.StdIn.readInt()
        
        result = if (num%2==0) "EVEN" else "ODD"
        
        println("Number is: "+result)
    }  
}