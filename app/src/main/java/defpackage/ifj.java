package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import com.google.android.apps.camera.hdrplus.fusion.api.FusionProgressCallback;
import com.pairip.VMRunner;
import java.io.IOException;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ifj implements idy {
    private static final sgv b = sgv.g("ifj");
    public final hbj a;
    private final Context c;
    private final String d;
    private final lgp e;
    private final syw f;
    private final ifo g;
    private final tdi h;
    private final pbn i;
    private volatile boolean j = false;

    public ifj(Context context, hbj hbjVar, pbn pbnVar, rwc rwcVar, lgp lgpVar, syw sywVar, ifo ifoVar, tdi tdiVar) {
        this.c = context;
        this.a = hbjVar;
        this.d = (String) rwcVar.b(new hia(4)).e("");
        this.e = lgpVar;
        this.f = sywVar;
        this.g = ifoVar;
        this.h = tdiVar;
        this.i = pbnVar;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [sgt, shi] */
    @Override // defpackage.idy
    public final void a() throws IOException {
        String strF;
        if (this.j) {
            return;
        }
        lgp lgpVar = this.e;
        if (lgpVar.a() == 0) {
            pbn pbnVar = this.i;
            pbnVar.f("SegmenterManager#init");
            lgpVar.b();
            pbnVar.g();
        }
        this.i.f("FocusStack#init");
        hbj hbjVar = this.a;
        boolean zP = hbjVar.p(gzc.n);
        if (zP) {
            strF = hbjVar.f(gzc.l);
            strF.getClass();
        } else {
            strF = "";
        }
        boolean z = false;
        try {
            Context context = this.c;
            AssetFileDescriptor assetFileDescriptorOpenFd = context.getAssets().openFd(strF);
            try {
                AssetFileDescriptor assetFileDescriptorOpenFd2 = context.getAssets().openFd("deblur_06_20_2023_pwcnet_v0.tflite.uncompressed");
                try {
                    tpc tpcVarM = ifv.a.m();
                    String str = Build.DEVICE;
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    tph tphVar = tpcVarM.b;
                    str.getClass();
                    ((ifv) tphVar).c = str;
                    String str2 = this.d;
                    if (!tphVar.C()) {
                        tpcVarM.o();
                    }
                    ((ifv) tpcVarM.b).d = str2;
                    ifu ifuVar = ifu.a;
                    tpc tpcVarM2 = ifuVar.m();
                    int fd = assetFileDescriptorOpenFd.getParcelFileDescriptor().getFd();
                    if (!tpcVarM2.b.C()) {
                        tpcVarM2.o();
                    }
                    ((ifu) tpcVarM2.b).b = fd;
                    long startOffset = assetFileDescriptorOpenFd.getStartOffset();
                    if (!tpcVarM2.b.C()) {
                        tpcVarM2.o();
                    }
                    ((ifu) tpcVarM2.b).c = startOffset;
                    long length = assetFileDescriptorOpenFd.getLength();
                    if (!tpcVarM2.b.C()) {
                        tpcVarM2.o();
                    }
                    tph tphVar2 = tpcVarM2.b;
                    ((ifu) tphVar2).d = length;
                    if (!tphVar2.C()) {
                        tpcVarM2.o();
                    }
                    ((ifu) tpcVarM2.b).e = a.ar(3);
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    ifv ifvVar = (ifv) tpcVarM.b;
                    ifu ifuVar2 = (ifu) tpcVarM2.l();
                    ifuVar2.getClass();
                    ifvVar.e = ifuVar2;
                    ifvVar.b |= 1;
                    tpc tpcVarM3 = ifuVar.m();
                    int fd2 = assetFileDescriptorOpenFd2.getParcelFileDescriptor().getFd();
                    if (!tpcVarM3.b.C()) {
                        tpcVarM3.o();
                    }
                    ((ifu) tpcVarM3.b).b = fd2;
                    long startOffset2 = assetFileDescriptorOpenFd2.getStartOffset();
                    if (!tpcVarM3.b.C()) {
                        tpcVarM3.o();
                    }
                    ((ifu) tpcVarM3.b).c = startOffset2;
                    long length2 = assetFileDescriptorOpenFd2.getLength();
                    if (!tpcVarM3.b.C()) {
                        tpcVarM3.o();
                    }
                    tph tphVar3 = tpcVarM3.b;
                    ((ifu) tphVar3).d = length2;
                    if (!tphVar3.C()) {
                        tpcVarM3.o();
                    }
                    ((ifu) tpcVarM3.b).e = a.ar(4);
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    ifv ifvVar2 = (ifv) tpcVarM.b;
                    ifu ifuVar3 = (ifu) tpcVarM3.l();
                    ifuVar3.getClass();
                    ifvVar2.f = ifuVar3;
                    ifvVar2.b |= 2;
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    tph tphVar4 = tpcVarM.b;
                    ((ifv) tphVar4).g = zP;
                    if (!tphVar4.C()) {
                        tpcVarM.o();
                    }
                    ((ifv) tpcVarM.b).h = false;
                    boolean zC = this.g.c((ifv) tpcVarM.l());
                    if (assetFileDescriptorOpenFd2 != null) {
                        assetFileDescriptorOpenFd2.close();
                    }
                    if (assetFileDescriptorOpenFd != null) {
                        assetFileDescriptorOpenFd.close();
                    }
                    z = zC;
                } finally {
                }
            } finally {
            }
        } catch (IOException e) {
            ((sgt) ((sgt) b.c().i(e)).M((char) 1965)).s("Unable to initialize.");
        }
        this.j = z;
        this.i.g();
    }

    @Override // defpackage.idy
    public final syu b(final long j, kgw kgwVar, final idx idxVar, final idx idxVar2, final FusionProgressCallback fusionProgressCallback, pas pasVar) {
        return this.f.submit(new Callable() { // from class: ifi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(this.a.g(j, idxVar, idxVar2, fusionProgressCallback));
            }
        });
    }

    @Override // defpackage.idy
    public final void c() {
    }

    @Override // defpackage.idy
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.idy
    public final int e(int i) {
        return 5;
    }

    @Override // defpackage.idy
    public final int f(int i) {
        int i2 = jea.i(i);
        if (i2 == 0) {
            return 1;
        }
        switch (i2 - 2) {
        }
        return 1;
    }

    public boolean g(long j, idx idxVar, idx idxVar2, FusionProgressCallback fusionProgressCallback) {
        return ((Boolean) VMRunner.invoke("8EsZpQTfGuTvVBvc", new Object[]{this, Long.valueOf(j), idxVar, idxVar2, fusionProgressCallback})).booleanValue();
    }
}
