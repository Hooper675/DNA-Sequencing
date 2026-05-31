# DNA.java

A simple Java demo that scans DNA sequences for a valid protein-coding region.

The program looks for the start codon `ATG` and the stop codon `TGA` in each DNA string. If both codons exist and the substring length between them is a multiple of 3, it prints the protein sequence; otherwise it prints `No Protein`.

## Files

- `DNA.java` — Java source file with the main program

## Compile and run

```bash
javac DNA.java
java DNA
```

## Behavior

For each DNA sequence in the program, `DNA.java` prints:

1. The length of the DNA string
2. Either the extracted protein sequence or `No Protein`

## Example output

```text
15
Protein: ATGCGATACGCTTGA
13
No Protein
15
Protein: ATTAATATGTACTGA
```

## Notes

- This example uses a fixed set of three sample DNA strings.
- It only checks for the exact codons `ATG` and `TGA`.
- It does not handle multiple proteins per sequence or more advanced gene-finding rules.
