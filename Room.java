public class Room extends Entity{

    public String exist() {
        String existence = "Exists";
        return existence;
    }

    interface roomState {

        void isFree();
        void isOccupied();
   }
                 
}
