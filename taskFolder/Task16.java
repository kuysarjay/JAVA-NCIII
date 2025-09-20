package taskFolder;

public class Task16 {
    interface Animal{
        boolean feed(boolean timeToEat);
        void groom();
        void pet();
    }

    static class Gorilla implements Animal{
        @Override
        public boolean feed(boolean timeToEat){
            if(timeToEat){
                System.out.println("Putting gorilla food into cage");
                return true;
            }else{
                return false;
            }
        }
        @Override
        public void groom(){
            System.out.println("Lather, rinse, repeat.");
        }
        @Override
        public void pet(){
            System.out.println("Pet at your own risk!");
        }
    }
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();
        gorilla.feed(true);
        gorilla.groom();
        gorilla.pet();
    }
}
