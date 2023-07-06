package Utils;

import org.testng.IRetryAnalyzer; // It allows you to implement custom logic to control how test methods are retried in case of failures.
import org.testng.ITestResult; // It represents the result of a test method execution. You can use this interface to obtain information about the test method, its status, and any associated data.

public class retry implements IRetryAnalyzer {
    private int retryCount = 0;
    private static final int maxRetryCount = 0;

    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount) {
            retryCount++;
            return true;
        }
        return false;
    }
}
