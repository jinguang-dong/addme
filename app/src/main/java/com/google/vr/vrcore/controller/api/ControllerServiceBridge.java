package com.google.vr.vrcore.controller.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.apps.camera.facemetadata.conversions.jni.HM.oUZhwRhE;
import com.google.vr.vrcore.base.api.VrCoreUtils;
import defpackage.a;
import defpackage.fbj;
import defpackage.smv;
import defpackage.tpc;
import defpackage.tph;
import defpackage.txv;
import defpackage.tye;
import defpackage.tyf;
import defpackage.tyh;
import defpackage.tyi;
import defpackage.tyk;
import defpackage.tyl;
import defpackage.tym;
import defpackage.tyq;
import defpackage.tyr;
import defpackage.tys;
import defpackage.tyt;
import defpackage.tyu;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ControllerServiceBridge implements ServiceConnection {
    public static final /* synthetic */ int h = 0;
    private static final AtomicInteger i = new AtomicInteger(-1);
    public final Context a;
    public final Handler b;
    final String c;
    public final SparseArray d;
    public tym e;
    public boolean f;
    public tyr g;
    private final int j;
    private final tyq k;

    /* compiled from: PG */
    public interface Callbacks {
        void a(tyf tyfVar);

        void b(tye tyeVar);

        void c(tyi tyiVar);

        void d(int i, int i2);

        void e();

        void f();

        void g(int i);

        void h();

        void i();
    }

    public ControllerServiceBridge(Context context, Callbacks callbacks, int i2) {
        tyh tyhVar = new tyh(i2);
        SparseArray sparseArray = new SparseArray();
        this.d = sparseArray;
        this.a = context.getApplicationContext();
        int vrCoreClientApiVersion = 0;
        tym tymVar = new tym(callbacks, tyhVar, 0);
        this.e = tymVar;
        sparseArray.put(tymVar.a, tymVar);
        this.b = new Handler(Looper.getMainLooper());
        this.k = new tyq(this, 2);
        try {
            vrCoreClientApiVersion = VrCoreUtils.getVrCoreClientApiVersion(context);
        } catch (txv unused) {
        }
        this.j = vrCoreClientApiVersion;
        this.c = "VrCtl.ServiceBridge" + i.incrementAndGet();
    }

    public static final void d() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("This should be running on the main thread.");
        }
    }

    private final boolean e(int i2, tym tymVar) {
        boolean zE;
        try {
            tyr tyrVar = this.g;
            String str = this.c;
            tyq tyqVar = new tyq(tymVar, 0);
            Parcel parcelA = tyrVar.a();
            parcelA.writeInt(i2);
            parcelA.writeString(str);
            fbj.d(parcelA, tyqVar);
            Parcel parcelZ = tyrVar.z(5, parcelA);
            zE = fbj.e(parcelZ);
            parcelZ.recycle();
        } catch (RemoteException e) {
            Log.w("VrCtl.ServiceBridge", "RemoteException while registering listener.", e);
        }
        return zE;
    }

    public final void a() {
        d();
        if (!this.f) {
            Log.w("VrCtl.ServiceBridge", "Service is already unbound.");
            return;
        }
        d();
        tyr tyrVar = this.g;
        if (tyrVar != null) {
            try {
                String str = this.c;
                Parcel parcelA = tyrVar.a();
                parcelA.writeString(str);
                Parcel parcelZ = tyrVar.z(6, parcelA);
                fbj.e(parcelZ);
                parcelZ.recycle();
            } catch (RemoteException e) {
                Log.w("VrCtl.ServiceBridge", "RemoteException while unregistering listeners.", e);
            }
        }
        if (this.j >= 21) {
            try {
                tyr tyrVar2 = this.g;
                if (tyrVar2 != null) {
                    tyq tyqVar = this.k;
                    Parcel parcelA2 = tyrVar2.a();
                    fbj.d(parcelA2, tyqVar);
                    Parcel parcelZ2 = tyrVar2.z(9, parcelA2);
                    boolean zE = fbj.e(parcelZ2);
                    parcelZ2.recycle();
                    if (!zE) {
                        Log.w("VrCtl.ServiceBridge", "Failed to unregister remote service listener.");
                    }
                }
            } catch (RemoteException e2) {
                Log.w("VrCtl.ServiceBridge", "Exception while unregistering remote service listener: ".concat(e2.toString()));
            }
        }
        this.a.unbindService(this);
        this.g = null;
        this.f = false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.vr.vrcore.controller.api.ControllerServiceBridge$Callbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.google.vr.vrcore.controller.api.ControllerServiceBridge$Callbacks, java.lang.Object] */
    public final void b() {
        this.e.b.i();
        tym tymVar = this.e;
        if (e(tymVar.a, tymVar)) {
            SparseArray sparseArray = this.d;
            tym tymVar2 = this.e;
            sparseArray.put(tymVar2.a, tymVar2);
        } else {
            Log.w("VrCtl.ServiceBridge", "Failed to register service listener.");
            this.e.b.f();
            a();
        }
    }

    public final void c(int i2, tyk tykVar) {
        d();
        tyr tyrVar = this.g;
        if (tyrVar == null) {
            Log.w("VrCtl.ServiceBridge", "Vibration cancelled: service not connected");
            return;
        }
        try {
            Parcel parcelA = tyrVar.a();
            parcelA.writeInt(i2);
            fbj.c(parcelA, tykVar);
            tyrVar.A(11, parcelA);
        } catch (RemoteException e) {
            Log.w("VrCtl.ServiceBridge", "RemoteException while vibrating the controller.", e);
        }
    }

    public void controllerHapticsEffect(int i2, int i3, int i4) {
        tpc tpcVarM = tyu.a.m();
        tpc tpcVarM2 = tys.a.m();
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        tph tphVar = tpcVarM2.b;
        tys tysVar = (tys) tphVar;
        tysVar.b |= 1;
        tysVar.c = i3;
        if (!tphVar.C()) {
            tpcVarM2.o();
        }
        tys tysVar2 = (tys) tpcVarM2.b;
        tysVar2.b |= 2;
        tysVar2.d = i4;
        tys tysVar3 = (tys) tpcVarM2.l();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tyu tyuVar = (tyu) tpcVarM.b;
        tysVar3.getClass();
        tyuVar.d = tysVar3;
        tyuVar.b |= 2;
        tyu tyuVar2 = (tyu) tpcVarM.l();
        tyk tykVar = new tyk();
        tykVar.a(tyuVar2);
        this.b.post(new tyl(this, i2, tykVar, 1));
    }

    public boolean createAndConnectController(int i2, Callbacks callbacks, int i3) {
        tyh tyhVar = new tyh(i3);
        d();
        if (this.g == null) {
            return false;
        }
        tym tymVar = new tym(callbacks, tyhVar, i2);
        int i4 = tymVar.a;
        if (e(i4, tymVar)) {
            if (i4 == 0) {
                this.e = tymVar;
            }
            this.d.put(i2, tymVar);
            return true;
        }
        if (i2 == 0) {
            Log.e("VrCtl.ServiceBridge", "Failed to connect controller 0.");
            i2 = 0;
        }
        this.d.remove(i2);
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.vr.vrcore.controller.api.ControllerServiceBridge$Callbacks, java.lang.Object] */
    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        d();
        this.g = null;
        this.e.b.e();
    }

    public void requestBind() {
        this.b.post(new smv(this, 8));
    }

    public void requestUnbind() {
        this.b.post(new smv(this, 6));
    }

    public void vibrateController(int i2, int i3, int i4, int i5) {
        tpc tpcVarM = tyu.a.m();
        tpc tpcVarM2 = tyt.a.m();
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        tph tphVar = tpcVarM2.b;
        tyt tytVar = (tyt) tphVar;
        tytVar.b |= 1;
        tytVar.c = i3;
        if (!tphVar.C()) {
            tpcVarM2.o();
        }
        tph tphVar2 = tpcVarM2.b;
        tyt tytVar2 = (tyt) tphVar2;
        tytVar2.b |= 2;
        tytVar2.d = i4;
        if (!tphVar2.C()) {
            tpcVarM2.o();
        }
        tyt tytVar3 = (tyt) tpcVarM2.b;
        tytVar3.b |= 4;
        tytVar3.e = i5;
        tyt tytVar4 = (tyt) tpcVarM2.l();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tyu tyuVar = (tyu) tpcVarM.b;
        tytVar4.getClass();
        tyuVar.c = tytVar4;
        tyuVar.b |= 1;
        tyu tyuVar2 = (tyu) tpcVarM.l();
        tyk tykVar = new tyk();
        tykVar.a(tyuVar2);
        this.b.post(new tyl(this, i2, tykVar, 0));
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [com.google.vr.vrcore.controller.api.ControllerServiceBridge$Callbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.google.vr.vrcore.controller.api.ControllerServiceBridge$Callbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v16, types: [com.google.vr.vrcore.controller.api.ControllerServiceBridge$Callbacks, java.lang.Object] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        tyr tyrVar;
        d();
        if (this.f) {
            if (iBinder == null) {
                tyrVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.vr.vrcore.controller.api.IControllerService");
                tyrVar = iInterfaceQueryLocalInterface instanceof tyr ? (tyr) iInterfaceQueryLocalInterface : new tyr(iBinder);
            }
            this.g = tyrVar;
            try {
                Parcel parcelA = tyrVar.a();
                parcelA.writeInt(25);
                Parcel parcelZ = tyrVar.z(1, parcelA);
                int i2 = parcelZ.readInt();
                parcelZ.recycle();
                if (i2 != 0) {
                    Log.e("VrCtl.ServiceBridge", "initialize() returned error: ".concat(i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? a.bE(i2, "[UNKNOWN CONTROLLER INIT RESULT: ", "]") : "FAILED_CLIENT_OBSOLETE" : "FAILED_NOT_AUTHORIZED" : "FAILED_UNSUPPORTED" : "SUCCESS"));
                    this.e.b.g(i2);
                    a();
                    return;
                }
                if (this.j >= 21) {
                    try {
                        tyr tyrVar2 = this.g;
                        tyq tyqVar = this.k;
                        Parcel parcelA2 = tyrVar2.a();
                        fbj.d(parcelA2, tyqVar);
                        Parcel parcelZ2 = tyrVar2.z(8, parcelA2);
                        boolean zE = fbj.e(parcelZ2);
                        parcelZ2.recycle();
                        if (!zE) {
                            Log.e("VrCtl.ServiceBridge", oUZhwRhE.qKRXZp);
                            this.e.b.g(0);
                            a();
                            return;
                        }
                    } catch (RemoteException e) {
                        Log.w("VrCtl.ServiceBridge", "Exception while registering remote service listener: ".concat(e.toString()));
                    }
                }
                b();
            } catch (RemoteException e2) {
                Log.e("VrCtl.ServiceBridge", "Failed to call initialize() on controller service (RemoteException).", e2);
                this.e.b.f();
                a();
            }
        }
    }
}
