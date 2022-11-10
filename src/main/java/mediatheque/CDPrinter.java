package mediatheque;

public class CDPrinter implements ItemVisitor {

    @Override
    public void visit(Book i) {
        System.out.println(i.toString());
    }

    @Override
    public void visit(CD i) {
       i.toString();
       
    }
    
}
