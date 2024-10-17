package Container;

public  class Container {

	    private String type;
	    private double length;
	    private double width;
	    private double height;
	    
	    
	    //CONTAINER

	    public Container(String type, double length, double width, double height) {
	        this.type = type;
	        this.length = length;
	        this.width = width;
	        this.height = height;
	        
	        
	        //GETTER AND SETTER
	    }
		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public double getLength() {
			return length;
		}

		public void setLength(double length) {
			this.length = length;
		}

		public double getWidth() {
			return width;
		}

		public void setWidth(double width) {
			this.width = width;
		}

		public double getHeight() {
			return height;
		}

		public void setHeight(double height) {
			this.height = height;
		}
		



	    public void printInfo() {
	        System.out.println("Container: " + type);
	        System.out.println("Dimensions: " + length + "m x " + width + "m x " + height + "m");
	    }


}
