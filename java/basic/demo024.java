public class Demo024 {
    public static void main(String[] args) {
        String[][] friends = {
            {"abhi", "7896655441","Alwal
            "},
            {"Kowshik", "9876543210", "Nagole"},
            {"srujan", "8976543211", "Karimnagar"}
        };

        for (String[] friend : friends) {
            System.out.println("Name: " + friend[0]);
            System.out.println("Phone Number: " + friend[1]);
            System.out.println("Address: " + friend[2]);
            System.out.println("----------------------");
        }
    }
}