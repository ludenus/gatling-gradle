#!/bin/bash -xe

export LOG_LEVEL=${LOG_LEVEL:-'INFO'}
export GATLING_RAMP_USERS=${GATLING_RAMP_USERS:-111}
export GATLING_MAX_DURATION_SECONDS=${GATLING_MAX_DURATION_SECONDS:-100}
export GATLING_EXPECTED_RESPONSE_TIME_MILLISECONDS=${GATLING_EXPECTED_RESPONSE_TIME_MILLISECONDS:-1000}
export GATLING_PONGSERVICE_URL=${GATLING_PONGSERVICE_URL:-'http://localhost:8100'}
export GATLING_HTTP_WARMUP_URL=${GATLING_HTTP_WARMUP_URL:-'http://localhost:8100'}

export GATLING_RUN_CMD=${GATLING_RUN_CMD:-'gatlingRun'}
./gradlew ${GATLING_RUN_CMD}
