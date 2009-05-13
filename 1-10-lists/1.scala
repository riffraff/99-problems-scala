//(*) Find the last element of a list. 

val x= List(1,2,3,4);
<<<<<<< HEAD:1-10-lists/1.scala
// needs 3 cases or causes warning
def myLast[T](list :List[T]):T = list match {
  case Nil      => error("this list is empty")
  case x::Nil => x
  case _::xs     => myLast(xs)
}

def myLast1[T](list :List[T]):T = list match {
  case List(x) => x
  case x::xs   => myLast1(xs)
}

def myLast2[T](list : List[T]): T = list.last

def myLast3[T](list : List[T]): T = list.reverse.head
def myLast4[T](list : List[T]): T = list(list.size-1)


println(myLast(x)==4)
println(myLast1(x)==4)
println(myLast2(x)==4)
println(myLast3(x)==4)
println(myLast4(x)==4)

=======
def myLast[T](list :List[T]):T = list match {
  case List()      => error("this list is empty")
  case x::List() => x
  case _::xs     => myLast(xs)
}
println(myLast(x)==4)

println(myLast2(x)==4)
>>>>>>> c60843e96b1c7f7def77667cb63ea1ac6e75cd85:1-10-lists/1.scala
