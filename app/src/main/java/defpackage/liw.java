package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class liw implements syf {
    final /* synthetic */ float a;
    final /* synthetic */ liy b;

    public liw(liy liyVar, float f) {
        this.a = f;
        this.b = liyVar;
    }

    @Override // defpackage.syf
    public final void a(Throwable th) {
        int i = liy.b;
        this.b.c(this.a);
    }

    @Override // defpackage.syf
    public final /* synthetic */ void b(Object obj) {
        Boolean bool = (Boolean) obj;
        float f = (bool == null || !bool.booleanValue()) ? this.a : ((lja) this.b.a.dL()).a;
        int i = liy.b;
        this.b.c(f);
    }
}
