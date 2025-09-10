package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.view.Display;
import android.widget.CheckBox;
import j$.util.Optional;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gtm {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public gtm(fvu fvuVar, ndj ndjVar, krj krjVar, owq owqVar, hie hieVar, owq owqVar2) {
        this.b = fvuVar;
        this.a = ndjVar;
        this.e = krjVar;
        this.f = owqVar;
        this.d = hieVar;
        this.c = owqVar2;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void a(pka pkaVar, int i, int i2) {
        syu syuVarD;
        int iQ;
        int iP;
        if (i2 == 3) {
            syuVarD = ((gox) this.c).d(gox.c(pkaVar));
            cxb cxbVar = (cxb) this.d;
            iQ = cxbVar.s();
            iP = cxbVar.r();
        } else {
            syuVarD = ((gox) this.c).d(gox.b(pkaVar));
            cxb cxbVar2 = (cxb) this.d;
            iQ = cxbVar2.q();
            iP = cxbVar2.p();
        }
        ske.W(syuVarD, new god(this, pkaVar, i, i2, iQ, iP), this.f);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, pbc] */
    public final void b(pka pkaVar, int i, int i2, int i3, int i4) {
        String strValueOf = String.valueOf(pkaVar);
        String str = i != 2 ? "SWITCH" : "AUTOMATIC";
        String strX = ezh.x(i2);
        String strM = sla.m(i3);
        this.b.b("Hardware help dialog when falling back to working camera. defective camera: " + strValueOf + " Trigger reason " + str + " Fallback reason " + strX + " at stage " + strM + " event type " + Integer.toString(i4 - 1));
        ((mdy) this.f).u(i4, i3, i2, pkaVar, i);
    }

    public final void c(pka pkaVar, int i, int i2, int i3) {
        b(pkaVar, i, i2, i3, 4);
    }

    public final void d(pka pkaVar, int i, int i2, int i3) {
        b(pkaVar, i, i2, i3, 3);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, pbc] */
    public final void e(int i, int i2) {
        this.c.b("Hardware help dialog for unavailability of any cameras due to reason: " + ezh.x(i2) + " at stage " + sla.m(i) + " Negative button clicked");
        ((mdy) this.f).u(4, i, i2, null, 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, ndj] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, owq] */
    public final void f() {
        this.f.a(true);
        ((fvu) this.b).k();
        this.a.C();
        this.c.a(fyx.RECORDING);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, owq] */
    public final void g() throws Resources.NotFoundException {
        ((krj) this.e).k();
        this.f.a(true);
        CheckBox checkBox = ((hie) this.d).p;
        rnt.w(checkBox, "EvCompViewController must be first initialized", new Object[0]);
        checkBox.setSoundEffectsEnabled(false);
        this.c.a(fyx.RECORDING);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, ndj] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, owq] */
    public final void h() {
        this.f.a(false);
        ((fvu) this.b).i();
        this.a.y();
        this.c.a(fyx.PAUSED);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, owq] */
    public final void i() {
        ((krj) this.e).j();
        this.f.a(false);
        CheckBox checkBox = ((hie) this.d).p;
        rnt.w(checkBox, "EvCompViewController must be first initialized", new Object[0]);
        checkBox.setSoundEffectsEnabled(true);
        this.c.a(fyx.READY);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, tzj] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, tzj] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, tzj] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, tzj] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, tzj] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, tzj] */
    public final gjw j(nkw nkwVar) {
        nkw nkwVar2 = nkw.UNINITIALIZED;
        int iOrdinal = nkwVar.ordinal();
        return iOrdinal != 5 ? iOrdinal != 8 ? iOrdinal != 19 ? iOrdinal != 13 ? iOrdinal != 14 ? (gjw) this.f.a() : (gjw) this.e.a() : (gjw) this.d.a() : (gjw) this.b.a() : (gjw) this.c.a() : (gjw) this.a.a();
    }

    public final int k() {
        gzi gziVar = gym.a;
        return o() ? 5 : 2;
    }

    public final oxj l(pka pkaVar) {
        pka pkaVar2 = pka.FRONT;
        gzi gziVar = pkaVar == pkaVar2 ? gym.f : gym.g;
        rwc rwcVarI = rwc.i((Integer) ((hbj) this.d).a(gziVar).orElse(null));
        if (!rwcVarI.h()) {
            if (pkaVar == pkaVar2) {
                return oxj.RES_1080P;
            }
            return ((Boolean) ((luj) this.a).b(luf.V)).booleanValue() ? oxj.RES_2160P : oxj.RES_1080P;
        }
        int iIntValue = ((Integer) rwcVarI.c()).intValue();
        if (iIntValue == 144) {
            return oxj.RES_QCIF;
        }
        if (iIntValue == 240) {
            return oxj.RES_QVGA;
        }
        if (iIntValue == 288) {
            return oxj.RES_CIF;
        }
        if (iIntValue == 480) {
            return oxj.RES_480P;
        }
        if (iIntValue == 720) {
            return oxj.RES_720P;
        }
        if (iIntValue == 1080) {
            return oxj.RES_1080P;
        }
        if (iIntValue == 2160) {
            return oxj.RES_2160P;
        }
        throw new IllegalArgumentException("Value " + rwcVarI.c().toString() + " for ADB flag " + gziVar.a + " not supported.");
    }

    public final Long m() throws NumberFormatException {
        Object obj = this.d;
        gzg gzgVar = gym.N;
        hbj hbjVar = (hbj) obj;
        gox goxVar = (gox) hbjVar.b.get(gzgVar);
        goxVar.getClass();
        Optional optionalEmpty = Optional.empty();
        if (gzgVar.a()) {
            optionalEmpty = Optional.of((Long) goxVar.k());
        }
        if (gzgVar.b()) {
            Supplier supplier = gzgVar.d;
            supplier.getClass();
            Object obj2 = supplier.get();
            obj2.getClass();
            optionalEmpty = Optional.of((Long) obj2);
        }
        if (!optionalEmpty.isPresent() || gzgVar.c) {
            hbh hbhVar = hbjVar.c;
            String str = gzgVar.a;
            String strE = hbhVar.e(str);
            Object objDecode = null;
            if (strE != null) {
                try {
                    objDecode = Long.decode(strE);
                    hbhVar.f(gzgVar);
                } catch (NumberFormatException e) {
                    ((sgt) ((sgt) hbh.a.c().i(e)).M(1097)).E("getAdbOrPreferenceLongValue: adbName=%s value=%s", str, strE);
                }
            }
            if (objDecode == null) {
                SharedPreferences sharedPreferences = hbhVar.c;
                if (sharedPreferences.contains(str)) {
                    hbhVar.f(gzgVar);
                    objDecode = Long.valueOf(sharedPreferences.getLong(str, Long.MIN_VALUE));
                }
            }
            if (objDecode == null && optionalEmpty.isPresent()) {
                objDecode = optionalEmpty.get();
            }
            if (objDecode == null) {
                objDecode = (Long) goxVar.b;
            }
            optionalEmpty = (objDecode == null || ((Long) objDecode).longValue() == Long.MIN_VALUE) ? Optional.empty() : Optional.of(objDecode);
        }
        return (Long) optionalEmpty.orElse(4000000000L);
    }

    public final boolean n(Context context, pka pkaVar) {
        if (pkaVar.equals(pka.BACK)) {
            return true;
        }
        hbj hbjVar = (hbj) this.d;
        if (!hbjVar.p(gza.e)) {
            return hbjVar.p(gym.ah);
        }
        Display display = context.getDisplay();
        display.getClass();
        if (qpt.bh(context, display).getWidth() < 580) {
            return hbjVar.p(gym.ah);
        }
        return false;
    }

    public final boolean o() {
        gzi gziVar = gym.a;
        if (((Boolean) ((luj) this.a).b(luf.Q)).booleanValue()) {
            if (((hbj) this.d).p(gym.o) && ((pfl) this.f).a()) {
                return true;
            }
        }
        return false;
    }

    public final boolean p() {
        return ((Boolean) ((luj) this.a).b(luf.O)).booleanValue();
    }

    public final boolean q() {
        return ((hbj) this.d).o(gym.r);
    }

    public gtm(gue gueVar, gun gunVar, guk gukVar, iso isoVar, gtx gtxVar, gtn gtnVar) {
        this.a = gueVar;
        this.b = gunVar;
        this.c = gukVar;
        this.f = isoVar;
        this.d = gtxVar;
        this.e = gtnVar;
    }

    public gtm(hbj hbjVar, uem uemVar, uem uemVar2, uem uemVar3, uem uemVar4, uem uemVar5) {
        this.e = hbjVar;
        this.a = uemVar;
        this.b = uemVar2;
        this.f = uemVar3;
        this.d = uemVar4;
        this.c = uemVar5;
    }

    public gtm(luj lujVar, pfl pflVar, hbj hbjVar, owf owfVar, owf owfVar2, gnt gntVar) {
        this.a = lujVar;
        this.f = pflVar;
        this.d = hbjVar;
        this.b = owfVar;
        this.c = owfVar2;
        this.e = gntVar;
    }

    public gtm(tzj tzjVar, tzj tzjVar2, tzj tzjVar3, tzj tzjVar4, tzj tzjVar5, tzj tzjVar6) {
        this.a = tzjVar;
        this.f = tzjVar2;
        this.c = tzjVar3;
        this.d = tzjVar4;
        this.e = tzjVar5;
        this.b = tzjVar6;
    }

    public gtm(Context context, feb febVar, Activity activity, mdy mdyVar, pbc pbcVar, cxb cxbVar, byte[] bArr) {
        this.d = context;
        this.e = febVar;
        this.b = activity;
        this.f = mdyVar;
        this.a = cxbVar;
        this.c = pbcVar.a("CamUnavailableHelp");
    }

    public gtm(uem uemVar, uem uemVar2, uem uemVar3, uem uemVar4, uem uemVar5, uem uemVar6) {
        uemVar.getClass();
        this.e = uemVar;
        this.a = uemVar2;
        uemVar3.getClass();
        this.f = uemVar3;
        uemVar4.getClass();
        this.d = uemVar4;
        uemVar5.getClass();
        this.c = uemVar5;
        uemVar6.getClass();
        this.b = uemVar6;
    }

    public gtm(Context context, feb febVar, Activity activity, mdy mdyVar, pbc pbcVar, cxb cxbVar) {
        this.d = context;
        this.a = febVar;
        this.e = activity;
        this.f = mdyVar;
        this.c = cxbVar;
        this.b = pbcVar.a("FallbackHelper");
    }

    public gtm(out outVar, gox goxVar, gtm gtmVar, cxb cxbVar, pbc pbcVar, gof gofVar) {
        this.f = outVar;
        this.c = goxVar;
        this.e = gtmVar;
        this.d = cxbVar;
        this.a = gofVar;
        this.b = pbcVar.a("FallbackHandler");
    }
}
