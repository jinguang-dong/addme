package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.google.android.apps.camera.backup.cNHl.ibINv;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qzx {
    private static boolean d;
    public final int a;
    public final Object b;
    public final Object c;

    public qzx(int i, long[] jArr, Object[] objArr) {
        this.a = i;
        this.b = jArr;
        this.c = objArr;
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, rww] */
    public final void a() {
        synchronized (qzx.class) {
            if (!d) {
                qly qlyVar = new qly(this, 12);
                long j = this.a;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                syx syxVar = (syx) this.b.fr();
                qpt.ah(syxVar.d(new jzz(qlyVar, syxVar, j, timeUnit, 3), j, timeUnit));
                d = true;
            }
        }
    }

    public final int b(long j) {
        int i = this.a - 1;
        if (i == -1) {
            return -1;
        }
        int i2 = 0;
        if (i == 0) {
            long j2 = ((long[]) this.b)[0];
            if (j2 == j) {
                return 0;
            }
            return j2 <= j ? -1 : -2;
        }
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            long j3 = ((long[]) this.b)[i3] - j;
            if (j3 < 0) {
                i2 = i3 + 1;
            } else {
                if (j3 <= 0) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public final int c(Object obj) {
        zm zmVar = (zm) this.b;
        int iA = zmVar.a(obj);
        if (iA >= 0) {
            return zmVar.c[iA];
        }
        return -1;
    }

    public qzx(Class cls, String str, int i) {
        this.b = cls;
        this.c = str;
        this.a = i;
    }

    public qzx(ofk ofkVar, int i, oet oetVar) {
        this.c = ofkVar;
        this.a = i;
        this.b = oetVar;
    }

    public qzx(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.b = colorStateList;
        this.c = configuration;
        this.a = theme == null ? 0 : theme.hashCode();
    }

    public qzx(rww rwwVar) {
        qxd qxdVar = new qxd(2);
        this.b = rwwVar;
        this.a = Math.max(5, 10);
        this.c = qxdVar;
    }

    public qzx(ukv ukvVar, ocq ocqVar) {
        Object obj = ocqVar.a;
        final int i = ukvVar.a;
        if (i < 0) {
            akg.c("negative nearestRange.first");
        }
        apg apgVar = (apg) obj;
        final int iMin = Math.min(ukvVar.b, apgVar.a - 1);
        if (iMin < i) {
            this.b = zn.a();
            this.c = new Object[0];
            this.a = 0;
            return;
        }
        int i2 = (iMin - i) + 1;
        this.c = new Object[i2];
        this.a = i;
        final zm zmVar = new zm(i2);
        uiq uiqVar = new uiq() { // from class: aph
            @Override // defpackage.uiq
            public final Object a(Object obj2) {
                ant antVar = (ant) obj2;
                Object obj3 = antVar.c;
                int iMax = Math.max(i, antVar.a);
                int iMin2 = Math.min(iMin, (r0 + antVar.b) - 1);
                if (iMax <= iMin2) {
                    while (true) {
                        qzx qzxVar = this;
                        zm zmVar2 = zmVar;
                        anr anrVar = new anr(iMax);
                        zmVar2.g(anrVar, iMax);
                        ((Object[]) qzxVar.c)[iMax - qzxVar.a] = anrVar;
                        if (iMax == iMin2) {
                            break;
                        }
                        iMax++;
                    }
                }
                return ufg.a;
            }
        };
        String str = ibINv.edxyb;
        if (i < 0 || i >= apgVar.a) {
            akg.d("Index " + i + str + apgVar.a);
        }
        if (iMin < 0 || iMin >= apgVar.a) {
            akg.d("Index " + iMin + str + apgVar.a);
        }
        if (iMin < i) {
            akg.b("toIndex (" + iMin + ") should be not smaller than fromIndex (" + i + ')');
        }
        bdp bdpVar = (bdp) apgVar.b;
        int iAu = byi.au(bdpVar, i);
        int i3 = ((ant) bdpVar.a[iAu]).a;
        while (i3 <= iMin) {
            ant antVar = (ant) bdpVar.a[iAu];
            uiqVar.a(antVar);
            i3 += antVar.b;
            iAu++;
        }
        this.b = zmVar;
    }
}
