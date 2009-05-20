/*
(*) Split a list into two parts; the length of the first part is given.

Do not use any predefined predicates.

Example:
* (split '(a b c d e f g h i k) 3)
( (A B C) (D E F G H I K))
*/

def split[T](list: List[T], n: Int): Pair[List[T],List[T]] =
  list.splitAt(n)
    
def split2[T](list: List[T], n: Int): Pair[List[T],List[T]] =
  (list.take(n), list.drop(n))

def split3[T](list: List[T], n: Int): Pair[List[T],List[T]] = (list,n) match {
    case (_, 0) => (Nil, list)
    case (x::xs, _) => {
        val (h,t)=split3(xs,n-1)
        (x::h,t)
    }
}

  
println(split(List.fromString("abcdefghik"),3))
println(split2(List.fromString("abcdefghik"),3))
println(split3(List.fromString("abcdefghik"),3))

// vim: set ts=4 sw=4 et:
