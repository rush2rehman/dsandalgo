package DesignPatterns.Builder;

public class CellPhone {

  private String OS;
  private String networkProvider;

  private boolean touchEnabled;
  private boolean supports4G;


  public String getOS() {
    return OS;
  }

  public void setOS(String OS) {
    this.OS = OS;
  }

  public String getNetworkProvider() {
    return networkProvider;
  }

  public void setNetworkProvider(String networkProvider) {
    this.networkProvider = networkProvider;
  }

  private CellPhone(CellPhoneBuilder builder)
  {
    this.OS = builder.OS;
    this.networkProvider = builder.networkProvider;

  }

  public boolean isTouchEnabled() {
    return touchEnabled;
  }

  public void setTouchEnabled(boolean touchEnabled) {
    this.touchEnabled = touchEnabled;
  }

  public boolean isSupports4G() {
    return supports4G;
  }

  public void setSupports4G(boolean supports4G) {
    this.supports4G = supports4G;
  }

  public static class CellPhoneBuilder
  {
    private String OS;
    private String networkProvider;
    public CellPhoneBuilder(String os, String nw)
    {
      this.OS = os;
      this.networkProvider = nw;
    }

    private boolean touchEnabled;
    private boolean supports4G;

    public CellPhoneBuilder touchEnabled(boolean touch)
    {
      this.touchEnabled = touch;
      return this;
    }

    public CellPhoneBuilder support4g(boolean supports4G)
    {
      this.supports4G = supports4G;
      return this;
    }

    public CellPhone build()
    {
      return new CellPhone(this);
    }

  }

  @Override
  public String toString()
  {
    return this.OS+";"+this.networkProvider+";"+this.supports4G+";"+this.touchEnabled;
  }



}
