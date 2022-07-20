package aagustin;

public class TenMinWalk {
    public static boolean isValid(char[] ruta) {
    if (!(ruta.length==10)){
        return false;
    }
    int nsPos=0;
    int ewPos=0;
    
    for (int i=0;i<10;i++){
        char caminar=ruta[i];
        switch (caminar){
            case 'n':
                nsPos++;
                break;
            case 's':
                nsPos--;
                break;
            case 'e':
                ewPos++;
                break;
            case 'w':
                ewPos--;
                break;
        }
    }
        return (nsPos == 0 && ewPos == 0);
    }
}
