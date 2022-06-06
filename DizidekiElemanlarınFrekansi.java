public class DizidekiElemanlarınFrekansi {
    public static void main(String[] args) {
        int[] numbers={10,20,20,10,10,20,5,20};
        int sayac=1;
        int sayacZero=0;
        
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==0){
                sayacZero++;
                if(i==numbers.length-1){
                    System.out.println(0+" sayısı "+sayacZero+" kere tekrar edildi");
                }
            }
        }

        for(int i=0;i< numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]==numbers[j]){
                    numbers[j]=0;
                    sayac++;
                }
            }
            sayac=1;
            if(numbers[i]!=0){
                System.out.println(numbers[i]+" sayısı "+ sayac+" kere tekrar edildi.");
                sayac=1;
            }
        }
    }
}
