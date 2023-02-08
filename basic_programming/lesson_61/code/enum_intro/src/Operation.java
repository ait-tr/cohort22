public enum Operation {
    SUM{
        @Override
        public double action(double x, double y){   // реализация один
            return x+y;
        }
    },SUBTRACTION{
        @Override
        public double action(double x, double y){   // реализация два
            return x-y;
        }
    };
    public abstract double action(double x, double y); //указываем абстрактный метод
}
