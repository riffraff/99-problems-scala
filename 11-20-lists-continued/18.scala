/*
(**) Extract a slice from a list.

Given two indices, i and k, the slice is the list containing the elements between the i'th and k'th element of the original list (both limits included). Start counting the elements with 1.

Example:
* (slice '(a b c d e f g h i k) 3 7)
(C D E F G)

*/

def slice[T](list: List[T], i: Int, k: Int): List[T] =
    list.drop(i-1).take(k-2)

println(slice(List.fromString("abcdefghik"),3,7))
// vim: set ts=4 sw=4 et:

