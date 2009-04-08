// check wheter a list is palindrome

def isPalindrome[T](list: List[T]): Boolean = list == list.reverse
def isPalindrome2[T](list: List[T]): Boolean = list match {
  // List.init and List.tail raise exceptions on empty lists, so three cases are necessary
  case List(x) => true
  case List(x,y) => x==y
  case xs       => xs.head==xs.last && isPalindrome2(xs.tail.init) 
}

val p=List(3,3)
val p2=List(3,1,3)
val np=List(3,2)
val np2=List(3,1,2)

println(isPalindrome(p))
println(isPalindrome2(p))
println(isPalindrome(p2))
println(isPalindrome2(p2))

println(isPalindrome(np))
println(isPalindrome2(np))

println(isPalindrome(np2))
println(isPalindrome2(np2))


