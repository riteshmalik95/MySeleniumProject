package ExcelLearning;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.IOException;

public class ReadExcelData {
    public static void main(String[] args) throws IOException, InvalidFormatException {
        String excelFilePath=System.getProperty("user.dir")+ File.separator+
                ".\\src\\test\\resources\\MyExcel.xlsx";

        File getExcelFile=new File(excelFilePath);
        if(getExcelFile.exists()){
            Workbook openWorkbook=new XSSFWorkbook(getExcelFile);
            Sheet openSheet=openWorkbook.getSheet("UserData");
            int rowNo=openSheet.getPhysicalNumberOfRows();
            for(int i=0; i<rowNo; i++){
                Row getRow=openSheet.getRow(i);
                for(int j=0; j<getRow.getPhysicalNumberOfCells(); j++){
                    Cell getCell=getRow.getCell(j);
                    System.out.println(getCell.toString());
                }
            }
        }else{
            System.err.println("File is not found "+getExcelFile.getAbsoluteFile());
        }

    }
}
