package co.com.SkillHacking.runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {
                "src/test/resources/features/casoPdfProhibiciones.feature"
        },
        glue = "co.com.SkillHacking.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class RunnerTags {
}
