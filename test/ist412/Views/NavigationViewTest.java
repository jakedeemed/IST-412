/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist412.Views;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jakedotts
 */
public class NavigationViewTest {
    
    public NavigationViewTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of main method, of class NavigationView.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        NavigationView.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testLogoutButton() throws AWTException{
        Robot robot = new Robot();
        robot.mouseMove(10,310);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        try{Thread.sleep(250);}catch(InterruptedException e){}
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
    }
    @Test
    public void testBatchImportButton() throws AWTException{
        Robot robot = new Robot();
        robot.mouseMove(10,158);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        try{Thread.sleep(250);}catch(InterruptedException e){}
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
    }
    @Test
    public void testBackButton() throws AWTException{
        Robot robot = new Robot();
        robot.mouseMove(16,51);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        try{Thread.sleep(250);}catch(InterruptedException e){}
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
    }
    
}
