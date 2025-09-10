package defpackage;

import android.view.View;
import android.view.WindowManager;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class htn implements pnh {
    final /* synthetic */ mxm a;
    final /* synthetic */ hto b;
    private mxm c;

    public htn(mxm mxmVar, hto htoVar) {
        this.a = mxmVar;
        this.b = htoVar;
        this.c = mxmVar;
    }

    public static final void b(boolean z, hto htoVar) {
        if (z) {
            our ourVar = htoVar.g;
            if (ourVar != null) {
                ourVar.close();
                return;
            }
            return;
        }
        try {
            htoVar.b().showAtLocation((View) htoVar.e.c, 119, 0, 0);
            htoVar.a().findViewById(R.id.serengeti_overlay_text).sendAccessibilityEvent(8);
            our ourVar2 = new our();
            ourVar2.d(htoVar.d.a());
            ourVar2.d(htoVar.h.d(imk.NOTIFICATION_CHIP));
            ourVar2.d(new gge(htoVar, 20));
            htoVar.g = ourVar2;
        } catch (WindowManager.BadTokenException e) {
            ((sgt) hto.a.c().i(e).M(1531)).s("Failed to show overlay, activity not running.");
        }
    }

    @Override // defpackage.pnh
    public final void a(int i) {
        mxm mxmVarB;
        hto htoVar = this.b;
        if (htoVar.i.c.isEmpty()) {
            mxmVarB = (mxm) htoVar.b.dL();
        } else {
            mxmVarB = this.c;
            int iAbs = Math.abs(i - mxmVarB.e);
            if (Math.min(iAbs, 360 - iAbs) > 50) {
                mxmVarB = mxm.b(i);
                mxmVarB.getClass();
            }
        }
        if (this.c == mxmVarB) {
            return;
        }
        mxmVarB.getClass();
        this.c = mxmVarB;
        mxm mxmVar = this.a;
        boolean z = true;
        if (mxmVar != mxmVarB && (mxmVar.d() || mxmVarB.d())) {
            z = false;
        }
        htoVar.c.c(new emz(z, htoVar, 7));
    }
}
