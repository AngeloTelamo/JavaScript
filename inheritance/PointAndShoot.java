public class PointAndShoot extends DigitalCamera {
    // public void create() {
        // make = "Canon";
    // model = "Powershot A590 IS";
    // megapixels = 8.0;
    // price = 129.95;
     // }
     public void describe() {
        System.out.println("Digital Camera");
        System.out.println("Make:       " + make);
        System.out.println("Model:      " + model);
        System.out.println("Megapixels: " + megapixels);
        System.out.println("Price:      " + price);
    }
    
    public void takePicture(){
        System.out.println("kaching");
    }
}
