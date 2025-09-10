package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import com.google.ar.core.ImageMetadata;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class otq extends ohx {
    private final pfl A;
    private final pfl B;
    private final pfl C;
    private final pfl D;
    public final pfl t;
    private final ots u;
    private final pfl v;
    private final pfl w;
    private final pfl x;
    private final pfl y;
    private final pfl z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public otq(Context context, Looper looper, oeu oeuVar, oev oevVar, ohp ohpVar) {
        super(context, looper, 14, ohpVar, oeuVar, oevVar);
        ojl ojlVar = olr.a;
        ExecutorService executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        ots otsVarA = ots.a(context);
        this.v = new pfl((byte[]) null);
        this.w = new pfl((byte[]) null);
        this.x = new pfl((byte[]) null);
        this.y = new pfl((byte[]) null);
        this.z = new pfl((byte[]) null);
        this.t = new pfl((byte[]) null);
        this.A = new pfl((byte[]) null);
        this.B = new pfl((byte[]) null);
        this.C = new pfl((byte[]) null);
        this.D = new pfl((byte[]) null);
        new pfl((byte[]) null);
        new pfl((byte[]) null);
        ojl.ay(executorServiceUnconfigurableExecutorService);
        this.u = otsVarA;
        rnt.y(new fvq(context, 11));
    }

    @Override // defpackage.ohm
    public final boolean D() {
        return true;
    }

    @Override // defpackage.ohx, defpackage.ohm, defpackage.oeo
    public final int a() {
        return 8600000;
    }

    @Override // defpackage.ohm
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
        return iInterfaceQueryLocalInterface instanceof osr ? (osr) iInterfaceQueryLocalInterface : new osr(iBinder);
    }

    @Override // defpackage.ohm
    protected final String c() {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    @Override // defpackage.ohm
    protected final String d() {
        return "com.google.android.gms.wearable.BIND";
    }

    @Override // defpackage.ohm
    public final odl[] e() {
        return oqd.F;
    }

    @Override // defpackage.ohm, defpackage.oeo
    public final void i(ohh ohhVar) {
        if (!m()) {
            try {
                Context context = this.b;
                Bundle bundle = context.getPackageManager().getApplicationInfo("com.google.android.wearable.app.cn", 128).metaData;
                int i = bundle != null ? bundle.getInt("com.google.android.wearable.api.version", 0) : 0;
                if (i < 8600000) {
                    Log.w("WearableClient", a.bv(i, "The Wear OS app is out of date. Requires API version 8600000 but found "));
                    Intent intent = new Intent("com.google.android.wearable.app.cn.UPDATE_ANDROID_WEAR").setPackage("com.google.android.wearable.app.cn");
                    if (context.getPackageManager().resolveActivity(intent, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) == null) {
                        intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.wearable.app.cn").build());
                    }
                    z(ohhVar, 6, lpa.v(context, intent, 33554432));
                    return;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                z(ohhVar, 16, null);
                return;
            }
        }
        super.i(ohhVar);
    }

    @Override // defpackage.ohm, defpackage.oeo
    public final boolean m() {
        return !this.u.b();
    }

    @Override // defpackage.ohm
    protected final String v() {
        return this.u.b() ? "com.google.android.wearable.app.cn" : "com.google.android.gms";
    }

    @Override // defpackage.ohm
    protected final void x(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (i == 0) {
            this.v.b(iBinder);
            this.w.b(iBinder);
            this.x.b(iBinder);
            this.z.b(iBinder);
            this.t.b(iBinder);
            this.A.b(iBinder);
            this.B.b(iBinder);
            this.C.b(iBinder);
            this.D.b(iBinder);
            this.y.b(iBinder);
            i = 0;
        }
        super.x(i, iBinder, bundle, i2);
    }
}
