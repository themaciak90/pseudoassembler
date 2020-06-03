public class Instruction {

    public static Integer addSubInst(Integer left, Integer right, Boolean isAdd){
        Integer result = 0;
        if(left == null || right == null)
            return null;
        if(isAdd)
            result = left + right;
        else
            result = left - right;

        return result;
    }

    public static Integer multiplyInst(Integer left, Integer right){
        Integer result = 0;
        if(left == null || right == null){
            return null;
        }
        result = left * right;

        return result;
    }

    public static Integer getRegValue(String id, Register register){
        Integer result = 0;
        if ("%eax".equals(id)) {
            result = register.getEax();
        } else if ("%ebx".equals(id)) {
            result = register.getEbx();
        } else if ("%ecx".equals(id)) {
            result = register.getEcx();
        } else if ("%edx".equals(id)) {
            result = register.getEdx();
        }
        return result;
    }

    public static Integer movInst(String id, Integer toMove, Register register){
        if ("%eax".equals(id)) {
            register.setEax(toMove);
            return register.getEax();
        } else if ("%ebx".equals(id)) {
            register.setEbx(toMove);
            return register.getEbx();
        } else if ("%ecx".equals(id)) {
            register.setEcx(toMove);
            return register.getEcx();
        } else if ("%edx".equals(id)) {
            register.setEdx(toMove);
            return register.getEdx();
        }

        return -1;
    }

    public static Integer xorInst(String id, Integer toXor, Register register){
        if ("%eax".equals(id)) {
            if(register.getEax() == null && toXor == null)
                register.setEax(0);
            else
                register.setEax(toXor ^ register.getEax());
            return register.getEax();
        } else if ("%ebx".equals(id)) {
            if(register.getEbx() == null && toXor == null)
                register.setEbx(0);
            else
                register.setEbx(toXor ^ register.getEbx());
            return register.getEbx();
        } else if ("%ecx".equals(id)) {
            if(register.getEcx() == null && toXor == null)
                register.setEcx(0);
            else
                register.setEcx(toXor ^ register.getEcx());
            return register.getEcx();
        } else if ("%edx".equals(id)) {
            if(register.getEdx() == null && toXor == null)
                register.setEdx(0);
            else
                register.setEdx(toXor ^ register.getEdx());
            return register.getEdx();
        }
        return -1;
    }
}
