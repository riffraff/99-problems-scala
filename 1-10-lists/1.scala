//(*) Find the last element of a list. 

val x= List(1,2,3,4);
def myLast[T](list :List[T]):T = list match {
  case List()      => error("this list is empty")
  case x::List() => x
  case _::xs     => myLast(xs)
}
println(myLast(x)==4)

