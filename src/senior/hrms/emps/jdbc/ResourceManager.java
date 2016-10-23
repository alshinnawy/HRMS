package senior.hrms.emps.jdbc;

import java.sql.*;

public class ResourceManager
{
    private static String JDBC_DRIVER   = "oracle.jdbc.OracleDriver";
    /*  Online */
//    private static String JDBC_URL      = "jdbc:oracle:thin:@52.36.106.136:1521:orcl";
//    private static String JDBC_USER     = "hrms";
//    private static String JDBC_PASSWORD = "senior_hrms";
    
    /* Local */
    private static String JDBC_URL      = "jdbc:oracle:thin:@localhost:1521:XE";
    private static String JDBC_USER     = "dev"; // dev
    private static String JDBC_PASSWORD = "dev";
    private static Driver driver = null;

    public static synchronized Connection getConnection()
	throws SQLException
    {
        if (driver == null)
        {
            try
            {
                Class jdbcDriverClass = Class.forName( JDBC_DRIVER );
                driver = (Driver) jdbcDriverClass.newInstance();
                DriverManager.registerDriver( driver );
            }
            catch (Exception e)
            {
                System.out.println( "Failed to initialise JDBC driver" );
                e.printStackTrace();
            }
        }

        return DriverManager.getConnection(
                JDBC_URL,
                JDBC_USER,
                JDBC_PASSWORD
        );
    }


	public static void close(Connection conn)
	{
		try {
			if (conn != null) conn.close();
		}
		catch (SQLException sqle)
		{
			sqle.printStackTrace();
		}
	}

	public static void close(PreparedStatement stmt)
	{
		try {
			if (stmt != null) stmt.close();
		}
		catch (SQLException sqle)
		{
			sqle.printStackTrace();
		}
	}

	public static void close(ResultSet rs)
	{
		try {
			if (rs != null) rs.close();
		}
		catch (SQLException sqle)
		{
			sqle.printStackTrace();
		}

	}

}
