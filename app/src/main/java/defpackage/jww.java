package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jww implements pau {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public jww(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.pau
    public final /* synthetic */ void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            ((jxa) this.a).G((String) obj);
            return;
        }
        if (i == 1) {
            jxa jxaVar = (jxa) this.a;
            if (jxaVar.q == 1 && jxaVar.N == 0) {
                jxaVar.A.post(new juc(this, 9, null));
                return;
            }
            return;
        }
        Object obj2 = this.a;
        synchronized (((llj) obj2).d) {
            if (!((llj) obj2).e && ((Boolean) ((ovx) ((llj) obj2).c).d).booleanValue()) {
                ((llj) obj2).b();
            }
        }
    }
}
