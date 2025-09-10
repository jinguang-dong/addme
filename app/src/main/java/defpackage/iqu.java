package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iqu implements mng {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public iqu(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.mng
    public final void e(int i) {
        iqv iqvVar;
        paq paqVar;
        ips ipsVar;
        paq paqVar2;
        if (this.b != 0) {
            if (i != 23 || (paqVar2 = (ipsVar = (ips) this.a).g) == null) {
                return;
            }
            paqVar2.close();
            ipsVar.g = null;
            return;
        }
        if (i != 37 || (paqVar = (iqvVar = (iqv) this.a).g) == null) {
            return;
        }
        paqVar.close();
        iqvVar.g = null;
    }

    @Override // defpackage.mng
    public final void eE(int i) {
        if (this.b != 0) {
            if (i == 23) {
                Object obj = this.a;
                ips ipsVar = (ips) obj;
                ipsVar.g = ipsVar.c.dK(new iqt(this, 1, null), ojl.ce());
                return;
            }
            return;
        }
        if (i == 37) {
            Object obj2 = this.a;
            iqv iqvVar = (iqv) obj2;
            iqvVar.g = iqvVar.c.dK(new iqt(this, 0), ojl.ce());
        }
    }
}
