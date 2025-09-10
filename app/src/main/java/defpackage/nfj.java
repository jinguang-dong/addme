package defpackage;

import android.hardware.display.DisplayManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nfj implements DisplayManager.DisplayListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public nfj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        nfk nfkVar;
        int iA;
        if (this.b != 0) {
            jxa jxaVar = (jxa) this.a;
            int iCf = qpt.cf(jxaVar.l);
            if (((iCf - jxaVar.y) + 360) % 360 == 180) {
                jxaVar.L();
            }
            jxaVar.y = iCf;
            return;
        }
        if (i != 0 || (iA = (nfkVar = (nfk) this.a).a()) <= 0 || nfkVar.e.get() == iA) {
            return;
        }
        nfkVar.b(false);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
