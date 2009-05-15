/* 
(**) Flatten a nested list structure.

Transform a list, possibly holding lists as elements into a `flat' list by replacing each list with its elements (recursively). 
*/

def flatten(list:List[Any]):List[Any] =
  list.flatMap( {
      case x: List[Any] => flatten(x)
      case x  => List(x)
    })

println(flatten(List(List(1))))
println(flatten(List(0, 1,List(2,List(3),List()))))
println(flatten(List(1, List(2, List(3,4), 5))))
