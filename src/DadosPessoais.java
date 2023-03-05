public class DadosPessoais
{
    private String nome;
    private String CPF;
    private int sexo;
    private double peso;
    private double altura;
    private int idade;
    private int freqAtividade;
    private int objetivo;

    public DadosPessoais()
    {

    }

    public DadosPessoais(String nome, String CPF, int sexo, double peso, double altura, int idade, int freqAtividade, int objetivo)
    {
        this.nome = nome;
        this.CPF = CPF;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;
        this.freqAtividade = freqAtividade;
        this.objetivo = objetivo;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getCPF()
    {
        return CPF;
    }

    public void setCPF(String CPF)
    {
        this.CPF = CPF;
    }

    public int getSexo()
    {
        return sexo;
    }

    public void setSexo(int sexo)
    {
        this.sexo = sexo;
    }

    public double getPeso()
    {
        return peso;
    }

    public void setPeso(double peso)
    {
        this.peso = peso;
    }

    public double getAltura()
    {
        return altura;
    }

    public void setAltura(double altura)
    {
        this.altura = altura;
    }

    public int getIdade()
    {
        return idade;
    }

    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    public int getFreqAtividade()
    {
        return freqAtividade;
    }

    public void setFreqAtividade(int freqAtividade)
    {
        this.freqAtividade = freqAtividade;
    }

    public int getObjetivo()
    {
        return objetivo;
    }

    public void setObjetivo(int objetivo)
    {
        this.objetivo = objetivo;
    }
}
