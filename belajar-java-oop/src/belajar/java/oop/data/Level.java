package belajar.java.oop.data;

//Membuat enum class
public enum Level {
    STANDART("Standart Level"),
    PREMIUM("Premium Level"),
    VIP("VIP Level");

    private String desc;

    //Membuat contructor
    Level(String desc){
        this.desc = desc;
    }

    //Membuat getter
    public String getDesc() {
        return desc;
    }
}
