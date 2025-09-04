public class App {
    public static void main(String[] args) throws Exception {
        Produto produto = new Produto(1L, "Smart TV", 1000.00, ECategoriaProduto.CAMA);

        produto.exibirDetalhes();

        produto.aplicarDesconto(10);

        produto.exibirDetalhes();

        // Com os atributos com "private", apenas Produto consegue manipular
        // produto.preco = "Smart TV";
        // produto.exibirDetalhes();

        produto.setPreco(1.0);
        produto.exibirDetalhes();
    }
}
