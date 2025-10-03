package Basics;

public class Greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[]number= {1,2,3,4,5,6,7,40,9,10};
     int greatestnumber = number[0];
     for ( int i=0; i<number.length;i++ )
      if (   number[i] > greatestnumber) {
    	  greatestnumber=number[i];
    	  
    	  
    	  
      }
     
     System.out.println("greatest number"+ " "+greatestnumber);

	}

}
