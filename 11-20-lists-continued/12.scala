/*
(**) Decode a run-length encoded list. Given a run-length code list generated as specified in problem 11. Construct its uncompressed version.

Example in Haskell:
P12> decodeModified [Multiple 4 'a',Single 'b',Multiple 2 'c',Multiple 2 'a',Single 'd',Multiple 4 'e']
"aaaabccaadeeee"
*/

//not really typed
def decodeModified[T](list: List[Any]): List[T] = 
    list.flatMap({
        case (n:Int,k:T)=> new Range(0,n,1) map(i=>k)
        case x: T => List(x)
    })

println(decodeModified(List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))))

// the heavy OO "anti-if  campaign" version
abstract class EncodedItem[T] {
    def decode(): List[T] 
}
case class SingletonItem[T](x:T) extends EncodedItem[T] {
    override def decode(): List[T] = List(x)
}
case class PairItem[T](n: Int, x:T) extends EncodedItem[T] {
    override def decode(): List[T] = new Range(0,n,1).map(i=>x).toList
}

type EncodedList[T] = List[EncodedItem[T]]

def decodeModified2[T](list: EncodedList[T]): List[T] = 
    list.flatMap( _.decode)

println(decodeModified2(List(PairItem(4,'a), SingletonItem('b), PairItem(2,'c), PairItem(2,'a), SingletonItem('d), PairItem(4,'e))))
// vim: set ts=4 sw=4 et:
