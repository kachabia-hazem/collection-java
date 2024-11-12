class Ustensile {
    protected int annee;

    public Ustensile(int annee) {
        this.annee = annee;
    }

    public double calculerValeur() {
        double r = 0;
        if (this.annee < 50) {
            r += 0;
        } else {
            int i = 2024 - this.annee;
            r += i;
        }
        return r;
    }
}

abstract class Assiette extends Ustensile {
    public Assiette(int annee) {
        super(annee);
    }

  abstract  double calculerSurface() ; 
}

class AssietteRonde extends Assiette {
    private double rayon;

    public AssietteRonde(int annee, double rayon) {
        super(annee);
        this.rayon = rayon;
    }

    public double calculerSurface() {
        return 3.14 * rayon * rayon;
    }
   
}

class AssietteCarree extends Assiette {
    private double cote;

    public AssietteCarree(int annee, double cote) {
        super(annee);
        this.cote = cote;
    }

    public double calculerSurface() {
        return cote * cote;
    }
    public double calculerValeur()
 {
    	return super.calculerValeur()*5;
    }
}

class Cuillere extends Ustensile {
    private double largeur;

    public Cuillere(int annee, double largeur) {
        super(annee);
        this.largeur = largeur;
    }
   
    
}

    

