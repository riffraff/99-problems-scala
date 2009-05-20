/*
(**) Drop every N'th element from a list.

Example:
* (drop '(a b c d e f g h i k) 3)
(A B D E G H K)

*/
import scala.collection.mutable.ListBuffer
def drop[T](list: List[T], n: Int): List[T] = {
    val buff=new ListBuffer[T]
    var i= 0
    list.foreach(x=>{i+=1; if (i%n !=0) buff+=x})
    buff.toList
}
def drop2[T](list: List[T], step: Int): List[T] = {
    def helper(l:List[T], i:Int):List[T] = (l,i) match {
        case (Nil, _) => Nil
        case (_, 1)   => helper(l.tail, step)
        case _        => l.head::helper(l.tail, i-1)
    }
    helper(list, step)
}


println(drop(List.fromString("abcdefghik"),3))
println(drop2(List.fromString("abcdefghik"),3))
    
// vim: set ts=4 sw=4 et:
