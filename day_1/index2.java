public class index2 {
    public static void main(String[] args) {
        int[] ar={20,30,50,40,40,60,50,30,10};
        for(int i=0;i< ar.length-1;i++){
            for(int j=i+1;j<ar.length;j++){
                if(ar[i]==ar[j] && (i !=j)){
                    System.out.println("Duplicate element found at index "+ar[j]);
        }
            
}
    }
}
}
