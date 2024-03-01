public class javaoperators {

    public class Operators {
        public static void main(String[] args){
            //Arithmetic operators
            int num1=10;
            int num2=5;

            int sum =num1 + num2;
            int different= num1-num2;
            int product = num1*num2;
            int quotient = num1/num2;
            int remainder=num1%num2;


            System.out.println("Sum:"+sum);
            System.out.println("different:"+different);
            System.out.println("product"+product);
            System.out.println("quotient:"+quotient);
            System.out.println("remaider:"+remainder);
            //increment and discreteness
            int x=5;
            System.out.println(x);
            x++;
            System.out.println(x);
            x--;
            System.out.println(x);

            //relational
            int a=10;
            int b=20;

            System.out.println(a==b);
            System.out.println(a!=b);
            System.out.println(a>b);
            System.out.println(a<b);
            System.out.println(a>=b);
            System.out.println(a<=b);


            //logical
            boolean p = true;
            boolean q = false;

            System.out.println(p&&q);
            System.out.println(p||q);
            System.out.println(!p);

            //conditionals
            int m=10;
            int n=5;

            int max =(m>n)?m:n;
            System.out.println(max);


        }

    }



}



