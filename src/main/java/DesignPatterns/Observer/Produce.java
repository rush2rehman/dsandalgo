package DesignPatterns.Observer;

public class Produce {

  public enum Color{RED,BLUE,GREEN}

  private int instanceCount = 0;
  private Color color;

  public int getInstanceCount() {
    return instanceCount;
  }

  public void setInstanceCount(int instanceCount) {
    this.instanceCount = instanceCount;
  }

  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  private Produce(ProduceBuilder builder)
  {
    this.color = builder.color;
    this.instanceCount = builder.instanceCount;
  }

  public static class ProduceBuilder
  {

    private int instanceCount = 0;
    private Color color;

    public ProduceBuilder(Color color, int instanceCount)
    {
      this.color = color;
      this.instanceCount = instanceCount;

    }

    public Produce build()
    {
      return new Produce(this);
    }


  }
}
