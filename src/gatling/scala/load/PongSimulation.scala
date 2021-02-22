package load

import io.gatling.core.Predef._
import load.base._

class PongSimulation extends Simulation with Log with Config {

  log.info("~~~~~ config: {}", config)

  val scn = scenario("pong").forever {
    exec(ApiPong.ping)
  }

  val loadRamp = scn.inject(rampUsers(config.loadProfile.rampUsers) during (config.loadProfile.rampSeconds))
  val loadAtOnce = scn.inject(atOnceUsers(config.loadProfile.rampUsers))

  setUp(loadAtOnce)
    .protocols(ApiPong.protocol)
    .maxDuration(config.loadProfile.maxDurationSeconds)
    .assertions(
      forAll.failedRequests.count.is(0),
      forAll.responseTime.percentile4.lte(config.loadProfile.expectedResponseTimeMsec)
    )

}