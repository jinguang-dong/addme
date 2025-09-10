package defpackage;

import android.graphics.RectF;
import com.google.android.apps.camera.ui.hotshot.jni.ObjectInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mxa {
    public int a;
    public float b;
    public RectF c;
    public String d;
    public String e;
    public byte f;
    private Float g;
    private Float h;
    private Float i;

    public final ObjectInfo a() {
        if (this.f == 3) {
            return new mwy(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.i);
        }
        throw new IllegalStateException();
    }

    public final void b(float f) {
        this.g = Float.valueOf(f);
    }

    public final void c(float f) {
        this.h = Float.valueOf(f);
    }

    public final void d(float f) {
        this.i = Float.valueOf(f);
    }
}
