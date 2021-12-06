import java.io.*;

class ShowFile2{
    public static void main(String args[]){
        int i;
        try{
        if (args.length!=2){
            //System.out.println("A helyes forma: fajl Input_fajl Output_fajl");
            throw new Exception("A helyes forma: fajl Input_fajl Output_fajl");
            //return;
        }
        }
        catch(Exception e){
        	System.out.println(e);
        	return;
        }

            try(
                FileInputStream fi = new FileInputStream(args[0]);
                FileOutputStream fo = new FileOutputStream(args[1]) )
                {
                    
                    do{
                    i=fi.read();
                    if (i!=-1) fo.write(i);
                    }
                    while (i!=-1);

                }      
                catch(FileNotFoundException e){
                System.out.println("Nem található a fájl"+ e);
                }
            catch(IOException e){
                System.out.println("Input/Output exception"+ e);
            }
        }
}
