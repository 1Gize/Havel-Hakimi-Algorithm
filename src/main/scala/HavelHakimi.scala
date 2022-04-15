import scala.collection.mutable.ListBuffer

object HavelHakimi{
  def remove0(ls :List[Int]) ={
    val newLs = ls.filter(_ != 0)
    newLs
  }
  def hh(ls: List[Int]): Boolean={
    if(ls.isEmpty){
      true
    }else{
      val lsNo0 = remove0(ls)
      if(lsNo0.isEmpty){
        true
      }else{
        val lsNo0Sorted = lsNo0.sorted(Ordering.Int.reverse)
        val firstValue = lsNo0Sorted.head
        val lsNo0SortedTail = lsNo0Sorted.tail
        if(lsNo0SortedTail.size < firstValue){
          false
        }else{
          var x = 0
          val lsForRec = new ListBuffer[Int]
          while(x < firstValue){
           lsForRec += lsNo0SortedTail(x) - 1
            x += 1
          }
          while(x < lsNo0SortedTail.size){
            lsForRec += lsNo0SortedTail(x)
            x += 1
          }
          hh(lsForRec.toList)
        }
      }
    }
  }
}
