FROM ubuntu:20.04

RUN apt-get update && apt-get install -y curl

ADD heartbeat.sh /heartbeat.sh

ENTRYPOINT /heartbeat.sh