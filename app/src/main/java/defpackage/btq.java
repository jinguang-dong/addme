package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class btq {
    public static final btn a = new btn();

    public static final void a(bik bikVar, uiu uiuVar, ayc aycVar, int i, int i2) {
        int i3;
        ayc aycVarC = aycVar.c(-1298353104);
        if (i2 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != aycVarC.B(bikVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != aycVarC.D(uiuVar) ? 16 : 32;
        }
        if (aycVarC.H((i3 & 19) != 18, i3 & 1)) {
            if (i2 != 0) {
                bikVar = bik.c;
            }
            ayg aygVar = (ayg) aycVarC;
            Object objR = aygVar.R();
            if (objR == ayb.a) {
                objR = new hls(bsv.a);
                aygVar.ac(objR);
            }
            b((hls) objR, bikVar, uiuVar, aycVarC, (i3 << 3) & 1008);
        } else {
            aycVarC.r();
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new bto(bikVar, uiuVar, i, i2);
        }
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, uiu] */
    public static final void b(hls hlsVar, bik bikVar, uiu uiuVar, ayc aycVar, int i) {
        int i2;
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(-511989831);
        if (i3 == 0) {
            i2 = (true != aycVarC.D(hlsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != aycVarC.B(bikVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != aycVarC.D(uiuVar) ? 128 : 256;
        }
        if (aycVarC.H((i2 & 147) != 146, i2 & 1)) {
            int iR = a.r(bay.N(aycVarC));
            ayg aygVar = (ayg) aycVarC;
            aygVar.ab(206, ayi.e);
            if (aygVar.v) {
                baz.X(aygVar.q);
            }
            Object objQ = aygVar.Q();
            aye ayeVar = objQ instanceof aye ? (aye) objQ : null;
            if (ayeVar == null) {
                ayeVar = new aye(new ayf(aygVar, aygVar.w, aygVar.g, aygVar.m));
                aygVar.ae(ayeVar);
            }
            bfk bfkVarAg = aygVar.ag();
            ayf ayfVar = ayeVar.a;
            ayfVar.b.b(bfkVarAg);
            aygVar.Y();
            bik bikVarV = bay.v(aycVarC, bikVar);
            bfk bfkVarAg2 = aygVar.ag();
            uif uifVar = bvm.a;
            aycVarC.v();
            if (aygVar.v) {
                aycVarC.j(uifVar);
            } else {
                aycVarC.x();
            }
            bbr.a(aycVarC, hlsVar, hlsVar.d);
            bbr.a(aycVarC, ayfVar, hlsVar.b);
            bbr.a(aycVarC, uiuVar, hlsVar.a);
            bbr.a(aycVarC, bfkVarAg2, bum.c);
            bbr.a(aycVarC, bikVarV, bum.b);
            uiu uiuVar2 = bum.e;
            if (aygVar.v || !a.ao(aygVar.R(), Integer.valueOf(iR))) {
                Integer numValueOf = Integer.valueOf(iR);
                aygVar.ac(numValueOf);
                aycVarC.h(numValueOf, uiuVar2);
            }
            aycVarC.m();
            if (aycVarC.G()) {
                aycVarC.u(-1259218039);
                aygVar.Y();
            } else {
                aycVarC.u(-1259276660);
                boolean zD = aycVarC.D(hlsVar);
                Object objR = aygVar.R();
                if (zD || objR == ayb.a) {
                    objR = new bol(hlsVar, 4);
                    aygVar.ac(objR);
                }
                azb.g((uif) objR, aycVarC);
                aygVar.Y();
            }
        } else {
            aycVarC.r();
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new btp(hlsVar, bikVar, uiuVar, i);
        }
    }
}
