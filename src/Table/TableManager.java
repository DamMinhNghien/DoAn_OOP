/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Table;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;
import java.util.Scanner;

public class TableManager {
    // thuoc tinh
    private ArrayList<Table> tables;
    //ham tao
    public TableManager() {
        tables = new ArrayList<>();
    }
    // tao bang 
    public void createTable(int tableId) {
        Table table = new Table(tableId);
        tables.add(table);
        System.out.println("Table " + tableId + " has been created.");
    }
    // xoa bang
    public void deleteTable(int tableId) {
    }
    //xem bang
    public void viewTable(int tableId) {
    }
    // roi bang
    public void leaveTable(int tableId) {
        // Do something to leave the table
    }
    // thong ke
    public void showStatistics() {
        // Do something to show other statistics
    }
}
