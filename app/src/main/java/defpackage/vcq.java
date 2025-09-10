package defpackage;

import android.os.Process;
import android.os.Trace;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class vcq implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ vcq(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, vdb] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, vdb] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, vdb] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, vdb] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        int i = 3;
        switch (this.c) {
            case 0:
                new jps("JavaUploadDataSinkBase#executeOnExecutor " + ((String) this.a) + " running callback", 3, null);
                try {
                    this.b.run();
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 1:
                Thread.currentThread().setName("JavaCronetEngine");
                Process.setThreadPriority(((vcl) this.a).a);
                this.b.run();
                return;
            case 2:
                vda vdaVar = (vda) this.a;
                String str = vdaVar.p;
                vcy vcyVar = vdaVar.b;
                vcyVar.a(new vcx(vcyVar, (UrlResponseInfo) this.b, str, 0), "onRedirectReceived");
                return;
            case 3:
                try {
                    this.a.a();
                    return;
                } catch (Throwable th3) {
                    ((vda) this.b).b(new vbz("System error", th3));
                    return;
                }
            case 4:
                try {
                    this.a.a();
                    return;
                } catch (Throwable th4) {
                    ((vda) this.b).c(th4);
                    return;
                }
            case 5:
                try {
                    this.a.a();
                    return;
                } catch (Throwable th5) {
                    Object obj = this.b;
                    smv smvVar = new smv(obj, 13);
                    vda vdaVar2 = (vda) obj;
                    vdaVar2.d(smvVar, "enterUserErrorState");
                    vdaVar2.b(new vbv("Exception received from UrlRequest.Callback", th5));
                    return;
                }
            case 6:
                String str2 = vda.a;
                new jps("Cronet JavaUrlRequest#executeOnExecutor " + ((String) this.a) + " running callback", 3, null);
                try {
                    this.b.run();
                    Trace.endSection();
                    return;
                } catch (Throwable th6) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                    throw th6;
                }
            case 7:
                ?? r0 = this.a;
                vda vdaVar3 = (vda) this.b;
                vdaVar3.d(new vcq(vdaVar3, (vdb) r0, i), "read");
                return;
            case 8:
                Object obj2 = this.b;
                Object obj3 = this.a;
                try {
                    ((vcy) obj3).a.onSucceeded(((vcy) obj3).d, (UrlResponseInfo) obj2);
                } catch (Exception e) {
                    ((vcy) obj3).d.i("onSucceded", e);
                }
                vcy vcyVar2 = (vcy) obj3;
                vcyVar2.c();
                vcyVar2.d.r.a();
                return;
            case 9:
                new jps("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnFallbackExecutor  " + ((String) this.a) + " running callback", 3, null);
                try {
                    this.b.run();
                    Trace.endSection();
                    return;
                } catch (Throwable th8) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th9) {
                        th8.addSuppressed(th9);
                    }
                    throw th8;
                }
            case 10:
                new jps("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnUserExecutor " + ((String) this.a) + " running callback", 3, null);
                try {
                    this.b.run();
                    Trace.endSection();
                    return;
                } catch (Throwable th10) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th11) {
                        th10.addSuppressed(th11);
                    }
                    throw th10;
                }
            default:
                Object obj4 = this.b;
                Object obj5 = this.a;
                try {
                    ((vcy) obj5).a.onCanceled(((vcy) obj5).d, (UrlResponseInfo) obj4);
                } catch (Exception e2) {
                    ((vcy) obj5).d.i("onCanceled", e2);
                }
                vcy vcyVar3 = (vcy) obj5;
                vcyVar3.c();
                vcyVar3.d.r.a();
                return;
        }
    }

    public /* synthetic */ vcq(Runnable runnable, int i) {
        this.c = i;
        this.a = "onFailed";
        this.b = runnable;
    }

    public vcq(vcl vclVar, Runnable runnable, int i) {
        this.c = i;
        this.b = runnable;
        this.a = vclVar;
    }

    public /* synthetic */ vcq(vda vdaVar, vdb vdbVar, int i) {
        this.c = i;
        this.b = vdaVar;
        this.a = vdbVar;
    }
}
