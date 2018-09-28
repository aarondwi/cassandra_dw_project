%~d0
cd %~dp0
java -Xms256M -Xmx1024M -Dfile.encoding=UTF-8 -cp .;../lib/routines.jar;../lib/dom4j-1.6.1.jar;../lib/log4j-1.2.16.jar;../lib/postgresql-9.4-1201.jdbc41.jar;jnstbt_etl_0_1.jar; skripsi.jnstbt_etl_0_1.jnstbt_etl  %* 