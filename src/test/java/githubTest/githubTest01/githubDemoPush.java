package githubTest.githubTest01;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class githubDemoPush {
  @Test
  public void f() {
	  System.out.println("github-Push测试");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("github-Push测试");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("github-Push测试");
  }

}
