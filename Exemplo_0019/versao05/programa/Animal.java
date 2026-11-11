package programa;

public class Animal implements Comparable<Animal>{

	private String nome;
	
	public Animal(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	@Override
	public int compareTo(Animal outro) {
		return Integer.compare(this.nome.length(), outro.nome.length());
	}
	
	@Override
    public String toString() {
        return this.nome;
    }
	
	
}
