import com.twitter.scalding._

/**
  * Created by sagara on 1/3/18.
  */
class WordCountJob(args: Args) extends Job(args) {
  TypedPipe.from(TextLine(args("input")))
    .flatMap { line => line.split("\\s+") }
    .groupBy { word => word }
    .size
    .write(TypedTsv(args("output")))
}
