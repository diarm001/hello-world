implicit val actorSystem = ActorSystem()
implicit val actorMaterializer = ActorMaterializer()
import actorSystem.dispatcher

val address = Play.current.configuration.getString("eventservice.location").getOrElse("localhost")
val port    = Play.current.configuration.getInt("eventservice.port").getOrElse(9000)

val publishFlow = Tcp().outgoingConnection(host, port)