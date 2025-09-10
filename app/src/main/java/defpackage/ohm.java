package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.AttributionSource;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ohm {
    private static final odl[] s = new odl[0];
    oic a;
    public final Context b;
    final Handler c;
    protected ohh f;
    public final int i;
    public volatile String j;
    public oii o;
    public volatile pfl p;
    public final rnu q;
    public final rnu r;
    private final ohz u;
    private IInterface v;
    private ohi w;
    private final String x;
    private volatile String t = null;
    public final Object d = new Object();
    public final Object e = new Object();
    public final ArrayList g = new ArrayList();
    public int h = 1;
    public odj k = null;
    public boolean l = false;
    public volatile ohr m = null;
    protected final AtomicInteger n = new AtomicInteger(0);

    protected ohm(Context context, Looper looper, ohz ohzVar, odo odoVar, int i, rnu rnuVar, rnu rnuVar2, String str) {
        ojl.az(context, "Context must not be null");
        this.b = context;
        ojl.az(looper, "Looper must not be null");
        ojl.az(ohzVar, "Supervisor must not be null");
        this.u = ohzVar;
        ojl.az(odoVar, "API availability must not be null");
        this.c = new ohf(this, looper);
        this.i = i;
        this.r = rnuVar;
        this.q = rnuVar2;
        this.x = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(int i, IInterface iInterface) {
        odj odjVarD;
        oic oicVar;
        a.I((i == 4) == (iInterface != null));
        synchronized (this.d) {
            this.h = i;
            this.v = iInterface;
            Bundle bundle = null;
            if (i == 1) {
                ohi ohiVar = this.w;
                if (ohiVar != null) {
                    ohz ohzVar = this.u;
                    oic oicVar2 = this.a;
                    String str = oicVar2.a;
                    String str2 = oicVar2.b;
                    int i2 = oicVar2.c;
                    u();
                    ohzVar.a(str, str2, ohiVar, this.a.d);
                    this.w = null;
                }
            } else if (i == 2 || i == 3) {
                ohi ohiVar2 = this.w;
                if (ohiVar2 != null && (oicVar = this.a) != null) {
                    Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + oicVar.a + " on " + oicVar.b);
                    ohz ohzVar2 = this.u;
                    oic oicVar3 = this.a;
                    String str3 = oicVar3.a;
                    String str4 = oicVar3.b;
                    int i3 = oicVar3.c;
                    u();
                    ohzVar2.a(str3, str4, ohiVar2, this.a.d);
                    this.n.incrementAndGet();
                }
                ohi ohiVar3 = new ohi(this, this.n.get());
                this.w = ohiVar3;
                oic oicVar4 = new oic(v(), d(), B());
                this.a = oicVar4;
                if (oicVar4.d && a() < 17895000) {
                    throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(oicVar4.a));
                }
                ohz ohzVar3 = this.u;
                String str5 = oicVar4.a;
                String str6 = oicVar4.b;
                int i4 = oicVar4.c;
                String strU = u();
                boolean z = this.a.d;
                H();
                ohy ohyVar = new ohy(str5, str6, z);
                HashMap map = ohzVar3.c;
                synchronized (map) {
                    oia oiaVar = (oia) map.get(ohyVar);
                    Executor executor = ohzVar3.h;
                    if (oiaVar == null) {
                        oiaVar = new oia(ohzVar3, ohyVar);
                        oiaVar.c(ohiVar3, ohiVar3);
                        odjVarD = oiaVar.d(strU);
                        map.put(ohyVar, oiaVar);
                    } else {
                        ohzVar3.e.removeMessages(0, ohyVar);
                        if (oiaVar.a(ohiVar3)) {
                            throw new IllegalStateException(mn.g(ohyVar.a, "Trying to bind a GmsServiceConnection that was already connected before.  config="));
                        }
                        oiaVar.c(ohiVar3, ohiVar3);
                        int i5 = oiaVar.b;
                        if (i5 == 1) {
                            ohiVar3.onServiceConnected(oiaVar.f, oiaVar.d);
                        } else if (i5 == 2) {
                            odjVarD = oiaVar.d(strU);
                        }
                        odjVarD = null;
                    }
                    if (oiaVar.c) {
                        odjVarD = odj.a;
                    } else if (odjVarD == null) {
                        odjVarD = new odj(-1);
                    }
                }
                if (!odjVarD.c()) {
                    oic oicVar5 = this.a;
                    Log.w("GmsClient", "unable to connect to service: " + oicVar5.a + " on " + oicVar5.b);
                    int i6 = odjVarD.c;
                    if (i6 == -1) {
                        i6 = 16;
                    }
                    PendingIntent pendingIntent = odjVarD.d;
                    if (pendingIntent != null) {
                        bundle = new Bundle();
                        bundle.putParcelable("pendingIntent", pendingIntent);
                    }
                    y(i6, bundle, this.n.get());
                }
            } else if (i == 4) {
                ojl.ay(iInterface);
                System.currentTimeMillis();
            }
        }
    }

    public final boolean A(int i, int i2, IInterface iInterface) {
        synchronized (this.d) {
            if (this.h != i) {
                return false;
            }
            J(i2, iInterface);
            return true;
        }
    }

    protected boolean B() {
        return false;
    }

    public final boolean C() {
        return this.m != null;
    }

    public boolean D() {
        return false;
    }

    public odl[] E() {
        throw null;
    }

    protected void G() {
        System.currentTimeMillis();
    }

    protected void H() {
        throw null;
    }

    public int a() {
        throw null;
    }

    protected abstract IInterface b(IBinder iBinder);

    protected abstract String c();

    protected abstract String d();

    public odl[] e() {
        return s;
    }

    public final String f() {
        oic oicVar;
        if (!k() || (oicVar = this.a) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return oicVar.b;
    }

    public final String g() {
        return this.t;
    }

    public void i(ohh ohhVar) {
        this.f = ohhVar;
        J(2, null);
    }

    public final void j(String str) {
        this.t = str;
        w();
    }

    public final boolean k() {
        boolean z;
        synchronized (this.d) {
            z = this.h == 4;
        }
        return z;
    }

    public final boolean l() {
        boolean z;
        synchronized (this.d) {
            int i = this.h;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public boolean m() {
        return true;
    }

    public boolean n() {
        return false;
    }

    public final odl[] o() {
        ohr ohrVar = this.m;
        if (ohrVar == null) {
            return null;
        }
        return ohrVar.b;
    }

    public final void p(oid oidVar, Set set) {
        Object obj;
        String attributionTag;
        Bundle bundleS = s();
        if (this.p == null || (obj = this.p.a) == null) {
            attributionTag = this.j;
        } else {
            AttributionSource attributionSource = (AttributionSource) obj;
            attributionTag = attributionSource.getAttributionTag() == null ? this.j : attributionSource.getAttributionTag();
        }
        String str = attributionTag;
        int i = this.i;
        int i2 = odo.c;
        Scope[] scopeArr = ohw.a;
        Bundle bundle = new Bundle();
        odl[] odlVarArr = ohw.b;
        ohw ohwVar = new ohw(6, i, i2, null, null, scopeArr, bundle, null, odlVarArr, odlVarArr, true, 0, false, str);
        ohwVar.f = this.b.getPackageName();
        ohwVar.i = bundleS;
        if (set != null) {
            ohwVar.h = (Scope[]) set.toArray(new Scope[0]);
        }
        if (n()) {
            Account accountR = r();
            if (accountR == null) {
                accountR = new Account("<<default account>>", "com.google");
            }
            ohwVar.j = accountR;
            if (oidVar != null) {
                ohwVar.g = oidVar.a;
            }
        }
        ohwVar.k = E();
        ohwVar.l = e();
        if (D()) {
            ohwVar.o = true;
        }
        try {
            try {
                synchronized (this.e) {
                    oii oiiVar = this.o;
                    if (oiiVar != null) {
                        oih oihVar = new oih(this, this.n.get());
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                            parcelObtain.writeStrongBinder(oihVar);
                            parcelObtain.writeInt(1);
                            azu.a(ohwVar, parcelObtain, 0);
                            oiiVar.a.transact(46, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                        } catch (Throwable th) {
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            throw th;
                        }
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                }
            } catch (DeadObjectException e) {
                Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
                Handler handler = this.c;
                handler.sendMessage(handler.obtainMessage(6, this.n.get(), 3));
            } catch (SecurityException e2) {
                throw e2;
            }
        } catch (RemoteException | RuntimeException e3) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e3);
            x(8, null, null, this.n.get());
        }
    }

    public final void q(AmbientModeSupport.AmbientController ambientController) {
        ((oga) ambientController.a).k.n.post(new ntd(ambientController, 20, null));
    }

    public Account r() {
        throw null;
    }

    protected Bundle s() {
        return new Bundle();
    }

    public final IInterface t() {
        IInterface iInterface;
        synchronized (this.d) {
            if (this.h == 5) {
                throw new DeadObjectException();
            }
            if (!k()) {
                throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
            }
            iInterface = this.v;
            ojl.az(iInterface, "Client is connected but service is null");
        }
        return iInterface;
    }

    protected final String u() {
        String str = this.x;
        return str == null ? this.b.getClass().getName() : str;
    }

    protected String v() {
        return "com.google.android.gms";
    }

    public void w() {
        this.n.incrementAndGet();
        ArrayList arrayList = this.g;
        synchronized (arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ohg) arrayList.get(i)).d();
            }
            arrayList.clear();
        }
        synchronized (this.e) {
            this.o = null;
        }
        J(1, null);
    }

    protected void x(int i, IBinder iBinder, Bundle bundle, int i2) {
        ohk ohkVar = new ohk(this, i, iBinder, bundle);
        Handler handler = this.c;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, ohkVar));
    }

    protected final void y(int i, Bundle bundle, int i2) {
        ohl ohlVar = new ohl(this, i, bundle);
        Handler handler = this.c;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, ohlVar));
    }

    protected final void z(ohh ohhVar, int i, PendingIntent pendingIntent) {
        this.f = ohhVar;
        Handler handler = this.c;
        handler.sendMessage(handler.obtainMessage(3, this.n.get(), i, pendingIntent));
    }
}
