package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqz {
    public static final aqz a = new aqz(null, null);
    public final bry b;
    public final cdl c;

    public aqz(bry bryVar, cdl cdlVar) {
        this.b = bryVar;
        this.c = cdlVar;
    }

    public static /* synthetic */ aqz a(aqz aqzVar, bry bryVar, cdl cdlVar, int i) {
        if ((i & 1) != 0) {
            bryVar = aqzVar.b;
        }
        if ((i & 2) != 0) {
            cdlVar = aqzVar.c;
        }
        return new aqz(bryVar, cdlVar);
    }
}
