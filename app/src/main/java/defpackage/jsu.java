package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jsu {
    private jpy b = null;
    public final pmv a = new pmv(new jst());

    public final int a() {
        int i;
        pmv pmvVar = this.a;
        synchronized (pmvVar.a) {
            i = ((ryb) pmvVar.b).b;
        }
        return i;
    }

    public final boolean b(long j, jss jssVar) {
        pmv pmvVar = this.a;
        synchronized (pmvVar) {
            jpy jpyVar = (jpy) pmvVar.k(j);
            if (jpyVar == null) {
                return false;
            }
            jssVar.a(jpyVar.a);
            this.b = jpyVar;
            while (true) {
                jpy jpyVar2 = (jpy) pmvVar.l();
                if (jpyVar2 == null || !jpyVar2.e(jpyVar)) {
                    break;
                }
                jpy jpyVar3 = (jpy) pmvVar.m();
                if (jpyVar3 != null) {
                    jpyVar3.b();
                }
            }
            return true;
        }
    }

    public final void c(jpy jpyVar) {
        pmv pmvVar = this.a;
        synchronized (pmvVar) {
            jpy jpyVar2 = this.b;
            if (jpyVar2 == null || !jpyVar.e(jpyVar2)) {
                pmvVar.o(jpyVar.a(), jpyVar);
            } else {
                jpyVar.b();
            }
        }
    }
}
