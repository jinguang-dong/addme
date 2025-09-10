package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iyi implements fre {
    private final fre a;

    public iyi(uem uemVar) throws SecurityException, IllegalArgumentException {
        paq paqVarX = gsn.X();
        try {
            this.a = (fre) uemVar.a();
            paqVarX.close();
        } catch (Throwable th) {
            try {
                paqVarX.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.fre
    public final /* synthetic */ int a() {
        return 0;
    }

    @Override // defpackage.fre
    public final syu b() throws SecurityException, IllegalArgumentException {
        paq paqVarX = gsn.X();
        try {
            syu syuVarB = this.a.b();
            paqVarX.close();
            return syuVarB;
        } catch (Throwable th) {
            try {
                paqVarX.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.fre
    public final String c() {
        return this.a.c();
    }
}
