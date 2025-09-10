package defpackage;

import android.util.ArraySet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hfs implements pdh {
    private static final sgv a = sgv.g("hfs");
    private long c;
    private pbw b = pbw.CAMERA_ERROR_CODE_UNKNOWN;
    private int e = 1;
    private final Set d = new ArraySet();

    @Override // defpackage.pdh
    public final void a(pbw pbwVar, long j) {
        synchronized (this) {
            if (this.e == 3) {
                return;
            }
            this.e = 2;
            ((sgt) a.c().M(1235)).D("CameraDeviceError : %s Open duration = %s", pbwVar.c(), j);
            this.b = pbwVar;
            this.c = j;
            Set set = this.d;
            scn scnVarF = scn.F(set);
            set.clear();
            sgj sgjVarListIterator = scnVarF.listIterator();
            while (sgjVarListIterator.hasNext()) {
                ((pdh) sgjVarListIterator.next()).a(pbwVar, j);
            }
        }
    }

    @Override // defpackage.pdh
    public final void b() {
        synchronized (this) {
            if (this.e == 2) {
                return;
            }
            this.e = 3;
            Set set = this.d;
            scn scnVarF = scn.F(set);
            set.clear();
            sgj sgjVarListIterator = scnVarF.listIterator();
            while (sgjVarListIterator.hasNext()) {
                ((pdh) sgjVarListIterator.next()).b();
            }
        }
    }

    public final paq c(pdh pdhVar) {
        pbw pbwVar;
        boolean z;
        long j;
        synchronized (this) {
            int i = this.e;
            int i2 = i - 1;
            pbwVar = null;
            if (i == 0) {
                throw null;
            }
            z = true;
            if (i2 != 1) {
                j = 0;
                if (i2 != 2) {
                    this.d.add(pdhVar);
                }
            } else {
                pbwVar = this.b;
                j = this.c;
            }
            z = false;
        }
        if (pbwVar != null) {
            pdhVar.a(pbwVar, j);
            return new pan(0);
        }
        if (!z) {
            return new ffx(this, pdhVar, 10);
        }
        pdhVar.b();
        return new pan(0);
    }

    public final synchronized void d(pdh pdhVar) {
        if (this.e != 2 && this.d.contains(pdhVar)) {
            pdhVar.b();
        }
        this.d.remove(pdhVar);
    }
}
