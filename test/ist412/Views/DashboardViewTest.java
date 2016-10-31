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
public class DashboardViewTest {
    
    public DashboardViewTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of main method, of class DashboardView.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        DashboardView.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testNavButton() throws AWTException{
        Robot robot = new Robot();
        robot.mouseMove(10,51);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        try{Thread.sleep(250);}catch(InterruptedException e){}
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
    }
    @Test
    public void testEditButton() throws AWTException{
        Robot robot = new Robot();
        robot.mouseMove(48,193);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        try{Thread.sleep(250);}catch(InterruptedException e){}
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
    }
    @Test
    public void testViewAllButton() throws AWTException{
        Robot robot = new Robot();
        robot.mouseMove(141,193);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        try{Thread.sleep(250);}catch(InterruptedException e){}
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
    }
    @Test
    public void testAddButton() throws AWTException{
        Robot robot = new Robot();
        robot.mouseMove(260,193);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        try{Thread.sleep(250);}catch(InterruptedException e){}
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
    }
    
}
