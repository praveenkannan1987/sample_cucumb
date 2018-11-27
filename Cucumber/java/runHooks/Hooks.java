package runHooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;

public class Hooks extends SeMethods{

	@Before
	public void beforeScenario(Scenario sc) {
    startResult();
    startTestModule(sc.getName(), sc.getId());
    test = startTestCase(sc.getId());
	test.assignCategory("smoke");
	test.assignAuthor("Koushik");
	startApp("chrome", "http://leaftaps.com/opentaps/control/main");
	}
    @After
	public void afterScenario(Scenario sc) {
     closeAllBrowsers();
     endResult();
    }
}





