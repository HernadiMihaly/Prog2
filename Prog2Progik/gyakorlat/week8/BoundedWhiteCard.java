class TwoD{
    int x,y;

    TwoD(int x, int y){
        this.x=x;
        this.y=y;
    }
}

class ThreeD extends TwoD{
    int z;

    ThreeD(int x, int y, int z){
        super(x,y);
        this.z= z;
    }
}

class FourD extends ThreeD{
    int t;

    FourD(int x, int y, int z, int t){
        super(x,y,z);
        this.t= t;
    }
}

class Coords<T extends TwoD>{
    T[] coords;

    Coords(T[] o){
        coords= o;
    }
}

class BoundedWildCard{
    static void showXY(Coords<?> c){
        System.out.println("X Y COORDS: ");
        for (int i=0; i<c.coords.length; i++){
            System.out.println(c.coords[i].x + " " + c.coords[i].y);
        }
    }

    static void showXYZ(Coords<? extends ThreeD> c){
        System.out.println("X Y Z COORDS: ");
        for (int i=0; i<c.coords.length; i++){
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z);
        }
    }

    static void showAll(Coords<? extends FourD> c){
        System.out.println("X Y Z T COORDS: ");
        for (int i=0; i<c.coords.length; i++){
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].t);
        }
    }

    public static void main(String args[]){
        TwoD td[] = {
            new TwoD(0,0),
            new TwoD(5,9),
            new TwoD(10,10),
            new TwoD(7,1),
            };

        Coords<TwoD> tdCoords = new Coords<TwoD>(td);

        showXY(tdCoords);
        //showXYZ(tdCoords); mivel TwoD osztályra specializálódott így nem működik

        FourD fd[] = {
            new FourD(0,0,0,0),
            new FourD(5,9,10,5),
            new FourD(10,10,6,7),
            new FourD(7,1,0,4),
            };

        Coords<FourD> fdCoords = new Coords<FourD>(fd);

        showXY(fdCoords);
        showXYZ(fdCoords);
        showAll(fdCoords);
        
    }
}









