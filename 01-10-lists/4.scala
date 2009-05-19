// find the number of elements in a list

def myLength[T](list : List[T]): Int = list.length
def myLength2[T](list : List[T]): Int = (0 /: list)((acc,el)=>acc+1)
def myLength3[T](list : List[T]): Int = (list :\ 0)((el,acc)=>1+acc)
def myLength4[T](list : List[T]): Int = list match {
  case Nil => 0
  case x::xs=> myLength4(xs)+1
}

println(myLength(2::1::Nil)==2)
println(myLength2(3::1::Nil)==2)
println(myLength3(3::1::Nil)==2)
println(myLength4(3::1::Nil)==2)
