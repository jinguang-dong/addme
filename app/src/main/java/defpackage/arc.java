package defpackage;

import android.graphics.RectF;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class arc implements uiq {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ arc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r10v30, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r10v45, types: [azr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v47, types: [azr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v49, types: [bbo, java.lang.Object] */
    @Override // defpackage.uiq
    public final Object a(Object obj) {
        float fSin;
        cfd cfdVar = null;
        switch (this.b) {
            case 0:
                return a.y((bte) this.a, (btd) obj);
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                are areVar = (are) this.a;
                ard ardVar = areVar.i;
                if (ardVar == null) {
                    z = false;
                } else {
                    ardVar.b = zBooleanValue;
                    areVar.l();
                }
                return Boolean.valueOf(z);
            case 2:
                float fFloatValue = ((Float) obj).floatValue();
                aus ausVar = (aus) this.a;
                bbb bbbVar = ausVar.l;
                float fE = bbbVar.e() + fFloatValue;
                float fM = ukc.m(fE, ausVar.f, ausVar.g);
                float f = fE - fM;
                ata ataVar = (ata) ausVar.i.a();
                if (ataVar != null) {
                    float f2 = ataVar.a;
                    float f3 = f / f2;
                    if (f3 < -1.0f) {
                        f3 = -1.0f;
                    }
                    if (f3 > 1.0f) {
                        f3 = 1.0f;
                    }
                    fSin = (f2 / 10.0f) * ((float) Math.sin((f3 * 3.1415927f) / 2.0f));
                } else {
                    fSin = 0.0f;
                }
                ausVar.j.i(fM + fSin);
                ausVar.k.i(f);
                bbbVar.i(fE);
                return ufg.a;
            case 3:
                cbn cbnVar = (cbn) obj;
                int i = avx.a;
                cbw.d(cbnVar, (String) this.a);
                cbw.g(cbnVar, 5);
                return ufg.a;
            case 4:
                utl utlVar = bao.k;
                ((ayn) this.a).a(obj);
                return ufg.a;
            case 5:
                Throwable th = (Throwable) obj;
                CancellationException cancellationExceptionB = ujo.b("Recomposer effect job completed", th);
                Object obj2 = this.a;
                synchronized (((bao) obj2).c) {
                    uol uolVar = ((bao) obj2).d;
                    if (uolVar != null) {
                        ((bao) obj2).l.e(bak.b);
                        uolVar.s(cancellationExceptionB);
                        ((bao) obj2).i = null;
                        uolVar.o(new aff(obj2, th, 15));
                    } else {
                        ((bao) obj2).e = cancellationExceptionB;
                        ((bao) obj2).l.e(bak.a);
                    }
                }
                return ufg.a;
            case 6:
                if (obj instanceof bhm) {
                    ((bhm) obj).j(4);
                }
                ((zw) this.a).j(obj);
                return ufg.a;
            case 7:
                bfx bfxVar = ((bfv) this.a).b;
                return Boolean.valueOf(bfxVar != null ? bfxVar.e(obj) : true);
            case 8:
                uiq uiqVar = bgr.a;
                bgj bgjVar = (bgj) this.a.a((bgq) obj);
                synchronized (bgr.b) {
                    bgr.c = bgr.c.d(bgjVar.v());
                }
                return bgjVar;
            case 9:
                cfv cfvVar = (cfv) obj;
                cfp cfpVar = cfvVar.b;
                int i2 = cfvVar.c;
                int i3 = cfvVar.d;
                Object obj3 = cfvVar.e;
                return ((qqq) this.a).I(new cfv(cfdVar, cfpVar)).a();
            case 10:
                Throwable th2 = (Throwable) obj;
                Object obj4 = this.a;
                if (th2 != null) {
                    ((cru) obj4).g.r(new cse(th2));
                }
                cru cruVar = (cru) obj4;
                if (cruVar.d.b()) {
                    cruVar.i().a();
                }
                return ufg.a;
            case 11:
                ddw ddwVarA = ((ddo) obj).a("UPDATE FatalErrorCounts SET failuresBeforeRebootDuringOpen = 0 , failuresAfterRebootDuringOpen = 0 WHERE cameraId = ?");
                Object obj5 = this.a;
                try {
                    if (obj5 == null) {
                        ddwVarA.f(1);
                    } else {
                        ddwVarA.g(1, (String) obj5);
                    }
                    ddwVarA.j();
                    return null;
                } finally {
                    ddwVarA.close();
                }
            case 12:
                bry bryVar = (bry) obj;
                bryVar.getClass();
                this.a.b(new bkf(bryVar.l(0L)));
                return ufg.a;
            case 13:
                bry bryVar2 = (bry) obj;
                bryVar2.getClass();
                long jS = byi.s(bryVar2);
                long j = jS >> 32;
                int i4 = (int) (jS & 4294967295L);
                int i5 = (int) j;
                this.a.b(new RectF(Float.intBitsToFloat(i5), Float.intBitsToFloat(i4), Float.intBitsToFloat(i5) + ((int) (bryVar2.h() >> 32)), Float.intBitsToFloat(i4) + ((int) (4294967295L & bryVar2.h()))));
                return ufg.a;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((chq) obj).getClass();
                return new chy(((Number) this.a.a()).intValue() & 4294967295L);
            case 15:
                int iIntValue = ((Integer) obj).intValue();
                if (iIntValue >= 0) {
                    gwv gwvVar = (gwv) this.a;
                    List list = gwvVar.J;
                    if (iIntValue < list.size()) {
                        Iterator it = gwvVar.j.iterator();
                        while (it.hasNext()) {
                            ((gwy) it.next()).a(iIntValue);
                        }
                        float fFloatValue2 = ((Number) list.get(iIntValue)).floatValue();
                        Float f4 = (Float) gwvVar.g.dL();
                        if (!ujp.d(f4, fFloatValue2)) {
                            mdy mdyVar = gwvVar.R;
                            f4.getClass();
                            mdyVar.r(11, f4.floatValue(), fFloatValue2, ((goi) gwvVar.d.dL()).a());
                            gwv.H(gwvVar, f4.floatValue(), fFloatValue2, 0, null, null, 28);
                        }
                    }
                }
                return ufg.a;
            case 16:
                ((ljj) this.a).q.h((String) obj);
                return ufg.a;
            default:
                ((lkn) this.a).p.h((String) obj);
                return ufg.a;
        }
    }
}
