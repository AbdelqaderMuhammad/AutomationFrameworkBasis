package tests.frames;

import base.TestBase;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTests extends TestBase {
    @Test
    public void testWysiwyg() {
        var editorPage = homePage.clickWysiwygEditorPage();
        editorPage.clearTextArea();

        String txt1 = "hello";
        String txt2 = "world" ;

        editorPage.setTextArea(txt1);
        editorPage.increaseIndention();
        editorPage.setTextArea(txt2);

        assertEquals(editorPage.getTextFromEditor(), txt1+txt2 , "failed");

    }
}
