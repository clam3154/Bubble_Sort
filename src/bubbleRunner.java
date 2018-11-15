public class bubbleRunner {
    public static void main(String[] args)
    {
        int[] list = new int[9];
        for(int i = 0; i< list.length; i++)
        {
            list[i] = 1+(int)(Math.random()*(9));
            System.out.print(list[i] + ",");
        }
        bubbleSort sorted = new bubbleSort();
        sorted.bubbleSorter(list);
        //System.out.println(sorted);
    }
}
