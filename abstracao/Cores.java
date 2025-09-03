    package abstracao;

    public enum Cores {

        AZUL (10),
        VERMELHO (20),
        VERDE (30),
        ROSA (40);

        private int i;

        public int getI() {
            return i;
        }
        Cores(int i) {
            this.i = i;
        }
    }
