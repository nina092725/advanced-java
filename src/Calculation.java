public class Calculation {
    public static int execute(int firstNum, String operator,int secondNum
    ) throws OperatorException{
        if(operator=="+"){
            return firstNum+secondNum;
        }else if(operator=="-"){
            return firstNum-secondNum;
        }else if(operator=="*"){
            return firstNum*secondNum;
        }else if(operator=="/"){
            return firstNum/secondNum;
        }else{
            throw new OperatorException("この演算子は使えません");
        }

    }

    




}
