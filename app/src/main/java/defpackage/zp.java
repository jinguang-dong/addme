package defpackage;

import androidx.compose.foundation.text.modifiers.Yk.LmJPKwPBa;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zp {
    public static final Object[] a = new Object[0];
    public static final zo b = new zo(0);

    public static final void a(List list, int i) {
        int size = list.size();
        if (i < 0 || i >= size) {
            a.bn(a.bD(size, i, "Index ", " is out of bounds. The list has ", " elements."));
        }
    }

    public static final zo c(Object obj, Object obj2) {
        zo zoVar = new zo(2);
        zoVar.o(obj);
        zoVar.o(obj2);
        return zoVar;
    }

    public static final void b(List list, int i, int i2) {
        int size = list.size();
        if (i > i2) {
            a.bl(a.bD(i2, i, "Indices are out of order. fromIndex (", ") is greater than toIndex (", LmJPKwPBa.IDJRcdO));
        }
        if (i < 0) {
            a.bn(a.bE(i, "fromIndex (", ") is less than 0."));
        }
        if (i2 > size) {
            a.bn("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
        }
    }
}
