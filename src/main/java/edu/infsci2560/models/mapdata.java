package edu.infsci2560.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Entity
public class mapdata {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String belong;// nomal map write aera name
                            // events use 17win
    protected String sign;
    protected String name;
    protected int HP;//no HP will be 0
    protected int base_aerial;//if can be 1 or be 0
    protected int num;//total points in this map
    public mapdata() {
        this.id = Long.MAX_VALUE;
        this.sign="0-0";
        this.belong="none";
        this.name="none";
        this.HP = 0;
        this.base_aerial= 0;
        this.num=0;
    }
    public mapdata(Long id,String s,String b,String name,int h,int ba, int n) {
        this.id = id;
        this.sign=s;
        this.belong=b;
        this.name=name;
        this.HP=h;
        this.base_aerial=ba;
        this.num=n;
    }

    @Override
    public String toString() {
        return "Map id=" + this.id + ", belong ="+ this.belong+", name=" + this.name + ", total HP=" + this.HP + " ]";
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
    public String getBelong() {
        return belong;
    }

    /**
     * @param title the name to set
     */
    public void setBelong(String b) {
        this.belong =b;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param title the name to set
     */
    public void setName(String name) {
        this.name = name;
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
    
        /**
     * @param id the id to set
     */
    public void setHP(int hp) {
        this.HP = hp;
    }
        public int getHP() {
        return HP;
    }
    /**
     * @param id the id to set
     */
    public void setBaseaerial(int ba) {
        this.base_aerial = ba;
    }
        public int getBaseaerial() {
        return base_aerial;
    }
    /**
     * @param id the id to set
     */
    public void setNum(int n) {
        this.num = n;
    }
        public int getNum() {
        return num;
    }
    public void setSign(String s) {
        this.sign = s;
    }
        public String getSign() {
        return sign;
    }

  //   public String getFloor() {
    //    return floor;
    //}
     //public void setFloor(Long id) {
      // this.floor= this.id+"l";
    //}


}