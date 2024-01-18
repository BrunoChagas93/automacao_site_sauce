package pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Utils {
    private WebDriver driver;

    public Utils(WebDriver driver){
        this.driver = driver;
    }

    public void imprimirEvidencia(String screenshot1) throws IOException {
        File printFinal = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(printFinal, new File("Saida/" + screenshot1 + ".png"));
    }
}
