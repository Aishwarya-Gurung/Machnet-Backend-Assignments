package Question3;

public class Number {
    int a=12;
    public boolean isZero(){
        if (a == 0) {
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isPositive(){
        if(a > 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public boolean isNegative(){
        if (a < 0) {
            return true ;
        }
        else {
            return false;
        }
    }
    public boolean isOdd(){
        if (a % 2 != 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public boolean isEven(){
        if (a % 2 == 0) {
            return true ;
        }
        else {
            return false;
        }
    }
    public boolean isPrime() {
        boolean flag = false;
        for (int i = 2; i <= a / 2; ++i) {
            if (a % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag) {
            return true;
        }else {
            return false;
        }
    }
    public boolean isArmstrong() {
        int num=0, rem;
        int y=a;
        while(y != 0){
            rem = y%10;
            num = num + rem*rem*rem;
            y = y/10;
        }
        if(num == y){
            return true;
        }else{
            return false;
        }
    }

    public int getFactorial() {
        int n=1;
        for(int i = a; i>0 ; i--){
            n *= i;
        }
        return n;
    }

    public int getSqr() {
        int b = a*a;
        return b;
    }

    public int getReverse(){
        int reversed = 0;
        int z=a;
        if(z>9){
            while(z != 0) {
                int digit = z % 10;
                reversed = reversed * 10 + digit;
                z= z/ 10;
            }
        }
        return reversed;
    }

    public int sumDigits() {
        int temp = a;
        int sum=0,digit;

        while(temp!=0){
            digit=temp%10;
            sum+=digit;
            temp=temp/10;
        }
        return sum;
    }

    public double getSqrt() {
        double x = Math.sqrt(a);
        return x;
    }

    public static void main(String[]args) {
        Number obj =new Number();
        System.out.println("The number is zero: " + obj.isZero());
        System.out.println("The number is positive: " + obj.isPositive());
        System.out.println("The number is negative: " + obj.isNegative());
        System.out.println("The number is odd: " + obj.isOdd());
        System.out.println("The number is even: " + obj.isEven());
        System.out.println("The number is prime number: " +obj.isPrime());
        System.out.println("The number is Armstrong number: " +obj.isArmstrong());
        System.out.println("The factorial of the number is: " +obj.getFactorial());
        System.out.println("The square of the number is: " +obj.getSqr());
        System.out.println("The reverse of the number is: " +obj.getReverse());
        System.out.println("The sum of digits is: " +obj.sumDigits());
        System.out.println("The square root of number is: " +obj.getSqrt());
    }
}