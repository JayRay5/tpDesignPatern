package mediatheque;

public class CDPrinter implements ItemVisitor {

    @Override
    public void visit(Book i) {
        
    }

    @Override
    public void visit(CD i) {
        System.out.println(i.toString());
       
    }
    
}
