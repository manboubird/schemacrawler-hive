# schemacrawler-hive

Unfortunately, [Apache Hive support for SchemaCrawler](http://schemacrawler.sourceforge.net/database-support.html) seems to be unrealistic so far.

As of hive-1.1.0 (CDH5.4), [hive-jdbc](https://cwiki.apache.org/confluence/display/Hive/HiveServer2+Clients#HiveServer2Clients-JDBC) does not support most [java.sql.DatabaseMetaData interface](https://github.com/cloudera/hive/blob/cdh5.4.2-release/jdbc/src/java/org/apache/hive/jdbc/HiveDatabaseMetaData.java#L546-L548). Therefore, this SchemaCrawler hive plugin throws exception: `Database access exception: Method not supported`.  

```
schemacrawler-12.06.03-main/_schemacrawler$ ./sc.sh -server=hive -database=default -password= -host localhost -infolevel=standard -command=list
log4j:WARN No appenders could be found for logger (org.apache.hive.jdbc.Utils).
log4j:WARN Please initialize the log4j system properly.
log4j:WARN See http://logging.apache.org/log4j/1.2/faq.html#noconfig for more info.
Database access exception: Method not supported
Re-run SchemaCrawler with the -? option for help
Or, re-run SchemaCrawler with the -loglevel=CONFIG option for details on the error
```

