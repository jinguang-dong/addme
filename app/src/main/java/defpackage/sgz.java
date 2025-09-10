package defpackage;

import com.bumptech.glide.qd.MyBPCgKwEjJI;
import com.google.android.apps.camera.ui.hotshot.yElM.PNlJufQ;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class sgz extends sij {
    public Object[] a = new Object[8];
    public int b = 0;

    public final int a(shl shlVar) {
        for (int i = 0; i < this.b; i++) {
            if (this.a[i + i].equals(shlVar)) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.sij
    public final int b() {
        return this.b;
    }

    @Override // defpackage.sij
    public final shl c(int i) {
        if (i < this.b) {
            return (shl) this.a[i + i];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // defpackage.sij
    public final Object d(shl shlVar) {
        int iA = a(shlVar);
        if (iA != -1) {
            return shlVar.c(this.a[iA + iA + 1]);
        }
        return null;
    }

    @Override // defpackage.sij
    public final Object e(int i) {
        if (i < this.b) {
            return this.a[i + i + 1];
        }
        throw new IndexOutOfBoundsException();
    }

    final void f(shl shlVar, Object obj) {
        int iA;
        if (!shlVar.b && (iA = a(shlVar)) != -1) {
            obj.getClass();
            this.a[iA + iA + 1] = obj;
            return;
        }
        int i = this.b + 1;
        Object[] objArr = this.a;
        int length = objArr.length;
        if (i + i > length) {
            this.a = Arrays.copyOf(objArr, length + length);
        }
        Object[] objArr2 = this.a;
        int i2 = this.b;
        int i3 = i2 + i2;
        shlVar.getClass();
        objArr2[i3] = shlVar;
        obj.getClass();
        objArr2[i3 + 1] = obj;
        this.b = i2 + 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata{");
        for (int i = 0; i < this.b; i++) {
            sb.append(MyBPCgKwEjJI.SWRJ);
            sb.append(c(i));
            sb.append(PNlJufQ.mMrm);
            sb.append(e(i));
        }
        sb.append(" }");
        return sb.toString();
    }
}
