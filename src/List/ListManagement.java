/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doAn;

import java.util.*;
public class ListManagement {
    
    ArrayList<List> ds = new ArrayList<List>();
    //Hàm tạo
    public void ListManagement(){
        ds = new ArrayList<>();
    }
    
    //Tạo danh sách mới
    public void addList(List ds){
        ds.add(ds);
    }
    
    //Xóa danh sách
    public void removeList(List ds){
        ds.remove(ds);
    }
    
    //Chỉnh sửa danh sách
    public void editList(List ds){
        
    }
    
    //Hiển thị danh sách các danh sách
    public void displayList(List ds){
        
    }

}