package com.ashraf.primeveraxereditor;

import java.util.ArrayList;
import java.util.List;
import net.sf.mpxj.MPXJException;
import net.sf.mpxj.ProjectFile;
import net.sf.mpxj.Task;
import net.sf.mpxj.primavera.PrimaveraXERFileReader;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainUITest {

    public MainUITest() {
    }


    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MainUI.main(args);
    }

    @Test
    public void testPopulateDetails() throws MPXJException {
        String xFileName = "src/test/java/resources/sample.xer";
        PrimaveraXERFileReader reader = new PrimaveraXERFileReader();
        ProjectFile file = reader.read(xFileName);
        Task task = file.getTaskByUniqueID(Integer.parseInt("101720"));

        assertEquals("A1030", task.getActivityID());
        assertEquals("Gondel", task.getName());
        assertEquals(2, task.getType().getValue());
        assertEquals("Task SE.WBS 1", task.getWBS());
        assertEquals("Fri Apr 02 08:00:00 CEST 2021", task.getStart().toString());
        assertEquals("Thu Apr 08 16:00:00 CEST 2021", task.getFinish().toString());
        assertEquals("Turm", task.getPredecessors().get(0).getTargetTask().getName());
        assertEquals("3x Blattmontage", task.getSuccessors().get(0).getTargetTask().getName());

    }

    @Test
    public void testPopulateTable() throws MPXJException {
        String xFileName = "src/test/java/resources/sample.xer";
        PrimaveraXERFileReader reader = new PrimaveraXERFileReader();
        ProjectFile file = reader.read(xFileName);
        List<XERDataModel> xerDataModel = new ArrayList<>();

        for (Task task : file.getTasks()) {
            xerDataModel.add(new XERDataModel(null, null, null, task.getName(), null, null, null, null));
        }

        assertEquals(58, xerDataModel.size());
        assertFalse(xerDataModel.isEmpty());
    }

    @Test
    public void testRemoveLOE() throws MPXJException {
        String xFileName = "src/test/java/resources/sample.xer";
        PrimaveraXERFileReader reader = new PrimaveraXERFileReader();
        ProjectFile file = reader.read(xFileName);
        List<XERDataModel> xerDataModel = new ArrayList<>();
        Boolean flag = false;

        for (Task task : file.getTasks()) {
            if (!task.getSummary() && !task.getName().contains("LOE")) {
                xerDataModel.add(new XERDataModel(null, null, null, task.getName(), null, null, null, null));
            }
        }
        for(XERDataModel m:xerDataModel){
            if(m.getTaskName().contains("LOE")){
                flag = true;
            }
        }
        assertEquals(42, xerDataModel.size());
        assertFalse(xerDataModel.isEmpty());
        assertFalse(flag);
    }
}
