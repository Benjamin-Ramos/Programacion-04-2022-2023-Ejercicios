package modelsBandaMusicos;

public interface IPercusionista {

    tipoPercusion tipoDePercusion = tipoPercusion.TAMBOR;

    /**
     * función que sirve para recalcular el salario base del músico según su especialización
     * @param salario es el salario base a recalcular
     * @return el salario recalculado según la ocupación
     */
    public default Double recalcularSalario(Double salario){
        Double incremento = 1.35;
        return (salario*incremento);
    }
}
