package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpv implements hps {
    private final hmy a;
    private final hpr[] b;
    private final Object c;

    public hpv() {
        long jConvert = TimeUnit.SECONDS.convert(30000L, TimeUnit.MILLISECONDS) * 30;
        this.c = new Object();
        int i = (int) jConvert;
        this.a = new hmy(i);
        this.b = new hpr[i];
    }

    @Override // defpackage.hps
    public final hpr a(long j) {
        hpr hprVar;
        synchronized (this.c) {
            int iF = this.a.f(j);
            hprVar = iF >= 0 ? this.b[iF] : null;
        }
        return hprVar;
    }

    @Override // defpackage.hps
    public final hpr b(long j) {
        synchronized (this.c) {
            hmy hmyVar = this.a;
            if (hmyVar.d() <= 0) {
                return null;
            }
            int iE = hmyVar.e(hmyVar.b(j));
            int iE2 = hmyVar.e(hmyVar.c(j));
            hpr hprVar = iE >= 0 ? this.b[iE] : null;
            hpr hprVar2 = iE2 >= 0 ? this.b[iE2] : null;
            if (hprVar == null) {
                return hprVar2;
            }
            if (hprVar2 == null) {
                return hprVar;
            }
            if (j - hprVar.a >= hprVar2.a - j) {
                hprVar = hprVar2;
            }
            return hprVar;
        }
    }

    public final void c(hpr hprVar) {
        try {
            synchronized (this.c) {
                this.b[this.a.a(hprVar.a)] = hprVar;
            }
        } catch (IllegalArgumentException unused) {
        }
    }
}
