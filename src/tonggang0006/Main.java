package tonggang0006;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by liguohua on 4/6/16.
 * 主要讲解,外部属性文件
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationcontext0006.xml");
        DataSource dataSource = (DataSource) ctx.getBean("dataSource");
        Connection conn = dataSource.getConnection();
        System.out.println(conn);
    }
}
