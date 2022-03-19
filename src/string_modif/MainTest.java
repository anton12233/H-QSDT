package string_modif;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;
import static string_modif.Main.*;

class MainTest {

    @Test
    public void checkDeleteTest(){
        assertTrue(isModif_True_Delete("Loraine Savage", "Loraine Savag"));
        assertTrue(isModif_True_Delete("Loraine Savage", "Lorane Savage"));
        assertTrue(isModif_True_Delete("Loraine Savage", "oraine Savage"));
        assertTrue(isModif_True_Delete("Loraine Savage", "LoraineSavage"));
        assertTrue(isModif_True_Delete("Loraine Savage", "Loraine Savag"));

        assertFalse(isModif_True_Delete("Johnjoseph", ""));
        assertFalse(isModif_True_Delete("Johnjoseph", "JohnjosephJohnjoseph"));
        assertFalse(isModif_True_Delete("Johnjoseph", "Johnjoseph12"));


        assertFalse(isModif_True_Delete("Johnjoseph", "Johnjoseph1"));
        assertFalse(isModif_True_Delete("Johnjoseph", "Johnjosep1"));

    }
    @Test
    public void checkInsertTest(){
        assertTrue(isModif_True_Insert("energy", "energya"));
        assertTrue(isModif_True_Insert("energy", "aenergy"));
        assertTrue(isModif_True_Insert("energy", "eneargy"));
        assertTrue(isModif_True_Insert("energy", "energy "));

        assertFalse(isModif_True_Insert("cormac", "cormac11"));
        assertFalse(isModif_True_Insert("cormac", "cor11mac"));
        assertFalse(isModif_True_Insert("cormac", "11cormac"));

        assertFalse(isModif_True_Insert("cormac", "cor1ac"));
        assertFalse(isModif_True_Insert("cormac", "corac"));


    }
    @Test
    public void checkChangeTest(){
        assertTrue(isModif_True_Change("energy", "anergy"));
        assertTrue(isModif_True_Change("energy", "energa"));
        assertTrue(isModif_True_Change("energy", "ene1gy"));
        assertTrue(isModif_True_Change("energy", " nergy"));

        assertFalse(isModif_True_Change("energy", "ener  "));
        assertFalse(isModif_True_Change("energy", "  ergy"));
        assertFalse(isModif_True_Change("energy", "eneggg"));

        assertFalse(isModif_True_Change("energy", "energy1"));
        assertFalse(isModif_True_Change("energy", "energ"));

    }

    @Test
    public void checkManagerTest(){
        assertTrue(isModif_FuncManager("energy", "anergy"));
        assertTrue(isModif_FuncManager("energy", "energa"));
        assertTrue(isModif_FuncManager("energy", "ene1gy"));
        assertTrue(isModif_FuncManager("energy", " nergy"));

        assertFalse(isModif_FuncManager("energy", "ener  "));
        assertFalse(isModif_FuncManager("energy", "  ergy"));
        assertFalse(isModif_FuncManager("energy", "eneggg"));

        assertTrue(isModif_FuncManager("energy", "energya"));
        assertTrue(isModif_FuncManager("energy", "aenergy"));
        assertTrue(isModif_FuncManager("energy", "eneargy"));
        assertTrue(isModif_FuncManager("energy", "energy "));

        assertFalse(isModif_FuncManager("cormac", "cormac11"));
        assertFalse(isModif_FuncManager("cormac", "cor11mac"));
        assertFalse(isModif_FuncManager("cormac", "11cormac"));

        assertTrue(isModif_FuncManager("Loraine Savage", "Loraine Savag"));
        assertTrue(isModif_FuncManager("Loraine Savage", "Lorane Savage"));
        assertTrue(isModif_FuncManager("Loraine Savage", "oraine Savage"));
        assertTrue(isModif_FuncManager("Loraine Savage", "LoraineSavage"));
        assertTrue(isModif_FuncManager("Loraine Savage", "Loraine Savag"));

        assertFalse(isModif_FuncManager("Johnjoseph", ""));
        assertFalse(isModif_FuncManager("Johnjoseph", "JohnjosephJohnjoseph"));
        assertFalse(isModif_FuncManager("Johnjoseph", "Johnjoseph12"));


        assertTrue(isModif_FuncManager("Johnjoseph", "Johnjoseph1"));
        assertTrue(isModif_FuncManager("Johnjoseph", "Johnjosep1"));
        assertTrue(isModif_FuncManager("cormac", "cor1ac"));
        assertTrue(isModif_FuncManager("cormac", "corac"));
        assertTrue(isModif_FuncManager("energy", "energy1"));
        assertTrue(isModif_FuncManager("energy", "energ"));
    }

}