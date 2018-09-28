#!/bin/sh
cd `dirname $0`
ROOT_PATH=`pwd`
java -Xms256M -Xmx1024M -Dfile.encoding=UTF-8 -cp .:$ROOT_PATH:$ROOT_PATH/../lib/routines.jar:$ROOT_PATH/../lib/dom4j-1.6.1.jar:$ROOT_PATH/../lib/log4j-1.2.16.jar:$ROOT_PATH/../lib/postgresql-9.4-1201.jdbc41.jar:$ROOT_PATH/koleksi_etl_0_1.jar: skripsi.koleksi_etl_0_1.koleksi_etl  "$@" 