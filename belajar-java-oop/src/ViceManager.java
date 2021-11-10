//Membuat inheritance pada satu class, sehingga tidak perlu memasukkan field yang sama dengan parentnya
class ViceManager extends Manager {
    ViceManager(String name) {
        //Memanggil super constructor yang ada di parentnya, bisa salah satu contructor saja
        super(name);
    }

    //Melakukan method overriding (Mendeklarasikan ulang dari method parentnya)
    void sayHello(String name){
        System.out.println("Hi "+ name +", My Name is "+ this.name + " and I'm a Vice Manager");
    }
}