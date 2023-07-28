
public class basic {
    public static void main(String arg[]) {

        // as now we have made a object and its fuction
        // now create a object

        Pen p1 = new Pen();
        p1.setcolor("blue");
        System.out.println(p1.color);

        p1.settip(10);
        System.out.print(p1.tip);

        // create a new bankaccout file
        Bankacc myacc = new Bankacc();

        myacc.username = "vanshaj";
        // myacc.pass="yoyo"; this will show error as we restricted
        // the password access to our class only by defining it as private

    }
}

class Bankacc {
    public String username;
    private String pass;

    void setname(String newname) {
        username = newname;
    }

    void setpass(String newpass) {
        pass = newpass;
    }
}

// we created a different class
class Pen {
    // define objects in it
    String color; // empty string
    int tip;

    // define there properties
    void setcolor(String newcolor) {
        color = newcolor; // color upade by this function
    }

    void settip(int tipsize) {
        tip = tipsize; // tip size update by calling this fuction
    }
}
