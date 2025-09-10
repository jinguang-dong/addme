package defpackage;

import android.graphics.Bitmap;
import com.google.android.apps.camera.ui.hotshot.HotshotController;
import com.google.android.apps.camera.ui.hotshot.HotshotView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class mvm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ mvm(HotshotController hotshotController, mwj mwjVar, int i, int i2) {
        this.d = i2;
        this.b = hotshotController;
        this.c = mwjVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d != 0) {
            ((nqp) ((iyu) this.c).E.a()).y((Bitmap) this.b, this.a);
            return;
        }
        HotshotController hotshotController = (HotshotController) this.b;
        mwn mwnVar = hotshotController.h;
        mwd mwdVar = hotshotController.E;
        rwc rwcVar = mwnVar.b;
        if (rwcVar.h() && mwnVar.c) {
            int i = this.a;
            Object obj = this.c;
            HotshotView hotshotView = (HotshotView) rwcVar.c();
            hotshotView.c = mwdVar;
            hotshotView.i = i;
            mwj mwjVarA = (mwj) obj;
            sbp sbpVar = mwjVarA.a;
            mwk mwkVar = sbpVar.size() > 0 ? (mwk) sbpVar.get(0) : null;
            if (mwkVar != null) {
                if (!mwkVar.e.equals(hotshotView.h)) {
                    mwjVarA = mwj.a(sex.a);
                }
            }
            hotshotView.o = mwjVarA;
            hotshotView.invalidate();
        }
    }

    public /* synthetic */ mvm(iyu iyuVar, Bitmap bitmap, int i, int i2) {
        this.d = i2;
        this.c = iyuVar;
        this.b = bitmap;
        this.a = i;
    }
}
