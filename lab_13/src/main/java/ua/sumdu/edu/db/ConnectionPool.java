package ua.sumdu.edu.db;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionPool {

    private ConnectionPool() {
    }

    private final static String RESOURCE = "java:/comp/env/jdbc/postgres";

    private static DataSource dataSource;

    public static synchronized Connection getConnection() throws SQLException {
        if (dataSource == null) {
            try {
                InitialContext ctx = new InitialContext();
                dataSource = (DataSource) ctx.lookup(RESOURCE);
            } catch (NamingException exp) {
                throw new SQLException(exp);
            }
        }
        return dataSource.getConnection();
    }
}
