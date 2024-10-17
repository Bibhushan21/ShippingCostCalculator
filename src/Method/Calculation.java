package Method;

import java.awt.Container;
import java.util.ArrayList;
import java.util.List;


import Item.Item;

public class Calculation {


	    private List<Item> items;
	    private List<Integer> order;
	    private List<Container> containers;
	    private double totalVolume;
	    private double totalWeight;
		private double bigContainersVol;
		private double smallContainersVol;
		private int NoOfBigContainer;
		private double totalPrice;
		private int NoOfSmallContainer;
		private double remaningVol;
		private int i;

	    public Calculation() {
	        items = new ArrayList<>();
	        order = new ArrayList<>();
	        containers = new ArrayList<>();
	        totalVolume = 0;
	        totalWeight = 0;
	    }
	    
	    /*
	     1- Laptop which has a box size: 60x50x50 cm and weight of 6.5 kg.
         2- Mouse which has a box size: 30x30x20 cm and weight of 200 g.
         3- Desktop which has a box size: 100x150x50 cm and weight of 20 kg.
         4- LCD screens which has a box size 120x140x 80 cm and weight of 2.6kg.*/

	    public void addItems() {
	        items.add(new Item("Laptop", 6.5, .60 * .50 * .50));
	        items.add(new Item("Mouse", 0.2, .30 * .30 * .20));
	        items.add(new Item("Desktop", 20, 1.00 * 1.50 * .50));
	        items.add(new Item("LCD screens", 2.6, 1.20 * 1.40 * .80));
	    }

	    public void addOrder(int laptop, int mouse, int desktop, int lcdScreens) {
	        order.add(laptop);
	        order.add(mouse);
	        order.add(desktop);
	        order.add(lcdScreens);
	    }

	    public void totalVolume() {
	        for (int i = 0; i < items.size(); i++) {
	            totalVolume += items.get(i).getVolume() * order.get(i);
	        }
	    }

	    public void totalWeight() {
	        for (int i = 0; i < items.size(); i++) {
	            totalWeight += items.get(i).getWeight() * order.get(i);
	        }
	    }

     	    public void bestShipping() {
//	        containers.add(new Container("Small", 6.06, 2.43, 2.59));
//	        containers.add(new Container("Big", 12.01, 2.43, 2.59));

	        double smallCost = 1000;
	        double bigCost = 1800;
	       

	         smallContainersVol =  (6.06 * 2.43 * 2.59);
	         bigContainersVol =  (12.01 * 2.43 * 2.59);
	        double remaningVol = totalVolume % bigContainersVol;
	         NoOfBigContainer =(int) (totalVolume/bigContainersVol);
	         NoOfSmallContainer = 0;

          if(remaningVol<smallContainersVol){
          	NoOfSmallContainer++;
              System.out.println(NoOfBigContainer+" Big Container and "+NoOfSmallContainer+" small container preferred");
          }
          else{
          	NoOfBigContainer++;
              System.out.println(NoOfBigContainer +" Big Container and "+NoOfSmallContainer+" small container preferred");
          }
       }
     	   public double shippingPrice(){
     	    	
     			for(i=0;i<NoOfSmallContainer;i++) {
     	                if (remaningVol < smallContainersVol && totalWeight <= 500) {
     	                    System.out.println("Small container price weight less than 500 KG: " + 1000);
     	                    totalPrice+=1000;
     	                } else {
     	                    System.out.println("Small container price weight more than 500 KG: " + 1200);
     	                    totalPrice+=1200;
     	                }
     	            }
     	        for(i=0;i<NoOfBigContainer;i++){
//     	            System.out.println("large Container price  "+1800+"Euros");
     	            totalPrice +=1800 ;
     	        }
     	       
     	       
     	        System.out.println(NoOfBigContainer +" Big Container price  "+NoOfBigContainer*1800+"Euros");
     	        System.out.println("Total Shipping Price :" +totalPrice);
     	        System.out.println("==========================THANK===YOU========================");
     	       return totalPrice;
     	    }
     	  

	    public void printItem() {
	        for (Item item : items) {
	            item.printInfo();
	            System.out.println();
	        }
	    }

	    public void printOrder() {
	        System.out.println("Order Information:");
	        for (int i = 0; i < items.size(); i++) {
	            System.out.println(items.get(i).getName() + ": " + order.get(i));
	        }
	        System.out.println("Total Volume: " + totalVolume + " m^3");
	        
			System.out.println("Total Volume of big cont: " +  bigContainersVol  + " m^3");
	        System.out.println("Total Weight: " + totalWeight + " kg");
	        System.out.println("===================================================================");
          System.out.println("The Best shipping method is: " + NoOfBigContainer + " big containers and " + NoOfSmallContainer + " small containers.");
          System.out.println("===================================================================");
//          System.out.println("The Best shipping cost is: " + totalPrice + " Euros.");
	    }
	
	
}
