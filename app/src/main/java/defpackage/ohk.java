package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ohk extends ohe {
    public final IBinder g;
    final /* synthetic */ ohm h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ohk(ohm ohmVar, int i, IBinder iBinder, Bundle bundle) {
        super(ohmVar, i, bundle);
        this.h = ohmVar;
        this.g = iBinder;
    }

    @Override // defpackage.ohe
    protected final void a(odj odjVar) {
        rnu rnuVar = this.h.q;
        if (rnuVar != null) {
            rnuVar.b(odjVar);
        }
        System.currentTimeMillis();
    }

    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, ofu] */
    @Override // defpackage.ohe
    protected final boolean b() throws RemoteException {
        try {
            IBinder iBinder = this.g;
            ojl.ay(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            ohm ohmVar = this.h;
            if (!ohmVar.c().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + ohmVar.c() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface iInterfaceB = ohmVar.b(this.g);
            if (iInterfaceB == null || !(ohmVar.A(2, 4, iInterfaceB) || ohmVar.A(3, 4, iInterfaceB))) {
                return false;
            }
            ohmVar.k = null;
            rnu rnuVar = ohmVar.r;
            if (rnuVar == null) {
                return true;
            }
            rnuVar.a.b();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
