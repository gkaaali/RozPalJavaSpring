package me.kalinowski.RozPal;

public class PackingCondition {

    public int id;
    public String description;

    public PackingCondition(){
    }

    public PackingCondition(int id, String description){
        this.id = id;
        this.description = description;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
