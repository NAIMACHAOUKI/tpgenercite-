import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String c;
        MetierProduitImpl metier = new MetierProduitImpl();
        while (true) {
            System.out.println("entrer une lettre");
            c = scanner.nextLine();
            long id;
            switch (c) {
                case "a":
                    System.out.println(metier.getAll());
                    break;
                case "b":
                    id = scanner.nextLong();
                    scanner.nextLine();
                    System.out.println(metier.findById(id));
                    break;

                case "c":
                    int Id = scanner.nextInt();
                    scanner.nextLine();
                    String Nom = scanner.nextLine();
                    String Marq = scanner.nextLine();
                    Double Prix = scanner.nextDouble();
                    scanner.nextLine();
                    String Desc = scanner.nextLine();
                    int NbStock = scanner.nextInt();
                    scanner.nextLine();
                    Produit produit = new Produit(Id, Nom, Marq, Prix, Desc, NbStock);
                    metier.add(produit);
                    break;
                case "d":
                    id = scanner.nextLong();
                    scanner.nextLine();
                    metier.delete(id);
                    break;
                case "e":
                    System.out.println("Fin le programme");
                    return;
                default:
                    System.out.println("choix invalide");
                    break;

            }


        }
    }
}
