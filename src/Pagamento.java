public class Pagamento {

    public double efetuarPagamento(){

        if(isEmAberto()){
            return pagamentoEmAberto();
        }else if(isPreparado()){
            return pagamentoPreparado();
        }else if(isAtrasado()){
            return pagamentoAtrasado();
        }else{
            return pagamentoNormal();
        }
    }
}
