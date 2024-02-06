package entities;

public class Company extends TaxPayer{

    //INSTANCIANDO O ARGUMENTO DA CLASSE
    int numberOfEmployees;

    //MÉTODO CONSTRUTOR SEM ARGUMENTO
    public Company() {
    }

    //MÉTODO CONSTRUTOR COM ARGUMENTOS
    public Company(String name, Double anualIncome, Integer numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    //MÉTODOS GETTERS AND SETTERS
    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    //SOBREPOSIÇÃO DO METÓDO DA CLASSE SUPER
    @Override
    public double tax() {
        double tax = 0;
        if (numberOfEmployees > 10) {
            tax = anualIncome * 0.14;
        }
        else {
            tax = anualIncome * 0.16;
        }
        return tax;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
