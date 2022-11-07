public class Main {
    public static void main(String[] args) {
        //A first table containing 3 titles of films in which our friend Indiana plays
        String[] movies =  {
                "The Raiders of the Lost Ark ",
                "Indiana Jones and the Temple of Doom",
                "Indiana Jones and the Last Crusade"
        };

        String[][] actorsMovie = new String[][] {
                {
                    "Harrison Ford", "Karen Allen", "Paul Freeman"
                },
                {
                    "Kate Capshaw", "Johnathan ke Quan", "Amrish Puri"
                },
                {
                    "Sean Connery", "Denholm Elliott", "Alison Doody"
                }
        };

        for (int i = 0; i < movies.length; i++ ) {
            System.out.println( "dans les film : " + movies[i] + "les principaux acteurs sont :" );
            for (int y = 0; y < actorsMovie.length; y++) {
                System.out.println(actorsMovie[i][y]);
            }
        }
    }
}