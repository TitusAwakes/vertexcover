package com.paa.vertexcover;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel; 
import org.jfree.chart.JFreeChart; 
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset; 
import org.jfree.data.category.DefaultCategoryDataset; 
import org.jfree.ui.ApplicationFrame; 
import org.jfree.ui.RefineryUtilities;

public class Chart extends ApplicationFrame {

    final DefaultCategoryDataset dataset = new DefaultCategoryDataset( );  
   
    public Chart( String applicationTitle , String chartTitle ) {
       super( applicationTitle );        
       JFreeChart barChart = ChartFactory.createBarChart(
          chartTitle,           
          "Num Nós",            
          "Grafos",            
          dataset,         
          PlotOrientation.VERTICAL,           
          true, true, false);
          
       ChartPanel chartPanel = new ChartPanel( barChart );        
       chartPanel.setPreferredSize(new java.awt.Dimension( 560 , 367 ) );        
       setContentPane( chartPanel ); 
    }
    
    public void addValueToDataset(long value, String numNodes) {
        dataset.addValue(value, numNodes, "");
    }
 }