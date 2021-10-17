package jdbcfirst;

import org.junit.Test;


import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
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
    @Test
    public void testConnection3() throws Exception {
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "root";
        //加载Driver驱动
        Class aClass = Class.forName("com.mysql.jdbc.Driver");
        Driver o = (Driver)aClass.getDeclaredConstructor().newInstance();

        //注册Driver驱动
        DriverManager.registerDriver(o);

        Connection connection = DriverManager.getConnection(url, user, password);

        System.out.println(connection);

    }
    @Test
    public void testConnection4() throws Exception {
        //读取配置文件
        InputStream is = ConnectionTest.class.getClassLoader().getResourceAsStream("jdbc.properties");
        Properties properties = new Properties();
        properties.load(is);
        String url = properties.getProperty("url");
        String password = properties.getProperty("password");
        String user = properties.getProperty("user");
        String DriverClass = properties.getProperty("DriverClass");
        //注册加载驱动
        Class.forName(DriverClass);
        //获取连接
        Connection connection = DriverManager.getConnection(url, user, password);

        System.out.println(connection);
    }
}
