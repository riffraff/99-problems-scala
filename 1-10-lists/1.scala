//(*) Find the last element of a list. 

val x= List(1,2,3,4);
def myLast[T](list :List[T]):T = list match {
  case Nil      => error("this list is empty")
  case x::Nil => x
  case _::xs     => myLast(xs)
}

def myLast2[T](list : List[T]): T = list.last

def myLast3[T](list : List[T]): T = list.reverse.head
def myLast4[T](list : List[T]): T = list(list.size-1)
println(myLast(x)==4)
println(myLast2(x)==4)
println(myLast3(x)==4)
println(myLast4(x)==4)

