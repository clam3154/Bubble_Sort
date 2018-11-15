public class bubbleRunner {
    public static void main(String[] args)
    {
        int[] list = new int[9];
        for(int i = 0; i< list.length; i++)
        {
            list[i] = 1+(int)(Math.random()*(9));
            System.out.print(list[i] + ",");
        }
        System.out.println();
        bubbleSort sorted = new bubbleSort();
        int[] result = sorted.bubbleSorter(list);
        for(int i = 0; i< result.length; i++)
        {
            list[i] = 1+(int)(Math.random()*(9));
            System.out.print(result[i] + ",");
        }
    }
}
