package com.ashraf.primeveraxereditor;

import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class XERDataTest {

    public XERDataTest() {
    }

    private XERDataModel createTestSubject() {
        return new XERDataModel("101718", "A1010", "Task SE.WBS 1", "Fundament", new Date(), new Date(), "Ausfahrt", "LOE1.1, Turm");
    }

    @Test
    public void testGetActivityID() {
        System.out.println("getWBS");
        XERDataModel model;
        model = createTestSubject();

        assertNotNull(model.getActivityID());
        assertEquals("A1010", model.getActivityID());
    }

    @Test
    public void testSetActivityID() {
        System.out.println("setWBS");
        XERDataModel model = createTestSubject();
        model.setActivityID("A1011");

        assertNotNull(model.getActivityID());
        assertEquals("A1011", model.getActivityID());
    }

    @Test
    public void testGetWBS() {
        System.out.println("getWBS");
        XERDataModel model = createTestSubject();

        assertNotNull(model.getWBS());
        assertEquals("Task SE.WBS 1", model.getWBS());
    }

    @Test
    public void testSetWBS() {
        System.out.println("setWBS");
        String wBS = "Task SE.WBS 2";
        XERDataModel model = createTestSubject();
        model.setWBS(wBS);

        assertNotNull(model.getWBS());
        assertEquals("Task SE.WBS 2", model.getWBS());
    }

    @Test
    public void testGetTaskName() {
        System.out.println("getTaskName");
        XERDataModel model = createTestSubject();

        assertNotNull(model.getTaskName());
        assertEquals("Fundament", model.getTaskName());
    }

    @Test
    public void testSetTaskName() {
        System.out.println("setTaskName");
        XERDataModel model = createTestSubject();
        model.setTaskName("New Task");

        assertNotNull(model.getTaskName());
        assertEquals("New Task", model.getTaskName());
    }

    @Test
    public void testGetStartDate() {
        System.out.println("getStartDate");
        XERDataModel model = createTestSubject();

        assertNotNull(model.getStartDate());
        assertEquals(new Date(), model.getStartDate());
    }

    @Test
    public void testSetStartDate() {
        System.out.println("setStartDate");
        XERDataModel model = createTestSubject();
        model.setStartDate(new Date());

        assertNotNull(model.getStartDate());
        assertEquals(new Date(), model.getStartDate());
    }

    @Test
    public void testGetEndDate() {
        System.out.println("getEndDate");
        XERDataModel model = createTestSubject();

        assertNotNull(model.getEndDate());
        assertEquals(new Date(), model.getEndDate());
    }

    @Test
    public void testSetEndDate() {
        System.out.println("setEndDate");
        XERDataModel model = createTestSubject();
        model.setEndDate(new Date());

        assertNotNull(model.getEndDate());
        assertEquals(new Date(), model.getEndDate());
    }

    @Test
    public void testGetPredecessor() {
        System.out.println("getPredecessor");
        XERDataModel model = createTestSubject();

        assertNotNull(model.getPredecessor());
        assertEquals("Ausfahrt", model.getPredecessor());
    }

    @Test
    public void testSetPredecessor() {
       System.out.println("getPredecessor");
        XERDataModel model = createTestSubject();
        model.setPredecessor("New Predecessor");

        assertNotNull(model.getPredecessor());
        assertEquals("New Predecessor", model.getPredecessor());
    }

    @Test
    public void testGetSuccessor() {
        System.out.println("getSuccessor");
        XERDataModel model = createTestSubject();

        assertNotNull(model.getSuccessor());
        assertEquals("LOE1.1, Turm", model.getSuccessor());
    }

    @Test
    public void testSetSuccessor() {
        System.out.println("setSuccessor");
        XERDataModel model = createTestSubject();
        model.setSuccessor("New Successor");

        assertNotNull(model.getSuccessor());
        assertEquals("New Successor", model.getSuccessor());
    }

    @Test
    public void testSetUniqueID() {
        System.out.println("setUniqueID");
        XERDataModel model = createTestSubject();
        model.setUniqueID("101719");

        assertNotNull(model.getUniqueID());
        assertEquals("101719", model.getUniqueID());
    }

    @Test
    public void testGetUniqueID() {
        System.out.println("getUniqueID");
        XERDataModel model;
        model = createTestSubject();

        assertNotNull(model.getUniqueID());
        assertEquals("101718", model.getUniqueID());
    }

}
