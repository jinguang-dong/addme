package defpackage;

import android.app.Activity;
import android.content.Context;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import androidx.wear.ambient.AmbientDelegate;
import com.google.ar.core.ArCoreApk;
import com.google.lens.sdk.LensApi;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class qej implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ qej(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, vdb] */
    /* JADX WARN: Type inference failed for: r13v3, types: [com.google.ar.core.ArCoreApk$ICheckAvailabilityCallback, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.google.ar.core.ArCoreApk$ICheckAvailabilityCallback, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 4;
        int i2 = 2;
        byte b = 0;
        switch (this.d) {
            case 0:
                Object obj = this.a;
                qek qekVar = (qek) obj;
                rnt.L(qekVar.b != -1);
                try {
                    ((qek) obj).c.g.e(((qek) obj).b, (ByteBuffer) this.b, (MediaCodec.BufferInfo) this.c);
                    return;
                } catch (czs e) {
                    qekVar.c.c.a(e);
                    return;
                }
            case 1:
                ((qei) this.c).b.b((String) this.b, this.a);
                return;
            case 2:
                qvr.b(new pev(this.c, this.a, 15), this.b);
                return;
            case 3:
                try {
                    rqo rqoVar = ((rtt) this.b).e;
                    String str = ((Context) this.c).getApplicationInfo().packageName;
                    Bundle bundleH = rtt.h();
                    rtu rtuVar = new rtu(this.a);
                    Parcel parcelA = rqoVar.a();
                    parcelA.writeString(str);
                    fbj.c(parcelA, bundleH);
                    fbj.d(parcelA, rtuVar);
                    rqoVar.B(2, parcelA);
                    return;
                } catch (RemoteException e2) {
                    Log.e("ARCore-InstallService", "requestInfo threw", e2);
                    this.a.onResult(ArCoreApk.Availability.UNKNOWN_ERROR);
                    return;
                }
            case 4:
                if (((AtomicBoolean) this.b).getAndSet(true)) {
                    return;
                }
                Log.w("ARCore-InstallService", "requestInstall timed out, launching fullscreen.");
                rtt.g((Activity) this.c, (rtr) this.a);
                return;
            case 5:
                try {
                    AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    rqo rqoVar2 = ((rtt) this.b).e;
                    Object obj2 = this.c;
                    String str2 = ((Activity) obj2).getApplicationInfo().packageName;
                    List listSingletonList = Collections.singletonList(rtt.h());
                    Bundle bundle = new Bundle();
                    Object obj3 = this.a;
                    rtx rtxVar = new rtx(atomicBoolean, (rtr) obj3, (Activity) obj2);
                    Parcel parcelA2 = rqoVar2.a();
                    parcelA2.writeString(str2);
                    parcelA2.writeTypedList(listSingletonList);
                    fbj.c(parcelA2, bundle);
                    fbj.d(parcelA2, rtxVar);
                    rqoVar2.B(1, parcelA2);
                    new Handler().postDelayed(new qej(atomicBoolean, (Activity) obj2, (rtr) obj3, 4), 3000L);
                    return;
                } catch (RemoteException e3) {
                    Log.w("ARCore-InstallService", "requestInstall threw, launching fullscreen.", e3);
                    rtt.g((Activity) this.c, (rtr) this.a);
                    return;
                }
            case 6:
                Object obj4 = this.b;
                Object obj5 = this.c;
                Object obj6 = this.a;
                final long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                final LensApi lensApi = (LensApi) obj6;
                final Activity activity = (Activity) obj5;
                final tnf tnfVar = (tnf) obj4;
                psf psfVar = new psf() { // from class: tnb
                    @Override // defpackage.psf
                    public final void a(int i3) {
                        if (i3 != 2) {
                            LensApi.d(activity);
                            return;
                        }
                        tnf tnfVar2 = tnfVar;
                        if (tnfVar2.c == null) {
                            long j = jElapsedRealtimeNanos;
                            tnfVar2 = new tnf(tnfVar2.a, tnfVar2.b, Long.valueOf(j), tnfVar2.d, tnfVar2.e);
                        }
                        lensApi.a(tnfVar2);
                    }
                };
                prh.c();
                AmbientDelegate ambientDelegate = lensApi.b;
                ambientDelegate.D(new pse(ambientDelegate, psfVar, b == true ? 1 : 0));
                return;
            case 7:
                new jps("Cronet JavaUploadDataSinkBase#executeOnUploadExecutor " + ((String) this.c) + " running callback", 3, null);
                try {
                    new vcq(((vct) this.a).k, (vdb) this.b, i).run();
                    Trace.endSection();
                    return;
                } finally {
                }
            case 8:
                Object obj7 = this.b;
                vda vdaVar = (vda) obj7;
                vdaVar.p = URI.create(vdaVar.m).resolve((String) this.c).toString();
                vdaVar.f.add(vdaVar.p);
                vdaVar.j(2, 3, new vcq(obj7, this.a, i2));
                return;
            default:
                Object obj8 = this.c;
                Object obj9 = this.a;
                Object obj10 = this.b;
                try {
                    ((vcy) obj10).a.onFailed(((vcy) obj10).d, (UrlResponseInfo) obj9, (CronetException) obj8);
                } catch (Exception e4) {
                    ((vcy) obj10).d.i("onFailed", e4);
                }
                vcy vcyVar = (vcy) obj10;
                vcyVar.c();
                vcyVar.d.r.a();
                return;
        }
    }

    public qej(AtomicBoolean atomicBoolean, Activity activity, rtr rtrVar, int i) {
        this.d = i;
        this.b = atomicBoolean;
        this.c = activity;
        this.a = rtrVar;
    }

    public /* synthetic */ qej(qei qeiVar, String str, Object obj, int i) {
        this.d = i;
        this.c = qeiVar;
        this.b = str;
        this.a = obj;
    }

    public /* synthetic */ qej(qek qekVar, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, int i) {
        this.d = i;
        this.a = qekVar;
        this.b = byteBuffer;
        this.c = bufferInfo;
    }

    public /* synthetic */ qej(qvr qvrVar, tzj tzjVar, Executor executor, int i) {
        this.d = i;
        this.c = qvrVar;
        this.a = tzjVar;
        this.b = executor;
    }

    public qej(rtt rttVar, Context context, Object obj, int i) {
        this.d = i;
        this.c = context;
        this.a = obj;
        this.b = rttVar;
    }

    public /* synthetic */ qej(vcy vcyVar, UrlResponseInfo urlResponseInfo, CronetException cronetException, int i) {
        this.d = i;
        this.b = vcyVar;
        this.a = urlResponseInfo;
        this.c = cronetException;
    }

    public /* synthetic */ qej(vda vdaVar, String str, UrlResponseInfo urlResponseInfo, int i) {
        this.d = i;
        this.b = vdaVar;
        this.c = str;
        this.a = urlResponseInfo;
    }
}
