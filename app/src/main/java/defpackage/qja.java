package defpackage;

import android.opengl.GLES20;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qja implements qjh {
    final /* synthetic */ String a;
    final /* synthetic */ float b;

    public qja(String str, float f) {
        this.a = str;
        this.b = f;
    }

    @Override // defpackage.qjh
    public final void a(qkg qkgVar) {
        GLES20.glUniform1f(qkgVar.b(this.a), this.b);
    }
}
