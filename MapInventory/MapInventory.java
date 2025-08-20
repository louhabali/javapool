import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MapInventory {
    public static int getProductPrice(Map<String, Integer> inventory, String productId) {
       
        if (inventory.get(productId)==null){
            return -1;
        };
        return inventory.get(productId);
    }

    public static List<String> getProductIdsByPrice(Map<String, Integer> inventory, int price) {
        List<String> ll = new ArrayList<>();
        
        if(inventory == null){
            return ll;
        }
        inventory.forEach((k,v) -> {
            if (v == price){
                ll.add(k);
            }
        });
        return  ll;
    }
}