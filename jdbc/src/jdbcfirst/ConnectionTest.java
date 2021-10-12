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
        //获取数据库连接方式
        Driver driver = new com.mysql.jdbc.Driver();
        String url = "jdbc:mysql://localhost:3306/test";
        Properties info = new Properties();
        info.setProperty("user","root");
        info.setProperty("password","root");

        Connection connect = driver.connect(url, info);

        System.out.println(connect);
    }
    @Test
    public void testConnection2() throws Exception {
        Class aClass = Class.forName("com.mysql.jdbc.Driver");
        //Driver o = (Driver)aClass.newInstance();
        Driver o = (Driver)aClass.getDeclaredConstructor().newInstance();

        String url = "jdbc:mysql://localhost:3306/test";
        Properties info = new Properties();
        info.setProperty("user","root");
        info.setProperty("password","root");

        Connection connect = o.connect(url, info);

        System.out.println(connect);
    }
}
