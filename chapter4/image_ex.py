from pyspark.sql import SparkSession
from pyspark.ml import image

if __name__ == "__main__":
    import sys

    file_dir = sys.argv[0]

    spark = SparkSession.builder.appName("image example").getOrCreate()


    imagesDF = spark.read.format("image").load(file_dir)

    imagesDF.printSchema()

    imagesDF.select("image.height", "image.width", "image.nChannels", "image.mode",
 "label").show(5, truncate=False)