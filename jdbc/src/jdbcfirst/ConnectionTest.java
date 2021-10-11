package jdbcfirst;

import org.junit.Test;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;
import java.util.Properties;


/**
 * @ClassName ConnectionTest
 * @Description TODO
 * @Author GOFAesir
 * @Data 2021/10/10
 **/
public class ConnectionTest {
    @Test
    public void testConnection1() throws SQLException {

        Driver driver = new com.mysql.jdbc.Driver();
        String url = null;
        Properties info = null;

        Connection connect = driver.connect(url, info);
    }
}
