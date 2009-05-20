/*(*) Duplicate the elements of a list.

Example:
* (dupli '(a b c c d))
(A A B B C C C C D D)

Example in Haskell:
> dupli [1, 2, 3]
[1,1,2,2,3,3]
*/

def dupli[T](list: List[T]): List[T] =
    list.flatMap(x=>List(x,x))

def dupli2[T](list: List[T]): List[T] =
    (list :\ List[T]()) ((el,acc)=>el::el::acc)
println(dupli(List(1,2,3)))
println(dupli2(List(1,2,3)))
// vim: set ts=4 sw=4 et:
