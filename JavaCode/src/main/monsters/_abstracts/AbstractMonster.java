package monsters._abstracts;


abstract public class AbstractMonster {

    /**
     * The name of this monster.
     */
    private String name;

    /**
     * The monster-family to which this monster belongs.
     */
    private String monsterFamily;


    /**
     * Set the name for this monster.
     * @param name String
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the name of this monster.
     * @return String
     */
    public String getName() {
        return this.name;
    }

}
