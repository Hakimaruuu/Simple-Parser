
package simpleparser.analyzer;
import java.util.ArrayList;

//untuk menginisialisasi tampilan ke tabel output
//untuk inisialisasi class objek yg menyimpan token
public class Tahap1 {
    //variabel
    private String d;
    private ArrayList<Integer> token = new ArrayList<>();
    
    //constructor
    public Tahap1(String a, ArrayList token){
        this.d = a;
        this.token = token;
    }
    
    //setter getter
    public String getString(){
        return d;
    }
    public ArrayList getToken(){
        return token;
    }
    public void setToken(ArrayList token){
        this.token = token;
    }
    public void setString(String a){
        this.d = a;
    }
    
    
    //override untuk mempermudah penggunaan
    //tapi tidak untuk semua package
    //bukan static
    @Override
    public String toString(){
        return "Lexical Analyzer {Input = "+d+", Output (Token Lexic) = "+token+'}';
    }
}
