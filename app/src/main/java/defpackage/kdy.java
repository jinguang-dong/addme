package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kdy implements hyg {
    final /* synthetic */ kdz a;

    public kdy(kdz kdzVar) {
        this.a = kdzVar;
    }

    @Override // defpackage.hyg
    public final void b(boolean z) {
        lzm lzmVar;
        lzm lzmVar2;
        if (z) {
            kdz kdzVar = this.a;
            if (!kdzVar.f) {
                kdzVar.f = true;
                ocq ocqVar = kdzVar.i;
                int iAj = ocqVar.aj("astro_smarts_chip");
                if (iAj < 9) {
                    ocqVar.am("astro_smarts_chip", iAj + 1);
                    if (iAj % 3 == 0) {
                        if (!kdzVar.a.compareAndSet(false, true) || (lzmVar2 = kdzVar.b) == null) {
                            return;
                        }
                        lzmVar2.b(kdzVar.c);
                        return;
                    }
                }
            }
        }
        kdz kdzVar2 = this.a;
        if (!kdzVar2.a.compareAndSet(true, false) || (lzmVar = kdzVar2.b) == null) {
            return;
        }
        kdzVar2.g = kdzVar2.e.schedule(new kdx(lzmVar, 3), 2000L, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.hyg
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.hyg
    public final /* synthetic */ void a(boolean z, boolean z2, boolean z3, boolean z4) {
    }
}
