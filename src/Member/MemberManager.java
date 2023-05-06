/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Member;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class MemberManager {
    // Thuộc tính
    private ArrayList<Member> members;

    // Hàm tạo
    public MemberManager() {
        members = new ArrayList<>();
    }

    // Thêm thành viên mới vào bảng
    public void addMember(Member member) {
        members.add(member);
        System.out.println("Thành viên " + member.getName() + " đã được thêm vào bảng.");
    }

    // Xóa thành viên khỏi bảng
    public void removeMember(Member member) {
        members.remove(member);
        System.out.println("Thành viên " + member.getName() + " đã bị xóa khỏi bảng.");
    }

    // Chỉnh sửa quyền hạn thành viên trên bảng
    public void editMemberPermissions(Member member, int permissions) {
        member.setPermissions(permissions);
        System.out.println("Quyền hạn của thành viên " + member.getName() + " đã được chỉnh sửa.");
    }

    // Hiển thị danh sách thành viên của bảng
    public void displayMembers() {
        System.out.println("Danh sách thành viên của bảng:");
        for (Member member : members) {
            System.out.println(member.getName());
        }
    }

    // Xem thông tin chi tiết của một thành viên
    public void displayMemberDetails(Member member) {
        System.out.println("Thông tin chi tiết của thành viên " + member.getName() + ":");
        System.out.println("Email: " + member.getEmail());
        System.out.println("Số điện thoại: " + member.getPhoneNumber());
        System.out.println("Quyền hạn: " + member.getPermissions());
    }
}

