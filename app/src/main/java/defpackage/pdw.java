package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pdw extends ojl {
    final /* synthetic */ Runnable a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pdw(Runnable runnable) {
        super((short[]) null);
        this.a = runnable;
    }

    @Override // defpackage.ojl
    public final void dI() {
        this.a.run();
    }

    @Override // defpackage.ojl
    public final void dY() {
        this.a.run();
    }
}
