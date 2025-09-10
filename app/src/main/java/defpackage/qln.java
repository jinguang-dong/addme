package defpackage;

import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qln {
    public final Object a;
    public rvu b;
    public Handler c;
    public boolean d;
    public Surface e;
    public boolean f;
    private final MediaFormat g;
    private final qlv h;
    private scf i;

    public qln() {
        this.a = new Object();
        this.b = rvx.a;
    }

    public final void a(qlr qlrVar) {
        this.i = new scf(qlrVar);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, qlr] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, qlr] */
    public final /* bridge */ /* synthetic */ qth b() {
        Object objApply;
        try {
            synchronized (this.a) {
                rvu rvuVar = this.b;
                try {
                    scf scfVar = this.i;
                    qlv qlvVar = this.h;
                    scfVar.a = new qlo(scfVar.a, qlvVar);
                    objApply = rvuVar.apply(new qth(this.g, qlvVar, scfVar.a, this.c, this.d, this.e, this.f));
                } catch (Throwable th) {
                    throw new IllegalStateException("Could not build track encoder", th);
                }
            }
            return (qth) objApply;
        } catch (Throwable th2) {
            throw new IllegalStateException("Could not build instance.", th2);
        }
    }

    public qln(MediaFormat mediaFormat, qlv qlvVar) {
        this.a = new Object();
        this.b = rvx.a;
        this.f = false;
        this.g = mediaFormat;
        this.c = null;
        this.h = qlvVar;
        this.i = new scf(qlr.c);
        this.d = false;
        this.e = null;
    }
}
