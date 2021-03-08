package runner.etsy;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/test/resources/com.etsy/EtsySearch.feature",
            glue = "",
            dryRun = true
    )

    public class EtsyRunner {

    }



