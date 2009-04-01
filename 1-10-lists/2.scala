//(*) Find the last but one element of a list. 
val x= List(1,2,3,4);
def butLast[T](list :List[T]):T = list match {
  case List()      => error("this list is too short")
  case x::List()    => error("this list is too short")
  case x::y::List() => x
  case x::y::xs => butLast(y::xs)
}

println(butLast(x))
println(butLast(List(1,2,3)))
// vim: set ts=4 sw=4 et:
