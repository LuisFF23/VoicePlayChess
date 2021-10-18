package controller;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class ClickController {
    
    public static void Select(int x, int y) throws AWTException {
        Robot bot = new Robot();
        bot.delay(3000);
        bot.setAutoDelay(1000);
        
        bot.mouseMove(x, y);
        
        bot.delay(2000);
        
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        bot.delay(2000);
    }
    
}
