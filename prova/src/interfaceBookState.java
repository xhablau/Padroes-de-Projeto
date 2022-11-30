interface BookState {
    borrow(book: Book): void;
    return(book: Book): void;
    reserve(book: Book): void;
  }
