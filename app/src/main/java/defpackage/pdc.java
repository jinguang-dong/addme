package defpackage;

import android.util.SparseArray;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pdc {
    public static final int[] a = {0, 1, 2, 3, 4};
    public final int b;
    private final SparseArray d = new SparseArray();
    public int c = 0;

    public pdc(int i) {
        this.b = i;
    }

    private static int f(short s) {
        return (char) s;
    }

    protected final int a() {
        return this.d.size();
    }

    public final pcz b(short s) {
        return (pcz) this.d.get(f(s));
    }

    protected final void c(short s) {
        this.d.remove(f(s));
    }

    protected final pcz[] d() {
        SparseArray sparseArray = this.d;
        int size = sparseArray.size();
        pcz[] pczVarArr = new pcz[size];
        for (int i = 0; i < size; i++) {
            pczVarArr[i] = (pcz) sparseArray.valueAt(i);
        }
        return pczVarArr;
    }

    public final void e(pcz pczVar) {
        pczVar.e = this.b;
        SparseArray sparseArray = this.d;
        int iF = f(pczVar.a);
        sparseArray.put(iF, pczVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof pdc)) {
            pdc pdcVar = (pdc) obj;
            if (pdcVar.b == this.b && pdcVar.a() == a()) {
                for (pcz pczVar : pdcVar.d()) {
                    if (pczVar != null) {
                        short s = pczVar.a;
                        if (!ExifInterface.t(s) && !pczVar.equals((pcz) this.d.get(f(s)))) {
                            return false;
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), this.d});
    }
}
