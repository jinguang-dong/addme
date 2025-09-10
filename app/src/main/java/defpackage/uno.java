package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uno extends uvz {
    public final ulz b;

    public uno(uhf uhfVar, uhb uhbVar) {
        super(uhfVar, uhbVar);
        this.b = new ulz(0, umc.a);
    }

    @Override // defpackage.uvz, defpackage.uov
    protected final void a(Object obj) {
        f(obj);
    }

    @Override // defpackage.uvz, defpackage.umd
    protected final void f(Object obj) {
        ulz ulzVar;
        do {
            ulzVar = this.b;
            int i = ulzVar.b;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                uhb uhbVar = this.e;
                uvh.a(ske.aE(uhbVar), ung.n(obj, uhbVar));
                return;
            }
        } while (!ulzVar.c(0, 2));
    }
}
