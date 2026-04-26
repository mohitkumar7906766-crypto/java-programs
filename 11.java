class DaysConvert {
    public static void main(String[] args) {
        int days = 400;

        int years = days / 365;
        int weeks = (days % 365) / 7;
        int remDays = (days % 365) % 7;

        System.out.println(years + " " + weeks + " " + remDays);
    }
}