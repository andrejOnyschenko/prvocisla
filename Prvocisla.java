class Prvocisla {
    public static void main(String[] args) {

        for(int cislo = 1; cislo <= 100; cislo++) {
            int vypocet = 0;
            for(int limit = 1; limit <= cislo; limit++) {
                if(cislo%limit==0) vypocet++;

            }
            if(vypocet == 2) {
                System.out.println(cislo);

            }
        }
    }
}