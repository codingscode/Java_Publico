package programa;

public class Animal {

	private String nome;
	
	public Animal(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	@Override
    public String toString() {
        return this.nome;
    }
	
	
}
