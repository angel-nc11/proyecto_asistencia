package org.example.Model;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtil {
    public static final Properties props = new Properties();
    static {
        try(InputStream in = JDBCUtil.class.getClassLoader()
                .getResourceAsStream("db.properties")) {
            if(in == null) {
                throw new RuntimeException("No se encuentra el  archivo 'db.properties'");
            }
            props.load(in);
        }catch (Exception e){
            throw new ExceptionInInitializerError("Error al cargar el archlivo"+e.getMessage());
        }
    }
    public static Connection getConnection() throws SQLException {
        String url = props.getProperty("jdbc.url");
        String user = props.getProperty("jdbc.user");
        String password = props.getProperty("jdbc.password");
        return DriverManager.getConnection(url,user,password);
    }

}
