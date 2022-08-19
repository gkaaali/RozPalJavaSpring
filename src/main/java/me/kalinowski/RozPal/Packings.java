package me.kalinowski.RozPal;

public class Packings {

    public int id;
    public String packingName;
    public int lenght;
    public int width;
    public int heigh;
    public int weight;

    public Packings(){
    };

    public Packings(int id, String packingName, int lenght, int width, int heigh, int weight){
        this.id = id;
        this.packingName = packingName;
        this.lenght = lenght;
        this.width = width;
        this.heigh = heigh;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public String getPackingName() {
        return packingName;
    }

    public void setPackingName(String packingName) {
        this.packingName = packingName;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getWidth() {return width;}

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeigh() {
        return heigh;
    }

    public void setHeigh(int heigh) {
        this.heigh = heigh;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
