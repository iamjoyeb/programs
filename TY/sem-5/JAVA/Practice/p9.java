class p9 {
    p9() {
        System.out.println("Default Constructor");
    }

    p9(int a) {
        System.out.println("Parameterized Constructor=" + a);
    }

    public static void main(String args[]) {
        new p9();
        new p9(200);
    }
}