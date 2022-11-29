package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "pretty",
        monochrome = true,
//        tags = "@esse",
//        tags = "~@igonere" tag para testar tudo menos ela
        features = {"src/main/resources/feature"},
        glue ={"steps"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        dryRun = false
)
public class runner {
}
