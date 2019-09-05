package tws.entity;


public class Book {
    private int bookNo;
    private String recipient;
    private int telNum;
    private String status;
    private String reservationTime;
    private String bookWeight;


    public Book(int bookNo, String recipient, int telNum, String status, String reservationTime, String bookWeight) {
        this.bookNo = bookNo;
        this.recipient = recipient;
        this.telNum = telNum;
        this.status = status;
        this.reservationTime = reservationTime;
        this.bookWeight = bookWeight;
    }

    public Book(){

    }

    public int getBookNo() {
        return bookNo;
    }

    public void setBookNo(int bookNo) {
        this.bookNo = bookNo;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public int getTelNum() {
        return telNum;
    }

    public void setTelNum(int telNum) {
        this.telNum = telNum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReservationTime() {
        return reservationTime;
    }

    public void setReservationTime(String reservationTime) {
        this.reservationTime = reservationTime;
    }
    public String getBookWeight() {
        return bookWeight;
    }

    public void setBookWeight(String bookWeight) {
        this.bookWeight = bookWeight;
    }
}
