class AvailableState implements BookState {
    public borrow(book: Book): void {
        book.setState(new BorrowedState());
        console.log("Book borrowed!");
    }    
    
    public return(book: Book): void {
        throw new Error('Book is not borrowed or reserved.');
    }
    public reserve(book: Book): void {
        book.setState(new ReservedState());
        console.log("Book reserved!");
    }  
}