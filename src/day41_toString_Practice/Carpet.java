package day41_Static;

public class Carpet {

    double width;
    double length;
    double unitPrice;
    boolean isPersian;

    public void customOrder(double width, double length, double unitPrice, boolean isPersian){
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost(){
        double totalPrice = (width*length)*unitPrice;
        if(isPersian){
            totalPrice += 200;
        }

        return totalPrice;
    }


    public void getCarpetInfo( ){
        System.out.println("============================");
        System.out.println("width: "+width);
        System.out.println("length: "+length);
        System.out.println("Unit Price: "+unitPrice);
        System.out.println("Persian Carpet: "+isPersian);
        System.out.println("Total Price: "+calcCost());
        System.out.println("============================");
    }
    public String toString(){
        return "Width: "+width +", length: "+length+", Persian: "+isPersian;
    }


}
