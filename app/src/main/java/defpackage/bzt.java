package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzt implements bim {
    private final bbb b = new azv(1.0f);

    @Override // defpackage.bim
    public final float a() {
        return this.b.e();
    }

    public final void b(float f) {
        this.b.i(f);
    }

    @Override // defpackage.uhf
    public final Object fold(Object obj, uiu uiuVar) {
        return ske.aF(this, obj, uiuVar);
    }

    @Override // defpackage.uhd, defpackage.uhf
    public final uhd get(uhe uheVar) {
        return ske.aG(this, uheVar);
    }

    @Override // defpackage.uhd
    public final /* synthetic */ uhe getKey() {
        return bim.a;
    }

    @Override // defpackage.uhf
    public final uhf minusKey(uhe uheVar) {
        return ske.aH(this, uheVar);
    }

    @Override // defpackage.uhf
    public final uhf plus(uhf uhfVar) {
        return ske.aI(this, uhfVar);
    }
}
