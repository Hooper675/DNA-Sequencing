// DNA Sequencing
public class DNA {
  public static void main (String[] args) {

    //  -. .-.   .-. .-.   .
    //    \   \ /   \   \ /
    //  /  \   \   / \   \
    // ~    `-~ `-`   `-~ `-
    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";
    String[] dnas = {dna1, dna2, dna3};
    for (String dna : dnas){
      int startcdn = dna.indexOf("ATG");
      int stopcdn = dna.indexOf("TGA");
      System.out.println(dna.length());
      
    if (startcdn != -1 && stopcdn != -1 && (stopcdn - startcdn) % 3 == 0) {
      String protein = dna.substring(startcdn, stopcdn+3);
      System.out.println("Protein: " + protein);
      }else{
        System.out.println("No Protein");
      } 
    } 
  } 
}