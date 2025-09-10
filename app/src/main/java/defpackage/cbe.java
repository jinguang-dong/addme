package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbe extends bij implements bwx {
    public boolean a;
    public uiq b;
    private final boolean c;

    public cbe(boolean z, boolean z2, uiq uiqVar) {
        this.a = z;
        this.c = z2;
        this.b = uiqVar;
    }

    @Override // defpackage.bwx
    public final boolean o() {
        return this.c;
    }

    @Override // defpackage.bwx
    public final boolean p() {
        return this.a;
    }

    @Override // defpackage.bwx
    public final void s(cbn cbnVar) {
        this.b.a(cbnVar);
    }
}
