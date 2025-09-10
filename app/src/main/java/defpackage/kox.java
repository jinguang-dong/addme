package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum kox {
    AUTO("auto", 2),
    OFF("off", 1),
    ON("on", 3);

    public final String d;
    public final int e;

    kox(String str, int i) {
        this.d = str;
        this.e = i;
    }

    public static kox a(String str, kox koxVar) {
        str.getClass();
        kox koxVar2 = AUTO;
        if (koxVar2.d.equals(str)) {
            return koxVar2;
        }
        kox koxVar3 = OFF;
        if (koxVar3.d.equals(str)) {
            return koxVar3;
        }
        kox koxVar4 = ON;
        return koxVar4.d.equals(str) ? koxVar4 : koxVar;
    }
}
