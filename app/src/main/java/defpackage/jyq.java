package defpackage;

import android.media.MediaFormat;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class jyq implements jzf {
    private static final sgv b = sgv.g("jyq");
    private final kao c;
    private final qfc d;
    private final pao e;
    private final boolean f;
    private jzf g = null;
    private boolean h = false;
    public rwc a = rvk.a;
    private boolean i = false;

    public jyq(kao kaoVar, qfc qfcVar, pao paoVar, boolean z) {
        this.c = kaoVar;
        this.d = qfcVar;
        this.e = paoVar;
        this.f = z;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kao] */
    @Override // defpackage.jzf
    public final synchronized boolean a(poj pojVar) {
        if (this.h) {
            pojVar.d();
            pojVar.close();
            return false;
        }
        kao kaoVar = this.c;
        MediaFormat mediaFormatA = kaoVar.a();
        if (Math.max(mediaFormatA.getInteger("height"), mediaFormatA.getInteger("width")) < Math.max(pojVar.b(), pojVar.c())) {
            this.i = true;
        }
        if (this.g == null) {
            if (this.i && this.a.h()) {
                this.g = this.a.c().b(this.d, this.e, this.f);
            } else {
                this.g = kaoVar.b(this.d, this.e, this.f);
            }
        }
        jzf jzfVar = this.g;
        jzfVar.getClass();
        return jzfVar.a(pojVar);
    }

    @Override // defpackage.jzf, defpackage.paq, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.h) {
            ((sgt) b.c().M(3169)).s("Closing sink more than once");
            return;
        }
        jzf jzfVar = this.g;
        if (jzfVar != null) {
            jzfVar.close();
        } else {
            this.d.close();
        }
        this.h = true;
    }
}
