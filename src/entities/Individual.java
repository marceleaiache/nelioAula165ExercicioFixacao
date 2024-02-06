package entities;

public class Individual extends TaxPayer{

    //INSTANCIANDO ARGUMENTOS DA CLASSE
    Double healthExpenditures;

    //MÉTODO CONSTRUTOR SEM ARGUMENTO
    public Individual(){
    super();
    }

    //MÉTODO CONSTRUTOR COM ARGUMENTOS
    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    //MÉTODOS GETTERS AND SETTERS
    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    //SOBREPOSIÇÃO DO METÓDO DA CLASSE SUPER
    @Override
    public double tax() {
        double totalTax = 0;
        if (anualIncome <= 20000.00) {
            if (healthExpenditures > 0) {
                totalTax = (anualIncome * 0.15) - (healthExpenditures * 0.5);
            }
            else {
                totalTax = anualIncome * 0.15;
            }
        }
        else if(anualIncome > 20000.00 ) {
            if (healthExpenditures > 0) {
                totalTax = (anualIncome * 0.25) - (healthExpenditures * 0.5);
            }
            else {
                totalTax = anualIncome * 0.25;
            }
        }
        return totalTax;
    }
}
