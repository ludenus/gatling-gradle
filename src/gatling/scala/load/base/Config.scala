package load.base

import com.typesafe.config.{ConfigBeanFactory, ConfigFactory}

import scala.beans.BeanProperty

trait Config {
  val config = ConfigBeanFactory.create(ConfigFactory.load(), classOf[TestConfig]);
}

class TestConfig {
  @BeanProperty var loadProfile: LoadProfile = null
  @BeanProperty var pongService: PongService = null

  override def toString = s"TestConfig(loadProfile=$loadProfile, pongService=$pongService)"
}

class LoadProfile {
  @BeanProperty var waitSeconds = 1
  @BeanProperty var rampUsers = 10
  @BeanProperty var rampSeconds = 10
  @BeanProperty var maxDurationSeconds = 20
  @BeanProperty var expectedResponseTimeMsec = 4000

  override def toString = s"LoadProfile(waitSeconds=$waitSeconds, rampUsers=$rampUsers, rampSeconds=$rampSeconds, maxDurationSeconds=$maxDurationSeconds, expectedResponseTimeMsec=$expectedResponseTimeMsec)"
}

class PongService {
  @BeanProperty var url = "http://localhost:8100"

  override def toString = s"PongService(url=$url)"
}