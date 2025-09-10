package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class lyg implements lyo {
    private final /* synthetic */ int a;

    public /* synthetic */ lyg(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, lze] */
    @Override // defpackage.lyo
    public final void a(Object obj) {
        int i = this.a;
        if (i == 0) {
            ((lyy) obj).c(false);
            return;
        }
        if (i == 1) {
            ((lyy) obj).c(true);
            return;
        }
        if (i == 2) {
            lyy lyyVar = (lyy) obj;
            rnt.L(lyyVar.d);
            rwc rwcVar = lyyVar.b.g;
            if (rwcVar.h()) {
                rwcVar.c().e();
                return;
            }
            return;
        }
        lyy lyyVar2 = (lyy) obj;
        rnt.L(lyyVar2.d);
        if (lyyVar2.e) {
            lyyVar2.a.f();
        }
        lyyVar2.a.dM();
        lyyVar2.c.a();
        lyyVar2.f.close();
    }
}
