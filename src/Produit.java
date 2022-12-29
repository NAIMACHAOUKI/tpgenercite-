import java.security.PrivateKey;

public class Produit {
    private int Id;
    private String Nom;
    private String Marq;
    private Double Prix;
    private String Desc;
    private int NbStock;

    @Override
    public String toString() {
        return "Produit{" +
                "Id=" + Id +
                ", Nom='" + Nom + '\'' +
                ", Marq='" + Marq + '\'' +
                ", Prix=" + Prix +
                ", Desc='" + Desc + '\'' +
                ", NbStock=" + NbStock +
                '}';
    }

    public Produit(int id, String nom, String marq, Double prix, String desc, int nbStock) {
        Id = id;
        Nom = nom;
        Marq = marq;
        Prix = prix;
        Desc = desc;
        NbStock = nbStock;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getMarq() {
        return Marq;
    }

    public void setMarq(String marq) {
        Marq = marq;
    }

    public Double getPrix() {
        return Prix;
    }

    public void setPrix(Double prix) {
        Prix = prix;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }

    public int getNbStock() {
        return NbStock;
    }

    public void setNbStock(int nbStock) {
        NbStock = nbStock;
    }
}
