package defpackage;

import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qkb extends qjr {
    final /* synthetic */ qjy e;
    final /* synthetic */ int f;
    final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qkb(qkq qkqVar, EGLDisplay eGLDisplay, EGLSurface eGLSurface, EGLContext eGLContext, EGLConfig eGLConfig, int i, qhx qhxVar, qjy qjyVar, int i2, int i3) {
        super(qkqVar, eGLDisplay, eGLSurface, eGLContext, eGLConfig, i, qhxVar);
        this.e = qjyVar;
        this.f = i2;
        this.g = i3;
    }

    @Override // defpackage.qfn
    public final qgi b() {
        this.e.i();
        qkd.e(this.f);
        qkd.d(this.g);
        return qgh.a;
    }
}
