public class Pagamento {

    private double resultado;

    public double efetuarPagamento(){
        if(isEmAberto()){
            resultado = pagamentoEmAberto();
        }else{
            if(isPreparado()){
                resultado = pagamentoPreparado();
            }else{
                if(isAtrasado()){
                    resultado = pagamentoAtrasado();
                }else{
                    resultado = pagamentoNormal();
                }
            }
        }
        return resultado;
    }
}
