package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class off extends ofe {
    protected final pfl a;

    public off(int i, pfl pflVar) {
        super(i);
        this.a = pflVar;
    }

    protected abstract void c(oga ogaVar);

    @Override // defpackage.ofk
    public final void d(Status status) {
        this.a.e(new oep(status));
    }

    @Override // defpackage.ofk
    public final void e(Exception exc) {
        this.a.e(exc);
    }

    @Override // defpackage.ofk
    public final void f(oga ogaVar) throws DeadObjectException {
        try {
            c(ogaVar);
        } catch (DeadObjectException e) {
            d(ofk.h(e));
            throw e;
        } catch (RemoteException e2) {
            d(ofk.h(e2));
        } catch (RuntimeException e3) {
            e(e3);
        }
    }

    @Override // defpackage.ofk
    public void g(mwq mwqVar, boolean z) {
    }
}
