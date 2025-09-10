package defpackage;

import android.media.MediaFormat;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kbe implements kao {
    public static final sgv a = sgv.g("kbe");
    private final kao b;
    private int c = 1;

    public kbe(kao kaoVar) {
        this.b = kaoVar;
    }

    @Override // defpackage.kao
    public final MediaFormat a() {
        return this.b.a();
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [sgt, shi] */
    @Override // defpackage.kao
    public final synchronized jzf b(qfc qfcVar, pao paoVar, boolean z) {
        int i;
        try {
            i = this.c;
        } catch (RuntimeException e) {
            ((sgt) ((sgt) a.b().i(e)).M((char) 3212)).s("Cannot create MomentsTrackEncoder! Moments will be disabled!");
        }
        if (i > 0) {
            this.c = i + 1;
            return new kbd(this, this.b.b(qfcVar, paoVar, z));
        }
        ((sgt) a.c().M(3211)).s("Attempting to launch already-closed MomentsTrackEncoder!");
        qfcVar.close();
        return new kbc(0);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [sgt, shi] */
    @Override // defpackage.kao
    public final synchronized void c() {
        try {
            if (this.c > 0) {
                this.b.c();
            }
        } catch (RuntimeException e) {
            ((sgt) ((sgt) a.c().i(e)).M((char) 3213)).s("Failed to prewarm MomentsTrackEncoder! Will instantiate during snapshot.");
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        d();
    }

    public final synchronized void d() {
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            this.b.close();
        }
    }
}
