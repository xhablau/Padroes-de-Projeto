public class GumballMachineTestDrive {
    public static void main(String[] args){
        GumballMachine gumballMachine = new GumballMachine(5);
        
        System.out.println(gumballMachine);
        
        gumballMachine.insertQuarter();
        gumballMachine.turnCranck();
        
        System.out.println(gumballMachine);
        
        gumballMachine.insertQuarter();
        gumballMachine.turnCranck();
        gumballMachine.insertQuarter();
        gumballMachine.turnCranck();
        gumballMachine.ejectQuarter();
        
        System.out.println(gumballMachine);
        
        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCranck();
        gumballMachine.insertQuarter();
        gumballMachine.turnCranck();
        gumballMachine.insertQuarter();
        gumballMachine.turnCranck();
        
        System.out.println(gumballMachine);
    }
}
