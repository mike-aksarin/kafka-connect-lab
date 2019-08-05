name := "kafka-connector-lab"

version := "0.1"

scalaVersion := "2.12.8"

val kafkaVersion = "2.3.0"
val twitterApiVersion = "2.2.0"
val elasticApiVersion = "7.2.0"

scalacOptions += "-Ydebug"

libraryDependencies ++= Seq(
  "org.apache.kafka" % "connect-api" % kafkaVersion exclude("javax.ws.rs", "javax.ws.rs-api"), // for connector
  "com.konghq" % "unirest-java" % "2.3.10",
  "org.slf4j" % "slf4j-simple" % "1.7.26",
  "org.scalatest" %% "scalatest" % "3.0.5" % "test"
)