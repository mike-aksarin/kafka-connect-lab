# Kafka Real-World Exercises

These is example connector from **Kafka Connect Hands-on Learning** course by **Stephane Maarek**. 

_Custom Kafka connector that gets a stream of issues and pull requests for your chosen GitHub repository._
 
 * Implementation
   * Connector class: [GitHubSourceConnector](src/main/scala/example/connector/GitHubSourceConnector.scala)
   * Most important class: [GitHubSourceTask](src/main/scala/example/connector/GitHubSourceTask.scala) 
   * Script to run Landoop (Lenses) `fast-data-dev` Kafka cluster with our custom connector mounted:
     [run-docker-with-connector.sh](run-docker-with-connector.sh)
   
 * Course links
   * Course at Udemy: https://www.udemy.com/kafka-connect/
   * Original java solution by **Stephane Maarek**: https://github.com/simplesteph/kafka-connect-github-source
   * More Kafka courses: https://www.kafka-tutorials.com
 