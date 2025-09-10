package defpackage;

import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qkc extends qjr {
    final /* synthetic */ qjy e;
    final /* synthetic */ int f;
    final /* synthetic */ qmn g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qkc(qkq qkqVar, EGLDisplay eGLDisplay, EGLSurface eGLSurface, EGLContext eGLContext, EGLConfig eGLConfig, int i, qhv qhvVar, qjy qjyVar, int i2, qmn qmnVar) {
        super(qkqVar, eGLDisplay, eGLSurface, eGLContext, eGLConfig, i, qhvVar);
        this.e = qjyVar;
        this.f = i2;
        this.g = qmnVar;
    }

    @Override // defpackage.qfn
    public final qgi b() {
        try {
            this.e.i();
            qkd.e(0);
            qkd.d(this.f);
            return this.g.a();
        } catch (Throwable th) {
            return new qgi(this.g.a().a(sxo.a, new qfk(th, 0)));
        }
    }
}
