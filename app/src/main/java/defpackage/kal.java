package defpackage;

import android.os.SystemClock;
import com.google.android.apps.camera.autotimer.analysis.jni.wVCD.HHdu;
import com.google.android.apps.camera.jni.saliency.tLp.KsvNaXS;
import com.google.android.libraries.oliveoil.natives.TtaZ.VnmwoBe;
import com.google.googlex.gcam.dirtylens.PrCd.SHXc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kal {
    private final lny a;
    private final pbc b;
    private final int c;
    private final Map d = new HashMap();
    private final hbj e;
    private final iso f;

    public kal(lny lnyVar, iso isoVar, pbc pbcVar, hbj hbjVar) {
        this.a = lnyVar;
        this.f = isoVar;
        this.b = pbcVar.a("MomentsMetadata");
        this.e = hbjVar;
        this.c = true != ((hbj) isoVar.a).p(haa.ag) ? 2 : 3;
    }

    private final synchronized kak g(ltd ltdVar) {
        kak kakVar;
        Map map = this.d;
        if (!map.containsKey(ltdVar)) {
            map.put(ltdVar, new kak());
        }
        kakVar = (kak) map.get(ltdVar);
        kakVar.getClass();
        return kakVar;
    }

    private static void i(float f) {
        Math.min(Math.max(f, 0.0f), 1.0f);
    }

    public final synchronized syu a(ltd ltdVar) {
        kak kakVarG;
        pbc pbcVar = this.b;
        kakVarG = g(ltdVar);
        pbcVar.b(mn.i(ltdVar, "uri ", " is collecting Moments metadata"));
        return kakVarG.a;
    }

    public final synchronized void b(ltd ltdVar, long j) {
        this.b.b("uri " + String.valueOf(ltdVar) + " : main session has base frame " + j);
        Map map = this.d;
        if (map.containsKey(ltdVar)) {
            ((kak) map.get(ltdVar)).e = j;
        }
        h();
    }

    public final synchronized void c(ltd ltdVar) {
        kak kakVarG = g(ltdVar);
        if (kakVarG.c) {
            return;
        }
        kakVarG.a.e(rvk.a);
    }

    public final synchronized void e(ltd ltdVar) {
        this.b.b(mn.i(ltdVar, "uri ", " has LongS active"));
        kak kakVarG = g(ltdVar);
        kakVarG.c = true;
        kakVarG.d = true;
    }

    public final synchronized void f(ltd ltdVar) {
        this.b.b(mn.i(ltdVar, "uri ", " has Moments active"));
        kak kakVarG = g(ltdVar);
        kakVarG.c = true;
        kakVarG.d = false;
    }

    private final synchronized void h() {
        int i;
        float f;
        Iterator it;
        Object objJ;
        float f2;
        Iterator it2;
        float f3;
        Iterator it3;
        float f4;
        ArrayList arrayList = new ArrayList();
        Map map = this.d;
        Iterator it4 = map.entrySet().iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it4.next();
            kak kakVar = (kak) entry.getValue();
            if (kakVar.c) {
                List list = kakVar.f;
                if (list != null && list.isEmpty()) {
                    szh szhVar = kakVar.a;
                    if (!szhVar.isDone()) {
                        szhVar.e(rvk.a);
                    }
                }
                if (kakVar.f != null && (kakVar.e != -1 || kakVar.d)) {
                    szh szhVar2 = kakVar.a;
                    if (!szhVar2.isDone()) {
                        ltd ltdVar = (ltd) entry.getKey();
                        List list2 = kakVar.f;
                        list2.getClass();
                        if (list2.isEmpty()) {
                            this.b.b(mn.i(ltdVar, "for ", ": no alternatives, not adding metadata."));
                            objJ = rvk.a;
                            it = it4;
                        } else {
                            pbc pbcVar = this.b;
                            pbcVar.b("for " + String.valueOf(ltdVar) + ": " + list2.size() + KsvNaXS.GlELSxqI);
                            tpc tpcVarM = tta.a.m();
                            int i2 = this.c;
                            if (!tpcVarM.b.C()) {
                                tpcVarM.o();
                            }
                            tta ttaVar = (tta) tpcVarM.b;
                            ttaVar.b |= 2;
                            ttaVar.e = i2;
                            if (kakVar.d) {
                                f = 0.0f;
                            } else {
                                rnt.L(kakVar.e >= 0);
                                long j = kakVar.e;
                                lnx lnxVarB = this.a.b(j);
                                if (lnxVarB == null) {
                                    pbcVar.h(mn.b(j, SHXc.YJFxBuWEL, " ... is the ringbuffer too small or we didn't even compute it?"));
                                    f = -1.0f;
                                } else {
                                    f = lnxVarB.b;
                                }
                            }
                            Iterator it5 = list2.iterator();
                            while (it5.hasNext()) {
                                paj pajVar = (paj) it5.next();
                                long j2 = pajVar.a;
                                float f5 = pajVar.b;
                                if (!kakVar.d) {
                                    it2 = it4;
                                    f3 = f;
                                    if (i2 == 2) {
                                        if (f5 < 0.2f) {
                                            pbcVar.b("   for frame " + j2 + " set the score to 0 because the score " + f5 + " is below the absolute threshold 0.2");
                                            f5 = 0.0f;
                                        }
                                        pbcVar.b(String.format(Locale.US, "   for Top Shot frame %d, the score %f is scaled by %f", Long.valueOf(j2), Float.valueOf(f5), Float.valueOf(0.7891367f)));
                                        f4 = f5 * 0.7891367f;
                                        it3 = it5;
                                    } else {
                                        if (f5 < 0.2f) {
                                            pbcVar.b("   for frame " + j2 + " set the score to 0 because the score " + f5 + " is below the absolute threshold 0.2");
                                            f5 = 0.0f;
                                        }
                                        float f6 = f5 - f3;
                                        float fA = jri.a(f6, this.e.p(haa.o));
                                        it3 = it5;
                                        pbcVar.b(String.format(Locale.US, "   Top Shot frame %d score is %f. Shutter frame score is %f. The diff %f is converted to confidence %f", Long.valueOf(j2), Float.valueOf(f5), Float.valueOf(f3), Float.valueOf(f6), Float.valueOf(fA)));
                                        f4 = fA;
                                    }
                                } else if (i2 != 3) {
                                    pbcVar.b("   for Long Shot frame " + j2 + " the score " + f5 + " is scaled by 1.118259");
                                    f4 = f5 * 1.118259f;
                                    it2 = it4;
                                    f3 = f;
                                    it3 = it5;
                                } else {
                                    float fZ = this.e.p(haa.o) ? jrh.b.z(f5) : jrh.a.z(f5);
                                    it2 = it4;
                                    f3 = f;
                                    pbcVar.b(String.format(Locale.US, "   Long Shot frame %d score is %f. Converted to confidence %f", Long.valueOf(j2), Float.valueOf(f5), Float.valueOf(fZ)));
                                    it3 = it5;
                                    f4 = fZ;
                                }
                                i(f4);
                                tpc tpcVarM2 = tsz.a.m();
                                long jConvert = TimeUnit.MICROSECONDS.convert(j2, TimeUnit.NANOSECONDS);
                                if (!tpcVarM2.b.C()) {
                                    tpcVarM2.o();
                                }
                                tph tphVar = tpcVarM2.b;
                                tsz tszVar = (tsz) tphVar;
                                tszVar.b |= 1;
                                tszVar.c = jConvert;
                                if (!tphVar.C()) {
                                    tpcVarM2.o();
                                }
                                tsz tszVar2 = (tsz) tpcVarM2.b;
                                tszVar2.b |= 2;
                                tszVar2.d = f4;
                                tsz tszVar3 = (tsz) tpcVarM2.l();
                                pbcVar.b("   for frame " + tszVar3.c + " adding score " + tszVar3.d);
                                tpcVarM.Y(tszVar3);
                                it4 = it2;
                                f = f3;
                                it5 = it3;
                            }
                            it = it4;
                            float f7 = f;
                            if (!kakVar.d) {
                                if (i2 == 2) {
                                    pbcVar.b(String.format(Locale.US, "   for Top Shot base frame %d, the score %f is scaled by %f", Long.valueOf(kakVar.e), Float.valueOf(f7), Float.valueOf(0.7891367f)));
                                    f2 = f7 * 0.7891367f;
                                } else {
                                    f2 = 0.0f;
                                }
                                i(f2);
                                if (!tpcVarM.b.C()) {
                                    tpcVarM.o();
                                }
                                tta ttaVar2 = (tta) tpcVarM.b;
                                ttaVar2.b |= 1;
                                ttaVar2.d = f2;
                                pbcVar.b("   for the base frame at " + kakVar.e + HHdu.mfNhaFBDYSUm + f2);
                            }
                            iso.q();
                            objJ = rwc.j((tta) tpcVarM.l());
                        }
                        szhVar2.e(objJ);
                        it4 = it;
                    }
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (((kak) entry2.getValue()).b < SystemClock.elapsedRealtimeNanos() - 600000000000L) {
                this.b.b("cleaning up entry for ".concat(String.valueOf(String.valueOf(entry2.getKey()))));
                arrayList.add((ltd) entry2.getKey());
            }
        }
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            map.remove((ltd) arrayList.get(i));
        }
    }

    public final synchronized void d(ltd ltdVar, List list) {
        kak kakVarG = g(ltdVar);
        this.b.b("uri " + String.valueOf(ltdVar) + VnmwoBe.WWeHZPwospf + list.size() + " frames");
        kakVarG.f = list;
        h();
    }
}
