#!/bin/bash

# A bash script to read in image files
# print the schema
# and print the first 10 rows

# specify the class in the scala package
# use 4 cpu cores
# provide the path to the jar from the sbt build
# pass args
$SPARK_HOME/bin/spark-submit \
	--class main.scala.imageFile.imageEx \
	--master local[4] \
	./target/scala-2.12/main-scala-imagefile_2.12-1.0.jar \
	../databricks-datasets/learning-spark-v2/cctvVideos/train_images/
