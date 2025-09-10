package defpackage;

import android.opengl.GLES20;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qjb implements qjh {
    final /* synthetic */ String a;
    final /* synthetic */ float b;
    final /* synthetic */ float c;

    public qjb(String str, float f, float f2) {
        this.a = str;
        this.b = f;
        this.c = f2;
    }

    @Override // defpackage.qjh
    public final void a(qkg qkgVar) {
        GLES20.glUniform2f(qkgVar.b(this.a), this.b, this.c);
    }
}
