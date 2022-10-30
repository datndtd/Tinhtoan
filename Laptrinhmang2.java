import java.io.*;
public class Laptrinhmang2 {
    public static void main(String[] args) throws IOException {
        DataOutputStream out = new DataOutputStream(new FileOutputStream("ltm2.txt"));
        double[] prices = {2.5,5,8.9};
        int[] units = {1,6,9};
        String[] descs = {"Dat09","Datt08","Dat07"};
        for (int i = 0;i < prices.length;i++){
            out.writeDouble(prices[i]);
            out.writeChar('\t');
            out.writeInt(units[i]);
            out.writeChar('\t');
            out.writeChars(descs[i]);
            out.writeChar('\n');
        }
        out.close();
    }
}