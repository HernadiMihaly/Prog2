class Stats<T extends Number>{

    T[] numb;

    Stats(T[] o) {numb= o;}

    double average(){
        double sum= 0.0;

        for (int i=0; i<numb.length; i++){
            sum+=numb[i].doubleValue(); //double-re kasztolja, ez a Number ősosztály eleme ez a fvény
        }
        return sum/numb.length;
    }
    boolean isavg_equal(Stats<?> ob){
        if(average()==ob.average())
            return true;
        return false;
    }
}

class BoundDemo{
    public static void main(String args[]){

        Integer inums[]= {1 ,2 ,3 ,4, 5, 6};
        Stats<Integer> iStats = new Stats<Integer>(inums);
        double iAvg = iStats.average();
        System.out.println("iAVG: " + iAvg);

        Double dnums[]= {1.5 ,2.6 ,3.0 ,4.2, 5.1, 6.0};
        Stats<Double> dStats = new Stats<Double>(dnums);
        double dAvg = dStats.average();
        System.out.println("dAVG: " + dAvg);

        Float fnums[]= {1.5F ,2.6F ,3.0F ,4.2F, 5.1F, 6.0F};
        Stats<Float> fStats = new Stats<Float>(fnums);
        double fAvg = fStats.average();
        System.out.println("fAVG: " + fAvg);

        if (fStats.isavg_equal(dStats)){
            System.out.println("Averages are the same");
        }
        else{
            System.out.println("Averages are not the same");
        }
        
    }
}