// reverse a list

val x= List(1,2,3,4);
val y= List(4,3,2,1);

def myReverse[T](list:List[T]):List[T] = list.reverse
def myReverse2[T](list:List[T]):List[T] = list match {
    case Nil=>Nil
    case x::Nil=>List(x)
    case x::xs => myReverse2(xs) ::: List(x)
}

def myReverse3[T](list:List[T]):List[T] = list match {
    case List(x)  => list
    case x::xs => myReverse2(xs) ::: List(x)
}

println(myReverse(x)==y)
println(myReverse2(x)==y)
println(myReverse3(x)==y)
