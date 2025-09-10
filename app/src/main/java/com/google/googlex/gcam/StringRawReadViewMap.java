package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class StringRawReadViewMap {
    public transient long a;
    protected transient boolean b;

    public StringRawReadViewMap() {
        long jNew_StringRawReadViewMap__SWIG_0 = GcamModuleJNI.new_StringRawReadViewMap__SWIG_0();
        this.b = true;
        this.a = jNew_StringRawReadViewMap__SWIG_0;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_StringRawReadViewMap(j);
            }
            this.a = 0L;
        }
    }

    public final void b(String str, RawReadView rawReadView) {
        GcamModuleJNI.StringRawReadViewMap_set(this.a, this, str, RawReadView.c(rawReadView), rawReadView);
    }

    protected final void finalize() {
        a();
    }
}
