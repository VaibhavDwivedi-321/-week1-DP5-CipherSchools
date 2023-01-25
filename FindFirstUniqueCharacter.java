public class FindFirstUniqueCharacter {
  
  public static void printFirstUniqueCharacter(String str){
    int size = str.length();
    DLLOperations dll = new DLLOperations();
    DLLNode [] charMap = new DLLNode[256];
    boolean [] repeated = new boolean[256];
    for(int i =0;i<size;i++){
        char c = str.charAt(i);
        if(!repeated[c]){
            if(charMap[c]==null){
                dll.append(c);
                charMap[c]=dll.last;
            }else{
                dll.delete(charMap[c]);
                repeated[c]=true;
            }
        }if(dll.head!=null){
        System.out.println("First Unit Character" );
        System.out.println(dll.head.data);
        }
    }
  }
   
}
    

