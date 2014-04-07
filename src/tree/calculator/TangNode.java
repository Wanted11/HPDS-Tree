package tree.calculator;

import tree.Value;
import tree.operator.UnaryNode;

/**
 *
 * @author Aeros
 */
public class TangNode extends UnaryNode{

    public TangNode(Value node) {
        super(node);
    }
 
    @Override
    public Value evaluate(){
        return null;
    }
    
}
