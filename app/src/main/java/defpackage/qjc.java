package defpackage;

import android.opengl.GLES20;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qjc implements qjh {
    final /* synthetic */ String a;
    final /* synthetic */ float b;
    final /* synthetic */ float c;
    final /* synthetic */ float d;

    public qjc(String str, float f, float f2, float f3) {
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
    }

    @Override // defpackage.qjh
    public final void a(qkg qkgVar) {
        GLES20.glUniform3f(qkgVar.b(this.a), this.b, this.c, this.d);
    }
}
