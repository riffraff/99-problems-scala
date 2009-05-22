/*
(**) Replicate the elements of a list a given number of times.

Example:
* (repli '(a b c) 3)
(A A A B B B C C C)

Example in Haskell:
> repli "abc" 3
"aaabbbccc"

*/
def repli[T](list :List[T], n: Int): List[T] =
    list.flatMap(x=>(1 to n) map {i=>x})

println(repli(List(1,2,3),3))
// vim: set ts=4 sw=4 et:
