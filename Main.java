public class Main {

    public static void main(String[] args) {

        Circle circleDefault = new Circle();
	    Circle c1 = new Circle (0.1, "red");
	    Circle c2 = new Circle(0.3, "yellow");
	    Circle c3 = new Circle(0.1,"blue");

	    circleDefault.Circle_Tidak_Berparameter();

	    circleDefault.Circle_Berparameter();
    }
}
