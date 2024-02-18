
import java.util.Scanner;
//author Robin dupuis

public class Location {
    
    public int row;
    public int columns;
    public double maxValue;
    
    
    
    public static Location locateLargest(double[][]a){
         Location location = new Location();//creates a new location 
         for(int i=0; i<a.length;++i){
             for(int j=0; j<a[i].length; ++j){
                 if(a[i][j]>location.maxValue){//if the number at specified index is bigger than the current location maxvalue then update current location max value
                     location.maxValue = a[i][j];
                   location.row = i;
                   location.columns = j;
                 }
             }
         }
             
        return location;
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter number of rows and columns in array: ");
        int rows = input.nextInt();
        int columns=input.nextInt();
        
        double [][]arey =  new double[rows][columns];//creates a custom array
        
        
        for(int i = 0; i<arey.length; ++i){
            for(int j=0; j<arey[i].length;++j){
                arey[i][j] = input.nextDouble();
            }
        }
             Location location = Location.locateLargest(arey);
             
             System.out.println("The maximum value in this array is "+location.maxValue+" at index ("+location.row+","+location.columns+")");
    }
            
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
