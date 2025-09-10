package defpackage;

import androidx.wear.ambient.AmbientLifecycleObserver;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class scf {
    public Object a;

    public scf() {
    }

    public static /* synthetic */ void b(scf scfVar, dlr dlrVar, und undVar, byz byzVar, int i) {
        dlrVar.c();
        for (dml dmlVar : (dml[]) scfVar.a) {
        }
        int length = ((dml[]) scfVar.a).length;
        for (int i2 = 1; i2 < length; i2++) {
            dml dmlVar2 = ((dml[]) scfVar.a)[i2];
            if (dmlVar2 != null) {
                dmlVar2.c();
            }
        }
        Object obj = scfVar.a;
        if (((dml[]) obj).length != 1) {
            Object[] objArrCopyOf = Arrays.copyOf((Object[]) obj, 1);
            objArrCopyOf.getClass();
            scfVar.a = (dml[]) objArrCopyOf;
        }
        for (int i3 = 0; i3 <= 0; i3++) {
            if (AmbientLifecycleObserver.AmbientLifecycleCallback.CC.i(dlrVar.d()) != null) {
                if (((dml[]) scfVar.a)[i3] != null) {
                    throw null;
                }
                dml dmlVar3 = new dml(undVar, byzVar, i);
                ((dml[]) scfVar.a)[i3] = dmlVar3;
                dmlVar3.d = dlrVar.a();
                throw null;
            }
            dml dmlVar4 = ((dml[]) scfVar.a)[i3];
            if (dmlVar4 != null) {
                dmlVar4.c();
            }
            ((dml[]) scfVar.a)[i3] = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final Map a() {
        ?? r0 = this.a;
        if (r0 != 0) {
            return r0;
        }
        rzf rzfVar = new rzf();
        this.a = rzfVar;
        return rzfVar;
    }

    public scf(Object obj) {
        this.a = obj;
    }

    public scf(qlr qlrVar) {
        this.a = qlrVar;
    }

    public scf(byte[] bArr, char[] cArr, byte[] bArr2) {
        this.a = dmo.a;
    }

    public scf(SwipeDismissBehavior swipeDismissBehavior) {
        swipeDismissBehavior.d = SwipeDismissBehavior.b(0.1f);
        swipeDismissBehavior.e = SwipeDismissBehavior.b(0.6f);
        swipeDismissBehavior.c = 0;
    }

    public scf(char[] cArr, byte[] bArr, byte[] bArr2) {
        a.I(true);
        this.a = ByteBuffer.allocateDirect(0);
    }
}
