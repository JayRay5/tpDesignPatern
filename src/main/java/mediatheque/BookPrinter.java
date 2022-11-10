package mediatheque;

public class BookPrinter implements ItemVisitor {

    @Override
    public void visit(Book i) {
       System.out.println(i.toString());
    }

    @Override
    public void visit(CD i) {
        
    }
    
    

}
