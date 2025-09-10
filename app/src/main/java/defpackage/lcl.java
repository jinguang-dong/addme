package defpackage;

import android.hardware.camera2.CameraCharacteristics;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class lcl {
    public static final sgv a = sgv.g("lcl");

    public static void a(pjo pjoVar, lcc lccVar, long j) {
        long[] jArr = (long[]) pjoVar.m(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES);
        if (jArr != null) {
            for (long j2 : jArr) {
                if (j2 == j) {
                    lccVar.i = j;
                    return;
                }
            }
        }
    }

    public static peq b(pjo pjoVar, lcs lcsVar, nkw nkwVar, hbj hbjVar, rwc rwcVar, boolean z, boolean z2, boolean z3, lbb lbbVar, peg pegVar, ldd lddVar, lcz lczVar) {
        pko pkoVarC;
        boolean z4 = false;
        boolean z5 = nkwVar == nkw.PORTRAIT && hbjVar.p(hak.w) && z2;
        if (z5 && hak.b(hbjVar)) {
            z4 = true;
        }
        if (pjoVar.l() == pka.BACK && z5) {
            lcz lczVar2 = lcz.RAW_TELE;
            pkoVarC = new pko(37, new pas(((Integer) (lczVar.equals(lczVar2) ? hbjVar.a(gyk.f).get() : hbjVar.a(gyk.b).get())).intValue(), ((Integer) (lczVar.equals(lczVar2) ? hbjVar.a(gyk.g).get() : hbjVar.a(gyk.c).get())).intValue()));
        } else {
            pkoVarC = lbbVar.c(lczVar, pjoVar, z3);
        }
        lcc lccVar = new lcc();
        lccVar.a = pjoVar.j();
        lccVar.b = pkoVarC;
        lccVar.c = lcsVar.a(pkoVarC);
        lccVar.d = true;
        lccVar.f = (Long) rwcVar.f();
        lccVar.g = z;
        lccVar.h = z3;
        lccVar.l = pegVar;
        lccVar.k = lddVar.b(lczVar);
        if (z4) {
            lccVar.i = 6L;
        }
        return lccVar.a();
    }

    public static void c(final lcz lczVar, sbr sbrVar, final pjo pjoVar, final int i, final kfi kfiVar, final ldd lddVar) {
        if (pjoVar == null) {
            return;
        }
        sbrVar.f(lczVar, new uem() { // from class: lch
            @Override // defpackage.uem, defpackage.uel
            public final Object a() {
                lcc lccVar = new lcc();
                pjo pjoVar2 = pjoVar;
                lccVar.a = pjoVar2.j();
                lccVar.b = lbb.b(pjoVar2, i);
                lccVar.c = kfiVar.b;
                lccVar.k = lddVar.b(lczVar);
                lccVar.d = true;
                return lccVar.a();
            }
        });
    }
}
