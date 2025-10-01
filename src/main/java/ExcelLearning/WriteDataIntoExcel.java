package ExcelLearning;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteDataIntoExcel {
    public static void main(String[] args) throws IOException {
        //Here we define a file path in which we write the data
        String excelFilePath=System.getProperty("user.dir")+File.separator+
                ".\\src\\test\\resources\\MyExcel.xlsx";

        // File class object help to check the file is existed or not by the given path
        File createFile=new File(excelFilePath);
        //Here we are checking the parent directory is existed or not
        if(!createFile.getParentFile().exists()){ //If not
            //then we create
            createFile.mkdir();//make directory
        }
        // Workbook class help to create excel file by the given path
        Workbook createWorkbook=new XSSFWorkbook();
        //Sheet class help to create a sheet by given sheet name.
        Sheet createSheet =createWorkbook.createSheet("UserData");

        System.out.println("Please enter the data to save in the excel");
        //Now scanner class help to read the user inputted data from the console
        Scanner sc=new Scanner(System.in);
        //Here I declare the data String type variable which
        String data="";
        //Here we are defining how many row we want to create in a sheet
        for(int row=0; row<5; row++){
            //here we are creating a sheet as per the index
            Row createRow=createSheet.createRow(row);

            //Here we are defining how many column we want to create in a sheet
            for(int column=0; column<2; column++){
                //Cell class help to create a sheet as per the given column index
                Cell createCell=createRow.createCell(column);
                //now here we save the data given by the user in the console
                data=sc.nextLine();
                //here we set the data in the cell
                createCell.setCellValue(data);
            }
        }
        //File out stream help to get the data
        try(FileOutputStream fos=new FileOutputStream(createFile)){
            //Here we save/ write the user inputted data in to the Excel file with help FileOutputStream class
            createWorkbook.write(fos);
            //we are printing the data is created/ save or not in the file path
            System.out.println("File created at: "+createFile.getAbsoluteFile());// return the full file path

            //After writing a data we save the Excel
            createWorkbook.close();
            // close file
            fos.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
