
public class Item {
	String descricao;
	String unidade;
	double valorUnitario;
	double qtdade;
	
	Item(String descricao, String unidade, double valorUnitario, double qtdade){
		this.descricao=descricao;
		this.unidade=unidade;
		this.valorUnitario=valorUnitario;
		this.qtdade=qtdade;
	}
	
	double vTotalItem() {
		return this.valorUnitario*this.qtdade;
	}
   
}
