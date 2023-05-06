/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Member;

/**
 *
 * @author admin
 */
public class Member {
    // Thuộc tính
    private String name;
    private String email;
    private String phoneNumber;
    private int permissions;

    // Hàm tạo
    public Member(String name, String email, String phoneNumber, int permissions) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.permissions = permissions;
    }

    // Getter và setter cho các thuộc tính
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPermissions() {
        return permissions;
    }

    public void setPermissions(int permissions) {
        this.permissions = permissions;
    }
}

