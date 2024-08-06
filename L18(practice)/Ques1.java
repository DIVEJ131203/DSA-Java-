public class Ques1 {
    public static  repeatingElements(int arr[]) {
    int count=0;
    for(int i=0;i<arr.length;i++)
    {
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[i]==arr[j])
            {
                return true;
            }
            else

     

    

    
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 elements of Array");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        repeatingElements(arr);

    }

}