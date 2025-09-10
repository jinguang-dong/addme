package defpackage;

import android.opengl.GLES20;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qiz implements qjh {
    final /* synthetic */ String a = "shouldRenderPipScrim";
    final /* synthetic */ int b;

    public qiz(int i) {
        this.b = i;
    }

    @Override // defpackage.qjh
    public final void a(qkg qkgVar) {
        GLES20.glUniform1i(qkgVar.b(this.a), this.b);
    }
}
