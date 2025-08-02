class FanRunner {
    public static void main(String[] args) {
        Fan[] fans = new Fan[5];

        Fan f1 = new Fan();
        f1.setBrand("Usha");
        f1.setPrice(1500);
        f1.setColor("White");
        f1.setSpeedLevels(3);
        f1.setIsRemoteControl(false);
        fans[0] = f1;

        Fan f2 = new Fan();
        f2.setBrand("Crompton");
        f2.setPrice(2200);
        f2.setColor("Brown");
        f2.setSpeedLevels(4);
        f2.setIsRemoteControl(true);
        fans[1] = f2;

        Fan f3 = new Fan();
        f3.setBrand("Havells");
        f3.setPrice(1800);
        f3.setColor("Grey");
        f3.setSpeedLevels(5);
        f3.setIsRemoteControl(false);
        fans[2] = f3;

        Fan f4 = new Fan();
        f4.setBrand("Orient");
        f4.setPrice(2400);
        f4.setColor("Black");
        f4.setSpeedLevels(3);
        f4.setIsRemoteControl(true);
        fans[3] = f4;

        Fan f5 = new Fan();
        f5.setBrand("Bajaj");
        f5.setPrice(1600);
        f5.setColor("Blue");
        f5.setSpeedLevels(2);
        f5.setIsRemoteControl(false);
        fans[4] = f5;

        for (int i = 0; i < fans.length; i++) {
            System.out.println("Fan " + (i + 1));
            System.out.println("Brand: " + fans[i].getBrand());
            System.out.println("Price: ₹" + fans[i].getPrice());
            System.out.println("Color: " + fans[i].getColor());
            System.out.println("Speed Levels: " + fans[i].getSpeedLevels());
            System.out.println("Remote Control: " + (fans[i].getIsRemoteControl() ? "Yes" : "No"));
            System.out.println("----------------------------");
        }
    }
}
