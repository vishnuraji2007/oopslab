import java.util.*;
 public class RailwayPlatformQueue {   
     public static void main(String[] args) {    
            Scanner sc = new Scanner(System.in);    
                Queue<String> trainQueue = new LinkedList<>();      
                  int choice;       
                   do {          
                      System.out.println("\n===== RAILWAY PLATFORM QUEUE MANAGEMENT =====");          
                        System.out.println("1. Add Train");           
                         System.out.println("2. Remove Train");          
                           System.out.println("3. Display Waiting Trains");     
                                  System.out.println("4. Exit");         
                                     System.out.print("Enter your choice: ");        
                                         choice = sc.nextInt();         
                               sc.nextLine();           
                                switch (choice) {             
                                       case 1:              
                                             System.out.print("Enter Train Number/Name: ");           
                                                      String train = sc.nextLine();                   
                                                       trainQueue.add(train);                  
                                                         System.out.println("Train added to the platform queue.");              
                                                               break;               
                                                 case 2:                   
                                                  if (trainQueue.isEmpty()) {             
                                                               System.out.println("No trains are waiting.");                
                                                                   } 
                                                    else {                     
                                                           String removedTrain = trainQueue.poll();                      
                                                             System.out.println("Train departed: " + removedTrain);                  
                                                               }                 
                                                                  break;               
                                                                   case 3:                 
                                                                      if (trainQueue.isEmpty()) {        
                                                                              System.out.println("No trains are waiting.");                 
                                                                           } 
                                                    else {      
                                                              System.out.println("\nWaiting Trains:");                      
                                                                for (String t : trainQueue) {                         
                                                                       System.out.println(t);                       
                                                                        }                   
                                                                        
                                                                         }                   
                                                                          break;               
                                                         case 4:                   
                                                          System.out.println("Exiting the system...");                  
                                                            break;               
                                                             default:                   
                                                              System.out.println("Invalid choice!");          
                                                                }       
                                                         } while (choice != 4);      
                                                           sc.close();}   
                                                            }