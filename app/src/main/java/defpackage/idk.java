package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class idk implements iec {
    public static final sgv a = sgv.g("idk");
    private final hbj B;
    public final boolean b;
    private final pbn c;
    private final idt d;
    private final pjp e;
    private final owf f;
    private final owf g;
    private final owf h;
    private final owf i;
    private final owf j;
    private final Optional k;
    private final Optional l;
    private final Optional m;
    private final Optional n;
    private final ifo o;
    private final owf p;
    private final ibb q;
    private final owf r;
    private final String s;
    private final String t;
    private final String u;
    private final String v;
    private final boolean w;
    private final Range x;
    private final Range y;
    private final Map z = new idi();
    private final Map A = new idi();

    public idk(pbn pbnVar, idt idtVar, pjp pjpVar, owf owfVar, owf owfVar2, Map map, owf owfVar3, owf owfVar4, owf owfVar5, ifo ifoVar, owf owfVar6, ibb ibbVar, jwd jwdVar, hbj hbjVar, owf owfVar7) {
        this.c = pbnVar;
        this.d = idtVar;
        this.e = pjpVar;
        this.f = owfVar;
        this.g = owfVar2;
        this.B = hbjVar;
        this.h = owfVar3;
        this.i = owfVar4;
        this.j = owfVar5;
        this.o = ifoVar;
        this.p = owfVar6;
        this.q = ibbVar;
        this.r = owfVar7;
        this.t = c((peo) map.get(lcz.RAW_WIDE_RM_UPPER));
        this.u = c((peo) map.get(lcz.RAW_WIDE_UPPER));
        this.s = c((peo) map.get(lcz.RAW_WIDE));
        this.v = c((peo) map.get(lcz.RAW_TELE));
        this.k = jwdVar.a;
        this.l = jwdVar.c;
        this.m = jwdVar.g;
        this.n = jwdVar.i;
        this.w = hbjVar.p(gzc.Q);
        this.b = hbjVar.p(gzc.T);
        this.x = Range.create((Float) hbjVar.e(gzc.K).orElse(Float.valueOf(2.45f)), (Float) hbjVar.e(gzc.L).orElse(Float.valueOf(4.9f)));
        this.y = Range.create((Float) hbjVar.e(gzc.q).orElse(Float.valueOf(1.0f)), (Float) hbjVar.e(gzc.r).orElse(Float.valueOf(1.99f)));
    }

    private final Object b(poe poeVar, CameraCharacteristics.Key key) {
        String strB = poeVar.b();
        strB.getClass();
        Object objM = this.e.a(pjr.b(strB)).m(key);
        objM.getClass();
        return objM;
    }

    private static String c(peo peoVar) {
        return (String) Optional.ofNullable(peoVar).map(new hci(6)).orElse(null);
    }

    private static final void d(poe poeVar) {
        poeVar.d();
        poeVar.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x03ca  */
    @Override // defpackage.iec
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.iea a(defpackage.poe r12, boolean r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 1507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.idk.a(poe, boolean, boolean):iea");
    }
}
