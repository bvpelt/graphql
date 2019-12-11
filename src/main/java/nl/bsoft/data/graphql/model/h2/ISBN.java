package nl.bsoft.data.graphql.model.h2;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.Transient;

@Slf4j
@Getter
public class ISBN {


    private final String ENGLISCH = "0";
    private final String ENGLISCH01 = "1";
    private final String FRENCH = "2";
    private final String GERMAN = "3";
    private final String JAPAN = "4";
    private final String RUSSIA = "5";
    private final String CHINA = "7";

    private final String CZECH_REPUBLIC = "80";
    private final String INDIA = "81";
    private final String NORWAY = "82";
    private final String POLAND = "83";
    private final String SPAIN = "84";
    private final String BRAZIL = "85";
    private final String SERBIA = "86";
    private final String DANMARK = "87";
    private final String ITALY = "88";
    private final String KOREA = "89";
    private final String NETHERLANDS = "90";
    private final String SWEDEN = "91";
    private final String INTERNATIONAL = "92";
    private final String INDIA01 = "93";

    private final String IRAN = "600";
    private final String ARGENTINIA = "950";
    private final String FINLAND = "951";
    private final String FINLAND01 = "952";
    private final String CROATIA = "953";
    private final String BULGARIA = "954";
    private final String SRILANKA = "955";
    private final String CHILI = "956";
    private final String TAIWAN = "957";
    private final String COLOMBIA = "958";
    private final String CUBA = "959";
    private final String GREECE = "960";
    private final String SLOVANIA = "961";
    private final String HONGKONG = "962";
    private final String HUNGARY = "963";
    private final String IRAN01 = "964";
    private final String ISRAEL = "965";
    private final String UKRAINE = "966";
    private final String MALAYSIA = "967";
    private final String MEXICO = "968";
    private final String PAKISTAN = "969";
    private final String MEXICO01 = "970";
    private final String PHILIPPINES = "971";
    private final String PORTUGAL = "972";
    private final String ROMANIA = "973";
    private final String THAILAND = "974";
    private final String TURKEY = "975";
    private final String CARIBBEAN = "976";
    private final String EGYPT = "977";
    private final String NIGERIA = "978";
    private final String INDONESIA = "979";
    private final String VENEZUELA = "980";
    private final String SINGAPORE = "981";
    private final String SOUTH_PACIFIC = "982";
    private final String MALAYSIA01 = "983";
    private final String BANGLADESH = "984";
    private final String BELARUS = "985";
    private final String TAIWAN01 = "986";
    private final String ARGENTINA = "987";
    private final String HONGKONG01 = "988";
    private final String PORTUGAL01 = "989";

    private final String MONTENEGRO = "9940";
    private final String GEORGIA = "9941";
    private final String ECUADOR = "9942";
    private final String UZBEKISTAN = "9943";
    private final String TURKEY01 = "9944";
    private final String DOMINICAN_REPUBLIC = "9945";
    private final String KOREA01 = "9946";
    private final String ALGERIA = "9947";
    private final String UNITED_ARAB_EMIRATES = "9948";
    private final String ESTONIA = "9949";
    private final String PALESTINE = "9950";
    private final String KOSOVA = "9951";
    private final String AZERBAIJAN = "9952";
    private final String LEBANON = "9953";
    private final String MOROCCO = "9954";
    private final String LITHUANIA = "9955";
    private final String CAMEROON = "9956";
    private final String JORDAN = "9957";
    private final String BOSNIA_HERZEGOVINA = "9958";
    private final String LIBYA = "9959";
    private final String SAUDIARABIA = "9960";
    private final String ALGERIA01 = "9961";
    private final String PANAMA = "9962";
    private final String CYPRUS = "9963";
    private final String GHANA = "9964";
    private final String KAZAKHSTAN = "9965";
    private final String KENYA = "9966";
    private final String KYRGYZSTAN = "9967";
    private final String COSTARICA = "9968";
    private final String UGANDA = "9970";
    private final String SINGAPORE01 = "9971";
    private final String PERU = "9972";
    private final String TUNISIA = "9973";
    private final String URUGUAY = "9974";
    private final String MOLDOVA = "9975";
    private final String TANZANIA = "9976";
    private final String CASTARICA = "9977";
    private final String ECUADOR01 = "9978";
    private final String ICELAND = "9979";
    private final String PAPUA = "9980";
    private final String MOROCCO01 = "9981";
    private final String ZAMBIA = "9982";
    private final String GAMBIA = "9983";
    private final String LATVIA = "9984";
    private final String ESTONIA01 = "9985";
    private final String LITHUANIA01 = "9986";
    private final String TANZANIA01 = "9987";
    private final String GHANA01 = "9988";
    private final String MACEDONIA = "9989";

    private final String BAHRAIN = "99901";
    private final String GABON = "99902";
    private final String MAURITIUS = "99903";
    private final String NETHERLANDS_ANTILLES = "99904";
    private final String BOLIVIA = "99905";
    private final String KUWAIT = "99906";
    private final String MALAWI = "99908";
    private final String MALTA = "99909";
    private final String SIERRA_LEONE = "99910";
    private final String LESOTHO = "99911";
    private final String BOTSWANA = "99912";
    private final String ANDORRA = "99913";
    private final String SURINAME = "99914";
    private final String MALDIVES = "99915";
    private final String NAMIBIA = "99916";
    private final String BRUNEI = "99917";
    private final String FAROE_ISLANDS = "99918";
    private final String BENIN = "99919";
    private final String ANDORRA01 = "99920";
    private final String QATAR = "99921";
    private final String GUATEMALA = "99922";
    private final String EL_SALVADOR = "99923";
    private final String NICARAGUA = "99924";
    private final String PARAGUAY = "99925";
    private final String HONDURAS = "99926";
    private final String ALBANIA = "99927";
    private final String GEORGIA01 = "99928";
    private final String MONGOLIA = "99929";
    private final String ARMENIA = "99930";
    private final String SEYCHELLES = "99931";
    private final String MALTA01 = "99932";
    private final String NEPAL = "99933";
    private final String DOMINICAN_REPUBLIC01 = "99934";
    private final String HAITI = "99935";
    private final String BHUTAN = "99936";
    private final String MACAU = "99937";
    private final String SRPSKA = "99938";
    private final String GUATEMALA01 = "99939";
    private final String GEORGIA02 = "99940";
    private final String ARMENIA01 = "99941";
    private final String SUDAN = "99942";
    private final String ALBANIA01 = "99943";
    private final String ETHIOPIA = "99944";
    private final String NAMIBIA01 = "99945";
    private final String NEPAL01 = "99946";
    private final String TAJIKISTAN = "99947";
    private final String ERITREA = "99948";
    private final String MAURITIUS01 = "99949";
    private final String CAMBODIA = "99950";
    private final String CONGO = "99951";
    private final String MALI = "99952";
    private final String PARAGUAY01 = "99953";
    private final String BOLIVIA01 = "99954";
    private final String SRPSKA01 = "99955";


    @Transient
    // Het prefix onderscheidt een ISBN van andere productcodes. Zulke productcodes worden gebruikt door EAN International.
    // - EAN International heeft aan ISBN's twee prefixen toegewezen, elk van drie cijfers: 978 en 979. Anno 2014 werd 979 nog niet voor ISBN's gebruikt.
    private int prefix;

    @Transient
    // De registratiegroep geeft doorgaans het land van publicatie aan.
    // - Het kan ook het taalgebied aangeven. Zo zijn 90 en 94 groepsnummers voor zowel Nederland als voor Nederlandstalig België.
    //   In dit geval zijn de groepsnummers dus tweecijferig.
    // - Grote taalgebieden krijgen maar één cijfer, waardoor er meer vervolgposities overblijven voor afzonderlijke uitgaven:
    //   Engeland, de Verenigde Staten, Australië, Zuid-Afrika en een aantal andere landen hebben de prefixen 0 en 1.
    //   Frankrijk en onder meer Franstalig België en Franstalig Zwitserland hebben 2, Duitse taalgebieden 3, Japans is 4.[1]
    // - Kleinere taalgebieden (wat aantal publicaties betreft) daarentegen krijgen drie of meer cijfers: 979 voor Indonesië, 9964 voor Ghana.
    // - De registratiegroep geeft geen uitsluitsel over de taal.
    //   Zo worden in Nederland vele wetenschappelijke uitgaven in het Engels geproduceerd; zij krijgen niettemin groepsnummer 90 of 94.
    // - Het International Standard Music Number (ISMN) heeft een met ISBN vergelijkbare opbouw.
    //   De prefix is 979 en de registratiegroep is 0. Bij ISBN's met prefix 979 zullen de registratiegroepen met de cijfers 1–9 beginnen.
    private int registratieGroep;

    @Transient
    // De uitgeversaanduiding is een cijferreeks, opnieuw van uiteenlopende lengte, die de uitgever definieert.
    // De vuistregel luidt: hoe groter het uitgeversfonds is, des te korter is de uitgeversaanduiding. Zo blijft er opnieuw optimale ruimte over voor de titelaanduiding.
    // - Bekende uitgevers in het Nederlandse taalgebied krijgen twee of drie cijfers: zo identificeert 02 de Standaard Uitgeverij, 234 is De Bezige Bij.
    //   De langste aanduidingen kennen zes cijfers, bijvoorbeeld 800041. Zo'n lange aanduiding is alleen bruikbaar bij instanties die hooguit tien
    //   titels zullen uitgeven: er zijn immers al drie plus twee plus zes cijfers gebruikt. Er blijven er nog slechts twee over: een voor de
    //   titelaanduiding en een voor het controlecijfer.
    private int uitgeversAanduiding;

    @Transient
    // De titelaanduiding identificeert de "titel", zoals dat woord in het boekenvak wordt gebruikt: een bepaald werk in een
    // bepaalde uitvoering en uitgegeven door een bepaalde uitgever. In deze groep kunnen in het Nederlandstalige gebied
    // maximaal vijf cijfers worden toegekend (100.000 titels), maar de meeste uitgevers hebben minder cijfers tot hun beschikking voor de titelaanduiding.
    private int titelAanduiding;

    @Transient
    // Het controlecijfer wordt toegevoegd ter voorkoming of correctie van fouten in het ISBN.
    private int controleCijfer;

    private String isbn;

    private ISBN() {

    }

    public ISBN(final String isbn) {
        this.isbn = isbn;

        String[] parts = null;

        if (this.isbn.contains("-")) {
            parts = this.isbn.split("-");
        } else if (this.isbn.contains("-")) {
            parts = this.isbn.split(" ");
        } else {
            parts = new String[5];
            parts[0] = this.isbn.substring(0, 3); // 978 of 979 length 3
            parts[1] = findRegistrationGroup(this.isbn.substring(3, 8)); // registration group length 1..5
            //parts[1] = this.isbn.substring(3, 5); // 90
            parts[2] = this.isbn.substring(5, 8); // registrant
            parts[3] = this.isbn.substring(8, 12); // publication
            parts[4] = this.isbn.substring(12, 13); // check digit length 1
        }
        if (5 == parts.length) {
            this.prefix = Integer.parseInt(parts[0]);
            this.registratieGroep = Integer.parseInt(parts[1]);
            this.uitgeversAanduiding = Integer.parseInt(parts[2]);
            this.titelAanduiding = Integer.parseInt(parts[3]);
            this.controleCijfer = Integer.parseInt(parts[4]);
        }
        this.toString();
    }

    //
    // based on https://web.archive.org/web/20090722202708/http://www.isbn-international.org/en/identifiers/allidentifiers.html
    //
    private String findRegistrationGroup(final String isbnregistration) {
        String registrationGroup = "";
        String oneDigit = isbnregistration.substring(0, 1);
        String twoDigit = isbnregistration.substring(0, 2);
        String threeDigit = isbnregistration.substring(0, 3);
        String fourDigit = isbnregistration.substring(0, 4);
        String fiveDigit = isbnregistration.substring(0, 5);

        registrationGroup = findRegistrationOne(oneDigit);

        if (registrationGroup.length() == 0) {
            registrationGroup = findRegistrationTwo(twoDigit);
        }
        if (registrationGroup.length() == 0) {
            registrationGroup = findRegistrationThree(threeDigit);
        }
        if (registrationGroup.length() == 0) {
            registrationGroup = findRegistrationFour(fourDigit);
        }
        if (registrationGroup.length() == 0) {
            registrationGroup = findRegistrationFive(fiveDigit);
        }
        return registrationGroup;
    }

    private String findRegistrationFive(String fiveDigit) {
        String registrationGroup = "";
        switch (fiveDigit) {
            case BAHRAIN:
                registrationGroup = BAHRAIN;
                break;
            case GABON:
                registrationGroup = GABON;
                break;
            case MAURITIUS:
                registrationGroup = MAURITIUS;
                break;
            case NETHERLANDS_ANTILLES:
                registrationGroup = NETHERLANDS_ANTILLES;
                break;
            case BOLIVIA:
                registrationGroup = BOLIVIA;
                break;
            case KUWAIT:
                registrationGroup = KUWAIT;
                break;
            case MALAWI:
                registrationGroup = MALAWI;
                break;
            case MALTA:
                registrationGroup = MALTA;
                break;
            case SIERRA_LEONE:
                registrationGroup = SIERRA_LEONE;
                break;
            case LESOTHO:
                registrationGroup = LESOTHO;
                break;
            case BOTSWANA:
                registrationGroup = BOTSWANA;
                break;
            case ANDORRA:
                registrationGroup = ANDORRA;
                break;
            case SURINAME:
                registrationGroup = SURINAME;
                break;
            case MALDIVES:
                registrationGroup = MALDIVES;
                break;
            case NAMIBIA:
                registrationGroup = NAMIBIA;
                break;
            case BRUNEI:
                registrationGroup = BRUNEI;
                break;
            case FAROE_ISLANDS:
                registrationGroup = FAROE_ISLANDS;
                break;
            case BENIN:
                registrationGroup = BENIN;
                break;
            case ANDORRA01:
                registrationGroup = ANDORRA01;
                break;
            case QATAR:
                registrationGroup = QATAR;
                break;
            case GUATEMALA:
                registrationGroup = GUATEMALA;
                break;
            case EL_SALVADOR:
                registrationGroup = EL_SALVADOR;
                break;
            case NICARAGUA:
                registrationGroup = NICARAGUA;
                break;
            case PARAGUAY:
                registrationGroup = PARAGUAY;
                break;
            case HONDURAS:
                registrationGroup = HONDURAS;
                break;
            case ALBANIA:
                registrationGroup = ALBANIA;
                break;
            case GEORGIA01:
                registrationGroup = GEORGIA01;
                break;
            case MONGOLIA:
                registrationGroup = MONGOLIA;
                break;
            case ARMENIA:
                registrationGroup = ARMENIA;
                break;
            case SEYCHELLES:
                registrationGroup = SEYCHELLES;
                break;
            case MALTA01:
                registrationGroup = MALTA01;
                break;
            case NEPAL:
                registrationGroup = NEPAL;
                break;
            case DOMINICAN_REPUBLIC01:
                registrationGroup = DOMINICAN_REPUBLIC01;
                break;
            case HAITI:
                registrationGroup = HAITI;
                break;
            case BHUTAN:
                registrationGroup = BHUTAN;
                break;
            case MACAU:
                registrationGroup = MACAU;
                break;
            case SRPSKA:
                registrationGroup = SRPSKA;
                break;
            case GUATEMALA01:
                registrationGroup = GUATEMALA01;
                break;
            case GEORGIA02:
                registrationGroup = GEORGIA02;
                break;
            case ARMENIA01:
                registrationGroup = ARMENIA01;
                break;
            case SUDAN:
                registrationGroup = SUDAN;
                break;
            case ALBANIA01:
                registrationGroup = ALBANIA01;
                break;
            case ETHIOPIA:
                registrationGroup = ETHIOPIA;
                break;
            case NAMIBIA01:
                registrationGroup = NAMIBIA01;
                break;
            case NEPAL01:
                registrationGroup = NEPAL01;
                break;
            case TAJIKISTAN:
                registrationGroup = TAJIKISTAN;
                break;
            case ERITREA:
                registrationGroup = ERITREA;
                break;
            case MAURITIUS01:
                registrationGroup = MAURITIUS01;
                break;
            case CAMBODIA:
                registrationGroup = CAMBODIA;
                break;
            case CONGO:
                registrationGroup = CONGO;
                break;
            case MALI:
                registrationGroup = MALI;
                break;
            case PARAGUAY01:
                registrationGroup = PARAGUAY01;
                break;
            case BOLIVIA01:
                registrationGroup = BOLIVIA01;
                break;
            case SRPSKA01:
                registrationGroup = SRPSKA01;
                break;
            default:
                break;
        }
        return registrationGroup;
    }

    private String findRegistrationFour(String fourDigit) {
        String registrationGroup = "";
        switch (fourDigit) {
            case MONTENEGRO:
                registrationGroup = MONTENEGRO;
                break;
            case GEORGIA:
                registrationGroup = GEORGIA;
                break;
            case ECUADOR:
                registrationGroup = ECUADOR;
                break;
            case UZBEKISTAN:
                registrationGroup = UZBEKISTAN;
                break;
            case TURKEY01:
                registrationGroup = TURKEY01;
                break;
            case DOMINICAN_REPUBLIC:
                registrationGroup = DOMINICAN_REPUBLIC;
                break;
            case KOREA01:
                registrationGroup = KOREA01;
                break;
            case ALGERIA:
                registrationGroup = ALGERIA;
                break;
            case UNITED_ARAB_EMIRATES:
                registrationGroup = UNITED_ARAB_EMIRATES;
                break;
            case ESTONIA:
                registrationGroup = ESTONIA;
                break;
            case PALESTINE:
                registrationGroup = PALESTINE;
                break;
            case KOSOVA:
                registrationGroup = KOSOVA;
                break;
            case AZERBAIJAN:
                registrationGroup = AZERBAIJAN;
                break;
            case LEBANON:
                registrationGroup = LEBANON;
                break;
            case MOROCCO:
                registrationGroup = MOROCCO;
                break;
            case LITHUANIA:
                registrationGroup = LITHUANIA;
                break;
            case CAMEROON:
                registrationGroup = CAMEROON;
                break;
            case JORDAN:
                registrationGroup = JORDAN;
                break;
            case BOSNIA_HERZEGOVINA:
                registrationGroup = BOSNIA_HERZEGOVINA;
                break;
            case LIBYA:
                registrationGroup = LIBYA;
                break;
            case SAUDIARABIA:
                registrationGroup = SAUDIARABIA;
                break;
            case ALGERIA01:
                registrationGroup = ALGERIA01;
                break;
            case PANAMA:
                registrationGroup = PANAMA;
                break;
            case CYPRUS:
                registrationGroup = CYPRUS;
                break;
            case GHANA:
                registrationGroup = GHANA;
                break;
            case KAZAKHSTAN:
                registrationGroup = KAZAKHSTAN;
                break;
            case KENYA:
                registrationGroup = KENYA;
                break;
            case KYRGYZSTAN:
                registrationGroup = KYRGYZSTAN;
                break;
            case COSTARICA:
                registrationGroup = COSTARICA;
                break;
            case UGANDA:
                registrationGroup = UGANDA;
                break;
            case SINGAPORE01:
                registrationGroup = SINGAPORE01;
                break;
            case PERU:
                registrationGroup = PERU;
                break;
            case TUNISIA:
                registrationGroup = TUNISIA;
                break;
            case URUGUAY:
                registrationGroup = URUGUAY;
                break;
            case MOLDOVA:
                registrationGroup = MOLDOVA;
                break;
            case TANZANIA:
                registrationGroup = TANZANIA;
                break;
            case CASTARICA:
                registrationGroup = CASTARICA;
                break;
            case ECUADOR01:
                registrationGroup = ECUADOR01;
                break;
            case ICELAND:
                registrationGroup = ICELAND;
                break;
            case PAPUA:
                registrationGroup = PAPUA;
                break;
            case MOROCCO01:
                registrationGroup = MOROCCO01;
                break;
            case ZAMBIA:
                registrationGroup = ZAMBIA;
                break;
            case GAMBIA:
                registrationGroup = GAMBIA;
                break;
            case LATVIA:
                registrationGroup = LATVIA;
                break;
            case ESTONIA01:
                registrationGroup = ESTONIA01;
                break;
            case LITHUANIA01:
                registrationGroup = LITHUANIA01;
                break;
            case TANZANIA01:
                registrationGroup = TANZANIA01;
                break;
            case GHANA01:
                registrationGroup = GHANA01;
                break;
            case MACEDONIA:
                registrationGroup = MACEDONIA;
                break;
            default:
                break;
        }
        return registrationGroup;
    }

    private String findRegistrationThree(String threeDigit) {
        String registrationGroup = "";
        switch (threeDigit) {
            case IRAN:
                registrationGroup = IRAN;
                break;
            case ARGENTINIA:
                registrationGroup = ARGENTINIA;
                break;
            case FINLAND:
                registrationGroup = FINLAND;
                break;
            case FINLAND01:
                registrationGroup = FINLAND01;
                break;
            case CROATIA:
                registrationGroup = CROATIA;
                break;
            case BULGARIA:
                registrationGroup = BULGARIA;
                break;
            case SRILANKA:
                registrationGroup = SRILANKA;
                break;
            case CHILI:
                registrationGroup = CHILI;
                break;
            case TAIWAN:
                registrationGroup = TAIWAN;
                break;
            case COLOMBIA:
                registrationGroup = COLOMBIA;
                break;
            case CUBA:
                registrationGroup = CUBA;
                break;
            case GREECE:
                registrationGroup = GREECE;
                break;
            case SLOVANIA:
                registrationGroup = SLOVANIA;
                break;
            case HONGKONG:
                registrationGroup = HONGKONG;
                break;
            case HUNGARY:
                registrationGroup = HUNGARY;
                break;
            case IRAN01:
                registrationGroup = IRAN01;
                break;
            case ISRAEL:
                registrationGroup = ISRAEL;
                break;
            case UKRAINE:
                registrationGroup = UKRAINE;
                break;
            case MALAYSIA:
                registrationGroup = MALAYSIA;
                break;
            case MEXICO:
                registrationGroup = MEXICO;
                break;
            case PAKISTAN:
                registrationGroup = PAKISTAN;
                break;
            case MEXICO01:
                registrationGroup = MEXICO01;
                break;
            case PHILIPPINES:
                registrationGroup = PHILIPPINES;
                break;
            case PORTUGAL:
                registrationGroup = PORTUGAL;
                break;
            case ROMANIA:
                registrationGroup = ROMANIA;
                break;
            case THAILAND:
                registrationGroup = THAILAND;
                break;
            case TURKEY:
                registrationGroup = TURKEY;
                break;
            case CARIBBEAN:
                registrationGroup = CARIBBEAN;
                break;
            case EGYPT:
                registrationGroup = EGYPT;
                break;
            case NIGERIA:
                registrationGroup = NIGERIA;
                break;
            case INDONESIA:
                registrationGroup = INDONESIA;
                break;
            case VENEZUELA:
                registrationGroup = VENEZUELA;
                break;
            case SINGAPORE:
                registrationGroup = SINGAPORE;
                break;
            case SOUTH_PACIFIC:
                registrationGroup = SOUTH_PACIFIC;
                break;
            case MALAYSIA01:
                registrationGroup = MALAYSIA01;
                break;
            case BANGLADESH:
                registrationGroup = BANGLADESH;
                break;
            case BELARUS:
                registrationGroup = BELARUS;
                break;
            case TAIWAN01:
                registrationGroup = TAIWAN01;
                break;
            case ARGENTINA:
                registrationGroup = ARGENTINA;
                break;
            case HONGKONG01:
                registrationGroup = HONGKONG01;
                break;
            case PORTUGAL01:
                registrationGroup = PORTUGAL01;
                break;
            default:
                break;
        }
        return registrationGroup;
    }

    private String findRegistrationTwo(String twoDigit) {
        String registrationGroup = "";
        switch (twoDigit) {
            case CZECH_REPUBLIC:
                registrationGroup = CZECH_REPUBLIC;
                break;
            case INDIA:
                registrationGroup = INDIA;
                break;
            case NORWAY:
                registrationGroup = NORWAY;
                break;
            case POLAND:
                registrationGroup = POLAND;
                break;
            case SPAIN:
                registrationGroup = SPAIN;
                break;
            case BRAZIL:
                registrationGroup = BRAZIL;
                break;
            case SERBIA:
                registrationGroup = SERBIA;
                break;
            case DANMARK:
                registrationGroup = DANMARK;
                break;
            case ITALY:
                registrationGroup = ITALY;
                break;
            case KOREA:
                registrationGroup = KOREA;
                break;
            case NETHERLANDS:
                registrationGroup = NETHERLANDS;
                break;
            case SWEDEN:
                registrationGroup = SWEDEN;
                break;
            case INTERNATIONAL:
                registrationGroup = INTERNATIONAL;
                break;
            case INDIA01:
                registrationGroup = INDIA01;
                break;
            default:
                break;
        }
        return registrationGroup;
    }

    private String findRegistrationOne(String oneDigit) {
        String registrationGroup = "";
        switch (oneDigit) {
            case ENGLISCH:
                registrationGroup = ENGLISCH;
                break;
            case ENGLISCH01:
                registrationGroup = ENGLISCH01;
                break;
            case FRENCH:
                registrationGroup = FRENCH;
                break;
            case GERMAN:
                registrationGroup = GERMAN;
                break;
            case JAPAN:
                registrationGroup = JAPAN;
                break;
            case RUSSIA:
                registrationGroup = RUSSIA;
                break;
            case CHINA:
                registrationGroup = CHINA;
                break;
            default:
                break;
        }
        return registrationGroup;
    }

    @Override
    public String toString() {
        return String.format("%03d-%02d-%03d-%04d-%01d", this.prefix, this.registratieGroep, this.uitgeversAanduiding, this.titelAanduiding, this.controleCijfer);
    }
}
