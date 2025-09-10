package com.google.googlex.gcam;

import defpackage.tct;
import defpackage.tcx;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RawWriteView extends RawReadView {
    private transient long b;

    public RawWriteView() {
        this(GcamModuleJNI.new_RawWriteView__SWIG_0());
    }

    public static long e(RawWriteView rawWriteView) {
        if (rawWriteView == null) {
            return 0L;
        }
        return rawWriteView.b;
    }

    @Override // com.google.googlex.gcam.RawReadView
    public synchronized void a() {
        long j = this.b;
        if (j != 0) {
            if (this.a) {
                this.a = false;
                GcamModuleJNI.delete_RawWriteView(j);
            }
            this.b = 0L;
        }
        super.a();
    }

    @Override // com.google.googlex.gcam.RawReadView
    protected void finalize() {
        a();
    }

    public RawWriteView(int i, int i2, int i3, tct tctVar, tcx tcxVar) {
        this(GcamModuleJNI.new_RawWriteView__SWIG_1(i, i2, i3, tctVar.g, tcx.a(tcxVar)));
    }

    public RawWriteView(long j) {
        super(GcamModuleJNI.RawWriteView_SWIGUpcast(j));
        this.b = j;
    }
}
