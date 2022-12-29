import java.util.ArrayList;
import java.util.List;

public class MetierProduitImpl implements IMetier<Produit>{
    private List<Produit> produit_list =new ArrayList<>();
    @Override
    public void add(Produit produit) {
        produit_list.add(produit);

    }

    @Override
    public List<Produit> getAll() {
        return produit_list;
    }

    @Override
    public Produit findById(long id) {
        for (int i = 0; i < produit_list.size(); i++) {
            Produit m;
            m=produit_list.get(i);
            if(m.getId()==id){
                return m;
            }

            }
            return null;
        }

    @Override
    public void delete(long id) {
        Produit produit=findById(id);
        produit_list.remove(produit);

    }
}
