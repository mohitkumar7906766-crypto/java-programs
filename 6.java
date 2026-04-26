class Interest {
    public static void main(String[] args) {
        double p = 1000, r = 5, t = 2;

        double si = (p * r * t) / 100;
        double ci = p * Math.pow((1 + r/100), t) - p;

        System.out.println("SI: " + si);
        System.out.println("CI: " + ci);
    }
}