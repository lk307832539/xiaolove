//import com.xxkxxy.dao.UserDao;
//import com.xxkxxy.entity.User;
//import org.apache.ibatis.io.Resources;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//import javax.annotation.Resource;
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.List;
//import java.util.Properties;
//
//
///**
// * Created by LK on 2016/8/4.
// */
//public class TestGetUser {
//    @Resource
//    private UserDao userDao;
//
//    @Before
//    public void setUp() throws Exception {
//        InputStream fis = null;
//        InputStream inputStream = null;
//        try {
//            //创建Properties对象
//            Properties prop = new Properties();
//            //创建输入流，指向配置文件,getResourceAsStream可以从classpath加载资源
//            fis = Resources.getResourceAsStream("config/jdbc.properties");
//            //加载属性文件
//            prop.load(fis);
//
//            inputStream = Resources.getResourceAsStream("config/spring-mybatis.xml");
//            //build的第二个参数对应mybatis.xml配置文件的<environment id="development">标签的id，
//            //其中后面两个参数可选，若第二个参数不写则默认为"development"
//            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream, prop);
//            SqlSession sqlSession = sqlSessionFactory.openSession();
//            userDao = sqlSession.getMapper(UserDao.class);
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } finally {
//            if (fis != null) {
//                try {
//                    fis.close();
//                } catch (IOException e) {
//                    // TODO Auto-generated catch block
//                    e.printStackTrace();
//                }
//            }
//            if (inputStream != null) {
//                try {
//                    inputStream.close();
//                } catch (IOException e) {
//                    // TODO Auto-generated catch block
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
//
//    @After
//    public void tearDown() throws Exception {
//    }
//
//    @Test
//    public void testGetUser() {
//        List<User> list = this.userDao.select(null);
//        if (!list.isEmpty()) {
//            for (User u : list) {
//                System.out.println(u.getUserName());
//            }
//        }
//    }
//
//    @Test
//    public void addUser() {
//        User user = new User();
//        user.setUserName("admin");
//        user.setPassword("password");
//        this.userDao.insert(user);
//    }
//
//}
