/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Card;

import Controller.CardController;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class MainCard {

    public int IDCard;
    public String title;
    private String description;
    private Date dueDate;
    private List<Label> labels;
    private List<Attachment> attachments;
    private List<Comment> comments;
    private boolean archived;

    public MainCard() {
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

    public void addLabel(Label label) {
        this.labels.add(label);
    }

    public void removeLabel(Label label) {
        this.labels.remove(label);
    }

    public List<Label> getLabels() {
        return labels;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void addAttachment(Attachment attachment) {
        this.attachments.add(attachment);
    }

    public void removeAttachment(Attachment attachment) {
        this.attachments.remove(attachment);
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void addComment(Comment comment) {
        this.comments.add(comment);
    }

    public void removeComment(Comment comment) {
        this.comments.remove(comment);
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
    private Connection conn = null;
    private PreparedStatement pat = null;

    public void IDTitleDB(int id, String title) throws SQLException {
        try {
            conn = (Connection) Conection.ConnectionDB.dbConn();

            String sql1 = "INSERT INTO The(IDCard,title) VALUES (?,?);";
            pat = conn.prepareStatement(sql1);
            pat.setInt(1, id);
            pat.setString(2, title);
            pat.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CardController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conn.close();
        }
    }

    public int MaxID() throws SQLException {
        try {
            conn = (Connection) Conection.ConnectionDB.dbConn();
            String sql = "SELECT MAX(IDCard) FROM The;";
            pat = conn.prepareStatement(sql);
            ResultSet rs = pat.executeQuery();
            int maxId = 0;
            if (rs.next()) {
                maxId = rs.getInt(1);
            }
            return maxId;
        } catch (SQLException ex) {
            Logger.getLogger(CardController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conn.close();
        }
        return 0;
    }

    public void TitleDB(String title, int id) throws SQLException {
        try {
            conn = (Connection) Conection.ConnectionDB.dbConn();

            String sql1 = "UPDATE The SET title = ? WHERE IDCard = ?;";
            pat = conn.prepareStatement(sql1);
            pat.setString(1, title);
            pat.setInt(2, id);
            pat.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CardController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conn.close();
        }
    }

    public boolean checkTitle() {
        boolean hasTitle = false;
        try {
            conn = (Connection) Conection.ConnectionDB.dbConn();
            String sql = "SELECT Title FROM The WHERE IDCard = ?";
            pat = conn.prepareStatement(sql);
            pat.setInt(1, IDCard);
            ResultSet rs = pat.executeQuery();
            if (rs.next()) {
                this.title = rs.getString("Title");

                if (this.title != null) {
                    hasTitle = true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(CardController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (pat != null) {
                    pat.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(CardController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return hasTitle;
    }

    public void initialize(URL url, ResourceBundle rb) {

    }
}
