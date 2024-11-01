class hello
{
    public static void main(String args[]){
    {
        System.out.println("Helllo World"); 
    }

    //Implicit type casting
    int a = 23;
    double doubleValue =a;
    System.out.println(doubleValue);


     //Explicit type casting
     double doubleValu = 324.7;
     int intValue = (int)doubleValu;
     byte byteValue = (byte)doubleValu;
     System.out.println(byteValue);
     System.out.println(intValue);

    //arithmetic operator
    int num1 =25;
    int num2 = 8;
    System.out.println("Addition is : " + (num1+num2));
    System.out.println("subtracton is : " + (num1-num2));
    System.out.println("multiplication is : " + (num1*num2));
    System.out.println("division is : " + (num1/num2));
    System.out.println("modulus is : " + (num2%num1));
    System.out.println("post increment : " + (num1++));
    System.out.println("pre increment : " + (++num1));
    System.out.println("pre decrement : " + (--num1));
    System.out.println("post decrement : " + (num1--));

    // ternary operator
    boolean isAuthenticated = true;
    String result = (isAuthenticated) ? "logged-in" : "not logged-in";
    System.out.println(result);

    //single dimensional array

    // declaring an array
    // int[] marks;
    // marks = new int[5];
    // // or
    // int[] marks = new int[];

    // // initializing an array;
    // int[] marks = new int[] {10,20,30,30,40};

    // declare and assign
    int[] marks = new int[5];
    marks[0] = 100;
    marks[1]= 78;
    marks[2]=80;
    marks[3]=96;
    marks[4]=89;
    //  traditional loop
    for(int i=0; i<marks.length;i++){
        System.out.println(marks[i]);
    }

    System.out.println("***************");

    // foreach loop
    for(int value : marks) {
        System.out.println(value);
    }
    
    // multi dimensional array
    int mark[][]= {
        {54,35,67,87,32},
        {87,45,57,84,34},
        {73,64,23,87,98}};
    
    for(int i=0;i<3;i++){
        for(int j=0;j<5;j++){
            System.out.print(mark[i][j] + "\t");
        }
        System.out.println();
    }

    // Strings
    // string literals
    String str1 = "Hello";
    System.out.println(str1);
    // string objects
    String str2 = new String ("World");
    System.out.println(str2);
    // concatenating string literals and string objects
    System.out.println(str1 + " " + str2);
    // string methods
    System.out.println(str1.length());
    System.out.println(str2.charAt(0));
    System.out.println(str1.concat(str2));
    System.out.println(str2.contains("world"));
    System.out.println(str1.toLowerCase());
    System.out.println(str2.toUpperCase());
    System.out.println(str1.trim());
    System.out.println(str2.substring(0,5));
    System.out.println(str1.equals(str2));


    // looping statements
    // for loop is used whenever we know the number iterations
    for(int i = 1; i<=10; i++){
    System.out.println("iampriya " + i);
    }

    // while loop
    int d = 1;
    while(d<=10){
        System.out.println("iamapatootie " + d);
        d++;
    }

    // do while loop
    int c =10;
    do{
        System.out.println(c);
        c++;
    }while(c<=20);

    // ternary operator
   int time = 29;
   String test = (time<30) ? "goodday" : "badday";
   System.out.println(test);

   int x = 10; do {     x--; } while (x > 5); System.out.println(x); 
}
}