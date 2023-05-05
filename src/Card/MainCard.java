/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Card;

import java.util.Date;
import java.util.List;

/**
 *
 * @author admin
 */
public class MainCard {
    private String title; 
    private String description;
    private Date dueDate;
    private  List<String> labels; 
    private  List<String> attachments; 
    private List<String> comments; 
     private int position;
     private boolean archived;
      private List<String> members;
     
    public MainCard(String title, String description, Date dueDate, List<String> labels, List<String> attachments, List<String> comments,int position,boolean archived) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.labels = labels;
        this.attachments = attachments;
        this.comments = comments;
        this.position = position;
        this.archived=false;
    }
     public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void addLabel(String label) {
        labels.add(label);
    }

    public void removeLabel(String label) {
        labels.remove(label);
    }

    public List<String> getLabels() {
        return labels;
    }

    public void addAttachment(String attachment) {
        attachments.add(attachment);
    }

    public void removeAttachment(String attachment) {
        attachments.remove(attachment);
    }

    public List<String> getAttachments() {
        return attachments;
    }

    public void addComment(String comment) {
        comments.add(comment);
    }

    public void removeComment(String comment) {
        comments.remove(comment);
    }

    public List<String> getComments() {
        return comments;
    }
      public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
    public boolean isArchived() {
        return archived;
    }
    
    public void archive() {
        archived = true;
    }
    
    public void unarchive() {
        archived = false;
    }
     public void addMember(String memberName) {
      members.add(memberName);
   }


   public void removeMember(String memberName) {
      members.remove(memberName);
   }


   public List<String> getMembers() {
      return members;
   }
}

