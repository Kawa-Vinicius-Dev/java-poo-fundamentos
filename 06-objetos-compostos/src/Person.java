/*
Escreva um programa em Java para criar uma classe chamada
Pessoa com variáveis de instância privadas nome, idade e país.
Forneça métodos públicos getter e setter
para acessar e modificar essas variáveis.
*/

public class Person {
    private String name;
    private int age;
    private String pais;

    public Person() {
        setName("");
        setAge(0);
        setPais("");
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public String getPais() {
        return pais;
    }

    public void statusPerson(){
        System.out.println("Nome: " + getName());
        System.out.println("Idade: " + getAge());
        System.out.println("Pais: " + getPais());
    }

}
