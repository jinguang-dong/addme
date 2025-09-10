package defpackage;

import android.opengl.EGLExt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class kap implements qfh {
    public final /* synthetic */ long a;
    private final /* synthetic */ int b;

    public /* synthetic */ kap(long j, int i) {
        this.b = i;
        this.a = j;
    }

    @Override // defpackage.qfh
    public final Object a(Object obj) {
        int i = this.b;
        if (i == 0) {
            qjy qjyVar = (qjy) obj;
            qjyVar.i();
            EGLExt.eglPresentationTimeANDROID(qjyVar.f(), qjyVar.g(), this.a);
            qjyVar.k();
            return true;
        }
        if (i == 1) {
            qjy qjyVar2 = (qjy) obj;
            sgv sgvVar = ite.a;
            EGLExt.eglPresentationTimeANDROID(qjyVar2.f(), qjyVar2.g(), this.a);
            return true;
        }
        if (i != 2) {
            qjy qjyVar3 = (qjy) obj;
            EGLExt.eglPresentationTimeANDROID(qjyVar3.f(), qjyVar3.g(), this.a);
            return qfg.a;
        }
        qjy qjyVar4 = (qjy) obj;
        EGLExt.eglPresentationTimeANDROID(qjyVar4.f(), qjyVar4.g(), this.a);
        return true;
    }
}
