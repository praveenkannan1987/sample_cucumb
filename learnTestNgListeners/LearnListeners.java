package learnTestNgListeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class LearnListeners implements IRetryAnalyzer, IAnnotationTransformer{
    int count=1;
	@Override
	public boolean retry(ITestResult result) {
        if(!result.isSuccess() && count<2) {
        	count++;
        	return true;
        }
		return false;
	}
	@Override
	public void transform(ITestAnnotation annotation,
			Class testClass, Constructor testConstructor, 
			Method testMethod) {
    // annotation.setRetryAnalyzer(this.getClass());
		if(testMethod.getName().equals("createLead")) {
			annotation.setInvocationCount(1);  
		}
	}
}






