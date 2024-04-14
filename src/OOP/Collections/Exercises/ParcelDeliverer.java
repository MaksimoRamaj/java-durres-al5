package OOP.Collections.Exercises;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class ParcelDeliverer {

    Queue<Parcel> deliveryToolQueue = new LinkedList<>();
    Queue<Parcel> truckQueue = new LinkedList<>();


    void addParcelToDeliveryTool(Parcel parcel){
        deliveryToolQueue.add(parcel);
    }

    Parcel getFromParcelDeliveryTool(){
       return deliveryToolQueue.poll();
    }

    boolean addParcelToTheTruck(){
        Parcel parcel = getFromParcelDeliveryTool() ;

        if (parcel == null){
            return false;
        }

        return truckQueue.add(parcel);
    }

    Parcel getFromTheTruck(){
       return truckQueue.poll();
    }

    public static void main(String[] args) {
            ParcelDeliverer parcelDeliverer = new ParcelDeliverer();
            parcelDeliverer.addParcelToDeliveryTool(new Parcel("100"));
            parcelDeliverer.addParcelToDeliveryTool(new Parcel("200"));
            parcelDeliverer.addParcelToDeliveryTool(new Parcel("300"));
            parcelDeliverer.addParcelToDeliveryTool(new Parcel("400"));

        while (true){
                if (parcelDeliverer.addParcelToTheTruck()){
                    continue;
                }
                break;
        }

        boolean isTruckEmpty = false;
            while (!isTruckEmpty){
                try {
                    Parcel parcel = parcelDeliverer.getFromTheTruck();
                    System.out.println(parcel.getId());
                }catch (NoSuchElementException | NullPointerException e){
                    isTruckEmpty = true;
                }
            }


    }

}
