/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

import status.Status.StatusCode;

/**
 * MidTerm-Exam
 * @author srinivsi
 */
public class StausUser 
{
   public void statusDetail()
{
      for(StatusCode status: Status.StatusCode.values()){
          System.out.println(status);
          
      }
        /*{
        case "ZERO": System.out.println("REJECTED");
        break;
        case "ONE": System.out.println("PENDING");
        break;
        case "TWO":
        System.out.println("PROCESSING");
        break;
        case "THREE": 
            System.out.println("APPROVED");
        break;
        default:
         System.out.println("NOT VALID CODE");
        break;
        }*/
}
 
}
