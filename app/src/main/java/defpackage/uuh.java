package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uuh implements uhf {
    public final Throwable a;
    private final /* synthetic */ uhf b;

    public uuh(Throwable th, uhf uhfVar) {
        this.b = uhfVar;
        this.a = th;
    }

    @Override // defpackage.uhf
    public final Object fold(Object obj, uiu uiuVar) {
        return this.b.fold(obj, uiuVar);
    }

    @Override // defpackage.uhf
    public final uhd get(uhe uheVar) {
        return this.b.get(uheVar);
    }

    @Override // defpackage.uhf
    public final uhf minusKey(uhe uheVar) {
        return this.b.minusKey(uheVar);
    }

    @Override // defpackage.uhf
    public final uhf plus(uhf uhfVar) {
        return this.b.plus(uhfVar);
    }
}
