public class bubbleSort
{
    public int[] bubbleSorter(int[] arr)
    {
        int check = 1;
        while(check != 0)
        {
            check = 0;
            for(int i = 0; i < arr.length-1; i++)
            {
                check++;
                swap(arr,i,i+1);
            }
        }
        return arr;
    }

    public void swap(int[] array, int pos1, int pos2)
    {
        int temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;
    }
}
