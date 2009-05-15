/*
(**) Eliminate consecutive duplicates of list elements.

If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed. 
*/

def compress[T](list: List[T]): List[T] = 
    list.foldLeft(List(list.head))((acc,el)=> if (acc.last==el) acc else acc++List(el))

def compress2[T](list: List[T]): List[T] = 
    list.foldRight(List(list.last))((el,acc)=> if (acc.head==el) acc else el::acc)

println(compress(List('a','a','a','a','b','c','c','a','a','d','e','e','e','e')))
println(compress2(List('a','a','a','a','b','c','c','a','a','d','e','e','e','e')))
//['a','b','c','a','d','e']

