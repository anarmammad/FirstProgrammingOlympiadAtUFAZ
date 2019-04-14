package QuarterFinal;

import java.util.Scanner;

/**
 * @author anarmammad
 **/

public class B_Quadrilateral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short Ax = sc.nextShort(), Ay = sc.nextShort(),
                Bx = sc.nextShort(), By = sc.nextShort(),
                Cx = sc.nextShort(), Cy = sc.nextShort(),
                Dx = sc.nextShort(), Dy = sc.nextShort(), rightAngles = 0;
        if((Bx-Ax)*(Cx-Bx)+(By-Ay)*(Cy-By)==0) rightAngles++;
        if((Cx-Bx)*(Dx-Cx)+(Cy-By)*(Dy-Cy)==0) rightAngles++;
        if((Dx-Cx)*(Ax-Dx)+(Dy-Cy)*(Ay-Dy)==0) rightAngles++;
        if((Ax-Dx)*(Bx-Ax)+(Ay-Dy)*(By-Ay)==0) rightAngles++;
        System.out.println(rightAngles);
    }
}
