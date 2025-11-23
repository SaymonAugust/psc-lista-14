public class CartaoCredito implements MetodoPagamento {

    private String numeroCartao;

    public CartaoCredito(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void realizarPagamento(double valor) {
        System.out.println(
            "Pagamento de R$ " + valor + 
            " realizado com Cartão de Crédito. Cobrança de 5% de taxa."
        );
    }
}

\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

public class Boleto implements MetodoPagamento {

    private String codigoBarra;

    public Boleto(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    @Override
    public void realizarPagamento(double valor) {
        System.out.println(
            "Pagamento de R$ " + valor + 
            " realizado com Boleto. Boleto gerado e enviado por e-mail."
        );
    }
}

\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
public class Pix implements MetodoPagamento {

    private String chavePix;

    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void realizarPagamento(double valor) {
        System.out.println(
            "Pagamento de R$ " + valor + 
            " realizado com Pix. Transação instantânea."
        );
    }
}
