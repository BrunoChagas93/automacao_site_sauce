package steps;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        dryRun = false,
        monochrome = false,
        features = "src/test/resources/features/",
        glue = "steps",
        plugin = {
               "pretty",
                "html:Relatorio/Relatorio.html"
}
)

public class Runner {
}
