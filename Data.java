public class Data {
    int dia;
    int mes;
    int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public boolean validaData(){ // Verificar se a data é válida
        if(ano >= 0){ // Anos inteiros positivos
            if((mes >= 1) && (mes <=12)) // Meses: 1 - Janeiro até 12 - Dezembro
                if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){ // Meses com 31 dias
                    if(dia >= 1 && dia <= 31)
                        return true;
                    else
                        return false;
                }
            else if(mes == 4 || mes == 6 || mes == 9 || mes == 11){ // Meses com 30 dias
                if(dia >= 1 && dia <= 30)
                    return true;
                else
                    return false;
            }
            else{ // Mês de fevereiro
                if((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))){ // Ano bissexto = Fev 29 dias
                    if(dia >= 1 && dia <= 29)
                        return true;
                    else
                        return false;
                }
                else{ // Ano não bissexto = Fev 28 dias
                    if(dia >= 1 && dia <= 28)
                        return true;
                    else
                        return false;
                }
            } 
        }
        else
            return false;
        return true;
    }
    public void mostrarData(){
        if(validaData())
            System.out.println(this.dia+"/"+this.mes+"/"+this.ano);
        else
            System.out.println("Data não é válida.");
    }

    // Demonstração
    
    public static void main(String[] args) {
        Data data1 = new Data(29,2,2018);
        
        data1.validaData();
        data1.mostrarData();
        
        Data data2 = new Data(29,2,2016);
        
        data2.validaData();
        data2.mostrarData();
    } 
}