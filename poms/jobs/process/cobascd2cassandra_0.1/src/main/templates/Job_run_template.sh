#!/bin/sh
cd `dirname $0`
ROOT_PATH=`pwd`
java -Xms256M -Xmx1024M -Dfile.encoding=UTF-8 -cp .:$ROOT_PATH:$ROOT_PATH/../lib/routines.jar:$ROOT_PATH/../lib/cassandra-driver-core-3.0.0-shaded.jar:$ROOT_PATH/../lib/dom4j-1.6.1.jar:$ROOT_PATH/../lib/log4j-1.2.16.jar:$ROOT_PATH/../lib/metrics-core-3.1.2.jar:$ROOT_PATH/../lib/slf4j-api-1.7.7.jar:$ROOT_PATH/../lib/talend-cassandra-1.2.jar:$ROOT_PATH/../lib/talend_file_enhanced_20070724.jar:$ROOT_PATH/../lib/talendcsv.jar:$ROOT_PATH/cobascd2cassandra_0_1.jar: skripsi.cobascd2cassandra_0_1.cobascd2cassandra  "$@" 