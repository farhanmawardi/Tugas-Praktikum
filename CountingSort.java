public class CountingSort {
    void sort(int []arr)
    {
        int n=arr.length;
        int output[]=new int[n];
        int count[]=new int[256];

        for (int i=0; i<256; ++i)
            count [i]=0;
        for (int i=0; i<n; ++i)
            ++count[arr[i]];

        for (int i=1; i<=255; ++i)
            count[i]+=count[i-1];

        for (int i=n-1; i>=0; --i)
        {
            output[count[arr[i]]-1]=arr[i];
            --count[arr[i]];
        }

        for (int i=0; i<n; ++i)
            arr[i]=output[n-1-i];
    }
    //end void sort

    public static void main(String[] args) {
        CountingSort ob=new CountingSort();
        
        //memasukan nilai variabel untuk Nilai1 sampai Nilai6
        int arr[]={8,5,3,9,4,2};
        ob.sort(arr);
        System.out.println("Nilai1 sampai Nilai6");

        for (int i=0; i<arr.length; ++i){
            System.out.print(arr[i]);

            if (i<arr.length-1){
                System.out.print(" ");
            }
        }
    }
    //end public static void main
}
//end class CountingSort
