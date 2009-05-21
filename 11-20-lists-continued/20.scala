/*
*) Remove the K'th element from a list.

Example in Prolog:

?- remove_at(X,[a,b,c,d],2,R).
X = b
R = [a,c,d]

Example in Lisp:

* (remove-at '(a b c d) 2)
(A C D)

(Note that this only returns the residue list, while the Prolog version also returns the deleted element.)

Example in Haskell:

*Main> removeAt 1 "abcd"
('b',"acd")
*/


def removeAt[T](list: List[T], i: Int): Pair[T,List[T]]= (list,i) match {
  case (Nil,_)   => error("empty list")
  case (x::xs,1) => (x,xs)
  case (x::xs,_) => {
      val (h,t) = removeAt(xs,i-1)
      (h,x::t)
    }
}

println(removeAt(List( 'a, 'b, 'c, 'd), 2))
