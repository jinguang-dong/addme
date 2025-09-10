package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lcr implements lsz {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public lcr(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.lsz
    public final void a() {
        if (this.b != 0) {
            ((our) this.a).close();
        } else {
            ((ovx) this.a).a(false);
        }
    }

    @Override // defpackage.lsz
    public final void b() {
        if (this.b != 0) {
            return;
        }
        ((ovx) this.a).a(false);
    }

    @Override // defpackage.lsz
    public final void c() {
        if (this.b != 0) {
            return;
        }
        ((ovx) this.a).a(true);
    }
}
