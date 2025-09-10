package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class omo extends ohx {
    public final aaa t;
    private final aaa u;
    private final aaa v;

    public omo(Context context, Looper looper, ohp ohpVar, ofu ofuVar, ogq ogqVar) {
        super(context, looper, 23, ohpVar, ofuVar, ogqVar);
        this.t = new aaa();
        this.u = new aaa();
        this.v = new aaa();
        new aaa();
    }

    @Override // defpackage.ohm
    public final boolean D() {
        return true;
    }

    @Override // defpackage.ohm
    public final void G() {
        System.currentTimeMillis();
        aaa aaaVar = this.t;
        synchronized (aaaVar) {
            aaaVar.clear();
        }
        aaa aaaVar2 = this.u;
        synchronized (aaaVar2) {
            aaaVar2.clear();
        }
        aaa aaaVar3 = this.v;
        synchronized (aaaVar3) {
            aaaVar3.clear();
        }
    }

    public final boolean I(odl odlVar) {
        odl odlVar2;
        odl[] odlVarArrO = o();
        if (odlVarArrO != null) {
            int i = 0;
            while (true) {
                if (i >= odlVarArrO.length) {
                    odlVar2 = null;
                    break;
                }
                odlVar2 = odlVarArrO[i];
                if (odlVar.a.equals(odlVar2.a)) {
                    break;
                }
                i++;
            }
            if (odlVar2 != null && odlVar2.a() >= odlVar.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ohx, defpackage.ohm, defpackage.oeo
    public final int a() {
        return 11717000;
    }

    @Override // defpackage.ohm
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterfaceQueryLocalInterface instanceof omg ? (omg) iInterfaceQueryLocalInterface : new omg(iBinder);
    }

    @Override // defpackage.ohm
    protected final String c() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // defpackage.ohm
    protected final String d() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // defpackage.ohm
    public final odl[] e() {
        return olt.p;
    }
}
