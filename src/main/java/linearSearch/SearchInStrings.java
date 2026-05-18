package linearSearch;

public class SearchInStrings {
    public static void main(String[] args) {
        String str="Jayansh";
        char c='k';
        System.out.print(searchInString(str,c));
    }
    static boolean searchInString(String str,char ch){
        if(str.length()==0){
            return false;
        }
        for(char c: str.toCharArray()){
            if(c==ch){
                return true;
            }
        }
        return false;
    }
}
