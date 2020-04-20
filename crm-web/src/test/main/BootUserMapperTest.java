import cn.ysf.bean.BootUser;
import cn.ysf.mapper.BootUserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author YiShunFeng
 * @version 1.0
 * @description PACKAGE_NAME
 * @data 2020/4/19
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class BootUserMapperTest {
    @Autowired
    private BootUserMapper bootUserMapper;
    @Test
    public void testSave(){
        BootUser bootUser = new BootUser();
        bootUser.setName("你是");
        bootUser.setPassword("大流弊");
        bootUserMapper.save(bootUser);
    }
}
