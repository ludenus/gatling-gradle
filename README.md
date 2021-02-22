# Gatling with Gradle
Sample project

## run all simulations
```
export LOG_LEVEL=INFO
export GATLING_RAMP_USERS=111
export GATLING_MAX_DURATION_SECONDS=100
 
 ./gradlew clean gatlingRun
```
## run one simulation only
```
./gradlew clean gatlingRun-load.PongSimulation
```