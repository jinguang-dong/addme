package defpackage;

import android.content.res.TypedArray;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nye {
    public final int[] a;
    public boolean c = false;
    public final int[] b = new int[12];

    public nye(int[] iArr) {
        this.a = iArr;
    }

    public static final boolean a(TypedArray typedArray, int i) {
        return typedArray.hasValue(i) && typedArray.getType(i) != 2;
    }
}
