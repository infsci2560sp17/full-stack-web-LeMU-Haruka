package edu.infsci2560.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Entity
public class enemyFleet {

    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String map;// like 1-1 or Win17E3
    protected String point;
    protected String flagship;
    protected String name2;
    protected String name3;
    protected String name4;
    protected String name5;
    protected String name6;
    public enemyFleet() {
        this.id = Long.MAX_VALUE;
        this.map="none";
        this.point="none";
        this.flagship="none";
        this.name2="none";
        this.name3="none";
        this.name4="none";
        this.name5="none";
        this.name6="none";
    }
    public enemyFleet(Long id,String map,String point,String flagship,String name2, String name3, String name4 ,String name5, String name6) {
        this.id = id;
        this.map=map;
        this.point=point;
        this.flagship=flagship;
        this.name2=name2;
        this.name3=name3;
        this.name4=name4;
        this.name5=name5;
        this.name6=name6;
    }

    @Override
    public String toString() {
        return "[ map=" + this.map + ", point=" + this.point + ", Flagship=" + this.flagship + " ]";
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * @return the name
     */
    public String getMap() {
        return map;
    }

    /**
     * @param title the name to set
     */
    public void setMap(String map) {
        this.map = map;
    }
    public String getPoint() {
        return point;
    }

    /**
     * @param title the name to set
     */
    public void setPoint(String point) {
        this.point = point;
    }

    /**
     * @return 
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
    
    public String getFlagship() {
        return flagship;
    }

    /**
     * @param 
     */
    public void setFlagship(String flagship) {
        this.flagship=flagship;
    }
    /**
     * @return the id
     */
    //public Long getId() {
    //    return id;
    //}

    /**
     * @param id the id to set
     */
   // public void setId(Long id) {
    //    this.id = id;
    //}
    
        /**
     * @param id the id to set
     */
    public void setName2(String name2) {
        this.name2 = name2;
    }

        public String getName2() {
        return name2;
    }
    /**
     * @param id the id to set
     */
     public void setName3(String name3) {
        this.name3 = name3;
        }
    
        public String getName3() {
        return name3;
    }
        public void setName4(String name4) {
        this.name4 = name4;
    }

        public String getName4() {
        return name4;
    }
    
        public void setName5(String name5) {
        this.name5 = name5;
    }
    
        public String getName5() {
        return name5;
    }
    public void setName6(String name6) {
        this.name6 = name6;
    }
    
    public String getName6() {
        return name6;
    }
  //   public String getFloor() {
    //    return floor;
    //}
     //public void setFloor(Long id) {
      // this.floor= this.id+"l";
    //}


}