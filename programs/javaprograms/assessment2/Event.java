class Event {
    static String name = "Tech Conference";
    static String date = "2023-12-01";
    static String location = "Convention Center";
    static int attendees = 500;
    static String organizer = "Tech Corp";

    public static String getEventInfo() {
        return name + " on " + date + " at " + location;
    }

    public static boolean isSoldOut() {
        return attendees >= 1000;
    }

    public static String getDate() {
        return date;
    }

    public static String getLocation() {
        return location;
    }

    public static String getOrganizer() {
        return organizer;
    }
}
