import java.awt.geom.Arc2D;

public class Painting {
    public static void main(String[] args) {
        int room_length;
        int room_width;
        int room_height;
        int room_area;
        int window_area;
        int door_area;
        double Area_You_can_paint_with_one_gallon;
        double Amount_of_Paint;

        Area_You_can_paint_with_one_gallon =350;
        room_length = 32;
        room_width = 40;
        room_height = 16;
        door_area = 20;
        window_area = 15;
        room_area = 2 * (room_height * room_length) + 2 * (room_height * room_width) + (room_length * room_width) - 2 * (door_area) - 4 * (window_area);
        Amount_of_Paint = room_area / Area_You_can_paint_with_one_gallon;
        System.out.print("You will need ");
        System.out.print(Amount_of_Paint);
        System.out.print(" gallons of paint");
    }
}
