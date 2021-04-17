#!/bin/bash

# Doesnt work
$SPARK_HOME/bin/spark-submit \
    --master local[4] \
    ./image_ex.py \
    ../databricks-datasets/learning-spark-v2/cctvVideos/train_images/