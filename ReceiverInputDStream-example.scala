val conf = new SparkConf(false) // skip loading external settings
  .setMaster("local[*]") // run locally with enough threads
  .setAppName("Spark Streaming") // name in Spark web UI
  .set("spark.logConf", "true")
  .set("spark.driver.port", s"$driverPort")
  .set("spark.driver.host", s"$driverHost")
  .set("spark.akka.logLifecycleEvents", "true")

val ssc = new StreamingContext(conf, Seconds(1))