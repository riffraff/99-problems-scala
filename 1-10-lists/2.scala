//(*) Find the last but one element of a list. 
val x= List(1,2,3,4);
def butLast[T](list :List[T]):T = list match {
  case Nil      => error("this list is too short")
  case x::Nil    => error("this list is too short")
  case x::y::Nil => x
  case x::y::xs => butLast(y::xs)
}

def butLast2[T](list :List[T]):T = list(list.size-2)
def butLast3[T](list :List[T]):T = list.reverse.tail.head
def butLast4[T](list :List[T]):T = list.init.last
//def butLast5[T](list :List[T]):T = list(-2) // 1, why?

println(butLast(x)==3)
println(butLast2(x)==3)
println(butLast3(x)==3)
println(butLast4(x)==3)
//println(butLast5(x))
