package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class uhp extends uhn {
    private final uhf a;
    public transient uhb n;

    public uhp(uhb uhbVar) {
        this(uhbVar, uhbVar != null ? uhbVar.q() : null);
    }

    @Override // defpackage.uhn
    protected void f() {
        uhb uhbVar = this.n;
        if (uhbVar != null && uhbVar != this) {
            uhd uhdVar = q().get(uhc.k);
            uhdVar.getClass();
            ((uhc) uhdVar).d(uhbVar);
        }
        this.n = uho.a;
    }

    @Override // defpackage.uhb
    public uhf q() {
        uhf uhfVar = this.a;
        uhfVar.getClass();
        return uhfVar;
    }

    public uhp(uhb uhbVar, uhf uhfVar) {
        super(uhbVar);
        this.a = uhfVar;
    }
}
