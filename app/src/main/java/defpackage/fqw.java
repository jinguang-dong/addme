package defpackage;

import android.hardware.display.DisplayManager;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fqw implements DisplayManager.DisplayListener {
    final /* synthetic */ fqy a;

    public fqw(fqy fqyVar) {
        this.a = fqyVar;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        nbr nbrVar;
        fqy fqyVar = this.a;
        int iCf = qpt.cf(fqyVar.w);
        if (((iCf - fqyVar.l) + 360) % 360 == 180 && (nbrVar = fqyVar.n) != null) {
            nbrVar.c();
            fqyVar.q.g();
        }
        fqyVar.l = iCf;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
