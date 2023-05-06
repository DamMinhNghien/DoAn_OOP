/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Card;
import Member.Member;
import java.util.Date;

/**
 *
 * @author admin
 */
public class Comment {
 
    private String content;
    private Date createdAt;
    private Member createdBy;

  public Comment( String content, Date createdAt, Member createdBy) {

        this.content = content;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Member getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Member createdBy) {
        this.createdBy = createdBy;
    }
}
