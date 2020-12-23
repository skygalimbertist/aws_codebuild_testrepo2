import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestNewMessageUtil {

  String message = "Robert";    
  MessageUtil messageUtil = new NewMessageUtil(message);
   
  @Test
  public void testPrintMessage() {      
    System.out.println("Inside testPrintMessage()");     
    assertEquals(message,messageUtil.printMessage());
  }

  @Test
  public void testSalutationMessage() {
    System.out.println("Inside testSalutationMessage()");
    message = "Hi all!" + "Robert";
    assertEquals(message,messageUtil.salutationMessage());
  }
  
}
