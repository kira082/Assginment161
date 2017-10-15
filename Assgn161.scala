object Assgn161 {
    case class oR[A]( p1: A=>Boolean, p2: A=>Boolean ) extends (A=>Boolean) {
  def apply( a: A ) = p1(a) || p2(a)
}
   def main(args: Array[String]) {
       var sum = 0;
       var sum1 = 0;
      val num : List[Int]  = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
      num.foreach(sum += _)
      println(sum);
      var len = num.length;
      println(len);
      var avg = sum/len;
      println(avg);
      val flist = num.filter(_ % 2 == 0);
      flist.foreach(sum1 += _)
      println(sum1);
      val flist1 = num filter oR (_ % 5 == 0 , _% 3 == 0)
      var len1 = flist1.length;
      println(len1);
   }
}
