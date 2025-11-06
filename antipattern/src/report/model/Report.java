import java.util.Map;

class Report {

    String title ; 
    Map<String,String> infos = new HashMap<String,String>();

    public Report(
        String title , 
        Map<String,String> infos
    ){
        this.title = title ; 
        this.infos = infos ; 

    }

}