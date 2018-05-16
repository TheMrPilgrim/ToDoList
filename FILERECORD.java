public class FILERECORD
{
   char descrizione;
   short svolgimento;
   short giorno_scadenza;
   short mese_scadenza;
   short anno_scadenza;
   short giorno_completamento;
   short mese_completamento;
   short anno_completamento;
   
   public FILERECORD(){
    }
   
   public void setsvolgimento(short svolgimento){
   this.svolgimento=svolgimento;
   }
   
   public short getsvolgimento(){
   return svolgimento; 
   }
    
   public void setgiorno_scadenza(short giorno_scadenza){
   this.giorno_scadenza=giorno_scadenza;
   }

   public short getgiorno_scadenza(){
   return giorno_scadenza; 
    } 
    
    
   public void setmese_scadenza(short mese_scadenza){
   this.mese_scadenza=mese_scadenza;
   }
   
   public short getmese_scadenza(){
   return mese_scadenza; 
    } 
    
    
   public void anno_scadenza(short anno_scadenza){
   this.anno_scadenza=anno_scadenza;
   }
   
   public short getanno_scadenza(){
   return anno_scadenza; 
    } 
    
    
}
