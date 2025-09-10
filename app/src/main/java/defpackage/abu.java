package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abu {
    public static final acy a;
    private static final acy b = byi.bf(0.0f, 0.0f, null, 7);

    static {
        Map map = aef.a;
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
        a = byi.bf(0.0f, 0.0f, 1, 3);
    }

    public static final bbo a(float f, aby abyVar, uiq uiqVar, ayc aycVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            abyVar = b;
        }
        float f2 = (i2 & 4) != 0 ? 0.01f : 0.0f;
        if ((i2 & 16) != 0) {
            uiqVar = null;
        }
        uiq uiqVar2 = uiqVar;
        if (abyVar == b) {
            aycVar.u(1144107839);
            boolean zY = aycVar.y(f2);
            Object objF = aycVar.f();
            if (zY || objF == ayb.a) {
                objF = byi.bf(0.0f, 0.0f, Float.valueOf(f2), 3);
                aycVar.w(objF);
            }
            abyVar = (acy) objF;
            aycVar.n();
        } else {
            aycVar.u(1144217765);
            aycVar.n();
        }
        return b(Float.valueOf(f), adu.a, abyVar, Float.valueOf(f2), uiqVar2, aycVar, i & 14, 0);
    }

    public static final bbo b(Object obj, byz byzVar, aby abyVar, Object obj2, uiq uiqVar, ayc aycVar, int i, int i2) {
        aby acyVar;
        if ((i2 & 4) != 0) {
            Object objF = aycVar.f();
            if (objF == ayb.a) {
                objF = byi.bf(0.0f, 0.0f, null, 7);
                aycVar.w(objF);
            }
            acyVar = (acy) objF;
        } else {
            acyVar = abyVar;
        }
        Object obj3 = (i2 & 8) != 0 ? null : obj2;
        Object objF2 = aycVar.f();
        Object obj4 = ayb.a;
        if (objF2 == obj4) {
            Object azzVar = new azz(null, bap.c);
            aycVar.w(azzVar);
            objF2 = azzVar;
        }
        azr azrVar = (azr) objF2;
        Object objF3 = aycVar.f();
        if (objF3 == obj4) {
            objF3 = new abr(obj, byzVar, obj3);
            aycVar.w(objF3);
        }
        abr abrVar = (abr) objF3;
        bbo bboVarAh = byi.ah(uiqVar, aycVar);
        if (obj3 != null && (acyVar instanceof acy)) {
            acy acyVar2 = (acy) acyVar;
            if (!a.ao(acyVar2.c, obj3)) {
                acyVar = new acy(acyVar2.a, acyVar2.b, obj3);
            }
        }
        bbo bboVarAh2 = byi.ah(acyVar, aycVar);
        Object objF4 = aycVar.f();
        if (objF4 == obj4) {
            objF4 = ukc.P(-1, 0, null, 6);
            aycVar.w(objF4);
        }
        uqm uqmVar = (uqm) objF4;
        boolean zD = aycVar.D(uqmVar) | ((((i & 14) ^ 6) > 4 && aycVar.D(obj)) || (i & 6) == 4);
        Object objF5 = aycVar.f();
        if (zD || objF5 == obj4) {
            objF5 = new sn(uqmVar, obj, 3);
            aycVar.w(objF5);
        }
        azb.g((uif) objF5, aycVar);
        boolean zD2 = aycVar.D(uqmVar) | aycVar.D(abrVar) | aycVar.B(bboVarAh2) | aycVar.B(bboVarAh);
        Object objF6 = aycVar.f();
        if (zD2 || objF6 == obj4) {
            Object abtVar = new abt(uqmVar, abrVar, bboVarAh2, bboVarAh, null);
            aycVar.w(abtVar);
            objF6 = abtVar;
        }
        azb.f(uqmVar, (uiu) objF6, aycVar);
        bbo bboVar = (bbo) azrVar.a();
        return bboVar == null ? abrVar.a : bboVar;
    }
}
