package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import com.google.android.libraries.oliveoil.gl.EGLImage;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class qim extends qiu {
    public qim(qin qinVar, qgf qgfVar) {
        super(qinVar, qgfVar);
    }

    public static qim b(qin qinVar, EGLImage eGLImage) {
        if (eGLImage.c.getFormat() == 1) {
            return new qim(qinVar, qiu.f(qinVar, new qii(qinVar, eGLImage)));
        }
        qjn qjnVarB = qjn.b(qinVar, eGLImage);
        qin qinVar2 = qjnVarB.b;
        qhv qhvVarC = qjnVarB.c();
        qki qkiVar = new qki(qinVar2.f(), ((qkj) qjnVarB.i()).b, ((qkj) qjnVarB.i()).c, qhvVarC);
        qkiVar.f = true;
        qml qmlVar = new qml(new qko(qinVar2, new qge(qkiVar, 0)));
        qin qinVar3 = ((qko) qmlVar.c()).b;
        return new qil(qinVar3, qiu.f(qinVar3, new qij(qmlVar, 0)), qjnVarB);
    }

    public static qim c(qin qinVar, final qmn qmnVar, final qfq qfqVar) {
        return new qim(qinVar, qinVar.d().g(new qig(qfqVar, 2), new qfh() { // from class: qih
            @Override // defpackage.qfh
            public final Object a(Object obj) {
                qjy qjyVar = (qjy) obj;
                EGLDisplay eGLDisplayF = qjyVar.f();
                EGLConfig eGLConfigD = qjyVar.d();
                qmn qmnVar2 = qmnVar;
                qmo qmoVar = new qmo(new qkw(eGLDisplayF, EGL14.eglCreateWindowSurface(eGLDisplayF, eGLConfigD, qmnVar2.c(), new int[]{12344}, 0)), Arrays.asList(qmnVar2));
                return new qka(qjyVar.h(), qjyVar.f(), (EGLSurface) qmoVar.c(), qjyVar.e(), qjyVar.d(), (qhv) qpt.E(qjyVar.l(), qfqVar), qjyVar, qmoVar);
            }
        }));
    }

    public static qim d(qmn qmnVar) {
        qin qinVar = ((qko) qmnVar.c()).b;
        return new qim(qinVar, qiu.f(qinVar, new qij(qmnVar, 1)));
    }

    public final qhv e() {
        return ((qjy) i()).l();
    }
}
