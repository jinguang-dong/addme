package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.util.Range;
import com.google.googlex.gcam.Gcam;
import com.google.googlex.gcam.TfliteFileData;
import com.google.googlex.gcam.hdrplus.NativeHdrPlusInterface;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ied implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    private final /* synthetic */ int i;

    public /* synthetic */ ied(owq owqVar, sbv sbvVar, pjo pjoVar, our ourVar, owf owfVar, owq owqVar2, nms nmsVar, out outVar, int i) {
        this.i = i;
        this.b = owqVar;
        this.a = sbvVar;
        this.e = pjoVar;
        this.h = ourVar;
        this.d = owfVar;
        this.c = owqVar2;
        this.g = nmsVar;
        this.f = outVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, pjo] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, lpp] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, syu] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, mhq] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, pbn] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, uem] */
    @Override // java.lang.Runnable
    public final void run() {
        int iC;
        int i = this.i;
        if (i == 0) {
            ((idy) ((rwc) this.a).c()).a();
            mhs mhsVar = new mhs();
            mhsVar.d("Falcon");
            mhsVar.c(this.c);
            mhsVar.g((mhp) this.d);
            Object obj = this.e;
            mhsVar.f(new hjp(obj, 9));
            mhsVar.e(new hjp(obj, 10));
            paq paqVarD = this.b.d(mhsVar.a());
            our ourVar = ((fqg) this.g).b;
            ourVar.d(paqVarD);
            ?? r0 = this.f;
            Object obj2 = this.h;
            lpm lpmVar = (lpm) obj2;
            lpmVar.a.add(r0);
            synchronized (obj2) {
                iC = ((lpm) obj2).c();
            }
            if (iC != 1) {
                r0.e(iC, lpmVar.g.a(), ((Integer) lpmVar.b.d).intValue());
            }
            ourVar.d(new ktu(obj2, r0, 5));
            return;
        }
        if (i != 1) {
            ?? r02 = this.e;
            this.b.a((Range) ((sbv) this.a).getOrDefault(r02.j(), Range.create(Float.valueOf(r02.d()), Float.valueOf(r02.c()))));
            ((our) this.h).d(this.d.dK(new leg(this.c, this.g, 4, null), this.f));
            return;
        }
        Object obj3 = this.c;
        Object obj4 = this.b;
        Object obj5 = this.d;
        Object obj6 = this.g;
        final ?? r7 = this.a;
        final ?? r6 = this.e;
        final ?? r5 = this.h;
        final Context context = (Context) obj6;
        final String str = (String) obj5;
        final String str2 = (String) obj4;
        final String str3 = (String) obj3;
        ojl.ck(this.f, new paf() { // from class: hyp
            /* JADX WARN: Type inference failed for: r2v5, types: [sgt, shi] */
            /* JADX WARN: Type inference failed for: r2v7, types: [sgt, shi] */
            @Override // defpackage.paf
            public final void a(Object obj7) throws IOException {
                AssetFileDescriptor assetFileDescriptorOpenFd;
                pbn pbnVar = r5;
                pbnVar.f("Pecan#initialize");
                Gcam gcam = (Gcam) r6.a();
                Object objA = ((hyt) r7).a();
                String str4 = str3;
                String str5 = str2;
                String str6 = str;
                Context context2 = context;
                try {
                    assetFileDescriptorOpenFd = context2.getAssets().openFd(str6);
                } catch (IOException e) {
                    ((sgt) ((sgt) ibd.a.b().i(e)).M((char) 1796)).s("Unable to get model asset file");
                } catch (RuntimeException e2) {
                    ((sgt) ((sgt) ibd.a.b().i(e2)).M((char) 1797)).s("Failed to initialize Pecan");
                }
                try {
                    TfliteFileData tfliteFileData = null;
                    AssetFileDescriptor assetFileDescriptorOpenFd2 = rnt.V(str5) ? null : context2.getAssets().openFd(str5);
                    try {
                        assetFileDescriptorOpenFd2 = rnt.V(str4) ? null : context2.getAssets().openFd(str4);
                        try {
                            TfliteFileData tfliteFileData2 = new TfliteFileData(assetFileDescriptorOpenFd.getParcelFileDescriptor().getFd(), assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getLength());
                            TfliteFileData tfliteFileData3 = assetFileDescriptorOpenFd2 == null ? null : new TfliteFileData(assetFileDescriptorOpenFd2.getParcelFileDescriptor().getFd(), assetFileDescriptorOpenFd2.getStartOffset(), assetFileDescriptorOpenFd2.getLength());
                            if (assetFileDescriptorOpenFd2 != null) {
                                tfliteFileData = new TfliteFileData(assetFileDescriptorOpenFd2.getParcelFileDescriptor().getFd(), assetFileDescriptorOpenFd2.getStartOffset(), assetFileDescriptorOpenFd2.getLength());
                            }
                            ((NativeHdrPlusInterface) objA).nativeInitializePecanFromOpenFile(tfliteFileData2.a, tfliteFileData3 == null ? 0L : tfliteFileData3.a, tfliteFileData != null ? tfliteFileData.a : 0L, Gcam.a(gcam));
                            if (assetFileDescriptorOpenFd2 != null) {
                                assetFileDescriptorOpenFd2.close();
                            }
                            if (assetFileDescriptorOpenFd2 != null) {
                                assetFileDescriptorOpenFd2.close();
                            }
                            if (assetFileDescriptorOpenFd != null) {
                                assetFileDescriptorOpenFd.close();
                            }
                            pbnVar.g();
                        } finally {
                            if (assetFileDescriptorOpenFd2 == null) {
                                throw th;
                            }
                            try {
                                assetFileDescriptorOpenFd2.close();
                                throw th;
                            } catch (Throwable th) {
                                th.addSuppressed(th);
                            }
                        }
                    } catch (Throwable th2) {
                        if (assetFileDescriptorOpenFd2 != null) {
                            try {
                                assetFileDescriptorOpenFd2.close();
                                throw th2;
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                                throw th2;
                            }
                        }
                    }
                } finally {
                }
            }
        }, sxo.a);
    }

    public /* synthetic */ ied(rwc rwcVar, fqg fqgVar, mhq mhqVar, out outVar, mhp mhpVar, ovx ovxVar, lpm lpmVar, lpo lpoVar, int i) {
        this.i = i;
        this.a = rwcVar;
        this.g = fqgVar;
        this.b = mhqVar;
        this.c = outVar;
        this.d = mhpVar;
        this.e = ovxVar;
        this.h = lpmVar;
        this.f = lpoVar;
    }

    public /* synthetic */ ied(syu syuVar, pbn pbnVar, uem uemVar, uem uemVar2, Context context, String str, String str2, String str3, int i) {
        this.i = i;
        this.f = syuVar;
        this.h = pbnVar;
        this.e = uemVar;
        this.a = uemVar2;
        this.g = context;
        this.d = str;
        this.b = str2;
        this.c = str3;
    }
}
