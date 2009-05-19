/*
Run-length encoding of a list. Use the result of problem P09 to implement the so-called run-length encoding data compression method. Consecutive duplicates of elements are encoded as lists (N E) where N is the number of duplicates of the element E.

Example:

    * (encode '(a a a a b c c a a d e e e e))
    ((4 A) (1 B) (2 C) (2 A) (1 D)(4 E))
*/
//this should be builtin in 2.8
def group[T](list: List[T]): List[List[T]] = list match {
  case Nil   => Nil
  case x::xs => {
    val (ys,zs) = xs.span(_==x);
    (x::ys)::group(zs) 
    }
}


def encode[T](list: List[T]): List[Tuple2[Int,T]]= 
    group(list).map(x=>(x.size,x.head))


println(encode(List.fromString("aaaabccaadeeee")))

// vim: set ts=4 sw=4 et:
