public class Girl {
    String name;
    Double promile = 0.0;         // уровень алкоголя опьянение
    Boolean hasMakeup;      // хороший макияж
    Boolean hasPrettyDress; // красивое платье
    public Girl(String name){
        this.name = name;
        hasPrettyDress = false;
        hasMakeup = false;
    }
    public void drink(){
        promile += 0.2;
    }
    public void makeUp(){
        hasMakeup = true;
    }
    public void dressBeautifully(){
        hasPrettyDress = true;
    }
    public void haveFun() throws FridayNightException {
        //с опьянением > 1 + платье + макияж = хорошо проведенное время
        //а в противном случае - мы хотим выбросить Exception
        if(promile>1 && hasMakeup && hasPrettyDress){
            System.out.println("Hehehey, uhhuhah!");
        } else {
            throw new FridayNightException(
                    "Ошибка, потому что " + promile + " " + hasMakeup + " " + hasPrettyDress
            );
        }

    }
    public void friday(){
        try {
            haveFun();
        } catch (FridayNightException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", promile=" + promile +
                ", hasMakeup=" + hasMakeup +
                ", hasPrettyDress=" + hasPrettyDress +
                '}';
    }
}
