//get the k-th element of a list, 1 indexed

val x= List(1,2,3,4)

def myApply[T](list :List[T], i :Int):T =list(i-1)

def myApply2[T](list:List[T], i:Int):T =list.drop(i-1).head
def myApply3[T](list:List[T], i:Int):T = if (i<=1) 
    list.head 
  else 
    myApply3(list.tail,i-1)

println(myApply(x,2)==2)
println(myApply2(x,2)==2)
println(myApply3(x,2)==2)
