package Jcalc;
import java.util.*;

public class Jcalc{
    static Scanner scan=new Scanner(System.in);
    static ArrayList<Integer> results=new ArrayList<>();
    public static void main(String[]args){

    int t=2;
    while(t>0){
        calcAll();
        t--;
    }
    Collections.sort(results);
    System.out.println("All the results in ascending order: ");
    for (int p:results){
        System.out.print(p+" ");
    }
    }

    public static int getInt(){
        int num;
        System.out.println("enter your digit: ");
        if(scan.hasNextInt()){
            num=scan.nextInt();}
            else {
                System.out.println("you entered invalid value,try again.");
                scan.next();
                num=getInt();
            }
    return num;
    }
    public static char getOperation(){
        char operation;
        System.out.println("Enter the sign of operation: ");
        if(scan.hasNext()){
            operation =scan.next().charAt(0);}
            else {
            System.out.println("you entered invalid type of symbol, try again.");
            scan.next();
            operation=getOperation();
        }
        return operation;
    }
    public static int calc(int num1,int num2,char operation) {
        int result;
        switch (operation){
            case '+':
                result=num1+num2;
                break;
            case '-':
                result=num1-num2;
                break;
            case '*':
                result=num1*num2;
                break;
            case '/':
                result=num1/num2;
                break;
            default:
                result=calc(num1, num2,operation);
        }
    return result;

    }
    public static void calcAll(){
        int num1=getInt();
        char operation=getOperation();
        int num2=getInt();
        int result=calc(num1,num2,operation);
        System.out.println ("your result is: "+result+" .");
        results.add(result);
        }

            }




