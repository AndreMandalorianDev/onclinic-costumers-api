#!/bin/bash
set -e

IMAGE="dockerhub_user/onclinic-api-dev:latest"

docker pull $IMAGE

docker run -d \
  --name onclinic-api-dev \
  -p 8080:8080 \
  $IMAGE