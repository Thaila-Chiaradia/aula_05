// 3. Complemente a solução 2, para que seja possível comparar programadores em relação ao tempo de experiência 
// em uma determinada linguagem. Isso deve ser modelado e implementado em uma nova classe.

public class Comparar {
    public static void compararTempoExperiencia(Programador programador_1, Programador programador_2, String linguagem)
    {
        int t_programador_1 = 0;
        int t_programador_2 = 0;

        if (programador_1.getLinguagem_1() != null && programador_1.getLinguagem_1().getNome().equalsIgnoreCase(linguagem))
        {
            t_programador_1 = programador_1.getLinguagem_1().getExperiencia();
        }
        if (programador_1.getLinguagem_2() != null && programador_1.getLinguagem_2().getNome().equalsIgnoreCase(linguagem))
        {
            t_programador_1 = programador_1.getLinguagem_2().getExperiencia();
        }
        if (programador_1.getLinguagem_3() != null && programador_1.getLinguagem_3().getNome().equalsIgnoreCase(linguagem))
        {
            t_programador_1 = programador_1.getLinguagem_3().getExperiencia();
        }

        if (programador_2.getLinguagem_1() != null && programador_2.getLinguagem_1().getNome().equalsIgnoreCase(linguagem))
        {
            t_programador_2 = programador_2.getLinguagem_1().getExperiencia();
        }
        if (programador_2.getLinguagem_2() != null && programador_2.getLinguagem_2().getNome().equalsIgnoreCase(linguagem))
        {
            t_programador_2 = programador_2.getLinguagem_2().getExperiencia();
        }
        if (programador_2.getLinguagem_3() != null && programador_2.getLinguagem_3().getNome().equalsIgnoreCase(linguagem))
        {
            t_programador_2 = programador_2.getLinguagem_3().getExperiencia();
        }

        if (t_programador_1 == t_programador_2){
            System.out.println("Ambos tem o mesmo tempo de experiencia");
        }
        else 
        {
            if(t_programador_1 > t_programador_2)
            {
                System.out.println(programador_1.getNome() + " tem maior tempo de experiência em " + linguagem + " : " + t_programador_1 + " anos");
			}
            else System.out.println(programador_2.getNome() + " tem maior tempo de experiência em " + linguagem + " : " + t_programador_2 + " anos");	
            
        }



    }
}
