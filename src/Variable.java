public class Variable {

    public static void main(String[] args){

        int number=10;
        double pi= 3.14;
        boolean isTure=true;
        char letter='A';

        String message="Hello world";
        int[] numberarray={1,2,3,4,5};
        object obj= new object();

        int unitializedNumber;
        String unitializedString;


        unitializedNumber=20;
        unitializedString= "Intialized now";

        System.out.println("Number ="+ number);
        System.out.println("Pi: "+ pi);
        System.out.println("Is True?"+ isTure);
        System.out.println("Letter is "+ letter);
        System.out.println("Message is " + message);
        System.out.println("Numbers Array: "+ java.util.Arrays.toString(numberarray));
        System.out.println("Object: "+ obj);
        System.out.println("Uninitialized Number "+ unitializedNumber);
        System.out.println("Uninitialized String "+ unitializedString);


    }
}
