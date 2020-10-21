package MrAndMs;

class Greetings {
    private String welcomeLady = "Szanowna Pani ";
    private String welcomeGentleman = "Szanowny Panie ";
    private String welcomeUserMale = "Droga użytkowniczko ";
    private String welcomeUserFemale = "Drogi użytkowniku ";


    private String welcome2Mr = "Pana ";
    private String welcome2Ms = "Panią ";
    private String welcome2You = "Cię ";

    private String welcome3LadyAndGentleman = "kieliszkiem szampana ";
    private String welcome3Underage = "kubkiem gorącej czekolady ";
    private String welcome3OnlyOld = "I zapraszamy do gry w Bingo ";

    private String goodbyeUnderage = "do zobaczenia ";
    private String goodbyeMr = "Czekamy na Pana";
    private String goodbyeMs = "Czekamy na Panią";
    private String goodbyeOld = "Z wyrazami szacunku ";

    public String getWelcomeLady() {
        return welcomeLady;
    }

    public void setWelcomeLady(String welcomeLady) {
        this.welcomeLady = welcomeLady;
    }

    public String getWelcomeGentleman() {
        return welcomeGentleman;
    }

    public void setWelcomeGentleman(String welcomeGentleman) {
        this.welcomeGentleman = welcomeGentleman;
    }

    public String getWelcomeUserMale() {
        return welcomeUserMale;
    }

    public void setWelcomeUserMale(String welcomeUserMale) {
        this.welcomeUserMale = welcomeUserMale;
    }

    public String getWelcomeUserFemale() {
        return welcomeUserFemale;
    }

    public void setWelcomeUserFemale(String welcomeUserFemale) {
        this.welcomeUserFemale = welcomeUserFemale;
    }

    public String getWelcome2Mr() {
        return welcome2Mr;
    }

    public void setWelcome2Mr(String welcome2Mr) {
        this.welcome2Mr = welcome2Mr;
    }

    public String getWelcome2Ms() {
        return welcome2Ms;
    }

    public void setWelcome2Ms(String welcome2Ms) {
        this.welcome2Ms = welcome2Ms;
    }

    public String getWelcome2You() {
        return welcome2You;
    }

    public void setWelcome2You(String welcome2You) {
        this.welcome2You = welcome2You;
    }

    public String getWelcome3LadyAndGentleman() {
        return welcome3LadyAndGentleman;
    }

    public void setWelcome3LadyAndGentleman(String welcome3LadyAndGentleman) {
        this.welcome3LadyAndGentleman = welcome3LadyAndGentleman;
    }

    public String getWelcome3Underage() {
        return welcome3Underage;
    }

    public void setWelcome3Underage(String welcome3Underage) {
        this.welcome3Underage = welcome3Underage;
    }

    public String getWelcome3OnlyOld() {
        return welcome3OnlyOld;
    }

    public void setWelcome3OnlyOld(String welcome3OnlyOld) {
        this.welcome3OnlyOld = welcome3OnlyOld;
    }

    public String getGoodbyeUnderage() {
        return goodbyeUnderage;
    }

    public void setGoodbyeUnderage(String goodbyeUnderage) {
        this.goodbyeUnderage = goodbyeUnderage;
    }

    public String getGoodbyeMr() {
        return goodbyeMr;
    }

    public void setGoodbyeMr(String goodbyeMr) {
        this.goodbyeMr = goodbyeMr;
    }

    public String getGoodbyeMs() {
        return goodbyeMs;
    }

    public void setGoodbyeMs(String goodbyeMs) {
        this.goodbyeMs = goodbyeMs;
    }

    public String getGoodbyeOld() {
        return goodbyeOld;
    }

    public void setGoodbyeOld(String goodbyeOld) {
        this.goodbyeOld = goodbyeOld;
    }

    public String createGreeting(Person person) {
        if (person.isFemale() == true) {
            if (person.getAge() < 18) {
                return "Droga Użytkowniczko\n" +
                        "Zapraszamy Cię serdecznie na otwarcie naszego sklepu!\n" +
                        "Powitamy Cię kubkiem gorącej czekolady.\n" +
                        "do zobaczenia";
            } else if (person.getAge() >= 18 && person.getAge() <= 60) {
                return "Szanowna Pani\n" +
                        "Zapraszamy Panią serdecznie na otwarcie naszego sklepu!\n" +
                        "Powitamy Panią kieliszkiem szampana.\n" +
                        "czekamy na Panią";
            } else {
                return "Szanowna Pani\n" +
                        "Zapraszamy Panią serdecznie na otwarcie naszego sklepu!\n" +
                        "Powitamy Panią kieliszkiem szampana. " +
                        "I zapraszamy do gry w bingo\n" +
                        "z wyrazami szacunku";
            }
        } else {
            if (person.getAge() < 18) {
                return "Drogi Użytkowniku\n" +
                        "Zapraszamy Cię serdecznie na otwarcie naszego sklepu!\n" +
                        "Powitamy Cię kubkiem gorącej czekolady.\n" +
                        "do zobaczenia";
            } else if (person.getAge() >= 18 && person.getAge() <= 60) {
                return "Szanowny Panie\n" +
                        "Zapraszamy Pana serdecznie na otwarcie naszego sklepu!\n" +
                        "Powitamy Pana kieliszkiem szampana.\n" +
                        "czekamy na Pana";
            } else {
                return "Szanowne Panie\n" +
                        "Zapraszamy Pana serdecznie na otwarcie naszego sklepu!\n" +
                        "Powitamy Pana kieliszkiem szampana. " +
                        "I zapraszamy do gry w bingo\n" +
                        "z wyrazami szacunku";
            }


        }

//    public String getGreeting1(String )

    }
}