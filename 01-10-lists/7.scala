/* 
(**) Flatten a nested list structure.

Transform a list, possibly holding lists as elements into a `flat' list by replacing each list with its elements (recursively). 
*/

def flatten(list:List[Any]):List[Any] =
  list.flatMap( {
      case x: List[Any] => flatten(x)
      case x  => List(x)
    })
val flatten2 = List.flatten _ 

println(flatten(List(List(1))))
println(flatten(List(0, 1,List(2,List(3),List()))))
println(flatten(List(1, List(2, List(3,4), 5))))

println(flatten2(List(List(1))))
//println(flatten2(List(List(0), List(1),List(2))))
// lists must be uniform
//println(flatten2(List(List(0), List(1),List(List(2)))))
