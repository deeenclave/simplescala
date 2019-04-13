package org.example

import java.io.InputStream


object CSVDemo extends App {
  println("Month, Income, Expenses, Profit")

  val stream: InputStream = getClass.getResourceAsStream("/finance.csv")
  val lines = scala.io.Source.fromInputStream(stream).getLines
  for (line <- lines) {
    val cols = line.split(",").map(_.trim)
    // do whatever you want with the columns here
    println(s"${cols(0)}|${cols(1)}|${cols(2)}|${cols(3)}")
  }
  stream.close
}
