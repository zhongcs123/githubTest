package githubTest.githubTest01;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Demo2 {
  @Test
  public void test() throws Exception {
	  
	  throw new Exception("测试2：错误信息")
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("测试2");
	  
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("测试2");
  }

}
