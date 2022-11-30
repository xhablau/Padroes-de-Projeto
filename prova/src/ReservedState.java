class ReservedState implements BookState {
    public borrow(book: Book): void {
        throw new Error('Book is currently reserved.');
    }    
    
    public return(book: Book): void {
        book.setState(new AvailableState());
        console.log("Book returned!");
    }
    public reserve(book: Book): void {
        throw new Error('Book is already reserved.');
    }  
}