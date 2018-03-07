package neppo.ic;

abstract class Quiz {

    
    private int nivel;
    private String descPergunta;
    private boolean r1;
    private String descR1;
    private boolean r2;
    private String descR2;
    private boolean r3;
    private String descR3;
    private boolean r4;
    private String descR4;

    public Quiz(int nivel, String descPergunta, boolean r1, String descR1, boolean r2, String descR2, boolean r3, String descR3, boolean r4, String descR4) {
        super();
        descPergunta = this.getDescPergunta();
        nivel = this.getNivel();
        r1 = this.isR1();
        descR1 = this.getDescR1();
        r2 = this.isR2();
        descR2 = this.getDescR2();
        r3 = this.isR3();
        descR3 = this.getDescR3();
        r4 = this.isR4();
        descR4 = this.getDescR4();

    }

    /**
     * @return the idPergunta
     */

    /**
     * @return the r1
     */
    public boolean isR1() {
        return r1;
    }

    /**
     * @param r1 the r1 to set
     */
    public void setR1(boolean r1) {
        this.r1 = r1;
    }

    /**
     * @return the descR1
     */
    public String getDescR1() {
        return descR1;
    }

    /**
     * @param descR1 the descR1 to set
     */
    public void setDescR1(String descR1) {
        this.descR1 = descR1;
    }

    /**
     * @return the r2
     */
    public boolean isR2() {
        return r2;
    }

    /**
     * @param r2 the r2 to set
     */
    public void setR2(boolean r2) {
        this.r2 = r2;
    }

    /**
     * @return the descR2
     */
    public String getDescR2() {
        return descR2;
    }

    /**
     * @param descR2 the descR2 to set
     */
    public void setDescR2(String descR2) {
        this.descR2 = descR2;
    }

    /**
     * @return the r3
     */
    public boolean isR3() {
        return r3;
    }

    /**
     * @param r3 the r3 to set
     */
    public void setR3(boolean r3) {
        this.r3 = r3;
    }

    /**
     * @return the descR3
     */
    public String getDescR3() {
        return descR3;
    }

    /**
     * @param descR3 the descR3 to set
     */
    public void setDescR3(String descR3) {
        this.descR3 = descR3;
    }

    /**
     * @return the r4
     */
    public boolean isR4() {
        return r4;
    }

    /**
     * @param r4 the r4 to set
     */
    public void setR4(boolean r4) {
        this.r4 = r4;
    }

    /**
     * @return the descR4
     */
    public String getDescR4() {
        return descR4;
    }

    /**
     * @param descR4 the descR4 to set
     */
    public void setDescR4(String descR4) {
        this.descR4 = descR4;
    }

    /**
     * @return the nivel
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    private String getDescPergunta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @param descPergunta the descPergunta to set
     */
    public void setDescPergunta(String descPergunta) {
        this.descPergunta = descPergunta;
    }

}
