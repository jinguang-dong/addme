package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rqe extends rqt {
    final /* synthetic */ String a;
    final /* synthetic */ rqh b;
    final /* synthetic */ pfl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rqe(rqh rqhVar, pfl pflVar, pfl pflVar2, String str) {
        super(pflVar);
        this.c = pflVar2;
        this.a = str;
        this.b = rqhVar;
    }

    @Override // defpackage.rqt
    protected final void a() {
        try {
            rqh rqhVar = this.b;
            IInterface iInterface = rqhVar.a.l;
            String str = rqhVar.b;
            Bundle bundleB = rqh.b();
            rqf rqfVar = new rqf(rqhVar, this.c);
            Parcel parcelA = ((fbh) iInterface).a();
            parcelA.writeString(str);
            fbj.c(parcelA, bundleB);
            fbj.d(parcelA, rqfVar);
            ((fbh) iInterface).B(3, parcelA);
        } catch (RemoteException e) {
            rqh.d.e(e, "completeUpdate(%s)", this.a);
            this.c.e(new RuntimeException(e));
        }
    }
}
