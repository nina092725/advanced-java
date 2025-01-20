public class Ex17 {
    public static void main(String[] args) {
        
        System.out.println(Calculation.execute(4, "+", 3));
        System.out.println(Calculation.execute(8, "-", 4));
        System.out.println(Calculation.execute(3, "*", 8));
        System.out.println(Calculation.execute(5, "/", 2));

        try {
            System.out.println(Calculation.execute(8, "$", 3));
        } catch (OperatorException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }


}
