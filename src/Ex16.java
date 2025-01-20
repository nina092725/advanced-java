public class Ex16 {
    public static void main(String[] args) {
        System.out.println(Calculation.execute(4,"+" , 3));
        System.out.println(Calculation.execute(8, "-", 4));
        System.out.println(Calculation.execute(3, "*", 8));
        System.out.println(Calculation.execute(5, "/", 2));

        try {
            System.out.println(Calculation.execute(8, "$", 3));
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        

        
    }

        
    }


