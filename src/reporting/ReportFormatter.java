package reporting;

/**
 * Created by Gürkan on 25.4.2015.
 */
public class ReportFormatter {

    String formattedOutput;

    public ReportFormatter(Object object,FormatType formatType){
        switch (formatType){
            case XML: formattedOutput = convertObjectToXML(object); break;
            case CSV: formattedOutput = converObjectToCSV(object); break;

        }
    }

    private String convertObjectToXML(Object object){
        return "XML : <title>"+object.toString()+"</title>";
    }

    private String converObjectToCSV(Object object){
        return "CSV : ,,, "+object.toString()+",,,";
    }


    public String getFormattedValue(){
        return formattedOutput;
    }
}
