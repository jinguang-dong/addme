package defpackage;

import android.graphics.PointF;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eka implements eky {
    public static final eka a = new eka();
    private static final iso b = iso.y("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    private eka() {
    }

    @Override // defpackage.eky
    public final /* synthetic */ Object a(elb elbVar, float f) {
        elbVar.h();
        String strF = null;
        String strF2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        boolean zO = true;
        float fA = 0.0f;
        float fA2 = 0.0f;
        float fA3 = 0.0f;
        float fA4 = 0.0f;
        int iB = 0;
        int iB2 = 0;
        int iB3 = 0;
        while (true) {
            int i = 3;
            while (elbVar.n()) {
                switch (elbVar.q(b)) {
                    case 0:
                        strF = elbVar.f();
                        break;
                    case 1:
                        strF2 = elbVar.f();
                        break;
                    case 2:
                        fA = (float) elbVar.a();
                        break;
                    case 3:
                        int iB4 = elbVar.b();
                        if (iB4 <= 2 && iB4 >= 0) {
                            i = a.an()[iB4];
                            break;
                        } else {
                            break;
                        }
                        break;
                    case 4:
                        iB = elbVar.b();
                        break;
                    case 5:
                        fA2 = (float) elbVar.a();
                        break;
                    case 6:
                        fA3 = (float) elbVar.a();
                        break;
                    case 7:
                        iB2 = eki.b(elbVar);
                        break;
                    case 8:
                        iB3 = eki.b(elbVar);
                        break;
                    case 9:
                        fA4 = (float) elbVar.a();
                        break;
                    case 10:
                        zO = elbVar.o();
                        break;
                    case 11:
                        elbVar.g();
                        PointF pointF3 = new PointF(((float) elbVar.a()) * f, ((float) elbVar.a()) * f);
                        elbVar.i();
                        pointF = pointF3;
                        break;
                    case 12:
                        elbVar.g();
                        PointF pointF4 = new PointF(((float) elbVar.a()) * f, ((float) elbVar.a()) * f);
                        elbVar.i();
                        pointF2 = pointF4;
                        break;
                    default:
                        elbVar.l();
                        elbVar.m();
                        break;
                }
            }
            elbVar.j();
            return new ehx(strF, strF2, fA, i, iB, fA2, fA3, iB2, iB3, fA4, zO, pointF, pointF2);
        }
    }
}
