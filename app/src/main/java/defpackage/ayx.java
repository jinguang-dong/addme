package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ayx implements baq {
    private final uiq a;
    private ayy b;

    public ayx(uiq uiqVar) {
        this.a = uiqVar;
    }

    @Override // defpackage.baq
    public final void b() {
        ayy ayyVar = this.b;
        if (ayyVar != null) {
            ayyVar.a();
        }
        this.b = null;
    }

    @Override // defpackage.baq
    public final void cU() {
        this.b = (ayy) this.a.a(azb.a);
    }

    @Override // defpackage.baq
    public final void a() {
    }
}
