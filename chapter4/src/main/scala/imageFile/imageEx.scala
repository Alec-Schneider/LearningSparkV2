package main.scala.imageFile

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.types._
import org.apache.spark.ml.source.image

object imageEx {
    def main(args: Array[String]) {
        // Create the SparkSession
        val spark = SparkSession.builder.appName("Chapter4 - Image Example").getOrCreate()

        if (args.length <= 0) {
            println("usage schema_ex <file path to blogs.json>")
            System.exit(1)
        }

        // Get the path to the image file
        val imageFile = args(0)

        val imagesDF = spark.read.format("image").load(imageFile)

        // print the schema
        println(imagesDF.printSchema())
        
        // print 10 rows of data
        println(imagesDF.select("image.height", "image.width", "image.nChannels", "image.mode",
 "label").show(10, false))
    }
}
// scalastyle:on println