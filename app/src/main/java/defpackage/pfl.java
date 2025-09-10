package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import android.widget.TextView;
import androidx.wear.ambient.AmbientModeSupport;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pfl {
    public final Object a;

    public pfl(TextView textView) {
        this.a = new cty(textView);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final boolean a() {
        MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) this.a.get("video/hevc");
        return mediaCodecInfo != null && mediaCodecInfo.isHardwareAccelerated();
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Map] */
    public final void b(IBinder iBinder) {
        osr osrVar;
        ?? r7 = this.a;
        synchronized (r7) {
            if (iBinder == null) {
                osrVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
                osrVar = iInterfaceQueryLocalInterface instanceof osr ? (osr) iInterfaceQueryLocalInterface : new osr(iBinder);
            }
            oto otoVar = new oto();
            for (Map.Entry entry : r7.entrySet()) {
                otr otrVar = (otr) entry.getValue();
                try {
                    osrVar.e(otoVar, new oqo(otrVar));
                } catch (RemoteException unused) {
                    Log.w("WearableClient", "onPostInitHandler: Didn't add: " + String.valueOf(entry.getKey()) + "/" + String.valueOf(otrVar));
                }
            }
        }
    }

    public final void c(Exception exc) {
        ((oow) this.a).o(exc);
    }

    public final void d(Object obj) {
        ((oow) this.a).p(obj);
    }

    public final void e(Exception exc) {
        ojl.az(exc, "Exception must not be null");
        Object obj = this.a;
        oow oowVar = (oow) obj;
        synchronized (oowVar.a) {
            if (((oow) obj).b) {
                return;
            }
            ((oow) obj).b = true;
            ((oow) obj).d = exc;
            oowVar.e.d((oor) obj);
        }
    }

    public final void f(Object obj) {
        ((oow) this.a).r(obj);
    }

    public final int g(String str) {
        return ((Context) this.a).checkCallingOrSelfPermission(str);
    }

    public final ApplicationInfo h(String str, int i) {
        return ((Context) this.a).getPackageManager().getApplicationInfo(str, i);
    }

    public final PackageInfo i(String str, int i) {
        return ((Context) this.a).getPackageManager().getPackageInfo(str, i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, owq] */
    public final synchronized void j(boolean z) {
        ?? r0 = this.a;
        lek lekVar = new lek((lel) r0.dL());
        lekVar.c(z);
        r0.a(lekVar.a());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, owq] */
    public final synchronized void k(float f) {
        ?? r0 = this.a;
        lek lekVar = new lek((lel) r0.dL());
        lekVar.b(f);
        r0.a(lekVar.a());
    }

    public final kmz l(kmz kmzVar) {
        return new kxx(kmzVar, (hbj) this.a);
    }

    public final PointF m(Rect rect, Rect rect2) {
        PointF pointF = new PointF(rect.exactCenterX(), rect.exactCenterY());
        return ((nnw) this.a).b(new PointF((pointF.x - rect2.left) / rect2.width(), (pointF.y - rect2.top) / rect2.height()));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final synchronized rwc n() {
        ?? r0;
        r0 = this.a;
        return rwc.i((pfl) (r0.isEmpty() ? null : ujp.aR(r0)));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    public final void o() {
        ?? r3 = this.a;
        synchronized (r3) {
            for (iso isoVar : r3) {
                isoVar.b.a(isoVar.a);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    public final void p(owq owqVar) {
        ?? r1 = this.a;
        synchronized (r1) {
            r1.add(new iso(owqVar));
        }
    }

    public final csl q() {
        return (csl) ((utl) this.a).c();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(defpackage.csl r6) {
        /*
            r5 = this;
            r6.getClass()
        L3:
            java.lang.Object r0 = r5.a
            utl r0 = (defpackage.utl) r0
            java.lang.Object r1 = r0.c()
            r2 = r1
            csl r2 = (defpackage.csl) r2
            boolean r3 = r2 instanceof defpackage.csf
            if (r3 != 0) goto L34
            cso r3 = defpackage.cso.a
            boolean r3 = defpackage.a.ao(r2, r3)
            if (r3 == 0) goto L1b
            goto L34
        L1b:
            boolean r3 = r2 instanceof defpackage.cqu
            if (r3 == 0) goto L29
            int r3 = r6.c
            r4 = r2
            cqu r4 = (defpackage.cqu) r4
            int r4 = r4.c
            if (r3 <= r4) goto L35
            goto L34
        L29:
            boolean r3 = r2 instanceof defpackage.cse
            if (r3 == 0) goto L2e
            goto L35
        L2e:
            uet r5 = new uet
            r5.<init>()
            throw r5
        L34:
            r2 = r6
        L35:
            boolean r0 = r0.f(r1, r2)
            if (r0 == 0) goto L3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pfl.r(csl):void");
    }

    public final int s() {
        return ((AtomicInteger) this.a).get();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public final void t() {
        ?? r2 = this.a;
        for (int iBk = ske.bk(r2); iBk >= 0; iBk--) {
            ((bxg) ((rnu) ((ArrayList) r2).get(iBk)).a).b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object u(defpackage.cfc r7, defpackage.uhb r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.cep
            if (r0 == 0) goto L13
            r0 = r8
            cep r0 = (defpackage.cep) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cep r0 = new cep
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            uhi r1 = defpackage.uhi.a
            int r2 = r0.c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L39
            if (r2 == r4) goto L2f
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            java.lang.Object r6 = r0.a
            defpackage.rnt.aN(r8)
            android.graphics.Typeface r8 = (android.graphics.Typeface) r8
            cft r6 = (defpackage.cft) r6
            throw r3
        L39:
            defpackage.rnt.aN(r8)
            return r8
        L3d:
            defpackage.rnt.aN(r8)
            boolean r8 = r7 instanceof defpackage.ceo
            if (r8 == 0) goto L56
            ceo r7 = (defpackage.ceo) r7
            cen r8 = r7.a
            java.lang.Object r6 = r6.a
            r0.c = r5
            android.content.Context r6 = (android.content.Context) r6
            java.lang.Object r6 = r8.b(r6, r7, r0)
            if (r6 != r1) goto L55
            return r1
        L55:
            return r6
        L56:
            boolean r6 = r7 instanceof defpackage.cft
            if (r6 == 0) goto L6e
            r6 = r7
            cft r6 = (defpackage.cft) r6
            r0.a = r7
            r0.c = r4
            uml r6 = new uml
            uhb r7 = defpackage.ske.aE(r0)
            r6.<init>(r7, r5)
            r6.x()
            throw r3
        L6e:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.util.Objects.toString(r7)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r8 = "Unknown font type: "
            java.lang.String r7 = r8.concat(r7)
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pfl.u(cfc, uhb):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object v(cfc cfcVar) {
        if (cfcVar instanceof ceo) {
            ceo ceoVar = (ceo) cfcVar;
            return ceoVar.a.a((Context) this.a, ceoVar);
        }
        if (!(cfcVar instanceof cft)) {
            return null;
        }
        throw null;
    }

    public final void w() {
        synchronized (this) {
            ((yq) this.a).e();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final synchronized paq x(rnu rnuVar) {
        this.a.add(rnuVar);
        return new ktu(this, rnuVar, 4, (byte[]) null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final synchronized paq y(pfl pflVar) {
        this.a.add(pflVar);
        return new ffx(this, pflVar, 17, null);
    }

    public pfl(Object obj) {
        this.a = obj;
    }

    public pfl(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public pfl(byte[] bArr, byte[] bArr2) {
        this.a = new oow();
    }

    public pfl(qaq qaqVar) {
        this.a = new oow();
        AmbientModeSupport.AmbientController ambientController = new AmbientModeSupport.AmbientController(this);
        ((oow) qaqVar.a).m(new oof(ambientController));
    }

    public pfl(char[] cArr, byte[] bArr, byte[] bArr2) {
        this.a = new AtomicReference(null);
    }

    public pfl(char[] cArr, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = new yq((byte[]) null);
    }

    public pfl(Context context, byte[] bArr) {
        this.a = context.getApplicationContext();
    }

    public pfl(byte[] bArr) {
        this.a = new HashMap();
    }

    public pfl(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = new ArrayList();
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, java.util.Map] */
    public pfl() {
        MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
        this.a = new HashMap();
        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
            if (mediaCodecInfo.isEncoder()) {
                String name = mediaCodecInfo.getName();
                String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                if (supportedTypes.length <= 0) {
                    Log.w("CdrCodecMgr", String.valueOf(name).concat(" contains empty supported type"));
                } else {
                    for (String str : supportedTypes) {
                        if (!this.a.containsKey(str)) {
                            this.a.put(str, mediaCodecInfo);
                        }
                    }
                }
            }
        }
    }

    public pfl(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.a = new ArrayList();
    }

    public pfl(byte[] bArr, char[] cArr, byte[] bArr2) {
        this.a = new ArrayList();
    }

    public pfl(char[] cArr, byte[] bArr) {
        this.a = new ArrayList();
    }

    public pfl(char[] cArr, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new AtomicInteger(0);
    }

    public pfl(byte[] bArr, char[] cArr) {
        this.a = new ArrayList();
    }

    public pfl(byte[] bArr, char[] cArr, byte[] bArr2, byte[] bArr3) {
        this.a = utm.a(cso.a);
    }

    public pfl(nkw nkwVar) {
        CaptureRequest.Key key = nvi.j;
        if (key != null) {
            this.a = sbp.l(new pej(key, Integer.valueOf(nkwVar == nkw.IMAGE_INTENT ? 0 : 1)));
        } else {
            int i = sbp.d;
            this.a = sex.a;
        }
    }

    public pfl(kgw kgwVar, byte[] bArr) {
        List listT = kgwVar.t();
        this.a = listT;
        rnt.L(listT.contains(new pas(0, 0)));
    }

    public pfl(pna pnaVar) {
        this.a = pnaVar.c("/gca/onecamera/frame_availability", new pmq("framestream_id", String.class));
    }

    public pfl(char[] cArr) {
        this.a = new CopyOnWriteArrayList();
    }
}
