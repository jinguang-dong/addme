package defpackage;

import com.google.android.apps.camera.ui.views.ViewfinderCover;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jxh implements glr {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ jxh(jjn jjnVar, int i) {
        this.b = i;
        this.a = jjnVar;
    }

    @Override // defpackage.glr
    public final void a(int i) {
        if (this.b != 0) {
            jjn jjnVar = (jjn) this.a;
            if (((nkw) jjnVar.b.dL()).equals(nkw.SLOW_MOTION)) {
                jjnVar.s(sbp.m(jjs.SINGLE_EXPOSURE, jjs.WHITEBALANCE));
                return;
            }
            return;
        }
        Object obj = this.a;
        synchronized (((jxi) obj).e) {
            oxh oxhVar = oxh.FPS_120_HFR_4X;
            if (i == 0) {
                oxhVar = oxh.FPS_240_HFR_8X;
            }
            ggx ggxVar = ((jxi) obj).c;
            nkw nkwVar = nkw.SLOW_MOTION;
            ggw ggwVarA = ggxVar.a(nkwVar);
            ggwVarA.dL();
            if (oxhVar != ggwVarA.dL()) {
                ggwVarA.a(oxhVar);
                ((ViewfinderCover) ((ngx) ((jxi) obj).d).a().e).o(nkwVar, new juc(obj, 13));
            }
        }
    }

    public jxh(jxi jxiVar, int i) {
        this.b = i;
        this.a = jxiVar;
    }
}
