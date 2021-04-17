// Name of the package
name := "main/scala/imageFile"
// Version of our package
version := "1.0"
// Version of our Scala
scalaVersion := "2.12.10"
// Spark library dependencies
libraryDependencies ++= Seq(
	"org.apache.spark" %% "spark-core" % "3.0.2",
	"org.apache.spark" %% "spark-sql" % "3.0.2",
	"org.apache.spark" %% "spark-mllib" % "3.0.2"
)
