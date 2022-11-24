public class SoldState implements State {

    private Object gumballMachine;
    public void insertQuarter(){
        System.out.println("Please wait, we're already giving you a gumball");
    }
    
    public void ejectQuarter(){
        System.out.println("Sorry, you already turned the crank. ");
    }
    
    public void turnCrank(){
        System.out.println("Turning twice doesn't get you another gumball!");
    }
    
    public void dispense(){
        gumballMachine.realeseBall();
        
        if(gumballMachine.getCount() > 0){
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }else{
            System.out.println("Oops, out of gumballs!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
