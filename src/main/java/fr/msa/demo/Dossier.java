package fr.msa.demo;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Dossier implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String numsecu;
	private java.lang.String typeDemarrage;

	public Dossier() {
	}

	public java.lang.String getNumsecu() {
		return this.numsecu;
	}

	public void setNumsecu(java.lang.String numsecu) {
		this.numsecu = numsecu;
	}

	public java.lang.String getTypeDemarrage() {
		return this.typeDemarrage;
	}

	public void setTypeDemarrage(java.lang.String typeDemarrage) {
		this.typeDemarrage = typeDemarrage;
	}

	public Dossier(java.lang.String numsecu, java.lang.String typeDemarrage) {
		this.numsecu = numsecu;
		this.typeDemarrage = typeDemarrage;
	}

	@Override
	public String toString() {
		return "Dossier [numsecu=" + numsecu + ", typeDemarrage=" + typeDemarrage + "]";
	}

}