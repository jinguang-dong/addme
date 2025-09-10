package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bpo {
    public final bdp d = new bdp(new bpn[16]);
    public final zo e = new zo(10);

    public boolean c(zb zbVar, bry bryVar, ebn ebnVar, boolean z) {
        bdp bdpVar = this.d;
        Object[] objArr = bdpVar.a;
        int i = bdpVar.b;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = ((bpn) objArr[i2]).c(zbVar, bryVar, ebnVar, z) || z2;
        }
        return z2;
    }

    public final void f() {
        bdp bdpVar = this.d;
        int i = bdpVar.b;
        while (true) {
            i--;
            if (i < 0) {
                return;
            }
            if (((bpn) bdpVar.a[i]).c.a == 0) {
                bdpVar.c(i);
            }
        }
    }
}
