public class BinaryNumbers {


    public static void convertdecimal(int a){
        int binary[] = new int[40];
        int index = 0;
        System.out.println();
        System.out.println("Binary number:");
        while(a > 0){
            binary[index++] = a%2;
            a = a/2;
        }
        for(int n = index-1; n>=0; n--){
            System.out.print(binary[n]);
        }
        System.out.println();
    }

}