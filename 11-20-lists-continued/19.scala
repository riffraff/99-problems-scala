/*
(**) Rotate a list N places to the left.

Hint: Use the predefined functions length and (++).

Examples:
* (rotate '(a b c d e f g h) 3)
(D E F G H A B C)

* (rotate '(a b c d e f g h) -2)
(G H A B C D E F)



*/

//single direction, seems the original statement
def rotate[T](list: List[T], i: Int): List[T] = (list,i) match {
    case (Nil,_)   => Nil
    case (x::xs,1) => xs+x
    case (x::xs,_) => rotate(xs+x,i-1)
}

//lousy but works
println(rotate(List.fromString("abcdefgh"),3))

def rotate2[T](list: List[T], i: Int) =
    if (i>0) rotate(list,i) else rotate(list.reverse,-i).reverse
println(rotate2(List.fromString("abcdefgh"),-2))
// vim: set ts=4 sw=4 et:
