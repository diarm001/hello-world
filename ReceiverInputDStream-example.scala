val conf = new SparkConf(false) // skip loading external settings
  .setMaster("local[*]") // run locally with enough threads
  .setAppName("Spark Streaming") // name in Spark web UI
  .set("spark.logConf", "true")
  .set("spark.driver.port", s"$driverPort")
  .set("spark.driver.host", s"$driverHost")
  .set("spark.akka.logLifecycleEvents", "true")

val ssc = new StreamingContext(conf, Seconds(1))


//This gives you a context to access the actor system that is of type ReceiverInputDStream. 

//Having DStream lets you define a high-level processing pipeline in Spark Streaming. 

//actorStream.print()

//class Diarm1 extends Actor with ActorHelper {
//val actorStream = ssc.actorStream[String](Props[Diar], actorName)
