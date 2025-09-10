package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qfl implements qfh {
    final /* synthetic */ Throwable a;

    public qfl(Throwable th) {
        this.a = th;
    }

    @Override // defpackage.qfh
    public final /* bridge */ /* synthetic */ Object a(Object obj) throws Throwable {
        Throwable th = (Throwable) obj;
        th.addSuppressed(this.a);
        throw th;
    }
}
