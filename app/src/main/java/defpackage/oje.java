package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.googlex.gcam.dirtylens.PrCd.TOnSyMaYeslEl;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oje extends ohx {
    private final oiw t;

    public oje(Context context, Looper looper, ohp ohpVar, oiw oiwVar, ofu ofuVar, ogq ogqVar) {
        super(context, looper, 270, ohpVar, ofuVar, ogqVar);
        this.t = oiwVar;
    }

    @Override // defpackage.ohm
    protected final boolean B() {
        return true;
    }

    @Override // defpackage.ohx, defpackage.ohm, defpackage.oeo
    public final int a() {
        return 203400000;
    }

    @Override // defpackage.ohm
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof oja ? (oja) iInterfaceQueryLocalInterface : new oja(iBinder);
    }

    @Override // defpackage.ohm
    protected final String c() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // defpackage.ohm
    public final odl[] e() {
        return odi.b;
    }

    @Override // defpackage.ohm
    protected final Bundle s() {
        Bundle bundle = new Bundle();
        String str = this.t.c;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // defpackage.ohm
    protected final String d() {
        return TOnSyMaYeslEl.SHooaHbld;
    }
}
