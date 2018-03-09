#!/bin/bash
export JAVA_HOME=/opt/java

cd /opt/api/
./bin/<%= slug %>-distribution server var/conf/server.yml
