package Lab4;
abstract class Robber{
    void RobbingClass(){
        System.out.println("MScAI&ML");
    }
    abstract int RowHouses(int array[]);
    abstract int RoundHouses(int array[]);
    abstract int SquareHouse(int array []);
    abstract int MultiHouseBuilding(int array[][]);

    void MachineLearning(){
        System.out.print("I love Machine Learning");
    }

}

class JAVAProfessionalRobber extends Robber{

    @Override
    int RowHouses(int array[]) {
        int[] arr=array;//{1,2,3,0}
        int sum1=0;
        int sum2=0;
        int sum3=arr[0]+arr[arr.length-1];

        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                sum1+=arr[i];
            }
            else{
                sum2+=arr[i];
            }   

        }
        if(sum1>sum2 && sum1>sum3){
            return sum1;
        }
        else if(sum2>sum1 && sum2>sum3){
            return sum2;
        }
        else{
            return sum3;
        }
        
    }

    @Override
    int RoundHouses(int array[]) {
        int[] arr=array;
        int sum1=0;
        int sum2=0;
        int sum3=0;
        if(arr.length%2==0){
            for(int i=0;i<arr.length;i++){
                if(i%2==0){
                    sum1+=arr[i];
                }
                else{
                    sum2+=arr[i];
                }   
    
            }
            if(sum1>sum2){
                return sum1;
            }
            
            else{
                return sum2;
            }

        }
        else{
            for(int i=0;i<arr.length;i++){
                if(i%2==0){
                    sum1+=arr[i];
                }
                else{
                    sum3+=arr[i];
                } 

            }
            sum1=sum1-arr[0];
            sum2=sum1-arr[arr.length-1];
            if(sum1>sum2 && sum1>sum3){
                return sum1;
            }
            else if(sum2>sum1 && sum2>sum3){
                return sum2;
            }
            else{
                return sum3;
            }
        }

       
    }

    @Override
    int SquareHouse(int array[]) {
        int[] arr=array; //{5,10,2,7}
        int sum1=0;
        int sum2=0;
        int sum3=0;
        if(arr.length%2==0){
            for(int i=0;i<arr.length;i++){
                if(i%2==0){
                    sum1+=arr[i];
                }
                else{
                    sum2+=arr[i];
                }   
    
            }
            if(sum1>sum2){
                return sum1;
            }
            
            else{
                return sum2;
            }

        }
        else{
            for(int i=0;i<arr.length;i++){
                if(i%2==0){
                    sum1+=arr[i];
                }
                else{
                    sum3+=arr[i];
                } 

            }
            sum1=sum1-arr[0];
            sum2=sum1-arr[arr.length-1];
            if(sum1>sum2 && sum1>sum3){
                return sum1;
            }
            else if(sum2>sum1 && sum2>sum3){
                return sum2;
            }
            else{
                return sum3;
            }
        }
        
    }

    @Override
    int MultiHouseBuilding(int array[][]) {
        int[][] arr=array; //MultiHouseBuilding([5,3,8,2],[10,12,7,6],[4,9,11,5],[8,6,3,7])
        int sum=0;
        
        for(int i=0;i<arr.length;i++){

            sum+=RoundHouses(arr[i]);
        }
        return sum;

        
    }
    
    

}
public class Rob {
    public static void main(String[] args) {
        Robber r=new JAVAProfessionalRobber();
        r.RobbingClass();

        int[] arrRow={1,2,3,0};
        int[] arrRound={1,2,3,4};
        int[] arrSq={5,10,2,7};
        int[][] arrM={{5,3,8,2},{10,12,7,6},{4,9,11,5},{8,6,3,7}};
        
        System.out.println("RowHouses: "+r.RowHouses(arrRow));
        System.out.println("RoundHouses: "+r.RoundHouses(arrRound));
        System.out.println("SquareHouse: "+r.SquareHouse(arrSq));
        System.out.println("MultiHouseBuilding: "+r.MultiHouseBuilding(arrM));

        r.MachineLearning();
    }
}
