package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations={"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestServer {

	@Test
	public void test() {
		while(true){
			System.out.println("Server running...");
			try {
				Thread.sleep(60*60000);
			} catch (InterruptedException e) {
			
			}
		}
	}

}
