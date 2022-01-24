public class DecimalNumbers {
    
    public static void convertBinary(int bin){
            int decimal = 0;
            int n = 0;
            int numbin = bin;
            while(bin >0){
                int temp = bin%10;
                decimal +=temp*Math.pow(2,n);
                bin = bin/10;
                n++;
            }
        System.out.println();
        System.out.println("The Decimal number of "+ numbin + " is: "+decimal);
    }
}
