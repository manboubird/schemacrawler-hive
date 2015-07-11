package schemacrawler.tools.hive;


import schemacrawler.tools.databaseconnector.DatabaseConnector;
import schemacrawler.tools.options.DatabaseServerType;

public final class HiveDatabaseConnector
  extends DatabaseConnector
{

  public HiveDatabaseConnector()
  {
    super(new DatabaseServerType("hive", "Hive"),
          "/help/Connections.hive.txt",
          "/schemacrawler-hive.config.properties",
          "/hive.information_schema");
    try
    {
      Class.forName("org.apache.hive.jdbc.HiveDriver");
    }
    catch (final ClassNotFoundException e)
    {
      throw new RuntimeException("Could not load Hive JDBC driver", e);
    }
  }

}
