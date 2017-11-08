
class MaxTemperature {
   
    public static void main (String[] args){
       
        int[] temperatureElements = {23,55,67,22,40,65,44,20};
        System.out.println(maximumTemperature(temperatureElements));
    }
   
  //Maximum temperature raise (Not necessarily consecutive)  
    public static int maximumTemperature(int[] temperatures) {
    	int min_temp= temperatures[0];
        int maxTemperature = 0;
        for (int i = 1; i <temperatures.length; i++) {
			if((temperatures[i] - min_temp)> maxTemperature)
				maxTemperature=temperatures[i] - min_temp;
			if(temperatures[i] < min_temp)
				min_temp=temperatures[i];
		}
        return maxTemperature;
    }

}
