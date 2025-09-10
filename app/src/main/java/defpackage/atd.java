package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atd implements bkx {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public atd(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [bun, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [bun, java.lang.Object] */
    @Override // defpackage.bkx
    public final long a() {
        int i = this.b;
        if (i == 0) {
            return ((ate) this.a).a;
        }
        if (i == 1) {
            ?? r6 = this.a;
            long jA = ((asg) r6).c.a();
            if (jA != 16) {
                return jA;
            }
            atb atbVar = (atb) bko.H(r6, atc.d);
            if (atbVar != null) {
                long j = atbVar.a;
                if (j != 16) {
                    return j;
                }
            }
            long j2 = ((bkv) bko.H(r6, asa.a)).g;
            return (((art) bko.H(r6, aru.a)).m() || ((double) bko.g(j2)) >= 0.5d) ? j2 : bkv.b;
        }
        if (i != 2) {
            return i != 3 ? ((dpy) this.a).a : ((awm) this.a).a;
        }
        ?? r62 = this.a;
        long jA2 = ((avt) r62).a.a();
        if (jA2 != 16) {
            return jA2;
        }
        awj awjVar = (awj) bko.H(r62, awl.a);
        if (awjVar != null) {
            long j3 = awjVar.a;
            if (j3 != 16) {
                return j3;
            }
        }
        return ((bkv) bko.H(r62, avs.a)).g;
    }
}
