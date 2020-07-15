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
          
          Neighbour theNewLink = new Neighbour(homeOwnerName,houseNumber);
          
           if(isEmpty()){
              
              firstLink = theNewLink;
          } else{
          lastLink.next = theNewLink;
         // firstLink = theNewLink;
           }
           lastLink =theNewLink;
          
      }
      public boolean isEmpty(){
          return(firstLink ==null);
      }
      public void display(){
        Neighbour theLink = firstLink;

        while(theLink != null){

                 

            theLink.display();

                 

            System.out.println("Next Link: " + theLink.next);

                 

            theLink = theLink.next;    

            System.out.println();

        }
  
     
  }
  
  
    public static void main(String[] args) {
        
        
       
    }}
    
          
    
}
