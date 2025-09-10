package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class myj implements nba {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ myj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.nba
    public final void a(Object obj) {
        if (this.b != 0) {
            iqh iqhVar = (iqh) obj;
            Object obj2 = this.a;
            synchronized (obj2) {
                int iOrdinal = iqhVar.ordinal();
                if (iOrdinal == 1) {
                    ((ipk) obj2).p();
                    return;
                } else {
                    if (iOrdinal == 2 || iOrdinal == 3) {
                        if (((Boolean) ((ipk) obj2).m.dL()).booleanValue()) {
                            ((ipk) obj2).f();
                        } else {
                            ((ipk) obj2).ek(iqhVar, false);
                        }
                        return;
                    }
                    return;
                }
            }
        }
        ltg ltgVar = (ltg) obj;
        Object obj3 = this.a;
        synchronized (obj3) {
            int iOrdinal2 = ltgVar.ordinal();
            if (iOrdinal2 == 0) {
                ((myl) obj3).g.d(luf.aN, false);
            } else {
                if (iOrdinal2 == 1) {
                    ((myl) obj3).f();
                    return;
                }
                throw new AssertionError("Unexpected Mars selection: " + ltgVar.toString());
            }
        }
    }
}
