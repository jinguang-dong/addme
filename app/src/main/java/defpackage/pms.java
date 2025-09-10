package defpackage;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pms implements Comparator {
    private final Comparator[] a;

    public pms(Comparator[] comparatorArr) {
        this.a = comparatorArr;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Object[] objArr = ((pmr) obj).b;
        Object[] objArr2 = ((pmr) obj2).b;
        int length = objArr.length;
        Comparator[] comparatorArr = this.a;
        int length2 = comparatorArr.length;
        if (length == length2 && objArr2.length == length2) {
            for (int i = 0; i < comparatorArr.length; i++) {
                int iCompare = comparatorArr[i].compare(objArr[i], objArr2[i]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return 0;
        }
        throw new IllegalArgumentException("Unable to compare " + Arrays.toString(objArr) + " to " + Arrays.toString(objArr2) + " because the lengths are different from " + length2);
    }
}
