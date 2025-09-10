package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ofi extends ofe {
    private final ogx a;
    private final pfl b;

    public ofi(int i, ogx ogxVar, pfl pflVar) {
        super(i);
        this.b = pflVar;
        this.a = ogxVar;
        if (i == 2 && ogxVar.b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // defpackage.ofe
    public final boolean a(oga ogaVar) {
        return this.a.b;
    }

    @Override // defpackage.ofe
    public final odl[] b(oga ogaVar) {
        return this.a.a;
    }

    @Override // defpackage.ofk
    public final void d(Status status) {
        this.b.e(ojl.aD(status));
    }

    @Override // defpackage.ofk
    public final void e(Exception exc) {
        this.b.e(exc);
    }

    @Override // defpackage.ofk
    public final void f(oga ogaVar) throws DeadObjectException {
        try {
            ogx ogxVar = this.a;
            ogxVar.d.a.a(ogaVar.b, this.b);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            d(ofk.h(e2));
        } catch (RuntimeException e3) {
            e(e3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.ofk
    public final void g(mwq mwqVar, boolean z) {
        ?? r0 = mwqVar.a;
        pfl pflVar = this.b;
        r0.put(pflVar, Boolean.valueOf(z));
        ((oor) pflVar.a).h(new ofw(mwqVar, pflVar));
    }
}
