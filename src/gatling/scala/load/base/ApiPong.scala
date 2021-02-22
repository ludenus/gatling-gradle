package load.base

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object ApiPong extends Object with Log with Config {

  val protocol = http
    .baseUrl(config.pongService.url)
//    .maxConnectionsPerHost(config.loadProfile.rampUsers)
    .userAgentHeader("Gatling Performance Test")

  val ping = exec(
      http("ping")
        .get("/ping/id")
        .check(
          status.is(200),
//          jsonPath("$.pong").exists,
          responseTimeInMillis.lte(config.loadProfile.expectedResponseTimeMsec)
        )
    )

}
