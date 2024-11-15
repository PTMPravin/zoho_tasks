package ArtOfProblemSolving;

public class RNAToDNA {
    public static void main(String[] args) {
        System.out.println(transcribeDNAtoRNA("GCTA")); // Expected output: CGAU
        System.out.println(transcribeDNAtoRNA("ACGTACGT")); // Expected output: UGCACGCA
        System.out.println(transcribeDNAtoRNA("TTAG")); // Expected output: AAUC
        System.out.println(transcribeDNAtoRNA("CGCG")); // Expected output: GCGC
        
    }

     public static String transcribeDNAtoRNA(String dna) {
        StringBuilder rna = new StringBuilder();

        for (char nucleotide : dna.toCharArray()) {
            
            switch (nucleotide) {
                case 'G':
                    rna.append('C');
                    break;
                case 'C':
                    rna.append('G');
                    break;
                case 'T':
                    rna.append('A');
                    break;
                case 'A':
                    rna.append('U');
                    break;
                default:
                    throw new IllegalArgumentException("Invalid DNA nucleotide: " + nucleotide);
            }
        }

        return rna.toString();
    }
}
