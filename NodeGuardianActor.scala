// Node Guardian, the supervisor actor that creates and
// manages child actors that processes information via Spark/Kafka

class NodeGuardian(ssc: ~, kafka: ~, settings: ~){
	KafkaStream(save: raw, save: aggr)
};

// KafkaStreamingActor is defined in .scala file

context.actorof (props(new KafkaStreamingActor(~)));

temp = context.actorOf(props(new TempActor));
station = context.actorOf(props(new StationActor));

// etc