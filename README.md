# What Scrabble word in what InChIKey?

Brute force analysis to answer the following existential question: [What's the largest english word/phrase you've found in the first part of standard InChI key hash? #ChemicalScrabble](https://twitter.com/johnpoverington/status/731873999299448833)

## Datasets

- All 1,583,897 InChIKeys from ChEMBL21 molecules: ftp://ftp.ebi.ac.uk/pub/databases/chembl/ChEMBLdb/latest/chembl_21_chemreps.txt.gz

- Scrabble "Enable" dictionary, 172,823 entries, filtering words lower than 5 characters: http://www.puzzlers.org/dokuwiki/doku.php?id=solving%3awordlists%3aabout%3astart

## Results

- Longest word, but in the second part of the key, from french: "metisses", lucky winners are [CHEMBL258855](https://www.ebi.ac.uk/chembl/compound/inspect/CHEMBL258855) and [CHEMBL261483](https://www.ebi.ac.uk/chembl/compound/inspect/CHEMBL261483)

- Personal favourite: "carwash" (7 letters), in [CHEMBL2181353](https://www.ebi.ac.uk/chembl/compound/inspect/CHEMBL2181353)

- Full results: https://github.com/loopasam/inchikey-scrabble/blob/master/src/main/resources/results.txt