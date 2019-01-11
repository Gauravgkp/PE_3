public class DifferentException {
    public static void main(String[] args){
        try {
            int demo[] = new int[2];
            System.out.println("Access element third element :" + demo[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown  :" + e);
        }
        System.out.println("ArrayIndexOutOfBoundsException");
        try {
            int[] myArray = new int[-2];
        } catch (NegativeArraySizeException ex) {
            System.out.println("Can't create array of negative size");
        }
        try {
            int marks[] = {  40, 50, 60 };
            System.out.println(marks[3]);
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Wrong index number, enter correct number. " + e);
        }
        try
        {
            String strtocheck=null;
            if (strtocheck.equals("abc"))
                System.out.print("Same");
            else
                System.out.print("Not Same");
        }
        catch(NullPointerException e)
        {
            System.out.print("NullPointerException detected");
        }
    }
}
