import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should
import HavelHakimi._
class HavelHakimiSpec extends AnyFlatSpec with should.Matchers{
// def hh(ls: List[Int]) ={
//   ls match {
//     case List(5, 3, 0, 2, 6, 2, 0, 7, 2, 5) => false
//     case List(4, 2, 0, 1, 5, 0) => false
//     case List(3, 1, 2, 3, 1, 0) => true
//     case List(16, 9, 9, 15, 9, 7, 9, 11, 17, 11, 4, 9, 12, 14, 14, 12, 17, 0, 3, 16) => true
//     case List(14, 10, 17, 13, 4, 8, 6, 7, 13, 13, 17, 18, 8, 17, 2, 14, 6, 4, 7, 12) => false
//     case List(6, 0, 10, 10, 10, 5, 8, 3, 0, 14, 16, 2, 13, 1, 2, 13, 6, 15, 5, 1) => false
//     case List(2, 2, 0) => false
//     case List(3, 2, 1) => false
//     case List(1,1) => true
//     case List(1) => false
//     case List() => true
//   }
// }
  "hh function " should "return false for input : List(5, 3, 0, 2, 6, 2, 0, 7, 2, 5)" in {
    hh(List(5, 3, 0, 2, 6, 2, 0, 7, 2, 5)) shouldBe false
  }
  "hh function " should "return false for input : List(4, 2, 0, 1, 5, 0)" in {
    hh(List(4, 2, 0, 1, 5, 0)) shouldBe false
  }
  "hh function " should "return true for input : List(3, 1, 2, 3, 1, 0)" in {
    hh(List(3, 1, 2, 3, 1, 0)) shouldBe true
  }
  "hh function " should "return true for input : List(16, 9, 9, 15, 9, 7, 9, 11, 17, 11, 4, 9, 12, 14, 14, 12, 17, 0, 3, 16)" in {
    hh(List(16, 9, 9, 15, 9, 7, 9, 11, 17, 11, 4, 9, 12, 14, 14, 12, 17, 0, 3, 16)) shouldBe true
  }
  "hh function " should "return true for input : List(14, 10, 17, 13, 4, 8, 6, 7, 13, 13, 17, 18, 8, 17, 2, 14, 6, 4, 7, 12)" in {
    hh(List(14, 10, 17, 13, 4, 8, 6, 7, 13, 13, 17, 18, 8, 17, 2, 14, 6, 4, 7, 12)) shouldBe true
  }
  "hh function " should "return false for input : List(6, 0, 10, 10, 10, 5, 8, 3, 0, 14, 16, 2, 13, 1, 2, 13, 6, 15, 5, 1)" in {
    hh(List(6, 0, 10, 10, 10, 5, 8, 3, 0, 14, 16, 2, 13, 1, 2, 13, 6, 15, 5, 1)) shouldBe false
  }
  "hh function " should "return false for input : List(2, 2, 0)" in {
    hh(List(2, 2, 0)) shouldBe false
  }
  "hh function " should "return false for input : List(3, 2, 1)" in {
    hh(List(3, 2, 1)) shouldBe false
  }
  "hh function " should "return true for input : List(1,1)" in {
    hh(List(1,1)) shouldBe true
  }
  "hh function " should "return false for input : List()" in {
    hh(List()) shouldBe true
  }
}
