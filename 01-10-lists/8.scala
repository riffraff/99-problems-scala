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


//this should be builtin in 2.8
def groupBy[T](list: List[T], eq: (T,T) => Boolean ): List[List[T]] = list match {
  case Nil   => Nil
  case x::xs => {
    val (ys:List[T],zs:List[T]) = xs.span(eq(_,x));
    (x::ys)::groupBy(zs, eq) 
    }
}

def compress3[T](list: List[T]): List[T] =
  groupBy(list,{(a:T,b:T)=>a==b}).map(_.head)
println(compress3(List('a','a','a','a','b','c','c','a','a','d','e','e','e','e')))
//['a','b','c','a','d','e']

