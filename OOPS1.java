
public class OOPS1 {

    static class Pen {

        private String color;
        private int tip;

        // GETTERS 
        String getColor() {
            return this.color;
        }

        int getTip() {
            return this.tip;
        }

        // SETTERS
        void SetColor(String newcolor) {
            this.color = newcolor;
        }

        void SetTip(int newtip) {
            this.tip = newtip;
        }

    }

    public static void main(String[] args) {

        Pen p = new Pen();
        p.SetColor("yellow");
        p.SetTip(5);
        System.out.println("THE Color OF THE PEN CAN BE SET TO: " + p.getColor());
        System.out.println("THE Tip OF THE PEN CAN BE SET TO: " + p.getTip());

    }

}
