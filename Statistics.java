package numbertricks;

import java.util.Arrays;

public class Statistics {
  
  public Statistics()
  {
    super();
  }
  
  public static String go(String input)
  {
    Statistics program = new Statistics();
    StringBuffer statsubout = new StringBuffer();
    
    String[] stringvalues = input.split(",");
    int svsize = stringvalues.length;
    double[] values = new double[svsize];
    
    for (int i=0;i<svsize;i++)
    {
      values[i] = Double.parseDouble(stringvalues[i]);
    }
    
    Arrays.sort(values);
    
    String basic = program.getbasic(values,svsize);
    String disp = program.getdisp(values,svsize);
    
    statsubout.append(basic + "\n");
    statsubout.append(disp + "\n");
    String statsoutput = statsubout.toString();
    return statsoutput;
  }
  
  private String getbasic(double[] input, int samplesize)
  {
    int i = 0, middle = samplesize/2;
    StringBuffer basicbuffer = new StringBuffer();
    double sum = 0, mean = 0, med = 0, max = 0, range = 0;
    
    // Find the mean
    for(i=0;i<input.length;i++)
    {
      sum += input[i];
    }
    
    mean = sum / input.length;
    
    // Find the mode
    max = input[samplesize-1];
    
    // Find the median
    if (samplesize % 2 == 0)
    {
        med = (input[middle] + input[middle+1]) / 2;
    }
    else
    {
        med = input[middle];
    }
    
    // Find the range
    range = (input[samplesize-1] - input[0]);
    
    basicbuffer.append("Basic statistics for sample:");
    basicbuffer.append("\nMean: " + mean + "\nMode: " + max);
    basicbuffer.append("\nMedian: " + med + "\nRange: " + range);
    
    String basicout = basicbuffer.toString();
    return basicout;
  }
  
  private String getdisp(double[] values, int samplesize)
  {
    int i=0;
    double sum=0,mean=0,sqtotal=0,var=0,std=0;
    double[] var1 = new double[samplesize];
    StringBuffer dispbuffer = new StringBuffer();
    
    // Find the variance and standard deviation
    for(i=0;i<samplesize;i++)
    {
      sum += values[i];
    }
    
    mean = sum / values.length;
    
    for (i=0;i<samplesize;i++)
    {
      var1[i] = Math.pow((values[i]-mean),2);
      sqtotal += var1[i];
    }
    
    var = sqtotal/samplesize;
    std = Math.sqrt(var);
    
    // Find skewness
    double skew = (mean-values[samplesize-1])/std;
    
    dispbuffer.append("\nDispersion for sample:\n");
    dispbuffer.append("Variance: " + var + "\nStandard Deviation: " + std);
    dispbuffer.append("\nSkewness: " + skew);
    
    String dispout = dispbuffer.toString();
    return dispout;
  }
  
}
