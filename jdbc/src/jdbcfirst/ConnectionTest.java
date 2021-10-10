package jdbcfirst;

import org.junit.Test;

import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;

/**
 * @ClassName ConnectionTest
 * @Description TODO
 * @Author GOFAesir
 * @Data 2021/10/10
 **/
public class ConnectionTest {
    @Test
    public void testConnection1(){
        Driver driver = new Driver() {
            @Override
            public Connection connect(String s, Properties properties) throws SQLException {
                return null;
            }

            @Override
            public boolean acceptsURL(String s) throws SQLException {
                return false;
            }

            @Override
            public DriverPropertyInfo[] getPropertyInfo(String s, Properties properties) throws SQLException {
                return new DriverPropertyInfo[0];
            }

            @Override
            public int getMajorVersion() {
                return 0;
            }

            @Override
            public int getMinorVersion() {
                return 0;
            }

            @Override
            public boolean jdbcCompliant() {
                return false;
            }

            @Override
            public Logger getParentLogger() throws SQLFeatureNotSupportedException {
                return null;
            }
        }


    }
}
