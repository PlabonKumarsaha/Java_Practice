package searching;


/**
 *
 * @author PKS
 */
public class LinkedList {
    

    
 public String bookName;
 public int millionsSold;
 public LinkedList next;
 
 public LinkedList(String bookName, int millionsSold){
     
     this.bookName = bookName;
     this.millionsSold = millionsSold;
     
 }
public void display(){
    System.out.println("Book name :"+ bookName + " & millions of copies sold : "+millionsSold);
}
   
public String toString(){
    
    return bookName;
}
    public static void main(String[] args) {
       
     Link link =  new Link();
     link.insertFirstLink("abc", 200);
     link.insertFirstLink("bcd", 300);
     link.insertFirstLink("def", 500);
     link.display();
     link.removeFirst();
     link.display();
     
     
   
     
     
     
     
 
    }
     public static class Link{
         
         public LinkedList firstLink;
         
         Link(){
             firstLink = null;
         }
         
         public boolean isEmpty(){
             
             return (firstLink == null);
         }
         
         public void insertFirstLink(String bookName, int millionsSold){
             
             LinkedList newLink = new LinkedList(bookName,millionsSold);
             newLink.next =firstLink;
             firstLink = newLink;
         }
         
         public LinkedList removeFirst(){
             
             LinkedList linkReference = firstLink;
             
             if(!isEmpty()){
              firstLink = firstLink.next;   
             }else{
                 System.out.print("Empty linkedList");
             }
             return linkReference;
         }
         
         public void display(){
             LinkedList theLink = firstLink;
             while(theLink != null){
                 theLink.display();
                 System.out.print("Next Link :"+theLink.next);
                 theLink = theLink.next;
                System.out.println("");

             }
          
             
         }
         public LinkedList find(String bookName){
             
             LinkedList theLink = firstLink;
             if(!isEmpty()){
                 while(theLink.bookName != bookName){
                     
                     if(theLink.next == null){
                         return null;
                     }else{
                        theLink = theLink.next; 
                     }
                 }
             } else{
                 System.out.print("Empty linked list");
             }
             return theLink;
         }
         
         public LinkedList removeLink(String bookName){
             
             LinkedList currentLink = firstLink;
             LinkedList previousLink = firstLink;
             while(currentLink.bookName != bookName){
             if(currentLink.next == null){
                 return null;
             }else{
                previousLink = currentLink;
                currentLink = currentLink.next;
             }
             }
             if(currentLink == firstLink){
                 firstLink = firstLink.next;
             } else{
                 
                 previousLink = currentLink.next;
             }
             
             return currentLink;
             
         }
         
     
     
 }
    
}
