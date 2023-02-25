package hw28;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Task6 {
    public static void main(String[] args) {
        ArrayList<Insurance> insurances=new ArrayList<>();
        insurances.add(new Car());
        insurances.add(new Pet());
        insurances.add(new Health());

        for (int i = 0; i < insurances.size(); i++) {
            Insurance insurance = insurances.get(i);
            insurance.getQuote();
            insurance.cancelInsurance();
            System.out.println("");
        }

        for (Insurance insurance: insurances){
            insurance.getQuote();
            insurance.cancelInsurance();
            System.out.println("");
        }

        Iterator<Insurance> iterator=insurances.iterator();
        while (iterator.hasNext()){
            Insurance insurance = iterator.next();
            insurance.getQuote();
            insurance.cancelInsurance();
        }
        
        
        //---------------------------------------------------------

        LinkedList<Card> card=new LinkedList<>();
        card.add(new Card("Visa", 15.6));
        card.add(new Card("Mastercard", 14.5));
        card.add(new Card("Prepaid", 5.4));

        for (int i = 0; i < card.size(); i++) {
            Card cards = card.get(i);
            cards.getQuote();
            cards.cancelInsurance();
            cards.display();
            System.out.println();
        }

        for (Card cardEn: card){
            cardEn.getQuote();
            cardEn.cancelInsurance();
            cardEn.display();
            System.out.println();
        }

        Iterator<Card> iterator2=card.iterator();
        while (iterator.hasNext()){
            Card cardIt=iterator2.next();
            cardIt.getQuote();
            cardIt.cancelInsurance();
            cardIt.display();
        }
    }
}

class Insurance{
    String InsuranceName;
    void getQuote(){

    }
    void cancelInsurance(){

    }
}

class Car extends Insurance{
    String carModel;

    @Override
    void getQuote() {
        System.out.println("Car insurance quote");    }

    @Override
    void cancelInsurance() {
        System.out.println("You would like to cancel your insurance");    }
}

class Pet extends Insurance{
    String petType;

    @Override
    void getQuote() {
        System.out.println("Pet insurance quote");    }

    @Override
    void cancelInsurance() {
        System.out.println("You would like to cancel your insurance");    }
}

class Health extends Insurance{
    @Override
    void getQuote() {
        System.out.println("Health insurance quote");    }

    @Override
    void cancelInsurance() {
        System.out.println("You would like to cancel your insurance");    }
}

class Card extends Insurance{
    String cardType;
    double interestRate;

    Card(String cardType, double interestRate){
        this.cardType=cardType;
        this.interestRate=interestRate;
    }

    @Override
    void getQuote() {
        System.out.println(cardType+" "+interestRate);
    }

    @Override
    void cancelInsurance() {
        System.out.println("Are you sure you want to cancel this card?");
    }

    void display(){
        System.out.println("This is a test");
    }
}

