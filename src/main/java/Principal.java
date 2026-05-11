import javax.swing.JOptionPane;
public class Principal {
    public static void main(String[] args) {
        
        int MENUPP = -1;
        
        while (MENUPP != 0) {
        
        String MENUPRINCIPAL = JOptionPane.showInputDialog(
                "<html><div style='text-align: center;'>"
                + "SEX ON THE BAR LTDA<br>"
                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                + "MENU PRINCIPAL"
                + "<div><br>"
                + "<div style='text-align: justify;'>"
                + "1 - CADASTRO DE PRODUTO<br>"
                + "2 - MOVIMENTAÇÃO<br>"
                + "3 - REAJUSTE DE PREÇOS<br>"
                + "4 - RELATÓRIOS<br>"
                + "0 - FINALIZAR<br><br>"
                + "</div></html>"
             );
        
        if (MENUPRINCIPAL == null) break;
        MENUPP = Integer.parseInt(MENUPRINCIPAL);
        
        if (MENUPP == 1) {
            
            int MENUCD = -1;
            
            while (MENUCD != 0) {
            String MENUCADASTRO = JOptionPane.showInputDialog(
                "<html><div style='text-align: center;'>"
                + "SEX ON THE BAR LTDA<br>"
                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                + "CADASTRO DE PRODUTOS"
                + "</div><br>"
                + "<div style='text-align: justify;'>"
                + "1 - INCLUSÃO<br>"
                + "2 - ALTERAÇÃO<br>"
                + "3 - CONSULTA<br>"
                + "4 - EXCLUSÃO<br>"
                + "0 - RETORNAR<br><br>"
                + "</div></html>"  
            );
            if (MENUCADASTRO == null) break;
            MENUCD = Integer.parseInt(MENUCADASTRO);

            if (MENUCD == 4) {

                boolean novaExclusao = true;

                while (novaExclusao) {

                    // Input 1 - Nome
                    String nome = JOptionPane.showInputDialog(null,
                        "<html><div style='text-align: center;'>"
                        + "SEX ON THE BAR LTDA<br>"
                        + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                        + "EXCLUSÃO DE PRODUTO"
                        + "</div><br><br>"
                        + "<div style='text-align: justify;'>"
                        + "NOME :"
                        + "</div></html>",
                        "SEX ON THE BAR LTDA - Tela 1.1.4",
                        JOptionPane.PLAIN_MESSAGE);

                    if (nome == null) break;

                    // Input 2 - Preço
                    String preco = JOptionPane.showInputDialog(null,
                        "<html><div style='text-align: center;'>"
                        + "SEX ON THE BAR LTDA<br>"
                        + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                        + "EXCLUSÃO DE PRODUTO"
                        + "</div><br><br>"
                        + "<div style='text-align: justify;'>"
                        + "NOME      : " + nome + "<br><br>"
                        + "PREÇO :"
                        + "</div></html>",
                        "SEX ON THE BAR LTDA - Tela 1.1.4",
                        JOptionPane.PLAIN_MESSAGE);

                    if (preco == null) break;

                    // Input 3 - Unidade
                    String unidade = JOptionPane.showInputDialog(null,
                        "<html><div style='text-align: center;'>"
                        + "SEX ON THE BAR LTDA<br>"
                        + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                        + "EXCLUSÃO DE PRODUTO"
                        + "</div><br><br>"
                        + "<div style='text-align: justify;'>"
                        + "NOME      : " + nome + "<br>"
                        + "PREÇO     : " + preco + "<br><br>"
                        + "UNIDADE :"
                        + "</div></html>",
                        "SEX ON THE BAR LTDA - Tela 1.1.4",
                        JOptionPane.PLAIN_MESSAGE);

                    if (unidade == null) break;

                    // Input 4 - Quantidade
                    String quantidade = JOptionPane.showInputDialog(null,
                        "<html><div style='text-align: center;'>"
                        + "SEX ON THE BAR LTDA<br>"
                        + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                        + "EXCLUSÃO DE PRODUTO"
                        + "</div><br><br>"
                        + "<div style='text-align: justify;'>"
                        + "NOME      : " + nome + "<br>"
                        + "PREÇO     : " + preco + "<br>"
                        + "UNIDADE   : " + unidade + "<br><br>"
                        + "QUANTIDADE :"
                        + "</div></html>",
                        "SEX ON THE BAR LTDA - Tela 1.1.4",
                        JOptionPane.PLAIN_MESSAGE);

                    if (quantidade == null) break;

                    // Input 5 - Confirmação da exclusão (S/N)
                    String confirmacao = "";
                    while (!confirmacao.equalsIgnoreCase("S") && !confirmacao.equalsIgnoreCase("N")) {
                        confirmacao = JOptionPane.showInputDialog(null,
                            "<html><div style='text-align: center;'>"
                            + "SEX ON THE BAR LTDA<br>"
                            + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                            + "EXCLUSÃO DE PRODUTO"
                            + "</div><br><br>"
                            + "<div style='text-align: justify;'>"
                            + "NOME      : " + nome + "<br>"
                            + "PREÇO     : " + preco + "<br>"
                            + "UNIDADE   : " + unidade + "<br>"
                            + "QUANTIDADE: " + quantidade + "<br><br>"
                            + "CONFIRMA EXCLUSÃO ( S/N ) ?"
                            + "</div></html>",
                            "SEX ON THE BAR LTDA - Tela 1.1.4",
                            JOptionPane.PLAIN_MESSAGE);

                        if (confirmacao == null) { confirmacao = "N"; break; }

                        if (!confirmacao.equalsIgnoreCase("S") && !confirmacao.equalsIgnoreCase("N")) {
                            JOptionPane.showMessageDialog(null,
                                "Entrada inválida. Digite S para Sim ou N para Não.",
                                "Aviso", JOptionPane.WARNING_MESSAGE);
                        }
                    }

                    if (confirmacao.equalsIgnoreCase("S")) {
                        JOptionPane.showMessageDialog(null,
                            "<html><div style='text-align: center;'>"
                            + "SEX ON THE BAR LTDA<br>"
                            + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                            + "EXCLUSÃO DE PRODUTO"
                            + "</div><br><br>"
                            + "<div style='text-align: justify;'>"
                            + "PRODUTO EXCLUÍDO COM SUCESSO!"
                            + "</div></html>",
                            "SEX ON THE BAR LTDA - Tela 1.1.4",
                            JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null,
                            "<html><div style='text-align: center;'>"
                            + "SEX ON THE BAR LTDA<br>"
                            + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                            + "EXCLUSÃO DE PRODUTO"
                            + "</div><br><br>"
                            + "<div style='text-align: justify;'>"
                            + "EXCLUSÃO CANCELADA."
                            + "</div></html>",
                            "SEX ON THE BAR LTDA - Tela 1.1.4",
                            JOptionPane.INFORMATION_MESSAGE);
                    }

                    // Input 6 - Nova exclusão (S/N)
                    String resposta = "";
                    while (!resposta.equalsIgnoreCase("S") && !resposta.equalsIgnoreCase("N")) {
                        resposta = JOptionPane.showInputDialog(null,
                            "<html><div style='text-align: center;'>"
                            + "SEX ON THE BAR LTDA<br>"
                            + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                            + "EXCLUSÃO DE PRODUTO"
                            + "</div><br><br>"
                            + "<div style='text-align: justify;'>"
                            + "NOVA EXCLUSÃO ( S/N ) ?"
                            + "</div></html>",
                            "SEX ON THE BAR LTDA - Tela 1.1.4",
                            JOptionPane.PLAIN_MESSAGE);

                        if (resposta == null) { resposta = "N"; break; }

                        if (!resposta.equalsIgnoreCase("S") && !resposta.equalsIgnoreCase("N")) {
                            JOptionPane.showMessageDialog(null,
                                "Entrada inválida. Digite S para Sim ou N para Não.",
                                "Aviso", JOptionPane.WARNING_MESSAGE);
                        }
                    }

                    if (resposta.equalsIgnoreCase("N")) {
                        novaExclusao = false; // Retorna para Tela 1.1
                    }
                }
            }

            }
        }

        if (MENUPP == 2) {
            
            int MENUMV = -1;
            
            while (MENUMV != 0) {
                String MENUMOVIMENTAÇÃO = JOptionPane.showInputDialog(
                "<html><div style='text-align: center;'>"
                + "SEX ON THE BAR LTDA<br>"
                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                + "MOVIMENTAÇÃO"
                + "</div><br>"
                + "<div style='text-align: justify;'>"
                + "1 - ENTRADA<br>"
                + "2 - SAIDA<br>"
                + "0 - RETORNAR<br><br>"
                + "</div></html>"  
            );
            if (MENUMOVIMENTAÇÃO == null) break;
            MENUMV = Integer.parseInt(MENUMOVIMENTAÇÃO);
            
                if (MENUMV == 1) {
                    
                    String CONFIRMAENTRADA = "S";
                    
                    while (CONFIRMAENTRADA.equalsIgnoreCase("S")) {
                        
                        String NOMEPRODUTO = JOptionPane.showInputDialog(
                            "<html><div style='text-align: center;'>"
                            + "SEX ON THE BAR LTDA<br>"
                            + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                            + "MOVIMENTAÇÃO - ENTRADA DE PRODUTO"
                            + "</div><br><br>"
                            + "<div style='text-align: justify;'>"
                            + "PRODUTO:"
                            + "</div></html>"
                        );
                        
                        if (NOMEPRODUTO == null) { CONFIRMAENTRADA = "N"; continue; }

                        String QTDEATUALSTR = JOptionPane.showInputDialog(
                            "<html><div style='text-align: center;'>"
                            + "SEX ON THE BAR LTDA<br>"
                            + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                            + "MOVIMENTAÇÃO - ENTRADA DE PRODUTO"
                            + "</div><br><br>"
                            + "<div style='text-align: justify;'>"
                            + "PRODUTO    : " + NOMEPRODUTO + "<br><br>"
                            + "QUANTIDADE ATUAL:"
                            + "</div></html>"
                        );
                        if (QTDEATUALSTR == null) { CONFIRMAENTRADA = "N"; continue; }
                        int QTDEATUAL = Integer.parseInt(QTDEATUALSTR);
                        
                        String QTDEENTRADASTR = JOptionPane.showInputDialog(
                            "<html><div style='text-align: center;'>"
                            + "SEX ON THE BAR LTDA<br>"
                            + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                            + "MOVIMENTAÇÃO - ENTRADA DE PRODUTO"
                            + "</div><br><br>"
                            + "<div style='text-align: justify;'>"
                            + "PRODUTO    : " + NOMEPRODUTO + "<br>"
                            + "QUANTIDADE ATUAL    : " + QTDEATUAL + "<br><br>"
                            + "QUANTIDADE ENTRADA:"
                            + "</div></html>"
                        );
                        if (QTDEENTRADASTR == null) { CONFIRMAENTRADA = "N"; continue; }
                        int QTDEENTRADA = Integer.parseInt(QTDEENTRADASTR);
                        
                        int QTDEFINAL = QTDEATUAL + QTDEENTRADA;
                        
                        String CONFIRMA = JOptionPane.showInputDialog(
                            "<html><div style='text-align: center;'>"
                            + "SEX ON THE BAR LTDA<br>"
                            + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                            + "MOVIMENTAÇÃO - ENTRADA DE PRODUTO"
                            + "</div><br><br>"
                            + "<div style='text-align: justify;'>"
                            + "PRODUTO      : " + NOMEPRODUTO + "<br>"
                            + "QUANTIDADE ATUAL    : " + QTDEATUAL + "<br>"
                            + "QUANTIDADE ENTRADA  : " + QTDEENTRADA + "<br>"
                            + "QUANTIDADE FINAL    : " + QTDEFINAL + "<br><br>"
                            + "CONFIRMA ENTRADA (S/N)?:"
                            + "</div></html>"
                        );
                        
                        if (CONFIRMA == null || !CONFIRMA.equalsIgnoreCase("S")) {
                            CONFIRMAENTRADA = JOptionPane.showInputDialog(
                                "<html><div style='text-align: center;'>"
                                + "SEX ON THE BAR LTDA<br>"
                                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                                + "MOVIMENTAÇÃO - ENTRADA DE PRODUTO"
                                + "</div><br><br>"
                                + "<div style='text-align: justify;'>"
                                + "ENTRADA CANCELADA.<br><br>"
                                + "NOVA ENTRADA (S/N)?:"
                                + "</div></html>"
                            );
                        } else {
                            CONFIRMAENTRADA = JOptionPane.showInputDialog(
                                "<html><div style='text-align: center;'>"
                                + "SEX ON THE BAR LTDA<br>"
                                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                                + "MOVIMENTAÇÃO - ENTRADA DE PRODUTO"
                                + "</div><br><br>"
                                + "<div style='text-align: justify;'>"
                                + "ENTRADA CONFIRMADA COM SUCESSO!<br><br>"
                                + "NOVA ENTRADA (S/N)?:"
                                + "</div></html>"
                            );
                        } else {
                            CONFIRMAENTRADA = JOptionPane.showInputDialog(
                                "<html><div style='text-align: center;'>"
                                + "SEX ON THE BAR LTDA<br>"
                                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                                + "MOVIMENTAÇÃO - ENTRADA DE PRODUTO"
                                + "</div><br><br>"
                                + "<div style='text-align: justify;'>"
                                + "ENTRADA CANCELADA.<br><br>"
                                + "NOVA ENTRADA (S/N)?:"
                                + "</div></html>"
                            );
                        }
                    }
                }

                if (MENUMV == 2) {
                    
                    String CONFIRMASAIDA = "S";
                    
                    while (CONFIRMASAIDA.equalsIgnoreCase("S")) {
                        
                        String NOMEPRODUTOSAIDA = JOptionPane.showInputDialog(
                            "<html><div style='text-align: center;'>"
                            + "SEX ON THE BAR LTDA<br>"
                            + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                            + "MOVIMENTAÇÃO - SAÍDA DE PRODUTO"
                            + "</div><br><br>"
                            + "<div style='text-align: justify;'>"
                            + "PRODUTO:"
                            + "</div></html>"
                        );
                        
                        if (NOMEPRODUTOSAIDA == null) { CONFIRMASAIDA = "N"; continue; }

                        String QTDEATUALSAIDASTR = JOptionPane.showInputDialog(
                            "<html><div style='text-align: center;'>"
                            + "SEX ON THE BAR LTDA<br>"
                            + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                            + "MOVIMENTAÇÃO - SAÍDA DE PRODUTO"
                            + "</div><br><br>"
                            + "<div style='text-align: justify;'>"
                            + "PRODUTO    : " + NOMEPRODUTOSAIDA + "<br><br>"
                            + "QUANTIDADE ATUAL:"
                            + "</div></html>"
                        );
                        if (QTDEATUALSAIDASTR == null) { CONFIRMASAIDA = "N"; continue; }
                        int QTDEATUALSAIDA = Integer.parseInt(QTDEATUALSAIDASTR);
                        
                        String QTDESAIDASTR = JOptionPane.showInputDialog(
                            "<html><div style='text-align: center;'>"
                            + "SEX ON THE BAR LTDA<br>"
                            + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                            + "MOVIMENTAÇÃO - SAÍDA DE PRODUTO"
                            + "</div><br><br>"
                            + "<div style='text-align: justify;'>"
                            + "PRODUTO    : " + NOMEPRODUTOSAIDA + "<br>"
                            + "QUANTIDADE ATUAL    : " + QTDEATUALSAIDA + "<br><br>"
                            + "QUANTIDADE SAÍDA:"
                            + "</div></html>"
                        );
                        if (QTDESAIDASTR == null) { CONFIRMASAIDA = "N"; continue; }
                        int QTDESAIDA = Integer.parseInt(QTDESAIDASTR);
                        
                        int QTDEFINALSAIDA = QTDEATUALSAIDA - QTDESAIDA;
                        
                        String CONFIRMA = JOptionPane.showInputDialog(
                            "<html><div style='text-align: center;'>"
                            + "SEX ON THE BAR LTDA<br>"
                            + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                            + "MOVIMENTAÇÃO - SAÍDA DE PRODUTO"
                            + "</div><br><br>"
                            + "<div style='text-align: justify;'>"
                            + "PRODUTO    : " + NOMEPRODUTOSAIDA + "<br>"
                            + "QUANTIDADE ATUAL    : " + QTDEATUALSAIDA + "<br>"
                            + "QUANTIDADE SAÍDA    : " + QTDESAIDA + "<br>"
                            + "QUANTIDADE FINAL    : " + QTDEFINALSAIDA + "<br><br>"
                            + "CONFIRMA SAÍDA (S/N)?:"
                            + "</div></html>"
                        );
                        
                        if (CONFIRMA == null || !CONFIRMA.equalsIgnoreCase("S")) {
                            CONFIRMASAIDA = JOptionPane.showInputDialog(
                                "<html><div style='text-align: center;'>"
                                + "SEX ON THE BAR LTDA<br>"
                                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                                + "MOVIMENTAÇÃO - SAÍDA DE PRODUTO"
                                + "</div><br><br>"
                                + "<div style='text-align: justify;'>"
                                + "SAÍDA CANCELADA.<br><br>"
                                + "NOVA SAÍDA (S/N)?:"
                                + "</div></html>"
                            );
                        } else {
                            CONFIRMASAIDA = JOptionPane.showInputDialog(
                                "<html><div style='text-align: center;'>"
                                + "SEX ON THE BAR LTDA<br>"
                                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                                + "MOVIMENTAÇÃO - SAÍDA DE PRODUTO"
                                + "</div><br><br>"
                                + "<div style='text-align: justify;'>"
                                + "SAÍDA CONFIRMADA COM SUCESSO!<br><br>"
                                + "NOVA SAÍDA (S/N)?:"
                                + "</div></html>"
                            );
                        } else {
                            CONFIRMASAIDA = JOptionPane.showInputDialog(
                                "<html><div style='text-align: center;'>"
                                + "SEX ON THE BAR LTDA<br>"
                                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                                + "MOVIMENTAÇÃO - SAÍDA DE PRODUTO"
                                + "</div><br><br>"
                                + "<div style='text-align: justify;'>"
                                + "SAÍDA CANCELADA.<br><br>"
                                + "NOVA SAÍDA (S/N)?:"
                                + "</div></html>"
                            );
                        }
                    }
                }
            }
        }

        if (MENUPP == 3) {

            String NOVOREAJUSTE = "S";

            while (NOVOREAJUSTE != null && NOVOREAJUSTE.equalsIgnoreCase("S")) {

                String TIPOREAJUSTE = JOptionPane.showInputDialog(
                    "<html><div style='text-align: center;'>"
                    + "SEX ON THE BAR LTDA<br>"
                    + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                    + "REAJUSTE DE PREÇOS"
                    + "</div><br><br>"
                    + "<div style='text-align: justify;'>"
                    + "REAJUSTE GERAL OU DE UM PRODUTO?<br><br>"
                    + "1 - GERAL<br>"
                    + "2 - UM PRODUTO<br>"
                    + "</div></html>"
                );

                String NOMEPRODUTORJ = JOptionPane.showInputDialog(
                    "<html><div style='text-align: center;'>"
                    + "SEX ON THE BAR LTDA<br>"
                    + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                    + "REAJUSTE DE PREÇOS"
                    + "</div><br><br>"
                    + "<div style='text-align: justify;'>"
                    + "REAJUSTE : " + (TIPOREAJUSTE.equals("1") ? "GERAL" : "UM PRODUTO") + "<br><br>"
                    + "PRODUTO:"
                    + "</div></html>"
                );

                String UNIDADEPRODUTO = JOptionPane.showInputDialog(
                    "<html><div style='text-align: center;'>"
                    + "SEX ON THE BAR LTDA<br>"
                    + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                    + "REAJUSTE DE PREÇOS"
                    + "</div><br><br>"
                    + "<div style='text-align: justify;'>"
                    + "REAJUSTE : " + (TIPOREAJUSTE.equals("1") ? "GERAL" : "UM PRODUTO") + "<br>"
                    + "PRODUTO  : " + NOMEPRODUTORJ + "<br><br>"
                    + "UNIDADE:"
                    + "</div></html>"
                );

                String PRECOATUALSTR = JOptionPane.showInputDialog(
                    "<html><div style='text-align: center;'>"
                    + "SEX ON THE BAR LTDA<br>"
                    + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                    + "REAJUSTE DE PREÇOS"
                    + "</div><br><br>"
                    + "<div style='text-align: justify;'>"
                    + "REAJUSTE : " + (TIPOREAJUSTE.equals("1") ? "GERAL" : "UM PRODUTO") + "<br>"
                    + "PRODUTO  : " + NOMEPRODUTORJ + "<br>"
                    + "UNIDADE  : " + UNIDADEPRODUTO + "<br><br>"
                    + "PREÇO ATUAL:"
                    + "</div></html>"
                );
                double PRECOATUAL = Double.parseDouble(PRECOATUALSTR.replace(",", "."));

                String PERCENTUALSTR = JOptionPane.showInputDialog(
                    "<html><div style='text-align: center;'>"
                    + "SEX ON THE BAR LTDA<br>"
                    + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                    + "REAJUSTE DE PREÇOS"
                    + "</div><br><br>"
                    + "<div style='text-align: justify;'>"
                    + "REAJUSTE   : " + (TIPOREAJUSTE.equals("1") ? "GERAL" : "UM PRODUTO") + "<br>"
                    + "PRODUTO    : " + NOMEPRODUTORJ + "<br>"
                    + "UNIDADE    : " + UNIDADEPRODUTO + "<br>"
                    + "PREÇO ATUAL: " + PRECOATUALSTR + "<br><br>"
                    + "PERCENTUAL DE REAJUSTE:"
                    + "</div></html>"
                );
                double PERCENTUAL = Double.parseDouble(PERCENTUALSTR.replace(",", "."));

                double PRECOFINAL = PRECOATUAL + (PRECOATUAL * PERCENTUAL / 100);

                String CONFIRMAREAJUSTE = JOptionPane.showInputDialog(
                    "<html><div style='text-align: center;'>"
                    + "SEX ON THE BAR LTDA<br>"
                    + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                    + "REAJUSTE DE PREÇOS"
                    + "</div><br><br>"
                    + "<div style='text-align: justify;'>"
                    + "REAJUSTE   : " + (TIPOREAJUSTE.equals("1") ? "GERAL" : "UM PRODUTO") + "<br>"
                    + "PRODUTO    : " + NOMEPRODUTORJ + "<br>"
                    + "UNIDADE    : " + UNIDADEPRODUTO + "<br>"
                    + "PREÇO ATUAL: " + String.format("%.2f", PRECOATUAL) + "<br>"
                    + "PERCENTUAL : " + String.format("%.2f", PERCENTUAL) + "%<br>"
                    + "PREÇO FINAL: " + String.format("%.2f", PRECOFINAL) + "<br><br>"
                    + "CONFIRMA REAJUSTE (S/N)?:"
                    + "</div></html>"
                );

                if (CONFIRMAREAJUSTE != null && CONFIRMAREAJUSTE.equalsIgnoreCase("S")) {
                    NOVOREAJUSTE = JOptionPane.showInputDialog(
                        "<html><div style='text-align: center;'>"
                        + "SEX ON THE BAR LTDA<br>"
                        + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                        + "REAJUSTE DE PREÇOS"
                        + "</div><br><br>"
                        + "<div style='text-align: justify;'>"
                        + "REAJUSTE CONFIRMADO COM SUCESSO!<br><br>"
                        + "NOVO REAJUSTE (S/N)?:"
                        + "</div></html>"
                    );
                } else {
                    NOVOREAJUSTE = JOptionPane.showInputDialog(
                        "<html><div style='text-align: center;'>"
                        + "SEX ON THE BAR LTDA<br>"
                        + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                        + "REAJUSTE DE PREÇOS"
                        + "</div><br><br>"
                        + "<div style='text-align: justify;'>"
                        + "REAJUSTE CANCELADO.<br><br>"
                        + "NOVO REAJUSTE (S/N)?:"
                        + "</div></html>"
                    );
                }
            }
        }

        if (MENUPP == 4) {

            int MENUREL = -1;

            while (MENUREL != 0) {
                String MENURELATORIO = JOptionPane.showInputDialog(
                    "<html><div style='text-align: center;'>"
                    + "SEX ON THE BAR LTDA<br>"
                    + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                    + "RELATÓRIOS"
                    + "</div><br>"
                    + "<div style='text-align: justify;'>"
                    + "&nbsp;1 - LISTA DE PRE&Ccedil;OS<br>"
                    + "&nbsp;2 - BALAN&Ccedil;O F&Iacute;SICO-FINANCEIRO<br>"
                    + "&nbsp;0 - RETORNAR<br><br>"
                    + "</div>"
                    + "<div style='text-align: center;'>"
                    + "OP&Ccedil;&Atilde;O :"
                    + "</div></html>"
                );
                if (MENURELATORIO == null) break;
                MENUREL = Integer.parseInt(MENURELATORIO);

                if (MENUREL == 1) {

                    // Dados simulados da lista de preços
                    String[][] produtos = {
                        {"AXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXX", "000.009,99"},
                        {"BXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXX", "000.009,99"},
                        {"CXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXX", "000.009,99"},
                        {"DXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXX", "000.009,99"},
                        {"EXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXX", "000.009,99"}
                    };

                    java.time.LocalDate hoje = java.time.LocalDate.now();
                    String data = String.format("%02d/%02d/%04d",
                        hoje.getDayOfMonth(), hoje.getMonthValue(), hoje.getYear());
                    int pagina = 1;

                    // Monta as linhas da tabela
                    StringBuilder linhas = new StringBuilder();
                    for (String[] p : produtos) {
                        linhas.append(
                            "<tr>"
                            + "<td style='padding-right:20px;'>" + p[0] + "</td>"
                            + "<td style='padding-right:20px; text-align:center;'>" + p[1] + "</td>"
                            + "<td style='text-align:right;'>" + p[2] + "</td>"
                            + "</tr>"
                        );
                    }

                    JOptionPane.showMessageDialog(null,
                        "<html>"
                        + "<div style='font-family:monospace;'>"
                        + "<div style='text-align:center;'>"
                        + "SEX ON THE BAR LTDA<br>"
                        + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                        + "</div>"
                        + "<div style='display:flex; justify-content:space-between;'>"
                        + "<span>" + data + "</span>"
                        + "<span>&nbsp;&nbsp;&nbsp;&nbsp;LISTA DE PREÇOS&nbsp;&nbsp;&nbsp;&nbsp;</span>"
                        + "<span>PG " + String.format("%03d", pagina) + "</span>"
                        + "</div><br>"
                        + "<table width='100%' style='border-collapse:collapse;'>"
                        + "<tr style='border-bottom:1px solid black;'>"
                        + "<th style='text-align:left; padding-right:20px;'>PRODUTO</th>"
                        + "<th style='text-align:center; padding-right:20px;'>UNIDADE</th>"
                        + "<th style='text-align:right;'>PREÇO</th>"
                        + "</tr>"
                        + "<tr><td colspan='3'><hr/></td></tr>"
                        + linhas.toString()
                        + "</table>"
                        + "</div>"
                        + "</html>",
                        "SEX ON THE BAR LTDA - Tela 1.4.1",
                        JOptionPane.PLAIN_MESSAGE
                    );
                }

                if (MENUREL == 2) {

                    // Dados simulados do balanço físico-financeiro
                    String[][] produtosBF = {
                        {"AXXXXXXXXXXXXXXXXXXXXXXXXX", "XXX", "000.009,99", "0009"},
                        {"BXXXXXXXXXXXXXXXXXXXXXXXXX", "XXX", "000.009,99", "0009"},
                        {"CXXXXXXXXXXXXXXXXXXXXXXXXX", "XXX", "000.009,99", "0009"},
                        {"DXXXXXXXXXXXXXXXXXXXXXXXXX", "XXX", "000.009,99", "0009"},
                        {"EXXXXXXXXXXXXXXXXXXXXXXXXX", "XXX", "000.009,99", "0009"}
                    };

                    java.time.LocalDate hojeBF = java.time.LocalDate.now();
                    String dataBF = String.format("%02d/%02d/%04d",
                        hojeBF.getDayOfMonth(), hojeBF.getMonthValue(), hojeBF.getYear());
                    int paginaBF = 1;

                    int totalItens = 0;
                    double valorTotalEstoque = 0;

                    StringBuilder linhasBF = new StringBuilder();
                    for (String[] p : produtosBF) {
                        double precoUnit = Double.parseDouble(
                            p[2].replace(".", "").replace(",", "."));
                        int qtde = 0;
                        try { qtde = Integer.parseInt(p[3]); } catch (NumberFormatException e) { qtde = 0; }
                        double precoTotal = precoUnit * qtde;
                        totalItens += qtde;
                        valorTotalEstoque += precoTotal;

                        String precoTotalFmt = String.format("%.2f", precoTotal)
                            .replace(".", "X").replace(",", ".").replace("X", ",");
                        linhasBF.append(
                            "<tr>"
                            + "<td style='padding-right:15px;'>" + p[0] + "</td>"
                            + "<td style='padding-right:15px; text-align:center;'>" + p[1] + "</td>"
                            + "<td style='padding-right:15px; text-align:right;'>" + p[2] + "</td>"
                            + "<td style='padding-right:15px; text-align:center;'>" + String.format("%04d", qtde) + "</td>"
                            + "<td style='text-align:right;'>" + precoTotalFmt + "</td>"
                            + "</tr>"
                        );
                    }

                    String totalItensFormatado = String.format("%04d", totalItens);
                    String valorTotalFormatado = String.format("%.2f", valorTotalEstoque)
                        .replace(".", "X").replace(",", ".").replace("X", ",");

                    JOptionPane.showMessageDialog(null,
                        "<html>"
                        + "<div style='font-family:monospace;'>"
                        + "<div style='text-align:center;'>"
                        + "SEX ON THE BAR LTDA<br>"
                        + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                        + "</div>"
                        + "<table width='100%'><tr>"
                        + "<td>" + dataBF + "</td>"
                        + "<td style='text-align:center;'>BALAN&Ccedil;O F&Iacute;SICO-FINANCEIRO</td>"
                        + "<td style='text-align:right;'>PG " + String.format("%03d", paginaBF) + "</td>"
                        + "</tr></table><br>"
                        + "<table width='100%' style='border-collapse:collapse;'>"
                        + "<tr>"
                        + "<th style='text-align:left; padding-right:15px;'>PRODUTO</th>"
                        + "<th style='text-align:center; padding-right:15px;'>UNIDADE</th>"
                        + "<th style='text-align:right; padding-right:15px;'>PRE&Ccedil;O UNIT&Aacute;RIO</th>"
                        + "<th style='text-align:center; padding-right:15px;'>QUANTIDADE</th>"
                        + "<th style='text-align:right;'>PRE&Ccedil;O TOTAL</th>"
                        + "</tr>"
                        + "<tr><td colspan='5'><hr/></td></tr>"
                        + linhasBF.toString()
                        + "<tr><td colspan='5'><br></td></tr>"
                        + "<tr><td colspan='5'>TOTAL DE &Iacute;TEN NO ESTOQUE : " + totalItensFormatado + "</td></tr>"
                        + "<tr><td colspan='5'>VALOR TOTAL DO ESTOQUE &nbsp;&nbsp;: " + valorTotalFormatado + "</td></tr>"
                        + "</table>"
                        + "</div>"
                        + "</html>",
                        "SEX ON THE BAR LTDA - Tela 1.4.2",
                        JOptionPane.PLAIN_MESSAGE
                    );
                }
            }
        }

        }
    }
