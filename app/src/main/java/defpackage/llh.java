package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class llh implements paf {
    final /* synthetic */ llj a;

    public llh(llj lljVar) {
        this.a = lljVar;
    }

    @Override // defpackage.paf
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        llo lloVar = (llo) obj;
        llj lljVar = this.a;
        synchronized (lljVar.d) {
            lljVar.e = false;
            ovx ovxVar = lljVar.a;
            ovxVar.a(Long.valueOf(((Long) ovxVar.d).longValue() - lljVar.b));
            lljVar.b();
        }
        lloVar.e(this);
    }
}
