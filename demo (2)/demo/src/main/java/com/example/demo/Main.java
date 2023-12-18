package com.example.demo;
import org.jfree.chart.JFreeChart;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            ManagingDatabase.createTable();
            List<DataModel> data = ReadingofExcel.readExcel("C:\\Users\\linga.nandhitha\\Downloads\\demo (2)\\demo\\src\\main\\resources\\Accolite_Data.xlsx");
            ManagingDatabase.insertData(data);
            ManagingDatabase.teamWiththeMaximumInterviews();
            ManagingDatabase.teamWiththeMinimumInterviews();
            ManagingDatabase.thetop3Skills();
            ManagingDatabase.thetop3Panels();
            ManagingDatabase.theskillsInPeakTime();
            JFreeChart chart = GenerationofCharts.createChart(data);
            GenerationofPdf.generatePdf(data, "C:\\Users\\linga.nandhitha\\Downloads\\demo (2)\\demo\\output.pdf");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}