package defpackage;

import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.RawWriteView;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tcu extends RawWriteView {
    private transient long b;
    private Optional c;

    public tcu() {
        this(GcamModuleJNI.new_RawImage__SWIG_0());
        if (this.b == 0) {
            return;
        }
        long jB = b();
        if (jB > 0) {
            this.c = Optional.of(rup.q(this, jB));
        }
        int i = tdh.a;
    }

    @Override // com.google.googlex.gcam.RawWriteView, com.google.googlex.gcam.RawReadView
    public final synchronized void a() {
        if (this.b != 0) {
            if (this.a) {
                int i = tdh.a;
                this.a = false;
                GcamModuleJNI.delete_RawImage(this.b);
                this.c.ifPresent(new tch(4));
            }
            this.b = 0L;
        }
        super.a();
    }

    @Override // com.google.googlex.gcam.RawWriteView, com.google.googlex.gcam.RawReadView
    protected final void finalize() {
        a();
    }

    public tcu(int i, int i2, tct tctVar) {
        this(GcamModuleJNI.new_RawImage__SWIG_1(i, i2, tctVar.g));
        if (this.b == 0) {
            return;
        }
        long jB = b();
        if (jB > 0) {
            this.c = Optional.of(rup.q(this, jB));
        }
        int i3 = tdh.a;
    }

    public tcu(long j) {
        super(GcamModuleJNI.RawImage_SWIGUpcast(j));
        this.c = Optional.empty();
        this.b = j;
    }
}
