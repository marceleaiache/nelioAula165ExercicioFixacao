package entities;

public abstract class TaxPayer {

    //INSTANCIANDO ARGUMENTOS DA CLASSE
    String name;
    Double anualIncome;

    //MÉTODO CONSTRUTOR SEM ARGUMENTO
    public TaxPayer() {
    }
    //MÉTODO CONSTRUTOR COM ARGUMENTOS
    public TaxPayer(String name, Double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }

    //MÉTODOS GETTERS AND SETTERS

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnualIncome() {
        return anualIncome;
    }

    public void setAnualIncome(Double anualIncome) {
        this.anualIncome = anualIncome;
    }

    //MÉTODO FUNÇÃO
    public double tax() {
        return 0;
    }
}
