package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features ={"C://Proyectos//userinyerface//Features//FormularioFeature.feature"},
        glue={"stepDefinitions"},
        monochrome = true,
        //  plugin={"html:target/cucumber-html-report","json:target/cucumber-reports/cucumber.json","junit:target/cucumber-reports/cucumber.xml","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        plugin = {"pretty", "html:target/report/cucumber.html", "json:target/report/cucumber.json", "junit:target/report/cucumber.xml"}
)

public class testFormOk {

}
