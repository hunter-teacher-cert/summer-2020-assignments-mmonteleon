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

          //Skip the element at index in the old array
          //add in the remaining elements
          for(int i= index; i<numElements-1; i++)
          {
              arr[i]=arr[i+1];
          }

          //Adjust the numElements
          numElements--;

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
        if(index == arr.length)
        {
          this.add(element);
        }
        else if(index < arr.length)
        {
          //Check to see if there is enough space to fit the new element.  Grow if necessary.
          if(numElements+1 > currentSize)
            grow();

          //move all the original elements from index on, one space to the right
          for(int i = numElements+1; i>index; i--)
          {
              arr[i]=arr[i-1];
          }

          //add the element at the given index
          arr[index]=element;


          numElements++;

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
