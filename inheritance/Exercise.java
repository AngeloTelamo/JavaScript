public class Exercise  {
    public static void main(String[] args) {
    PointAndShoot camera = new PointAndShoot();
    DigitalCamera camera1 = new PointAndShoot();
        
        
     camera1.make = "Canon";
     camera1.model = "Powershot A590 IS";
     camera1.megapixels = 8.0;
     camera1.price = 129.95;
     camera1.describe(); 
    // System.out.println("Digital Camera");
    // System.out.println("Make:       " + camera.make);
    // System.out.println("Model:      " + camera.model);
    // System.out.println("Megapixels: " + camera.megapixels);
    // System.out.println("Price:      " + camera.price);
    camera.make = "Olympus";
    camera.model = "FE-170";
    camera.megapixels = 6.0;
    camera.price = 119.95;

    camera.describe(); 
  }
}