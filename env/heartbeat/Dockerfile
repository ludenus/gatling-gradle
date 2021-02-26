FROM alpine:3.13.2

RUN apk add --no-cache curl

ADD heartbeat.sh /heartbeat.sh

ENTRYPOINT /heartbeat.sh