package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class uvz extends umd implements uhq {
    public final uhb e;

    public uvz(uhf uhfVar, uhb uhbVar) {
        super(uhfVar, true);
        this.e = uhbVar;
    }

    @Override // defpackage.uov
    protected void a(Object obj) {
        uhb uhbVar = this.e;
        uvh.a(ske.aE(uhbVar), ung.n(obj, uhbVar));
    }

    @Override // defpackage.uov
    protected final boolean b() {
        return true;
    }

    @Override // defpackage.uhq
    public final uhq cK() {
        uhb uhbVar = this.e;
        if (uhbVar instanceof uhq) {
            return (uhq) uhbVar;
        }
        return null;
    }

    @Override // defpackage.umd
    protected void f(Object obj) {
        uhb uhbVar = this.e;
        uhbVar.fW(ung.n(obj, uhbVar));
    }

    public void T() {
    }

    @Override // defpackage.uhq
    public final void cL() {
    }
}
