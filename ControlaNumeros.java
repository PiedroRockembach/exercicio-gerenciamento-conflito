import java.util.ArrayList;
public class ControlaNumeros {

    public boolean hasRepeat(ArrayList<Integer> list) {
        for(int i = 0; i < list.size(); i += 1) {
            int aux = 0;
            for(int j = 0; i < list.size(); i += 1) {
                if ( list.get(i) == list.get(j)) aux += 1;
                
            }
            if (aux > 1) return true; 
        }
        return false;
    }
    
}