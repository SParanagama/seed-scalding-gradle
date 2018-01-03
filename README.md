# seed-scalding-gradle
Seed project to get a Twitter Scalding based project using Gradle

## Requirements
- Gradle 2.1+
- Java 1.8

## Building

> gradle fatjar

## Running

> hadoop jar YOURPROJECT-0.0.1-SNAPSHOT-job.jar com.twitter.scalding.Tool your.package.your.jobclass --hdfs --restofyourargs

## Running locally

> java -jar YOURPROJECT-0.0.1-SNAPSHOT-job.jar your.package.your.Jobclass --local --restofyourargs

## Running the example WordCountJob

> java -jar seed-scalding-gradle-1.0.0-SNAPSHOT-job.jar WordCountJob --local --input /path/to/input/file --output /path/to/output/file
