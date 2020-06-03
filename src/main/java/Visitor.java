public class Visitor extends PseudoAssemblerBaseVisitor<Integer> {


    private MyStack stack;
    private Register register;

    public Visitor(MyStack stack, Register register) {
        this.stack = stack;
        this.register = register;
    }

    @Override
    public Integer visitRule_set(PseudoAssemblerParser.Rule_setContext ctx) {
        return visit(ctx.single_rule());
    }

    @Override
    public Integer visitMovxorexpr(PseudoAssemblerParser.MovxorexprContext ctx) {

        Integer left = visit(ctx.multiarg().arthmeticexpr());
        String id = ctx.multiarg().REG().getText();
        String cos = ctx.multiarg().arthmeticexpr().getRuleContext().getText();
        System.out.println(cos);
        Integer result = 0;
        if(ctx.MOV() != null){
            result = Instruction.movInst(id, left, register);
            return result;
        }
        if(ctx.XOR() != null) {
            result = Instruction.xorInst(id, left, register);
            return result;
        }
        return -1;
    }



    @Override
    public Integer visitMultiarg(PseudoAssemblerParser.MultiargContext ctx) {
        return super.visitMultiarg(ctx);
    }



    @Override
    public Integer visitPushexpr(PseudoAssemblerParser.PushexprContext ctx) {
        return visit(ctx.singlearg());
    }

    @Override
    public Integer visitIntrule(PseudoAssemblerParser.IntruleContext ctx) {
        return visit(ctx.intexpr());
    }



    @Override
    public Integer visitSinglearg(PseudoAssemblerParser.SingleargContext ctx) {

        Integer res = visit(ctx.arthmeticexpr());
        stack.pushItem(res);
        return res;
    }

    @Override
    public Integer visitIntexpr(PseudoAssemblerParser.IntexprContext ctx) {
        stack.popAndPeek();
        return 0;
    }

    @Override
    public Integer visitDigexpr(PseudoAssemblerParser.DigexprContext ctx) {
        return Integer.parseInt(ctx.DIG().getText());
    }

    @Override
    public Integer visitRegexpr(PseudoAssemblerParser.RegexprContext ctx) {
        String id = ctx.REG().getText();
        Integer res = Instruction.getRegValue(id,register);
        return res;
    }

    @Override
    public Integer visitMultexpr(PseudoAssemblerParser.MultexprContext ctx) {
        Integer left = visit(ctx.arthmeticexpr(0));
        Integer right = visit(ctx.arthmeticexpr(1));
        Integer res = Instruction.multiplyInst(left, right);
        return res;
    }

    @Override
    public Integer visitAddsubexpr(PseudoAssemblerParser.AddsubexprContext ctx) {
        Integer left = visit(ctx.arthmeticexpr(0));
        Integer right = visit(ctx.arthmeticexpr(1));
        Boolean isAdd = false;
            if (ctx.ADD() != null) {
                isAdd = true;
            }
            if (ctx.SUB() != null) {
                isAdd = false;
            }
            Integer res = Instruction.addSubInst(left,right,isAdd);

        return res;
    }

    @Override
    public Integer visitParenexpr(PseudoAssemblerParser.ParenexprContext ctx) {
        return visit(ctx.arthmeticexpr());
    }
}
