package zad7;

public class Ticket {

    public static final String STANDARD = "Standard";
    public static final String ONLINE = "Online";
    public static final String GIFT = "Gift";
    private  static int serialNumber = 0;

    private String nameEvent;
    private String placeEvent;
    private String typ;
    private double price;
    private double discount;
    private int id;

    public Ticket(String nameEvent, String placeEvent, String typ, double price, double discount) {
        this.nameEvent = nameEvent;
        this.placeEvent = placeEvent;
        this.typ = typ;
        this.price = price;
        this.discount = discount;
        this.id = serialNumber++;
    }

    public static int getSerialNumber() {
        return serialNumber;
    }

    public String getNameEvent() {
        return nameEvent;
    }

    public void setNameEvent(String nameEvent) {
        this.nameEvent = nameEvent;
    }

    public String getPlaceEvent() {
        return placeEvent;
    }

    public void setPlaceEvent(String placeEvent) {
        this.placeEvent = placeEvent;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void showTicketType (){
        switch (typ){
            case ONLINE:
                System.out.println("bilet internetowy");
                break;
            case STANDARD:
                System.out.println("bilet standardowy");
                break;
            case GIFT:
                System.out.println("bilet prezentowy");
                break;
        }
    }
}
