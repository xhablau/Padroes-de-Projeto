class BorrowedState implements BookState {
    public borrow(book: Book): void {
        throw new Error('Book is not available to borrow.');
    }    
    
    public return(book: Book): void {
        book.setState(new AvailableState());
        console.log("Book returned!");
    }
    public reserve(book: Book): void {
        throw new Error('Book is not available to reserve.');
    }  
}