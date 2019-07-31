package zad7;

public class TicketCalculator {
    public static double totalPrice (Ticket ticket){
        //double ticketPrice = ticket.getPrice() - (ticket.getPrice()*ticket.getDiscount());;
        switch (ticket.getTyp()){
            case Ticket.ONLINE:
                return ticket.getPrice()- (ticket.getPrice()*ticket.getDiscount());
            case Ticket.STANDARD:
                return ticket.getPrice()- (ticket.getPrice()*ticket.getDiscount()) + 5;
            case Ticket.GIFT:
                return ticket.getPrice()*ticket.getDiscount();
                default:
                    return  ticket.getPrice();
        }
    }
}
