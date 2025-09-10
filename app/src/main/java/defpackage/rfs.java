package defpackage;

import com.google.googlex.gcam.creativecamera.portraitmode.axeo.pAAtrB;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rfs {
    public String a = "";
    public String b = "";
    public rfq c = rfq.OPEN;
    public Boolean d = false;

    public static String a(String str) {
        return a.bw(str, "\"", "\"");
    }

    public static boolean b(String str) {
        for (char c : str.toCharArray()) {
            switch (c) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    break;
                default:
                    switch (c) {
                        case 'A':
                        case 'B':
                        case 'C':
                        case 'D':
                        case 'E':
                        case 'F':
                            break;
                        default:
                            return false;
                    }
            }
        }
        return true;
    }

    public static boolean c(String str, int i, int i2) {
        return str.length() >= i && str.length() <= i2;
    }

    public final String toString() {
        rwb rwbVarW = rnt.W(this);
        rwbVarW.b("ssid", this.a);
        rwbVarW.b("password", this.b);
        rwbVarW.b(pAAtrB.rhQMCuvcLkW, this.c);
        return rwbVarW.toString();
    }
}
