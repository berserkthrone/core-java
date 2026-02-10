package conditionalLogicAndLoopsAndJavaApplications;

public class whileAndDoWhile {
    public static void main(String[] args) {


        for(int i = 1; i <= 5; i++){
            System.out.println(i);     //for loop
        }

        int j = 1;                     //while loop
        while(true){
            if(j > 5){
                break;
            }
            System.out.println(j);
            j++;
        }


        int k = 1;
        boolean isReady  = false;         //do while loop
        do {
            if(k > 5){
                break;
            }
            System.out.println(k);
            k++;
            isReady = (k > 0);
        }while(isReady);
    }

}
