package defpackage;

import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qka extends qjr {
    final /* synthetic */ qjy e;
    final /* synthetic */ qmn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qka(qkq qkqVar, EGLDisplay eGLDisplay, EGLSurface eGLSurface, EGLContext eGLContext, EGLConfig eGLConfig, qhv qhvVar, qjy qjyVar, qmn qmnVar) {
        super(qkqVar, eGLDisplay, eGLSurface, eGLContext, eGLConfig, 0, qhvVar);
        this.e = qjyVar;
        this.f = qmnVar;
    }

    @Override // defpackage.qfn
    public final qgi b() {
        try {
            this.e.i();
            return this.f.a();
        } catch (Throwable th) {
            return new qgi(this.f.a().a(sxo.a, new qfk(th, 0)));
        }
    }
}
