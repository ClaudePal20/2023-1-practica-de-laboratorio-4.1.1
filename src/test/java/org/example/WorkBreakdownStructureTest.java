package org.example;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
class WorkBreakdownStructureTest {
    @Test
    void getName() {
        assertEquals("Proyecto","Proyecto");
    }
    @Test
    void setName() {
        assertEquals("Proyecto","Proyecto");
    }
    @Test
    void getTheTasks() {
        assertEquals("Tarea","Tarea");}
    @Test
    void setTheTasks() {
        assertEquals("Tarea","Tarea");
    }
}