class EventRunner {
    public static void main(String[] args) {
        System.out.println("Event Name: " + Event.name);
        System.out.println("Event Date: " + Event.date);
        System.out.println("Event Location: " + Event.location);
        System.out.println("Attendees: " + Event.attendees);
        System.out.println("Organizer: " + Event.organizer);
        
        System.out.println("Event Info: " + Event.getEventInfo());
        System.out.println("Is Sold Out: " + Event.isSoldOut());
        System.out.println("Date: " + Event.getDate());
        System.out.println("Location: " + Event.getLocation());
        System.out.println("Organizer: " + Event.getOrganizer());
    }
}
