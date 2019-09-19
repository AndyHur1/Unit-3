public class FindTheAverage {
    public static void main(String[] args) {
        double Value1;
        double Value2;
        double Value3;
        double Value4;
        double Average = 0;
        Scanner SPY = new Scanner(System.in);

        System.out.println("Please enter Value1");
        Value1= SPY.nextDouble();
        Average+= Value1;
        System.out.println("Please enter Value2");
        Value2= SPY.nextDouble();
        Average+= Value2;
        System.out.println("Please enter Value3");
        Value3= SPY.nextDouble();
        Average+= Value3;
        System.out.println("Please enter Value4");
        Value4= SPY.nextDouble();
        Average+= Value4;
        Average/= 4;
        System.out.println("Average = "+(Average));

}
