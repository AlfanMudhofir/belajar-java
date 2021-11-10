public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager();
        manager.name = "Alfan";
        manager.sayHello("Joko");

        var vm = new ViceManager("Bambang");
        vm.sayHello("Toto");
    }
}
