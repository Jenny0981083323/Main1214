public class Maincho412 {
    public  static  void  bubbleSort(int[] arr){
       // for (int i = 0; i < arr.length-1; i++) {
        //   for (int j = 0; j <arr.length-1-i ; j++) {

       //     }
       // }
        int turn=1;
        for (int i = arr.length-1; i>0 ; i--) {
            int earlyStop=1;
            for (int j = 0; j < i ; j++) {
                if(arr[j]>arr[j+1]){//從小排
                  int temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
                  earlyStop=0;
                //if(arr[j]<arr[j+1]){//從大排
                    //int temp=arr[j];
                    //arr[j]=arr[j+1];
                    //arr[j+1]=temp;

                }
            }
            if(earlyStop==1)  break;
             for (int k = 0; k < arr.length; k++) {
                if(k==(arr.length-1-turn))
                    System.out.print(arr[k]+"[");
                else if(k==arr.length-1)
                    System.out.print (arr[k]+"]");
                else
                    System.out.print(arr[k]+" ");

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] array={5,2,34,4,6,677,12,45,15,21,1234,612,778,303};
        bubbleSort(array);
        for(int i:array){
            System.out.print(i+" ");
        }
    }
}
