import javax.swing.*;


public class FlightTicket {
    double pragueBerlin = 400;
    double pragueBudapest = 600;
    double pragueAmsterdam = 850;
    double pragueBarcelona = 1200;
    double pragueLisbon = 1000;
    double unitPrice = 20;
    double discountRateReturn = 0.8;

    void calculateTicket() {
        String priceList1 =
                "1- Prague - Berlin (400 km )\n" +
                        "2- Prague - Budapest ( 600 km)\n" +
                        "3- Prague - Amsterdam   (850 km)\n" +
                        "4- Prague - Barcelona (1200 km)\n" +
                        "5- Prague - Lisbon ( 1000km)";
        String priceList2 =
                "1- Prague - Berlin  (800 km )\n" +
                        "2- Prague - Budapest ( 1200 km)\n" +
                        "3- Prague - Amsterdam    (1900 km)\n" +
                        "4- Prague - Barcelona (2400 km)\n" +
                        "5- Prague - Lisbon ( 2000km)";
        String goodbye = "Thank you for choosing Ryanair. Enjoy your flight! Always getting better.";

        while (true) {
            int way = Integer.parseInt(JOptionPane.showInputDialog("Welcome to Ryanair!\n" + "Please write 1  for one way 1 or returnway write 2!"));
            if (way == 1) {
                int oneway = Integer.parseInt(JOptionPane.showInputDialog("Please indicate in which direction you would like to travel with the appropriate number.!\n" + priceList1));
                while(oneway<1 || oneway>5){
                    oneway = Integer.parseInt(JOptionPane.showInputDialog("You have not selected one of the available options!\n "+"Please indicate again in which direction you would like to travel with the appropriate number!\n" + priceList1));
                }

                int age = Integer.parseInt(JOptionPane.showInputDialog("Please indicate how old you are with numbers!"));
                while(age<0){
                    age = Integer.parseInt(JOptionPane.showInputDialog("You have entered an incorrect age!\n"+"Please indicate how old you are again with numbers!"));
                }

                if (age>=0 && age < 12) {
                    JOptionPane.showMessageDialog(null, "Your total ticket amount: " + calculationTicketPrice(oneway) + "\n" + "Total amount of your ticket with 50% discount: " + calculationTicketPrice(oneway) * 0.5 + "\n" + goodbye);
                    break;
                } else if (age >= 12 && age <= 24) {
                    JOptionPane.showMessageDialog(null, "Your total ticket amount: " + calculationTicketPrice(oneway) + "\n" + "Total amount of your ticket with 10% discount: " + calculationTicketPrice(oneway) * 0.9 + "\n" + goodbye);
                    break;
                } else if (age > 65) {
                    JOptionPane.showMessageDialog(null, "Your total ticket amount: " + calculationTicketPrice(oneway) + "\n" + "Total amount of your ticket with 30% discount: " + calculationTicketPrice(oneway) * 0.7 + "\n" + goodbye);
                    break;
                } else if (age>24 && age<=65){
                    JOptionPane.showMessageDialog(null, "Your total ticket amount: " + calculationTicketPrice(oneway) + "\n" + goodbye);
                    break;
                }
            }

            else if (way == 2) {
                int returnWay = Integer.parseInt(JOptionPane.showInputDialog("Please indicate in which direction you would like to travel with the appropriate number!\n" + priceList2));

                while(returnWay<1 || returnWay>5){
                    returnWay = Integer.parseInt(JOptionPane.showInputDialog("You have not selected one of the available options!\n "+"Please indicate again in which direction you would like to travel with the appropriate number!\n" + priceList2));
                }
                double discounted = (calculationTicketPrice(returnWay) * discountRateReturn) * 2;

                int  age2 = Integer.parseInt(JOptionPane.showInputDialog("Please indicate how old you are with numbers!"));
                while(age2<0){
                    age2 = Integer.parseInt(JOptionPane.showInputDialog("You have entered an incorrect age!\n"+"Please indicate how old you are again with numbers!"));
                }
                if (age2>=0 && age2 < 12) {
                    JOptionPane.showMessageDialog(null, "Your total ticket amount: " + discounted + "\n" + "Total amount of your ticket with 50% discount: " + discounted * 0.5 + "\n" + goodbye);
                    break;
                } else if (age2 >= 12 && age2 <= 24) {
                    JOptionPane.showMessageDialog(null, "Your total ticket amount: " + discounted + "\n" + "Total amount of your ticket with 10% discount: " + discounted * 0.9 + "\n" + goodbye);
                    break;
                } else if (age2 > 65) {
                    JOptionPane.showMessageDialog(null, "Your total ticket amount: " + discounted + "\n" + "Total amount of your ticket with 30% discount: " + discounted * 0.7 + "\n" + goodbye);
                    break;
                } else if (age2>24 && age2<=65){
                    JOptionPane.showMessageDialog(null, "Your total ticket amount: " + discounted + "\n" + goodbye);
                    break;}

            } else
                JOptionPane.showMessageDialog(null, "You have selected an option that is not on the list! Please refresh the page!");
        }
    }

    double calculationTicketPrice(int way) {

        if (way == 1) {
            return (pragueBerlin * unitPrice);
        } else if (way == 2) {
            return pragueBudapest * unitPrice;
        } else if (way == 3) {
            return pragueAmsterdam * unitPrice;
        } else if (way == 4)
            return pragueBarcelona * unitPrice;
        else if (way == 5) {
            return pragueLisbon * unitPrice;
        } else
            return 0;

    }

}