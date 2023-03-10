package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    public CustomList creatList() {
        list = new CustomList(null, new ArrayList<>());
        return list;
    }

    @Test
    public void addCity() {
        list = creatList();
        int listSize = list.getCount();
        list.addCity(new City("Edmonton", "AB"));
        assertEquals(list.getCount(), listSize+1);
    }

    @Test
    public void hasCity() {
        list = creatList();
        list.addCity((new City("Edmonton", "AB")));
        assertEquals(list.hasCity("Edmonton"), true);
    }

    @Test
    public void deleteCity() {
        list = creatList();
        int listSize = list.getCount();
        list.addCity(new City("Edmonton", "AB"));
        list.deleteCity("Edmonton");
        assertEquals(list.getCount(), listSize);
    }

    @Test
    public void countCity() {
        list = creatList();
        int listSize = list.getCount();
        list.addCity(new City("Edmonton", "AB"));
        list.addCity(new City("Toronto", "ON"));
        list.addCity(new City("Montreal", "QC"));
        assertEquals(list.countCity(), listSize+3);
    }


}
