package defpackage;

import android.graphics.RectF;
import android.os.SystemClock;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgr implements nqo {
    public owf a;
    private final fgu b;

    public fgr(fgu fguVar) {
        this.b = fguVar;
    }

    @Override // defpackage.nqo
    public final boolean a(MotionEvent motionEvent) {
        owf owfVar = this.a;
        if (owfVar == null || !((RectF) owfVar.dL()).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        fgu fguVar = this.b;
        if (motionEvent.getPointerCount() <= 1) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                fhe fheVar = fguVar.b;
                if (fheVar.n()) {
                    fheVar.e();
                    mdy mdyVar = fguVar.c.a;
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    tpc tpcVarM = sod.a.m();
                    soc socVar = soc.BOBA_TAP_TO_EXPAND_EVENT;
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    sod sodVar = (sod) tpcVarM.b;
                    sodVar.f = socVar.aJ;
                    sodVar.b |= 1;
                    tpc tpcVarM2 = sny.a.m();
                    if (!tpcVarM2.b.C()) {
                        tpcVarM2.o();
                    }
                    sny snyVar = (sny) tpcVarM2.b;
                    snyVar.b |= 1;
                    snyVar.c = jElapsedRealtime;
                    sny snyVar2 = (sny) tpcVarM2.l();
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    sod sodVar2 = (sod) tpcVarM.b;
                    snyVar2.getClass();
                    sodVar2.aA = snyVar2;
                    sodVar2.d |= 268435456;
                    mdyVar.I(tpcVarM);
                    luj lujVar = fguVar.e;
                    lus lusVar = luf.aH;
                    int iIntValue = ((Integer) lujVar.b(lusVar)).intValue();
                    if (iIntValue < 2) {
                        shl shlVar = shx.a;
                        fguVar.f.d(lusVar, Integer.valueOf(iIntValue + 1));
                        fheVar.l();
                    }
                } else if (fheVar.o() && fheVar.p()) {
                    fheVar.g();
                } else {
                    fguVar.a.a(true);
                    fguVar.a(motionEvent);
                    fguVar.c.e();
                }
            } else if (actionMasked == 1) {
                fguVar.a.a(false);
                fguVar.a(motionEvent);
                fguVar.c.d();
            } else if (actionMasked == 2) {
                fguVar.a.a(true);
                fguVar.a(motionEvent);
            }
            fguVar.d.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final String toString() {
        return "BobaOverlappingAreaListener";
    }
}
