public abstract class DigitalCamera {
    String make;
    String model;
    double megapixels;
    double size;
    double price;
    
    // public void describe() {
	// System.out.println("Digital Camera");
	// System.out.println("Make:       " + make);
	// System.out.println("Model:      " + model);
	// System.out.println("Megapixels: " + megapixels);
	// System.out.println("Price:      " + price);
    // }
    abstract void describe();
}