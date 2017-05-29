/**
 * Describes BOOLEAN tokens
 */

public class BooleanToken extends Token {

  /**
   * The Boolean value of the token is also stored for BOOLEAN tokens
   */
  public Boolean value;
  
  public String toString()
  {
  	return value.toString();
  }

  public Object getValue()
  {
	  return value;
  }
  
  public BooleanToken(String image)
  {
    this.kind = HLConstants.BOOLEAN  ;
    this.image = image;
    
    // Calculate value
	  if (image.compareToIgnoreCase("TRUE") == 0)
		  value = new Boolean(true);
	  else
		  value = new Boolean(false);
  }
  
}
