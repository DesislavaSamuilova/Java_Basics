import java.util.Scanner;

public class FootballSouvenirs_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameTeam = scanner.nextLine();
        String typeSouvenirs = scanner.nextLine();
        int countBuySouvenirs = Integer.parseInt(scanner.nextLine());
        double flags = 0;
        double caps = 0;
        double posters = 0;
        double stickers = 0;
        if (nameTeam.equals("Argentina")) {
            if (typeSouvenirs.equals("flags")) {
                flags = 3.25;
                double allSum = countBuySouvenirs * flags;
                System.out.printf("Pepi bought %d %s of %s for %.2f lv.", countBuySouvenirs, typeSouvenirs, nameTeam, allSum);
            } else if (typeSouvenirs.equals("caps")) {
                caps = 7.20;
                double allSum = countBuySouvenirs * caps;
                System.out.printf("Pepi bought %d %s of %s for %.2f lv.", countBuySouvenirs, typeSouvenirs, nameTeam, allSum);
            } else if (typeSouvenirs.equals("posters")) {
                posters = 5.10;
                double allSum = countBuySouvenirs * posters;
                System.out.printf("Pepi bought %d %s of %s for %.2f lv.", countBuySouvenirs, typeSouvenirs, nameTeam, allSum);
            } else if (typeSouvenirs.equals("stickers")) {
                stickers = 1.25;
                double allSum = countBuySouvenirs * stickers;
                System.out.printf("Pepi bought %d %s of %s for %.2f lv.", countBuySouvenirs, typeSouvenirs, nameTeam, allSum);
            }
        } else if (nameTeam.equals("Brazil")) {
            if (typeSouvenirs.equals("flags")) {
                flags = 4.20;
                double allSum = countBuySouvenirs * flags;
                System.out.printf("Pepi bought %d %s of %s for %.2f lv.", countBuySouvenirs, typeSouvenirs, nameTeam, allSum);
            } else if (typeSouvenirs.equals("caps")) {
                caps = 8.50;
                double allSum = countBuySouvenirs * caps;
                System.out.printf("Pepi bought %d %s of %s for %.2f lv.", countBuySouvenirs, typeSouvenirs, nameTeam, allSum);
            } else if (typeSouvenirs.equals("posters")) {
                posters = 5.35;
                double allSum = countBuySouvenirs * posters;
                System.out.printf("Pepi bought %d %s of %s for %.2f lv.", countBuySouvenirs, typeSouvenirs, nameTeam, allSum);
            } else if (typeSouvenirs.equals("stickers")) {
                stickers = 1.20;
                double allSum = countBuySouvenirs * stickers;
                System.out.printf("Pepi bought %d %s of %s for %.2f lv.", countBuySouvenirs, typeSouvenirs, nameTeam, allSum);
            }

        } else if (nameTeam.equals("Croatia")) {
            if (typeSouvenirs.equals("flags")) {
                flags = 2.75;
                double allSum = countBuySouvenirs * flags;
                System.out.printf("Pepi bought %d %s of %s for %.2f lv.", countBuySouvenirs, typeSouvenirs, nameTeam, allSum);
            } else if (typeSouvenirs.equals("caps")) {
                caps = 6.90;
                double allSum = countBuySouvenirs * caps;
                System.out.printf("Pepi bought %d %s of %s for %.2f lv.", countBuySouvenirs, typeSouvenirs, nameTeam, allSum);
            } else if (typeSouvenirs.equals("posters")) {
                posters = 4.95;
                double allSum = countBuySouvenirs * posters;
                System.out.printf("Pepi bought %d %s of %s for %.2f lv.", countBuySouvenirs, typeSouvenirs, nameTeam, allSum);
            } else if (typeSouvenirs.equals("stickers")) {
                stickers = 1.10;
                double allSum = countBuySouvenirs * stickers;
                System.out.printf("Pepi bought %d %s of %s for %.2f lv.", countBuySouvenirs, typeSouvenirs, nameTeam, allSum);
            }
        } else if (nameTeam.equals("Denmark")) {
            if (typeSouvenirs.equals("flags")) {
                flags = 3.10;
                double allSum = countBuySouvenirs * flags;
                System.out.printf("Pepi bought %d %s of %s for %.2f lv.", countBuySouvenirs, typeSouvenirs, nameTeam, allSum);
            } else if (typeSouvenirs.equals("caps")) {
                caps = 6.50;
                double allSum = countBuySouvenirs * caps;
                System.out.printf("Pepi bought %d %s of %s for %.2f lv.", countBuySouvenirs, typeSouvenirs, nameTeam, allSum);
            } else if (typeSouvenirs.equals("posters")) {
                posters = 4.80;
                double allSum = countBuySouvenirs * posters;
                System.out.printf("Pepi bought %d %s of %s for %.2f lv.", countBuySouvenirs, typeSouvenirs, nameTeam, allSum);
            } else if (typeSouvenirs.equals("stickers")) {
                stickers = 0.90;
                double allSum = countBuySouvenirs * stickers;
                System.out.printf("Pepi bought %d %s of %s for %.2f lv.", countBuySouvenirs, typeSouvenirs, nameTeam, allSum);

            }
        }
        if (!nameTeam.equals("Argentina") && !nameTeam.equals("Brazil") && !nameTeam.equals("Croatia") && !nameTeam.equals("Denmark")) {
            System.out.printf("Invalid country!");
        } else if (!typeSouvenirs.equals("flags") && !typeSouvenirs.equals("caps") && !typeSouvenirs.equals("posters") && !typeSouvenirs.equals("stickers")) {
            System.out.printf("Invalid stock!");
        }
    }

}


