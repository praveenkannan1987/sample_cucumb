package groups;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LearnGroups {

	@BeforeMethod
	public void name() {
		System.out.println("@BeforeMethod");
	}
	@Test(groups= {"smoke"})
	public void m1() {
    System.out.println("m1");
    throw new RuntimeException();
	}

	@Test(groups="sanity", dependsOnGroups = "smoke")
	public void m2() {
		System.out.println("m2");
	}
}
