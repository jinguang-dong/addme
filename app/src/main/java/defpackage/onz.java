package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class onz extends ohx implements oeo {
    public final ohp t;
    public final Integer u;
    private final boolean v;
    private final Bundle w;

    public onz(Context context, Looper looper, ohp ohpVar, Bundle bundle, oeu oeuVar, oev oevVar) {
        super(context, looper, 44, ohpVar, oeuVar, oevVar);
        this.v = true;
        this.t = ohpVar;
        this.w = bundle;
        this.u = ohpVar.g;
    }

    @Override // defpackage.ohx, defpackage.ohm, defpackage.oeo
    public final int a() {
        return 12451000;
    }

    @Override // defpackage.ohm
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof onx ? (onx) iInterfaceQueryLocalInterface : new onx(iBinder);
    }

    @Override // defpackage.ohm
    protected final String c() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // defpackage.ohm
    protected final String d() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // defpackage.ohm, defpackage.oeo
    public final boolean n() {
        return this.v;
    }

    @Override // defpackage.ohm
    protected final Bundle s() {
        ohp ohpVar = this.t;
        String packageName = this.b.getPackageName();
        String str = ohpVar.d;
        if (!packageName.equals(str)) {
            this.w.putString("com.google.android.gms.signin.internal.realClientPackageName", str);
        }
        return this.w;
    }
}
