package ss12_JavaCollectionFrameWork.Exercise.Product2;

import java.util.Comparator;

public class ComparatorByLower implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if(o1.getPrice() > o2.getPrice()){
            return 1;
        }else if(o1.getPrice() < o2.getPrice()) {
            return -1;
        }else {
            return 0;
        }
    }
}