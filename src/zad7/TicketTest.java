package zad7;

public class TicketTest {
    public static void main(String[] args) {
        TicketCalculator ticketCalculator = new TicketCalculator();
        Ticket ticket1 = new Ticket("meskie granie", "hala stulecia", Ticket.ONLINE, 120, 0);
        Ticket ticket2 = new Ticket("disco polo", "stadion", Ticket.STANDARD, 80, 0.3);
        Ticket ticket3 = new Ticket("muzyka klasyczna", "opera",Ticket.GIFT, 100, 0.2);

        ticket1.showTicketType();
        ticket2.showTicketType();
        ticket3.showTicketType();
        System.out.println("Cena biletu: " + ticketCalculator.totalPrice(ticket2));



    }
}
