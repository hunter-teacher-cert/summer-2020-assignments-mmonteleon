public class SuperArray
{
    private static final int STARTING_SIZE = 10;
    private int[] arr;
    private int currentSize;
    private int numElements;

    public SuperArray()
    {
        arr = new int[STARTING_SIZE];
        currentSize = STARTING_SIZE;
        numElements = 0;
    }

    public SuperArray(int currentSize)
    {
        arr = new int[currentSize];
        this.currentSize = currentSize;
        numElements = 0;
    }


    public int size()
    {
        return currentSize;
    }

    // Remove the element at index `index` and shift
    // all subsequent elements to the left.
    public int remove(int index)
    {
        if(index >= 0 && index < numElements)
        {


          int removed = arr[index];
          //Create a new temporary array that has one less element
          int[] arr2 = new int[numElements-1];

          //Copy all the elements below the index into the new array
          for(int i=0; i<index; i++)
          {
              arr2[i]=arr[i];
          }

          //Skip the element at index in the old array
          //add in the remaining elements
          for(int i= index; i<numElements-1; i++)
          {
              arr2[i]=arr[i+1];
          }

          //Have the arr point to the new array
          arr=arr2;
          numElements--;
          currentSize=numElements;

          return removed;
        }
        else
          return -1;
    }

    // Add the int `element` at the `index` in the array.
    // You'll need to shift everything one index to the right
    // after this index.
    public void add(int index, int element)
    {
        if(index <= arr.length)
        {

          //Create a new temporary array
          int[] arr2 = new int[numElements+1];

          //Copy all the elements below the index into the new array
          for(int i=0; i<index; i++)
          {
              arr2[i]=arr[i];
          }

          //add the element at the given index
          arr2[index]=element;

          //add in the remaining elements
          for(int i= index; i<numElements; i++)
          {
              arr2[i+1]=arr[i];
          }

          //Have the arr point to the new array
          arr=arr2;

          numElements++;
          currentSize = numElements;
        }
    }



    private boolean isFull()
    {
        return numElements == currentSize;
    }

    private void grow()
    {
        int newSize = currentSize * 2;
        int[] newArray = new int[newSize];

        // Copy over old elements
        for(int i = 0; i < currentSize; i++)
        {
            newArray[i] = arr[i];
        }

        currentSize = newSize;
        arr = newArray;
    }

    public int get(int index)
    {
        return arr[index];
    }

    public void add(int x)
    {
        if(isFull())
        {
            grow();
        }
        arr[numElements] = x;
        numElements++;
    }

    public String toString()
    {
        String str = "{";
        for (int i=0; i < numElements; i++) {
            str += arr[i] + ", ";
        }
        //Remove the extra comma and space
        if (str.length() > 1)
        {
            str = str.substring(0, str.length()-2);
        }
        str += "}";
        return str;
    }

    public boolean isEmpty()
    {
      return numElements == 0;
    }


}
