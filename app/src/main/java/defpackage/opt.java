package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.googlex.gcam.dirtylens.PrCd.TOnSyMaYeslEl;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class opt extends ohx {
    private final AtomicReference t;

    public opt(Context context, Looper looper, ohp ohpVar, oeu oeuVar, oev oevVar) {
        super(context, looper, 41, ohpVar, oeuVar, oevVar);
        this.t = new AtomicReference();
    }

    @Override // defpackage.ohm
    public final boolean D() {
        return true;
    }

    public final void I(tyq tyqVar, tyq tyqVar2, ofp ofpVar) {
        opr oprVar = new opr((opo) t(), ofpVar, tyqVar2);
        if (tyqVar == null) {
            if (tyqVar2 == null) {
                ofpVar.d(Status.a);
                return;
            } else {
                ((opo) t()).e(tyqVar2, oprVar);
                return;
            }
        }
        opo opoVar = (opo) t();
        Parcel parcelA = opoVar.a();
        fbj.d(parcelA, tyqVar);
        fbj.d(parcelA, oprVar);
        opoVar.A(10, parcelA);
    }

    @Override // defpackage.ohx, defpackage.ohm, defpackage.oeo
    public final int a() {
        return 12600000;
    }

    @Override // defpackage.ohm
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.usagereporting.internal.IUsageReportingService");
        return iInterfaceQueryLocalInterface instanceof opo ? (opo) iInterfaceQueryLocalInterface : new opo(iBinder);
    }

    @Override // defpackage.ohm
    protected final String c() {
        return "com.google.android.gms.usagereporting.internal.IUsageReportingService";
    }

    @Override // defpackage.ohm
    protected final String d() {
        return "com.google.android.gms.usagereporting.service.START";
    }

    @Override // defpackage.ohm
    public final odl[] e() {
        return opb.f;
    }

    @Override // defpackage.ohm
    public final void w() {
        try {
            tyq tyqVar = (tyq) this.t.getAndSet(null);
            if (tyqVar != null) {
                opq opqVar = new opq();
                opo opoVar = (opo) t();
                Parcel parcelA = opoVar.a();
                fbj.d(parcelA, tyqVar);
                fbj.d(parcelA, opqVar);
                opoVar.A(5, parcelA);
            }
        } catch (RemoteException e) {
            Log.e(TOnSyMaYeslEl.asCpPkgeHJ, "disconnect(): Could not unregister listener from remote:", e);
        }
        super.w();
    }
}
