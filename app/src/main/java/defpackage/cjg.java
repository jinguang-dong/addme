package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cjg {
    cji a;
    final /* synthetic */ cjh b;

    public cjg(cjh cjhVar) {
        this.b = cjhVar;
    }

    public final String toString() {
        String str = "[ ";
        if (this.a != null) {
            for (int i = 0; i < 9; i++) {
                str = str + this.a.i[i] + " ";
            }
        }
        return str + "] " + this.a;
    }
}
