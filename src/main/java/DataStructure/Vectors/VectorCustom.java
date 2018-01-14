package DataStructure.Vectors;

import java.util.Arrays;

public class VectorCustom<K> {

  private Object[] objArray;
  private int incrementalSize = 0;
  private int initialSize = 0;
  private int currentEdgeIndex = 0;
  private int currentCapacity = 0;

  public VectorCustom(int initialSize, int incrementalSize)
  {
    this.objArray =  new Object[initialSize];
    this.initialSize = initialSize;
    this.incrementalSize = incrementalSize;
    this.currentCapacity = initialSize;
  }

  public VectorCustom()
  {
    this(10,10);
  }

  public void add(K value)
  {
    if(currentEdgeIndex >= currentCapacity)
    {
      addCapacity();

    }
    objArray[currentEdgeIndex] = value;
    currentEdgeIndex++;
  }

  private void addCapacity() {
    objArray = Arrays.copyOf(objArray,objArray.length+incrementalSize);
  }




}
