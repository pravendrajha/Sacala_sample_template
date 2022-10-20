package org.example

import org.apache.spark.sql.SparkSession


object AppClass {

  def main(args:Array[String]): Unit =
  {
    val spark = SparkSession.builder.master("local").getOrCreate()

    print("done")

  }


}

