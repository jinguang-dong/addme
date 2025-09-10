package defpackage;

import android.net.ConnectivityManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dzq implements eab {
    public final ConnectivityManager a;

    public dzq(ConnectivityManager connectivityManager) {
        this.a = connectivityManager;
    }

    @Override // defpackage.eab
    public final urk a(dvv dvvVar) {
        dvvVar.getClass();
        return new urf(new dzp(dvvVar, this, (uhb) null, 0));
    }

    @Override // defpackage.eab
    public final boolean b(ebx ebxVar) {
        return ebxVar.j.a() != null;
    }

    @Override // defpackage.eab
    public final boolean c(ebx ebxVar) {
        if (b(ebxVar)) {
            throw new IllegalStateException("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        }
        return false;
    }
}
