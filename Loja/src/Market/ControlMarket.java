package Market;

public class  ControlMarket {
	
	public static void main(String[] args) {
		
        
		// Criar fatura
		Invoice invoice = new Invoice(444,"Impressora",1,50.0);
		
		
		//Valores da Fatura
		System.out.println("Numero: " +invoice.getNumero());
		System.out.println("Descricao: " +invoice.getdescrevItem());
		System.out.println("Quantidade de Item: " +invoice.getQuantidade());
		System.out.println("Preco Por Item: " +invoice.getprecItem());
		
		
		// Alterar valor da fatura
		invoice.setNumero(321);
		invoice.setQuantidade(2);
		invoice.setprecItem(40);
		
		//Valor atualizado da fatura
		
		System.out.println("Numero:" +invoice.getNumero());
		System.out.println("Descricao:" +invoice.getdescrevItem());
		System.out.println("Quantidade de Item:" +invoice.getQuantidade());
		System.out.println("Preco Por Item:" +invoice.getprecItem());
		
		// Imprime valor total da fatura
		
		System.out.println("Valor Total da Fatura:"+ invoice.getInvoiceAmount());
		
	}

}
