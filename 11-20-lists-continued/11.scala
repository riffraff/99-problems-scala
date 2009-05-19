/*
(*) Modified run-length encoding. Modify the result of problem 10 in such a way that if an element has no duplicates it is simply copied into the result list. Only elements with duplicates are transferred as (N E) lists.

Example:
* (encode-modified '(a a a a b c c a a d e e e e))
((4 A) B (2 C) (2 A) D (4 E))
*/

def group[T](list: List[T]): List[List[T]] = list match {
  case Nil   => Nil
  case x::xs => {
    val (ys,zs) = xs.span(_==x);
    (x::ys)::group(zs) 
    }
}

def encodeModified[T](list: List[T]): List[Any]= 
    group(list).map({
        case List(x) => x
        case sub     => (sub.size,sub.head)
    })

println(encodeModified(List.fromString("aaaabccaadeeee")))
// vim: set ts=4 sw=4 et:
