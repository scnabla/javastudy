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
        //获取数据库连接方式一
        Driver driver = new com.mysql.jdbc.Driver();
        String url = "jdbc:mysql://localhost:3306/test";
        Properties info = new Properties();
        info.setProperty("user","root");
        info.setProperty("password","root");

        Connection connect = driver.connect(url, info);

        System.out.println(connect);
    }
}
