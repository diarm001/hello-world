object TwitterStreamer extends App {

// Begin by configuring necessary credentials 

val conf = ConfigFactory.load()

//All the keys necessary to access Twitter	


	private val consumerKey 
	private val consumerSecret 
	private val accessToken 
	private val accessTokenSecret 
	private val url = "https://stream.twitter.com/1.1/statuses/filter.json"

// declare ActorSystem, Materializer and format 
	
	implicit val system = ActorSystem()
	implicit val materializer = ActorMaterializer()
	implicit val formats = DefaultFormats

//Create a header to load all the credentials declared earlier

val oauthHeader: Future[String] = consumer.createOauthenticatedRequest(

KoauthRequest()) 

map (_.header)

// Pass header into Success method

oauthHeader.onComplete {
case Success(header) =>

HttpHeader.parse("Authorization", header)

// returns ParsingResult

HttpHeader.parse("Accept", header

// returns ParsingResult


// Declare HttpResquest and all its specific needs

val httpRequest: HttpRequest = HttpRequest(
				method = HttpMethods.POST,
				uri = source,
				headers = httpHeaders,
entity= (//this is main body of he tweet) 


// Call request
val request = Http().singleRequest(httpRequest)

response.entity.dataBytes
						.scan("")((acc, curr) => if (acc.contains("\r\n")) curr.utf8String else acc + curr.utf8String)
						.filter(_.contains("\r\n"))
						.map(json => Try(parse(json).extract[Tweet]))
.runForeach 

Success()
Failure()

case Failure(failure) => println(failure.getMessage)