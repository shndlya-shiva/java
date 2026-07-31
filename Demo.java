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
        int i;
        for(i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        //nested for loop
        int a, n;
        for (a = 1; a <= 6; a++) {
            System.out.println("Day " + a);
            for (n = 1; n <= 5; n++) {
                System.out.println("" + (n+8) + "-" + (n+9));
            }
        }
    } 
}
class test21{
    public static void main(String[] args) {
        //use for for lopp with if
        int a = 6;
        if (a <= 5 ){
            for (; a <= 5; a++) {
                System.out.println("Hello");
            }
        }
        else if (a >= 5) {
            for (; a >= -5; a--){
                System.out.println("Yellow");
            }
        }
    }
}
class test22 {
    public int add(int n1,int n2) {
        // calling and invoking values
        int r = n1 + n2;
        return r;
    }
}
class test23 
{
    // diff example
    public void playmusic() 
    {
        System.out.println("music playing....");
    }
    
    public String getMeAPen(int cost) 
    {
        return "Pen";
    }
}
class test24 {
    //method overloading
    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
    public int add(int n1, int n2) {
        return n1 + n2;
    }
    public double add(double n1, int n2) {
        return n1 + n2;
    }
}
class test25 {
    public static void main(String[] args) {
        // into to array
        int num[] = {12,23,34};
        System.out.println(num[1]);
    }
}
class test26 {
    public static void main(String[] args) {
        //working with array reassing the values
        int num [] = {12,122,413,413};
        num[3] = 23;
        System.out.println(num);
        //array with the loop
        int nums [] = new int[4];
        nums[0]=2;
        nums[1]=3;
        nums[2]=8;
        nums[3]=4;
        for (int j = 0; j < 6; j++) {
            System.out.println(nums[j]);
        }
    }
}
class test27 {
    public static void main(String[] args) {
        // Multi Dimensional Array
        int nums[][] = new int[3][4];
        // using Math.random() class
        // math random is a class thath fatches random value that are in the form od double
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j] = (int)(Math.random()*100);

            }
        } 
        // using normal for loop 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        // Enhanced for loop
        for (int n[] : nums) {
            for (int m : n) {
                System.out.print(m + " ");

            }
            System.out.println();
        }
    }
}
class test28 {
    public static void main(String[] args) {
        // Jagged Array
        int nums [][] = new int[3][];
        nums[0] = new int[5];
        nums[1] = new int[7];
        nums[2] = new int[6];
        // .length is a built-in property used exclusively to find the number of elements in an array
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums [i][j] = (int)(Math.random()*100);
            }
        }
        for (int n[] : nums) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
class test29 {
    int rollno;
    String name;
    double marks;
}
class test30 {
    public static void main(String[] args) {
        // into to string 
        String name =  "Matt";
        System.out.println("Hello " + name);
        System.out.println(name.charAt(2));
        System.out.println(name.concat(" Murdock"));
    }
}
class test31 {
    public static void main(String[] args) {
        // String are of two type - Mutable and Immutable. 
        // Mutable are that can be changed.
        // It consits two diff data types - String buffer and string builder. 
        // Immutable are that can not be changed.
        // String Buffer is thread safe.
        StringBuffer sb = new StringBuffer("Matt ");
        sb.append(" Murdock");
        sb.deleteCharAt(4);
        System.out.println(sb.capacity());
        System.out.println(sb);
    }
}
class test32 {
    public static void main(String[] args) {
        // String Builder
        // String Builder is not thread safe.
        StringBuilder sb = new StringBuilder("Fisk ");
        sb.append(" Willson");
        sb.deleteCharAt(4);
        System.out.println(sb.capacity());
        System.out.println(sb);
    }
}
class test33{
    static String Name;
    // Static Varible as class member
    // Static belogs to class itself, not to individual object.
    // It stops the class form making a copy of a varible & keep one shared one version for everyone. 
    int Price;
    String Brand;
    // Here price and brand name are instance varible 
    public void show() {
        System.out.println(Brand + " : " + Name + " : " + Price);
    }
}
class test34 {
    // Working with Static method
    static String Name;
    int Price;
    String Brand;
    
    public static void show(test33 obj) {
        System.out.println(obj.Brand + " : " + Name + " : " + obj.Price);
        // Here Price and Brand are non static varibles and hence,
        // can not be accessed directly inside the static method,
        // so by passing the object in the main class and accepting it in the static method,
        // using class name,which then refered with the help of object name &,
        // can be used indirectly in the static method. 
    }
}
class test35 {
    private String name;
    private int age;
    private String gender;
    public test35() { // Defult constructor 
       age = 30;
       name = "Matt";
    }
    public test35(int a, String n) { //Parmetrized Constructor
        age = a;
        name = n;
    }
    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
    public String getGender()
    {
        return gender;
    }
    public void setGender(String g)
    {
        gender = g;
    }
}
public class Demo{
    public static void main(String[] args) {
        test22 calc = new test22();
        int result = calc.add(14,55);
        System.out.println(result);
        test23 com = new test23();
        com.playmusic();
        String str = com.getMeAPen(result);
        System.out.println(str);
        test24 calTest24 = new test24();
        int r = calTest24.add(12,3);
        int r1 = calTest24.add(12, result, r);
        double r2 = calTest24.add(r, r1);
        System.out.println(r);
        System.out.println(r1);
        System.out.println(r2);
        test29 student1 = new test29();
        student1.rollno = 1;
        student1.name = "Matt";
        student1.marks = Math.random()*100;
        test29 student2 = new test29();
        student2.rollno = 2;
        student2.name = "Mathew";
        student2.marks = Math.random()*100;
        test29 student3 = new test29();
        student3.rollno = 3;
        student3.name = "Fisk";
        student3.marks = Math.random()*100;
        test29 students[] = new test29[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + ":" + students[i].marks);
        }
        test33 obj1 = new test33();
        obj1.Brand = "Apple";
        obj1.Price = 1499;
        obj1.Name = "Smartphone";
        test33 obj2 = new test33();
        obj2.Brand = "Samsung";
        obj2.Price = 1599;
        obj2.Name = "Smarthphone";
        test33.Name = "Phone";
        obj1.show();
        obj2.show();
        // Static varible should be called by the class name and not the object name.
        test34.show(obj1);
        test35 obj = new test35();
        test35 obj3Test35 = new test35(29, "Nelson");
        obj.setGender("Male");  
        System.out.println(obj.getName() + " : " + obj.getAge() + " : " + obj.getGender());
        System.out.println(obj3Test35.getName() + " : " + obj3Test35.getAge());
    }
}
