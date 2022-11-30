public class Book {
  
    private state: BookState;
    
    constructor(state: BookState) {
      this.state = state;
    }
    
    public setState(bookState: BookState): void {
        this.state = bookState;
    }
    
    public borrow(): void {
      this.state.borrow(this);
    }
    
    public return(): void {
      this.state.return(this);
    }
    
    public reserve(): void {
      this.state.reserve(this);
    }
  }