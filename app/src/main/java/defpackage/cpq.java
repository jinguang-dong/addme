package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cpq {
    public static int c;
    public final Object a;
    public Object b;

    public cpq() {
    }

    protected final void a(int i) {
        View decorView = ((Window) this.b).getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    protected final void b(int i) {
        View decorView = ((Window) this.b).getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    public final long c(cjz cjzVar, long j) {
        ckh ckhVar = cjzVar.d;
        if (ckhVar instanceof ckd) {
            return j;
        }
        List list = cjzVar.j;
        int size = list.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            cjx cjxVar = (cjx) list.get(i);
            if (cjxVar instanceof cjz) {
                cjz cjzVar2 = (cjz) cjxVar;
                if (cjzVar2.d != ckhVar) {
                    jMin = Math.min(jMin, c(cjzVar2, cjzVar2.e + j));
                }
            }
        }
        if (cjzVar != ckhVar.i) {
            return jMin;
        }
        long jA = ckhVar.a();
        long j2 = j - jA;
        return Math.min(Math.min(jMin, c(ckhVar.h, j2)), j2 - r10.e);
    }

    public final long d(cjz cjzVar, long j) {
        ckh ckhVar = cjzVar.d;
        if (ckhVar instanceof ckd) {
            return j;
        }
        List list = cjzVar.j;
        int size = list.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            cjx cjxVar = (cjx) list.get(i);
            if (cjxVar instanceof cjz) {
                cjz cjzVar2 = (cjz) cjxVar;
                if (cjzVar2.d != ckhVar) {
                    jMax = Math.max(jMax, d(cjzVar2, cjzVar2.e + j));
                }
            }
        }
        if (cjzVar != ckhVar.h) {
            return jMax;
        }
        long jA = ckhVar.a();
        long j2 = j + jA;
        return Math.max(Math.max(jMax, d(ckhVar.i, j2)), j2 - r10.e);
    }

    public cpq(ccm ccmVar) {
        this.a = ccmVar;
        this.b = ccmVar;
    }

    public cpq(List list, MotionEvent motionEvent) {
        this.a = list;
        this.b = motionEvent;
    }

    public cpq(ckh ckhVar) {
        this.b = null;
        this.a = new ArrayList();
        c++;
        this.b = ckhVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cpq(Window window) {
        this();
        WindowInsetsController insetsController = window.getInsetsController();
        new aaa();
        this.a = insetsController;
        this.b = window;
    }

    public cpq(Window window, byte[] bArr) {
        this(window);
    }
}
