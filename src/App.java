
public class App {
    
    public static void main(String[] args) throws Exception {
        //firstTask();
        int[] arr0 = new int[3];
        arr0[0] = 1;
        arr0[1] = 2;
        arr0[2] = 3;
        double[] arr1= {1.57, 7.654, 9.986};
        char[] name = {'V','l','a','d'};
        //secondTask();
        for(int i=0;i<arr0.length;i++){
            if(i!=arr0.length-1){
                System.out.print(arr0[i]+",");
            }else{
                System.out.print(arr0[i]);
            }
        }
        System.out.println('\n');
        for(int t=0;t<arr1.length;t++){
            if(t!=2){
                System.out.print(arr1[t]+",");
            }else{
                System.out.print(arr1[t]);
            }
        }
        System.out.println('\n');
        char m = ',';
        for(char c : name){
            if(c=='d'){
                m = ' ';
            }
            System.out.print(Character.toString(c)+m);
        }
        //thirdTask();
        System.out.println('\n');
        for(int i=arr0.length-1;i>=0;i--){
            if(i!=0){
                System.out.print(arr0[i]+",");
            }else{
                System.out.print(arr0[i]);
            }
        }
        System.out.println('\n');
        for(int t=arr1.length-1;t>=0;t--){
            if(t!=0){
                System.out.print(arr1[t]+",");
            }else{
                System.out.print(arr1[t]);
            }
        }
        System.out.println('\n');
        for(int t=name.length-1;t>=0;t--){
            if(t!=0){
                System.out.print(name[t]+",");
            }else{
                System.out.print(name[t]);
            }
        }
        //fourTask();
        System.out.println('\n');
        for(int i =0;i<arr0.length;i++){
            if(arr0[i]%2!=0){
                arr0[i]++;
            }
        }
        for(int y : arr0){
            System.out.print(y+" ");
        }
        
    }
}
