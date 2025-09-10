package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tmj {
    public static final boolean a;
    public static final tiw b;
    public static final tiw c;
    public static final tiw d;

    static {
        boolean z;
        tiw tiwVar;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        a = z;
        if (z) {
            b = tmg.a;
            c = tmh.a;
            tiwVar = tmi.a;
        } else {
            tiwVar = null;
            b = null;
            c = null;
        }
        d = tiwVar;
    }
}
