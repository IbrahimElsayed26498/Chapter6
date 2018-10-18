/*
In the name of Allah, the Gracious, the 
 */
package tableofnumbers;

/**
 *
 * @author ibrahim
 */
public class TableOfNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Decimal    Binary     Octal     HexaDecimal");
        for(int i=0;i<=256;i++){
            System.out.printf("%-10d %-10d %-10d",i,binary(i),octal(i));
            System.out.println(hexa(i));
        }
    }

    static int binary(int d) {
        int power = 0, b = 0;
        //while the number is not equal Zero
        while (d!=0) {
            /*reminder*10^value
            for example 1101 ==> if we have 1,1,0,1 and I want to make it 1101
            1*10^0+0*10^1+1*10^2+1*10^3 = 1101
            */
            
            b += (int) Math.pow(10, power) * (d % 2);
            d /= 2;
            power++;
        }
        return b;
    }

    static int octal(int d) {
        int power = 0, b = 0;
        while (d!=0) {
            b += (int) Math.pow(10, power) * (d % 8);
            d /= 8;
            power++;
        }
        return b;
    }

    static String hexa(int d) {
        if(d==0)
            return "0";
        String H = "";
        int n=0;
        while (d!=0) {
            n = d % 16;//n contains the remainder
            if (n <= 9) {
                //I used the following way not concat method of strings
                //because concat method put the char after the char and I wanna it before
                H = n + H;
            } else {
                switch (n) {
                    case 10:
                        H = "A" + H;
                        break;
                    case 11:
                        H = "B" + H;
                        break;
                    case 12:
                        H = "C" + H;
                        break;
                    case 13:
                        H = "D" + H;
                        break;
                    case 14:
                        H = "E" + H;
                        break;
                    case 15:
                        H = "F" + H;
                        break;
                }
            }
            d/=16;
        }
        return H;
    }
}
