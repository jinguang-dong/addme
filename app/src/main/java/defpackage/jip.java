package defpackage;

import android.content.Context;
import com.google.android.apps.camera.ui.gridlines.gBW.mNLbzhCxd;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class jip implements jiw {
    private static final sgv a = sgv.g(mNLbzhCxd.bpUuySevmMkKRJC);
    private FileOutputStream b;
    private final File c;

    /* JADX WARN: Type inference failed for: r0v2, types: [sgt, shi] */
    public jip(Context context) {
        FileOutputStream fileOutputStream;
        File file = new File(new File(context.getFilesDir(), "camera_events"), "session.pb");
        this.c = file;
        file.getPath();
        try {
            rup.h(file);
            fileOutputStream = new FileOutputStream(file, true);
        } catch (IOException e) {
            ((sgt) ((sgt) a.b().i(e)).M((char) 2775)).s("Failed to create logging file!");
            fileOutputStream = null;
        }
        this.b = fileOutputStream;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r9v2, types: [sgt, shi] */
    @Override // defpackage.jiw
    public final void a(sod sodVar) {
        int iK;
        try {
            synchronized (this) {
                FileOutputStream fileOutputStream = this.b;
                if (fileOutputStream != null) {
                    tpc tpcVar = (tpc) sodVar.a(5, null);
                    tpcVar.r(sodVar);
                    tpc tpcVarM = spm.a.m();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    spm spmVar = (spm) tpcVarM.b;
                    spmVar.b |= 1;
                    spmVar.c = jCurrentTimeMillis;
                    if (!tpcVar.b.C()) {
                        tpcVar.o();
                    }
                    sod sodVar2 = (sod) tpcVar.b;
                    spm spmVar2 = (spm) tpcVarM.l();
                    sod sodVar3 = sod.a;
                    spmVar2.getClass();
                    sodVar2.W = spmVar2;
                    sodVar2.c |= 134217728;
                    sod sodVar4 = (sod) tpcVar.l();
                    if (sodVar4.C()) {
                        iK = sodVar4.k(null);
                        if (iK < 0) {
                            throw new IllegalStateException(a.bv(iK, "serialized size must be non-negative, was "));
                        }
                    } else {
                        iK = sodVar4.aV & Integer.MAX_VALUE;
                        if (iK == Integer.MAX_VALUE) {
                            iK = sodVar4.k(null);
                            if (iK < 0) {
                                throw new IllegalStateException(a.bv(iK, "serialized size must be non-negative, was "));
                            }
                            sodVar4.aV = (sodVar4.aV & Integer.MIN_VALUE) | iK;
                        }
                    }
                    top topVar = new top(fileOutputStream, tos.S(tos.ab(iK) + iK));
                    topVar.C(iK);
                    sodVar4.eg(topVar);
                    topVar.i();
                    FileOutputStream fileOutputStream2 = this.b;
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                            this.b = null;
                            this.b = new FileOutputStream(this.c, true);
                        } catch (IOException e) {
                            ((sgt) ((sgt) a.b().i(e)).M((char) 2778)).s("Failed to re-open logging file!");
                        }
                    }
                }
            }
        } catch (IOException e2) {
            ((sgt) ((sgt) a.b().i(e2)).M((char) 2779)).s("Failed to log an event!");
        }
    }
}
