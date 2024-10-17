package Item;



public  class Item {
	
	
	

	
	    private String name;
	    private double weight;
	    private double volume;
	    
	    
	    //CONTAINER

	    public Item(String name, double weight, double volume) {
	        this.name = name;
	        this.weight = weight;
	        this.volume = volume;
	    }
	    
	    //GETTER AND SETTER
	    public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getWeight() {
			return weight;
		}

		public void setWeight(double weight) {
			this.weight = weight;
		}

		public double getVolume() {
			return volume;
		}

		public void setVolume(double volume) {
			this.volume = volume;
		}



	    public void printInfo() {
	        System.out.println("Item: " + name);
	        System.out.println("Weight: " + weight + " kg");
	        System.out.println("Volume: " + volume + " cm^3");
	    }

		
	    
	


	
	

	
	
	    

}   



