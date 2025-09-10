package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jsd implements jsh {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public jsd(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.jsh
    public final void a(jry jryVar) {
        if (this.b == 0) {
            ((jse) this.a).c();
            return;
        }
        Object obj = this.a;
        synchronized (obj) {
            ((jsa) obj).d = true;
            ((jsa) obj).e = rwc.j(jryVar);
            ((jsa) obj).d();
        }
    }

    @Override // defpackage.jsh
    public final void b(long j, jsl jslVar) {
        if (this.b == 0) {
            ((jse) this.a).c();
            return;
        }
        Object obj = this.a;
        synchronized (obj) {
            ((jsa) obj).b = true;
            ((jsa) obj).c = rwc.j(jslVar);
            ((jsa) obj).f = j;
            ((jsa) obj).d();
        }
    }
}
