class Main {
    public static void main(String[] args) {
        int numarIntreg = 10;
        float numarFloat = 3.14f;

        System.out.println("Valoarea variabilei de tip int: " + numarIntreg);
        System.out.println("Adresa variabilei de tip int: " + System.identityHashCode(numarIntreg));
        System.out.println("Dimensiunea variabilei de tip int (în octeți): " + Integer.SIZE/8);

        System.out.println();

        System.out.println("Valoarea variabilei de tip float: " + numarFloat);
        System.out.println("Adresa variabilei de tip float: " + System.identityHashCode(numarFloat));
        System.out.println("Dimensiunea variabilei de tip float (în octeți): " + Float.SIZE/8);
    }
}