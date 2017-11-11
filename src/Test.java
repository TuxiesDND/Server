import static org.junit.Assert.assertTrue;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ungear.service.HelloWorld;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:/dnd-beans.xml"})
public class Test {

	@Autowired
	HelloWorld h;
	
	@org.junit.Test
	public void test() {
		assertTrue(true);
	}

}
