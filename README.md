# Gatling with Gradle
Gatling with Gradle, InfluxDB v2.0 with Telegraf and Grafana for reporting.   

## run environment
```
cd env
docker-compose up
```

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

## influxdb UI
http://localhost:8186/

```
user: admin
pass: ********
```

## grafana dashboard
http://localhost:3100/d/nVrrhs1mk/dasboard
```
user: admin
pass: ********
```
