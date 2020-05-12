package managers;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utility.Log;

import java.io.File;
import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotManager {

    private WebDriver driver;
    private TakesScreenshot ts;
    private File source;
    private String destinationPath;
    private String timeStamp;
    private File destination;

    public ScreenshotManager(WebDriver driver) {
        this.driver = driver;
    }

    public void takeScreenshot(String name) {
        timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        ts = (TakesScreenshot) driver;
        source = ts.getScreenshotAs(OutputType.FILE);
        destinationPath = FileReaderManager.getInstance().getConfigReader().getSreenshotPath() + timeStamp + " " + name + ".png";
        destination = new File(destinationPath);
        try {
            FileUtils.copyFile(source, destination);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Log.info("Captura realizada <" + destinationPath + ">");
    }
}
