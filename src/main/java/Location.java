public class Location {

    private String navn;
    private double lengde;
    private double breddegrad;
    private String biom;

    public Location(String navn, double lengde, double breddegrad, String biom) {
        this.navn = navn;
        this.lengde = lengde;
        this.breddegrad = breddegrad;
        this.biom = biom;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public double getLengde() {
        return lengde;
    }

    public void setLengde(double lengde) {
        this.lengde = lengde;
    }

    public double getBreddegrad() {
        return breddegrad;
    }

    public void setBreddegrad(double breddegrad) {
        this.breddegrad = breddegrad;
    }

    public String getBiom() {
        return biom;
    }

    public void setBiom(String biom) {
        this.biom = biom;
    }
}
