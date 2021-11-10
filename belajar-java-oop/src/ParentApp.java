public class ParentApp {
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "Alfan";
        child.doIt();
        System.out.println(child.name);

        //Konversi dari child ke parent
        Parent parent = (Parent) child;
        parent.doIt();
        //Pada bagian ini akan terjadi variable hiding karena nama yang sama dengan class berbeda, sehingga name yang
        //diakses bukan yang ada di child melainkan yang ada di parent
        System.out.println(parent.name);
    }
}
