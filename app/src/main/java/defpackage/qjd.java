package defpackage;

import android.opengl.GLES20;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qjd implements qjh {
    final /* synthetic */ String a;
    final /* synthetic */ float b;
    final /* synthetic */ float c;
    final /* synthetic */ float d;
    final /* synthetic */ float e;

    public qjd(String str, float f, float f2, float f3, float f4) {
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    @Override // defpackage.qjh
    public final void a(qkg qkgVar) {
        GLES20.glUniform4f(qkgVar.b(this.a), this.b, this.c, this.d, this.e);
    }
}
