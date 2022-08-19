package me.kalinowski.RozPal;

public class Participants {

    public int id;
    public int clientId;
    public String name;
    public  int groupid;
    public Boolean headOfGroup;
    public String taxNumber;
    public String postalCode;
    public String adress;
    public String city;
    public Boolean isParticipant;

    public Participants(){
    }

    public Participants(int id, int clientId, String name, int groupid, Boolean headOfGroup, String taxNumber, String postalCode, String adress, String city, Boolean isParticipant){
        this.id = id;
        this.clientId = clientId;
        this.name = name;
        this.groupid = groupid;
        this.headOfGroup = headOfGroup;
        this.taxNumber = taxNumber;
        this.postalCode = postalCode;
        this.adress = adress;
        this.city = city;
        this.isParticipant = isParticipant;
    }

    public int getId(){return id;}

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getClientName(){return name;}

    public void setClientName(String name){this.name = name;}

    public int getGroupid() {return groupid;}

    public void setGroupid(int groupid) {this.groupid = groupid;}

    public Boolean getHeadOfGroup() {return headOfGroup;}

    public void setHeadOfGroup(Boolean headOfGroup) {
        this.headOfGroup = headOfGroup;
    }

    public String getTaxNumber() {return taxNumber;}

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCity() {return city;}

    public void setCity(String city) {
        this.city = city;
    }

    public Boolean getParticipant() {return isParticipant;}

    public void setParticipant(Boolean participant) {
        isParticipant = participant;
    }
}
