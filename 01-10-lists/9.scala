/*
(**) Pack consecutive duplicates of list elements into sublists. If a list contains repeated elements they should be placed in separate sublists. 
(pack '(a a a a b c c a a d e e e e))
((A A A A) (B) (C C) (A A) (D) (E E E E))
*/

//this should be builtin in 2.8
def groupBy[T](list: List[T], eq: (T,T) => Boolean ): List[List[T]] = list match {
  case Nil   => Nil
  case x::xs => {
    val (ys:List[T],zs:List[T]) = xs.span(eq(_,x));
    (x::ys)::groupBy(zs, eq) 
    }
}


def pack[T](list: List[T]): List[List[T]] = groupBy(list, {(a:T,b:T)=>a==b})

println(pack(List.fromString("aaaabccaadeeee")))
// vim: set ts=4 sw=4 et:
