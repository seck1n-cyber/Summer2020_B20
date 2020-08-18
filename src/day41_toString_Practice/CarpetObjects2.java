package day41_Static;

import java.util.ArrayList;
import java.util.Arrays;

/*
create an array of the carpet that contains 5 carpet objects
        ( make sure you set the instance variables of those objects)
            create two ArrayList of carpets:
                                        persianCarpets
                                        regularCarpets
            write a program to store all the persian Carpets into the list of persianCarpets, and store all regular carpets into the list of reugularCarpets
                    use for each loop to print out all the persian carpets
 */
public class CarpetObjects2 {

    public static void main(String[] args) {
        Carpet[] carpets = { new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet() };

        carpets[0].customOrder(4.5,3.5,7.5,false);
        carpets[1].customOrder(5.5,3.5,8.5,true);
        carpets[2].customOrder(4.5,5.5,9.5,false);
        carpets[3].customOrder(3.5,4.5,10.5,true);
        carpets[4].customOrder(6.5,5.5,11.5,true);



        ArrayList<Carpet> persianCarpets = new ArrayList<>();
        persianCarpets.addAll(Arrays.asList(carpets)); // add all the carpets
        persianCarpets.removeIf(p -> p.isPersian == false);  // removing the carpets that are not persion

        ArrayList<Carpet> regularCarpets = new ArrayList<>();
        regularCarpets.addAll(Arrays.asList(carpets)); // add all the carpets
        //regularCarpets.removeIf(p -> p.isPersian);
        regularCarpets.removeAll(persianCarpets);

        System.out.println("Number of persian Carpets: "+persianCarpets.size());
        System.out.println("Number of regular Carpets: "+regularCarpets.size());


        }

    }

