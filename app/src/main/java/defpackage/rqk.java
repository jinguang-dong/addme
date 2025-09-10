package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class rqk extends fbi implements IInterface {
    final /* synthetic */ rqh b;
    public final pfl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rqk(rqh rqhVar, pfl pflVar) {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
        this.b = rqhVar;
        this.c = pflVar;
    }

    public void b(Bundle bundle) {
        this.b.a.f(this.c);
    }

    public void c(Bundle bundle) {
        this.b.a.f(this.c);
    }

    @Override // defpackage.fbi
    protected final boolean y(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            Bundle bundle = (Bundle) fbj.a(parcel, Bundle.CREATOR);
            fbj.b(parcel);
            c(bundle);
            return true;
        }
        if (i != 3) {
            return false;
        }
        Bundle bundle2 = (Bundle) fbj.a(parcel, Bundle.CREATOR);
        fbj.b(parcel);
        b(bundle2);
        return true;
    }
}
