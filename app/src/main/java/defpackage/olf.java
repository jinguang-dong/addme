package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class olf extends ohx {
    public final lpa t;

    public olf(Context context, Looper looper, ohp ohpVar, oeu oeuVar, oev oevVar) {
        super(context, looper, 63, ohpVar, oeuVar, oevVar);
        this.t = new lpa();
    }

    @Override // defpackage.ohm
    public final boolean D() {
        return true;
    }

    @Override // defpackage.ohx, defpackage.ohm, defpackage.oeo
    public final int a() {
        return 11925000;
    }

    @Override // defpackage.ohm
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
        return iInterfaceQueryLocalInterface instanceof olh ? (olh) iInterfaceQueryLocalInterface : new olh(iBinder);
    }

    @Override // defpackage.ohm
    protected final String c() {
        return "com.google.android.gms.googlehelp.internal.common.IGoogleHelpService";
    }

    @Override // defpackage.ohm
    protected final String d() {
        return "com.google.android.gms.googlehelp.service.GoogleHelpService.START";
    }
}
