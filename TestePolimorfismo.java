public class TestePolimorfismo {
    public static void main(String[] args) {

        MetodoPagamento cartao = new CartaoCredito("1234 5678 9012 3456");
        MetodoPagamento boleto = new Boleto("83660000001-445580000000");
        MetodoPagamento pix = new Pix("saymon@pix.com");

        ProcessadorPagamento.processar(cartao, 150.75);
        ProcessadorPagamento.processar(boleto, 499.00);
        ProcessadorPagamento.processar(pix, 25.50);
    }
}
