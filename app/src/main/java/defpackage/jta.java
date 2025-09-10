package defpackage;

import com.google.android.apps.camera.toast.vvJ.CGlJpiVWrCQOq;
import java.lang.ref.WeakReference;
import java.util.EnumSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jta implements jtc, jte {
    private static final sgv a = sgv.g("jta");
    private static final EnumSet b = EnumSet.of(nkw.IMAX, nkw.SERENGETI, nkw.LENS, nkw.NIGHT_SIGHT, nkw.PORTRAIT, nkw.LANDSCAPE, nkw.ACTION_PAN, nkw.SLOW_MOTION, nkw.TIME_LAPSE, nkw.VIDEO, nkw.AMBER, nkw.ROOSTER, nkw.PHOTO, nkw.COTTAGE, nkw.VIDEO_NIGHT_SIGHT);
    private WeakReference c = new WeakReference(null);

    @Override // defpackage.jte
    public final void a(mzz mzzVar) {
        synchronized (this) {
            this.c = new WeakReference(mzzVar);
        }
    }

    @Override // defpackage.jtc
    public final void b(nkw nkwVar) {
        mzz mzzVar;
        rnt.B(b.contains(nkwVar), CGlJpiVWrCQOq.CyCKlFqJKza);
        synchronized (this) {
            mzzVar = (mzz) this.c.get();
        }
        if (mzzVar == null) {
            ((sgt) a.c().M(3061)).v("switchToMode has no ModeSwitchController, so NOT switching to %s", nkwVar);
        } else {
            mzzVar.A(nkwVar);
        }
    }
}
