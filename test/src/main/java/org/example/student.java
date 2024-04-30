package org.example;

public class student {
    //public int tip;//daca e strain sau din tara
    public String nume;
    public String prenume;
    public String nr_matricol;
    public String cnp;
    public String localitate_nastere;
    public String prenumele_mamei;
    public String prenumele_tatalui;
    public String localitate_domiciliu;
    public String judet_domiciuliu;
    public int tip_concurs;
    public int an_admitere;
    public int sesiunea;
    public float medie_admitere;
    public int anstadmis;
    public int baza_admiterii;
    public String aprobarea;
    public int nr_aprobare;
    public int ziua_aprobare;
    public int luna_aprobare;
    public int anul_aprobare;
    public String alte_acte;

    //de adaugat pentru straini*/
    public String getPrenumele_mamei() {
        return prenumele_mamei;
    }

    public String getLocalitate_domiciliu() {
        return localitate_domiciliu;
    }

    public String getJudet_domiciuliu() {
        return judet_domiciuliu;
    }

    public String getCNP() {
        return cnp;
    }

    public String getPrenumele_tatalui() {
        return prenumele_tatalui;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getNr_matricol() {
        return nr_matricol;
    }

    public String getLocalitate_nastere() {
        return localitate_nastere;
    }

    public int getAn_admitere() {
        return an_admitere;
    }

    public int getAnstadmis() {
        return anstadmis;
    }

    public float getMedie_admitere() {
        return medie_admitere;
    }

    public int getZiua_aprobare() {
        return ziua_aprobare;
    }

    public int getAnul_aprobare() {
        return anul_aprobare;
    }

    public int getNr_aprobare() {
        return nr_aprobare;
    }

    public String getAprobarea() {
        return aprobarea;
    }

    public String getAlte_acte() {
        return alte_acte;
    }

    public int getAnNastere() {
        if (Integer.parseInt(String.valueOf(cnp.charAt(0))) == 1 || Integer.parseInt(String.valueOf(cnp.charAt(0))) == 2)
            return 1900 + Integer.parseInt(cnp.substring(1, 2));
        else if (Integer.parseInt(String.valueOf(cnp.charAt(0))) == 5 || Integer.parseInt(String.valueOf(cnp.charAt(0))) == 6)
            return 2000 + Integer.parseInt(cnp.substring(1, 3));
        else
            return 0;//trebuie vazut pentru straini
    }

    public String getLunaNastere() {
        return switch (Integer.parseInt(cnp.substring(3, 5))) {
            case 1 -> "Ianuarie";
            case 2 -> "Februarie";
            case 3 -> "Martie";
            case 4 -> "Aprilie";
            case 5 -> "Mai";
            case 6 -> "Iunie";
            case 7 -> "Iulie";
            case 8 -> "August";
            case 9 -> "Septembrie";
            case 10 -> "Octombrie";
            case 11 -> "Noiembrie";
            case 12 -> "Decembrie";
            default -> "0";
        };
    }

    public String getLuna_aprobare() {
        return switch (luna_aprobare) {
            case 1 -> "Ianuarie";
            case 2 -> "Februarie";
            case 3 -> "Martie";
            case 4 -> "Aprilie";
            case 5 -> "Mai";
            case 6 -> "Iunie";
            case 7 -> "Iulie";
            case 8 -> "August";
            case 9 -> "Septembrie";
            case 10 -> "Octombrie";
            case 11 -> "Noiembrie";
            case 12 -> "Decembrie";
            default -> "0";
        };
    }

    public String getTip_concurs() {
        if (tip_concurs == 1)
            return "de admitere";
        else if (tip_concurs == 2)
            return "de dosare";
        else
            return "alt tip";
    }

    public String getSesiune() {
        if (sesiunea == 7)
            return "iulie";
        else if (sesiunea == 9)
            return "septembrie";
        else
            return "specială";
    }

    public String getBaza_admiterii() {
        if (baza_admiterii == 1)
            return "mediei de admitere";
        else if (baza_admiterii == 2)
            return "rezultatelor obtinute la concursuri";
        else
            return "0";
    }

    public String getJudet_nastere() {
        return switch (Integer.parseInt(cnp.substring(7, 9))) {
            case 1 -> "Alba";
            case 2 -> "Arad";
            case 3 -> "Argeș";
            case 4 -> "Bacău";
            case 5 -> "Bihor";
            case 6 -> "Bistrița-Năsăud";
            case 7 -> "Botoșani";
            case 8 -> "Brașov";
            case 9 -> "Brăila";
            case 10 -> "Buzău";
            case 11 -> "Caraș-Severin";
            case 12 -> "Cluj";
            case 13 -> "Constanța";
            case 14 -> "Covasna";
            case 15 -> "Dămbovița";
            case 16 -> "Dolj";
            case 17 -> "Galați";
            case 18 -> "Gorj";
            case 19 -> "Harghita";
            case 20 -> "Hunedoara";
            case 21 -> "Ialomița";
            case 22 -> "Iași";
            case 23 -> "Ilfov";
            case 24 -> "Maramureș";
            case 25 -> "Mehedinți";
            case 26 -> "Mureș";
            case 27 -> "Neamț";
            case 28 -> "Olt";
            case 29 -> "Prahova";
            case 30 -> "Satu Mare";
            case 31 -> "Sălaj";
            case 32 -> "Sibiu";
            case 33 -> "Suceava";
            case 34 -> "Teleorman";
            case 35 -> "Timiș";
            case 36 -> "Tulcea";
            case 37 -> "Vaslui";
            case 38 -> "Valcea";
            case 39 -> "Vrancea";
            case 40 -> "București";
            case 41 -> "București - Sector 1";
            case 42 -> "București - Sector 2";
            case 43 -> "București - Sector 3";
            case 44 -> "București - Sector 4";
            case 45 -> "București - Sector 5";
            case 46 -> "București - Sector 6";
            case 51 -> "Călărași";
            case 52 -> "Giurgiu";
            default -> "0";
        };
    }

    public student(String n, String p, String nrm, String cnp, String ln, String pm, String pt, String ld, String jd, int t, int s, int an, float m, int aaa, int b) {
        this.nume = n;
        this.prenume = p;
        this.nr_matricol = nrm;
        this.cnp = cnp;
        this.localitate_nastere = ln;
        this.prenumele_mamei = pm;
        this.prenumele_tatalui = pt;
        this.localitate_domiciliu = ld;
        this.judet_domiciuliu = jd;
        this.tip_concurs = t;
        this.sesiunea = s;
        this.an_admitere = an;
        this.medie_admitere = m;
        this.anstadmis = aaa;
        this.baza_admiterii = b;
    }
}
