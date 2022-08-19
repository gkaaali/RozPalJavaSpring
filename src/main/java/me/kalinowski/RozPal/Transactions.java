package me.kalinowski.RozPal;

import java.util.Date;

public class Transactions {
    public int id;
    public String supplierId;
    public String recipientId;
    public String deliveryDate;
    public String documentNumber;
    public int packingIdOneGood;
    public int quantityPackingOneGood;
    public int quantityPackingOneRepair;
    public int quantityPackingOneBroken;
    public int packingIdTwoGood;
    public int quantityPackingTwoGood;
    public int quantityPackingTwoRepair;
    public int quantityPackingTwoBroken;

    public int getPackingIdOneGood() {
        return packingIdOneGood;
    }

    public void setPackingIdOneGood(int packingIdOneGood) {
        this.packingIdOneGood = packingIdOneGood;
    }

    public int getQuantityPackingOneRepair() {
        return quantityPackingOneRepair;
    }

    public void setQuantityPackingOneRepair(int quantityPackingOneRepair) {
        this.quantityPackingOneRepair = quantityPackingOneRepair;
    }

    public int getPackingIdTwoGood() {
        return packingIdTwoGood;
    }

    public void setPackingIdTwoGood(int packingIdTwoGood) {
        this.packingIdTwoGood = packingIdTwoGood;
    }

    public int getQuantityPackingTwoRepair() {
        return quantityPackingTwoRepair;
    }

    public void setQuantityPackingTwoRepair(int quantityPackingTwoRepair) {
        this.quantityPackingTwoRepair = quantityPackingTwoRepair;
    }

    public Transactions(){}

    public Transactions(int id, String supplierId, String recipientId, String deliveryDate, String documentNumber, int packingIdOneGood, int quantityPackingOneGood, int quantityPackingOneRepair, int quantityPackingOneBroken, int packingIdTwoGood, int quantityPackingTwoGood, int quantityPackingTwoRepair, int quantityPackingTwoBroken) {
        this.id = id;
        this.supplierId = supplierId;
        this.recipientId = recipientId;
        this.deliveryDate = deliveryDate;
        this.documentNumber = documentNumber;
        this.packingIdOneGood = packingIdOneGood;
        this.quantityPackingOneGood = quantityPackingOneGood;
        this.quantityPackingOneRepair = quantityPackingOneRepair;
        this.quantityPackingOneBroken = quantityPackingOneBroken;
        this.packingIdTwoGood = packingIdTwoGood;
        this.quantityPackingTwoGood = quantityPackingTwoGood;
        this.quantityPackingTwoRepair = quantityPackingTwoRepair;
        this.quantityPackingTwoBroken = quantityPackingTwoBroken;
    }

    public int getId() {
        return id;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(String recipientId) {
        this.recipientId = recipientId;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public int getQuantityPackingOneGood() {
        return quantityPackingOneGood;
    }

    public void setQuantityPackingOneGood(int quantityPackingOneGood) {
        this.quantityPackingOneGood = quantityPackingOneGood;
    }

    public int getQuantityPackingOneBroken() {
        return quantityPackingOneBroken;
    }

    public void setQuantityPackingOneBroken(int quantityPackingOneBroken) {
        this.quantityPackingOneBroken = quantityPackingOneBroken;
    }

    public int getQuantityPackingTwoGood() {
        return quantityPackingTwoGood;
    }

    public void setQuantityPackingTwoGood(int quantityPackingTwoGood) {
        this.quantityPackingTwoGood = quantityPackingTwoGood;
    }

    public int getQuantityPackingTwoBroken() {
        return quantityPackingTwoBroken;
    }

    public void setQuantityPackingTwoBroken(int quantityPackingTwoBroken) {
        this.quantityPackingTwoBroken = quantityPackingTwoBroken;
    }

}
