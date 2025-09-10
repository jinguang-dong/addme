package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rqd extends rqt {
    final /* synthetic */ String a;
    final /* synthetic */ rqh b;
    final /* synthetic */ pfl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rqd(rqh rqhVar, pfl pflVar, String str, pfl pflVar2) {
        super(pflVar);
        this.a = str;
        this.c = pflVar2;
        this.b = rqhVar;
    }

    @Override // defpackage.rqt
    protected final void a() {
        Integer numValueOf;
        try {
            rqh rqhVar = this.b;
            IInterface iInterface = rqhVar.a.l;
            String str = rqhVar.b;
            String str2 = this.a;
            Bundle bundle = new Bundle();
            bundle.putAll(rqh.b());
            bundle.putString("package.name", str2);
            try {
                Context context = rqhVar.c;
                numValueOf = Integer.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                rqh.d.d("The current version of the app could not be retrieved", new Object[0]);
                numValueOf = null;
            }
            if (numValueOf != null) {
                bundle.putInt("app.version.code", numValueOf.intValue());
            }
            rqg rqgVar = new rqg(this.b, this.c);
            Parcel parcelA = ((fbh) iInterface).a();
            parcelA.writeString(str);
            fbj.c(parcelA, bundle);
            fbj.d(parcelA, rqgVar);
            ((fbh) iInterface).B(2, parcelA);
        } catch (RemoteException e) {
            rqh.d.e(e, "requestUpdateInfo(%s)", this.a);
            this.c.e(new RuntimeException(e));
        }
    }
}
