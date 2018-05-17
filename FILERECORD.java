import java.util.GregorianCalendar;
public class FILERECORD
{
   String descrizione;
   int svolgimento;
   GregorianCalendar data_scadenza;
   GregorianCalendar data_svolgimento;
   
   public FILERECORD(String d){     //non finito solo la inizializzazione
      this.descrizione = d;
      this.svolgimento = 0;
      this.data_scadenza = new GregorianCalendar(); 
      this.data_svolgimento = new GregorianCalendar();
    }
   
   public void setDescrizione(String d){this.descrizione = d;}
   public void setSvolgimento(int sv){this.svolgimento = sv;}
   public void setDataScadenza(GregorianCalendar dt){this.data_scadenza = dt;}
   public void setDataSvolgimento(GregorianCalendat dt){this.data_svolgimento = dt;}
   
   public String getDescrizione(){return this.descrizione;}
   public int getSvolgimeto(){return this.svoglimento;}
   public GregorianCalendar getDataScadenza(){return this.data_scadenza;}
   public GregorianCalendar getDataSvolgimento(){return this.data_svolgimento;}
   
}
