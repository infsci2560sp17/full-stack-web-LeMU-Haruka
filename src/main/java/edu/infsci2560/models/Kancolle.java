package edu.infsci2560.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Entity

public class Kancolle {

    private static final long serialVersionUID = 1L;

    public enum CommentType {
        Bump,
        Help,
        Information,
        Pray
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String name;
    protected String comment;
    protected CommentType commenttype;
    protected String floor;

    public Kancolle() {
        this.id = Long.MAX_VALUE;
        this.name="Tester";
        this.comment = "nothing";
        this.commenttype = CommentType.Bump;
        //this.floor= this.id+"";
    }

    public Kancolle(Long id,String name ,String comment, CommentType commenttype) {
        this.id = id;
        this.name=name;
        this.comment = comment;
        this.commenttype = commenttype;
       // this.floor=id+"l";
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", comment=" + this.comment + ", CommentType=" + this.commenttype + " ]";
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }


    public String getComment() {
        return comment;
    }

    /**
     * @param title the name to set
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * @return 
     */
    public CommentType getCommentType() {
        return commenttype;
    }

    /**
     * @param 
     */
    public void setCommentType(CommentType commenttype) {
        this.commenttype = commenttype;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    /**
     * @param id the id to set
     */
    public void setName(String name) {
        this.name = name;
    }
  //   public String getFloor() {
    //    return floor;
    //}
     //public void setFloor(Long id) {
      // this.floor= this.id+"l";
    //}


}