package com.paa.vertexcover;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel; 
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset; 
import org.jfree.ui.ApplicationFrame; 
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.ui.TextAnchor;

public class Chart extends ApplicationFrame {

    final DefaultCategoryDataset dataset = new DefaultCategoryDataset( );  
   
    public Chart( String applicationTitle , String chartTitle ) {
       super( applicationTitle );        
       JFreeChart barChart = ChartFactory.createBarChart(
          chartTitle,           
          "Grafos",            
          "Tempo (ms)",            
          dataset,         
          PlotOrientation.VERTICAL,           
          true, true, false);
          
       ChartPanel chartPanel = new ChartPanel( barChart );        
       chartPanel.setPreferredSize(new java.awt.Dimension( 560 , 367 ) );        
       setContentPane( chartPanel );

       CategoryItemRenderer renderer = ((CategoryPlot)barChart.getPlot()).getRenderer();
       renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
       renderer.setBaseItemLabelsVisible(true);
       ItemLabelPosition position = new ItemLabelPosition(ItemLabelAnchor.OUTSIDE12, 
            TextAnchor.TOP_CENTER);
       renderer.setBasePositiveItemLabelPosition(position); 
       
    }
    
    public void addValueToDataset(long value, String numNodes) {
        dataset.addValue(value, numNodes, "");
    }
 }