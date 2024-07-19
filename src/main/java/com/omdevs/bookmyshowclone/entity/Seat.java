package com.omdevs.bookmyshowclone.entity;

public class Seat {
    private int seatNo;
    private String seatName;
    private String seatType;
    private int seatPrice;
    public Seat(int seatNo, String seatName, String seatType, int seatPrice) {
        this.seatNo = seatNo;
        this.seatName = seatName;
        this.seatType = seatType;
        this.seatPrice = seatPrice;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

    public String getSeatName() {
        return seatName;
    }

    public void setSeatName(String seatName) {
        this.seatName = seatName;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public int getSeatPrice() {
        return seatPrice;
    }

    public void setSeatPrice(int seatPrice) {
        this.seatPrice = seatPrice;
    }
}
