class test{
    public static void main(String[] args){
    // first java program
        System.out.println("Hello World");
    }
}
class test1{
    public static void main(String[] args){
     //int data types
     //int stores integer values (whole numbers), without decimals, such as 123 or -123
        int num = 5;
        int num1 = 10;
        int num2 = 15;
        int result = num1 + num2 + num;
        System.out.println(num);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println("The result is: " + result);
    }
}
class test2{
    public static void main(String[] args){
        //float data types
        //float data types are used to store decimal numbers, such as 3.14 or -3.14 but with less precision than double
        float num = 5.5f;
        float num1 = 10.5f;
        float num2 = 15.5f;
        float result = num1 + num2 + num;
        System.out.println(num);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println("The result is: " + result);
    }
}
class test3{
    public static void main(String[] args){
        //double data types
        //double data types are used to store decimal numbers, such as 3.14 or -3.14
        double num = 5.5;
        double num1 = 11.5;
        double num2 = 15.5;
        double result = num1 + num2 + num;
        System.out.println(num);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println("The result is: " + result);
    }
}
class test4{
    public static void main(String[] args){
        //char data types
        //char data types are used to store single characters, such as 'A' or 'B'
        char ch = 'A';
        char ch1 = 'B';
        char ch2 = 'C';
        System.out.println(ch);
        System.out.println(ch1);
        System.out.println(ch2);
    }
}
class test5{
    public static void main(String[] args){
        //boolean data types
        //boolean data types are used to store true or false values
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);
    }
}
class test6{
    public static void main(String[] args){
        //String data types
        //String data types are used to store text, such as "Hello" or "World"
        String name = "John";
        String name1 = "Doe";
        String name2 = "Smith";
        System.out.println(name);
        System.out.println(name1);
        System.out.println(name2);
    }
}
class test7{
    public static void main(String[] args){
        //byte data types
        //byte data types are used to store whole numbers from -128 to 127
        byte num = 100;
        byte num1 = 50;
        byte num2 = 25;
        byte result = (byte)(num + num1 + num2);
        System.out.println(num);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println("The result is: " + result);
    }
}
class test8{
    public static void main(String[] args){
        //short data types
        //short data types are used to store whole numbers from -32,768 to 32,767
        short num = 10000;
        short num1 = 20000;
        short num2 = 30000;
        short result = (short)(num + num1 + num2);
        System.out.println(num);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println("The result is: " + result);
    }
}
class test9{
    public static void main(String[] args){
        //long data types
        //long data types are used to store whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long num = 1000000000L;
        long num1 = 2000000000L;
        long num2 = 3000000000L;
        long result = num + num1 + num2;
        System.out.println(num);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println("The result is: " + result);
    }
}
class test10{
    public static void main(String[] args){
        //arithmetic operations
        int num = 10;
        int num1 = 24;
        int num2 = 43;
        int sum = num + num1 + num2;
        int difference = num2 - num1;
        int product = num * num1;
        int quotient = num2 / num1;
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}
//type casting is the process of converting a variable from one data type to another.
// In Java, there are two types of type casting: implicit and explicit.
// Implicit casting is done automatically by the compiler when a smaller data type is converted to a larger data type.
// Explicit casting is done manually by the programmer when a larger data type is converted to a smaller data type.
class test11 {
    public static void main(String[] args) {
        //conversion of data types
        //converting int to byte
        int i = 267;
        byte b = (byte) i;
        System.out.println(b);
        //converting byte to int
        byte a = 10;
        int j = a;
        System.out.println(j);
        //converting float to int
        float f = 10.5f;
        int k = (int) f;
        System.out.println(k);
        //converting int to float
        int m = 15;
        float n = m;
        System.out.println(n);
        //type promotion is the automatic conversion of a smaller data type to a larger data type.
        byte num1 = 10;
        byte num2 = 40;
        int result = num1 * num2;
        System.out.println(result);
        // all the above conversions are examples of type casting and type promotion in Java.
    }
}
class test12 {
    public static void main(String[] args) {
        //type promotion in expressions
        byte a = 10;
        byte b = 20;
        byte c = 30;
        int result = a + b + c;
        System.out.println(result);
        //in this case, the values of a, b and c are promoted to int before the addition operation is performed.
    }
}
class test13 {
    public static void main(String[]args) {
        //other arithematic operatiions
        int a = 10;
        a += 5; // a = a + 5
        System.out.println("a after += 5: " + a);
        a -= 3; // a = a - 3
        System.out.println("a after -= 3: " + a);
        a *= 2; // a = a * 2
        System.out.println("a after *= 2: " + a);
        a /= 4; // a = a / 4
        System.out.println("a after /= 4: " + a);
        a %= 3; // a = a % 3
        System.out.println("a after %= 3: " + a);
        //post increment and decrement operators
        int b = 10;
        b++; // b = b + 1
        System.out.println("b after ++: " + b);
        b--; // b = b - 1
        System.out.println("b after --: " + b);
        //pre increment and decrement operators
        int c = 20;
        ++c; // c = c + 1
        System.out.println("c after ++: " + c);
        --c; // c = c - 1
        System.out.println("c after --: " + c);
        //diff between post and pre increment and decrement operators
        int d = 30;
        int e = 30;
        int f = d++;
        // f = d, then d = d + 1
        // in this case, f will be 30 and d will be 31 since the value of d is incremented after the assignment to f.
        // first fetch the value of d and assign it to f, then increment the value of d by 1.
        System.out.println("f after d++: " + f);
        System.out.println("d after d++: " + d);
        int g = ++e;
        // e = e + 1, then g = e
        // in this case, g will be 31 and e will be 31 since the value of e is incremented before the assignment to g.
        // first increment the value of e by 1, then fetch the value of e and assign it to g.
        System.out.println("g after ++e: " + g);
        System.out.println("e after ++e: " + e);
    }
}
class test14 {
    public static void main(String[] args) {
        //relational operators
        int a = 10;
        int b = 29;
        boolean c = a < b;
        // less than operator
        System.out.println("Is a < b? " + c);
        boolean d = a > b;
        // greater than operator
        System.out.println("Is a > b? " + d);
        boolean e = a <= b;
        // less than or equal to operator
        System.out.println("Is a <= b? " + e);
        boolean f = a >= b;
        // greater than or equal to operator
        System.out.println("Is a >= b? " + f);
        boolean g = a == b;
        // equal to operator
        System.out.println("Is a == b? " + g);
        boolean h = a != b;
        // not equal to operator
        System.out.println("Is a != b? " + h);
    }
}
class test15 {
    public static void main(String[] args) {
        //logical operators
        boolean a = true;
        boolean b = false;
        boolean c = a && b;
        // logical AND operator
        System.out.println("a && b: " + c);
        boolean d = a || b;
        // logical OR operator
        System.out.println("a || b: " + d);
        boolean e = !a;
        // logical NOT operator
        System.out.println("!a: " + e);
        boolean f = !b;
        // logical NOT operator
        System.out.println("!b: " + f);
        // logical AND operator with relational operators
        int x = 10;
        int y = 20;
        int z = 30;
        int j = 40;
        boolean g = (x < y) && (x > 5);
        boolean k = (x < y) && (z > j);
        System.out.println("(x < y) && (x > 5): " + g);
        System.out.println("(x < y) && (z > j): " + k);
        // logical OR operator with relational operators
        boolean h = (x < y) || (x > 5);
        boolean l = (x < y) || (z > j);
        System.out.println("(x < y) || (x > 5): " + h);
        System.out.println("(x < y) || (z > j): " + l);
        // logical NOT operator with relational operators
        boolean i = !(x < y);
        boolean m = (x > y);
        System.out.println("!(x < y): " + !m);
        System.out.println("!(x < y): " + i);
        // logical AND operator with boolean variables
    }
}
class test16 {
    public static void main(String[] args) {
        //if statement
        int num = 10;
        int num1 = 20;
        if (num < num1) {
            System.out.println("num is less than num1");
        }
        //if-else statement
        if (num > num1) {
            System.out.println("num is greater than num1");
        } else {
            System.out.println("num is less than or equal to num1");
        }
        //if-else-if statement
        if (num > num1) {
            System.out.println("num is greater than num1");
        } else if (num < num1) {
            System.out.println("num is less than num1");
        } else {
            System.out.println("num is equal to num1");
        }
        //ternary operator
        int result = (num > num1) ? num : num1;
        // ? is the ternary if operator
        // : is the else operator 
        System.out.println("Result: " + result);
    }
}
class test17 {
    public static void main(String[] args) {
        //switch statement
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Day");
        }
        //other way of writing switch statement
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid Day");
        }
        //other way of writing switch statement
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Invalid Day");
        }
        //switch as statement with string
        String month = "January";
        String result = "";
        result = switch (month) {
            case "January", "February", "March" -> "Winter";
            case "April", "May", "June" -> "Spring";
            case "July", "August", "September" -> "Summer";
            case "October", "November", "December" -> "Fall";
            default -> "Invalid Month";
        };
        System.out.println("Month: " + month);
        System.out.println("Season: " + result);
    }
}
class test18 {
    public static void main(String[] args) {
        //types of loops in java - for loop, while loop, do-while loop
        //while loop
        int num = 1;
        while (num <= 10) {
            System.out.println("Hii " + num);
            num++;
        }
        // nested while loop
        int i = 1;
        while (i <= 5) {
            System.out.println("Hello " + i);
            int j = 1;
            while (j <= 4) {
                System.out.println("Yello " +j);
                j++;
            }
            i++;
        }
    }
}
class test19 {
    public static void main(String [] args) {
        //do while loop
        int i = 5;
        do
        {
            System.out.println("hello " + i);
            i++;
        }while(i<=4);
    }
}
class test20 {
    public static void main(String [] args) {
        // for loop 
        
    }
}