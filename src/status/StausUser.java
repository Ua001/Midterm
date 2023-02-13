/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm-Exam
 * @author srinivsi
 */
public class StausUser 
{
  public enum StatusCode {
  ZERO("REJECTED"),
  ONE("PENDING"),
  TWO("PROCESSING"),
  THREE("APPROVED");

  private final String status;

  StatusCode(String status) {
    this.status = status;
  }

  public String getStatus() {
    return status;
  }
  }
  
   
  public static StatusCode fromString(String code) 
  {
    try {
      return StatusCode.valueOf(code.toUpperCase());
    } catch (IllegalArgumentException e) {
      return null;
    }
  }
}
