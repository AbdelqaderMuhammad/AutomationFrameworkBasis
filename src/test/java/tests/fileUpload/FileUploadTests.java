package tests.fileUpload;

import base.TestBase;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends TestBase {
    @Test
    public void testFileUpload() throws InterruptedException {
        var uploadPage = homePage.clickFileUploadPage();
        uploadPage.uploadFile("D:\\Work\\AutomationFrameworkBasis\\resources\\magazie.jpg");
        assertEquals(uploadPage.getUploadedFiles(), "magazie.jpg", "uploaded was successfull");
    }

}
