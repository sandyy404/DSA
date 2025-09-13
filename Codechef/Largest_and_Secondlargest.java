
public class Largest_and_Secondlargest {
   


        public static void main(String []args){
           int [] arr = {23,54,76,87,12,65,45,87,38,27,19};
           int max = Integer.MIN_VALUE;
           int smax = Integer.MIN_VALUE;
            for(int index = 1;index < arr.length;index++){
                if(arr[index]>max){
                    smax = max;
                    max = arr[index];
                    
                }
                else if (arr[index]>smax && arr[index] !=max) {
                  smax = arr[index];
                }
            }
           
           System.out.println(max);
            System.out.println(smax);
        }
      }


   

