package searching;


/**
 *
 * @author PKS
 */
public class LinkedList {
    

  class Neighbour{
  
  public String homeOwnerName;
  public int houseNumber;
  public Neighbour next;
  public Neighbour previous;
  
  public Neighbour(String homeOwnerName,int houseNumber){
      
      this.homeOwnerName = homeOwnerName;
      this.houseNumber = houseNumber;
  }
  
  public void display(){
      
      System.out.print(homeOwnerName + " : "+houseNumber );
  
  }
  
  public String toString(){
      
      return homeOwnerName;
  }
  
  }
  
  public class DoubleEndedLinkedList{
      
       public Neighbour firstLink;
  public Neighbour lastLink;
      
      public void insertInFirstPosition(String homeOwnerName,int houseNumber){
          
          Neighbour theNewLink = new Neighbour(homeOwnerName,houseNumber);
          
          if(isEmpty()){
              
              lastLink = theNewLink;
          }
          theNewLink.next = firstLink;
          firstLink = theNewLink;
      }
      
      public void insertInLastPosition(String homeOwnerName,int houseNumber){
          
      }
      
      public boolean inserAfterKey(String homeOwnerName,int houseNumber,int key){
          
          return false;
      }
  }
  
  
    public static void main(String[] args) {
        
        
       
    }
          
    
}
