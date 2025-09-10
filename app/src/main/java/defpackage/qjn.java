package defpackage;

import com.google.android.libraries.oliveoil.gl.EGLImage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qjn extends qiu {
    private qjn(qin qinVar, qgf qgfVar) {
        super(qinVar, qgfVar);
    }

    public static qjn b(qin qinVar, EGLImage eGLImage) {
        qfq qfqVarA = eGLImage.a();
        qjn qjnVar = new qjn(qinVar, qiu.f(qinVar, new qjm(qinVar, new qhx(qfqVarA), qfqVarA)));
        qjnVar.g(new qig(qjnVar, 1), new qfk(eGLImage, 2, null)).g(qfs.a);
        return qjnVar;
    }

    public final qhv c() {
        return ((qkj) i()).g;
    }

    public final String toString() {
        return getClass().getSimpleName() + "@" + hashCode() + "[layout=" + String.valueOf(c()) + "]";
    }
}
