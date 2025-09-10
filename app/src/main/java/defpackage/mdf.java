package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mdf implements mda {
    private final mdg a;
    private paq b;

    public mdf(mdg mdgVar) {
        this.a = mdgVar;
    }

    @Override // defpackage.mda
    public final void a() {
        this.b = this.a.a();
    }

    @Override // defpackage.mda
    public final void b() {
        paq paqVar = this.b;
        rnt.x(paqVar);
        paqVar.close();
        this.b = null;
    }
}
