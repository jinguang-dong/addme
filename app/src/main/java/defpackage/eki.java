package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eki {
    private static final iso a = iso.y("x", "y");

    static float a(elb elbVar) {
        int iP = elbVar.p();
        int i = iP - 1;
        if (i != 0) {
            if (i == 6) {
                return (float) elbVar.a();
            }
            throw new IllegalArgumentException("Unknown value for token of type ".concat(a.L(iP)));
        }
        elbVar.g();
        float fA = (float) elbVar.a();
        while (elbVar.n()) {
            elbVar.m();
        }
        elbVar.i();
        return fA;
    }

    static int b(elb elbVar) {
        elbVar.g();
        double dA = elbVar.a() * 255.0d;
        double dA2 = elbVar.a() * 255.0d;
        double dA3 = elbVar.a() * 255.0d;
        while (elbVar.n()) {
            elbVar.m();
        }
        int i = (int) dA2;
        int i2 = (int) dA;
        elbVar.i();
        return Color.argb(255, i2, i, (int) dA3);
    }

    static PointF c(elb elbVar, float f) {
        int iP = elbVar.p() - 1;
        if (iP == 0) {
            elbVar.g();
            float fA = (float) elbVar.a();
            float fA2 = (float) elbVar.a();
            while (elbVar.p() != 2) {
                elbVar.m();
            }
            elbVar.i();
            return new PointF(fA * f, fA2 * f);
        }
        if (iP != 2) {
            if (iP != 6) {
                throw new IllegalArgumentException("Unknown point starts with ".concat(a.L(elbVar.p())));
            }
            float fA3 = (float) elbVar.a();
            float fA4 = (float) elbVar.a();
            while (elbVar.n()) {
                elbVar.m();
            }
            return new PointF(fA3 * f, fA4 * f);
        }
        elbVar.h();
        float fA5 = 0.0f;
        float fA6 = 0.0f;
        while (elbVar.n()) {
            int iQ = elbVar.q(a);
            if (iQ == 0) {
                fA5 = a(elbVar);
            } else if (iQ != 1) {
                elbVar.l();
                elbVar.m();
            } else {
                fA6 = a(elbVar);
            }
        }
        elbVar.j();
        return new PointF(fA5 * f, fA6 * f);
    }

    static List d(elb elbVar, float f) {
        ArrayList arrayList = new ArrayList();
        elbVar.g();
        while (elbVar.p() == 1) {
            elbVar.g();
            arrayList.add(c(elbVar, f));
            elbVar.i();
        }
        elbVar.i();
        return arrayList;
    }
}
