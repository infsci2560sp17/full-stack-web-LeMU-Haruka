package edu.infsci2560.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Entity
public class enemy {

    private static final long serialVersionUID = 1L;

    public enum ShipType {
        Battleship,
        Cuiser,
        Destroyer,
        Carrier
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String name;
    protected int HP;
    protected int fire;
    protected int armor;
    protected int torp;
    protected int antiair;
    protected int escape;
    protected ShipType type;
    public enemy() {
        this.id = Long.MAX_VALUE;
        this.name="none";
        this.HP=0;
        this.fire = 0;
        this.armor = 0;
        this.torp=0;
        this.antiair = 0;
        this.escape=0;
        this.type=ShipType.Battleship;
    }
    public enemy(Long id,String name,int h,int f, int ar ,int t, int aa, int e ,ShipType s) {
        this.id = id;
        this.name=name;
        this.HP=h;
        this.fire = f;
        this.armor = ar;
        this.torp=t;
        this.antiair = aa;
        this.escape=e;
        this.type=s;
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", name=" + this.name + ", Type=" + this.type + " ]";
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
     * @return 
     */
    public ShipType getType() {
        return type;
    }

    /**
     * @param 
     */
    public void setType(ShipType type) {
        this.type = type;
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
    public void setHP(int HP) {
        this.HP = HP;
    }
    public int getHP() {
        return HP;
    }
    public void setTorp(int torp) {
        this.torp = torp;
    }
        public int getTorp() {
        return torp;
    }
    /**
     * @param id the id to set
     */
    public void setArmor(int armor) {
        this.armor = armor;
    }
        public int getArmor() {
        return armor;
    }
    /**
     * @param id the id to set
     */
    public void setAA(int aa) {
        this.antiair = aa;
    }
        public int getAA() {
        return antiair;
    }
    /**
     * @param id the id to set
     */
    public void setFire(int fire) {
        this.fire = fire;
    }
        public int getFire() {
        return fire;
    }
    public void setEscape(int escape) {
        this.escape = escape;
    }
        public int getEscape() {
        return escape;
    }
    public void setAntiair(int aa) {
        this.antiair = aa;
    }
    public int getAntiair() {
        return antiair;
    }
  //   public String getFloor() {
    //    return floor;
    //}
     //public void setFloor(Long id) {
      // this.floor= this.id+"l";
    //}


}