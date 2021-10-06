/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blood-donation-status;
import java.util.Arrays;
import org.neuroph.core.NeuralNetwork;
import org.neuroph.core.data.DataSet;
import org.neuroph.core.data.DataSetRow;
import org.neuroph.nnet.MultiLayerPerceptron;
import org.neuroph.nnet.learning.MomentumBackpropagation;
import org.neuroph.util.TransferFunctionType;
import org.neuroph.util.data.norm.MaxMinNormalizer;

/**
 *
 * @author caglaoksuz
 */
public class YSA {
  
    
    MomentumBackpropagation bp;
    private final int epoch;
    private final int interlayerNeuronCount;
    private final int inputsCount = 3;
    private final int outputsCount = 1;
    private final DataSet trainingSet;
    private final DataSet testingSet;

    
    public YSA(int interlayerNeuronCount, double momentum, double lambda, double minError, int epoch){
        this.epoch = epoch;
        this.interlayerNeuronCount = interlayerNeuronCount;
        
        bp = new MomentumBackpropagation();
        bp.setMomentum(momentum);
        bp.setLearningRate(lambda);
        bp.setMaxError(minError);
        bp.setMaxIterations(1);
        
          DataSet dataSet = DataSet.createFromFile("Blood.txt", 
                   inputsCount, outputsCount, ";", false);  
          
     
           
          MaxMinNormalizer norm =new MaxMinNormalizer(dataSet);
          norm.normalize(dataSet);
        dataSet.shuffle();
        
        DataSet[] subSets = dataSet.split(0.70, 0.30);
         trainingSet = subSets[0];
         testingSet = subSets[1];
    }
    
    public void Train() {
        MultiLayerPerceptron neuralNetwork = new MultiLayerPerceptron(TransferFunctionType.SIGMOID, 3, interlayerNeuronCount, 1);
        neuralNetwork.setLearningRule(bp);
        neuralNetwork.learn(trainingSet);
        for(int i=0; i<this.epoch; i++){
            neuralNetwork.learn(trainingSet);
            
            double a =neuralNetwork.getLearningRule().getPreviousEpochError();
            // System.out.println(a);
       
        }     
        double b=neuralNetwork.getLearningRule().getPreviousEpochError();
              neuralNetwork.save("ag.nnet");
              System.out.println(b);
             System.out.println("Egitim tamamlandi");
    }
    
    // Displays inputs, desired output (from dataset) and actual output (calculated by neural network) for every row from data set.
    public double test(){
        NeuralNetwork sinirselAg = NeuralNetwork.createFromFile("ag.nnet");
        double toplamHata = 0;
        for (DataSetRow test_row : testingSet) {
            sinirselAg.setInput(test_row.getInput());
            sinirselAg.calculate();
          //  double[] networkOutput = sinirselAg.getOutput();
                toplamHata += mape(test_row.getDesiredOutput(), sinirselAg.getOutput());
        //   System.out.println("Input: " + Arrays.toString(test_row.getInput()));
         //  System.out.println("Output: " + Arrays.toString(networkOutput));
        //    System.out.println("Desired output" + Arrays.toString(test_row.getDesiredOutput()));
           
            }   
        return toplamHata*100 / testingSet.size();
    }

    
    double mape(double[] beklenen , double[] cikti){

        double satirHata = 0;
        
            satirHata += Math.abs((beklenen[0] - cikti[0])/1);
        
        return satirHata;
    }
  public String tekTest(double[] inputs){     
        DataSet dataSetinput = DataSet.createFromFile("Blood.txt", 
                   inputsCount, outputsCount, ";", false);  
        DataSet tekTest = new DataSet(inputsCount);
        tekTest.addRow(inputs);
        MaxMinNormalizer norm =new MaxMinNormalizer(dataSetinput);
        norm.normalize(tekTest);
       
        NeuralNetwork sinirselAg = new NeuralNetwork().createFromFile("ag.nnet");
        sinirselAg.setInput(inputs);
        sinirselAg.calculate();
      //  double sonuc[] = sinirselAg.getOutput();
      
        return sonuc(sinirselAg.getOutput());
    }
  
  public String sonuc(double[] outputs){
        int indeks = 0;
        
        if(outputs[0] <= 0.5)
        {
            outputs[0]=0;   
            indeks = 0;
        }  //verir vermez
       
        if(outputs[0] >= 0.5)
        {
            
            outputs[0]=1;  
            indeks = 1;
        }
        if(indeks == 0) return "Kan Vermez";
        if(indeks == 1) return "Kan Verir";
        return "";
                
    }
}

