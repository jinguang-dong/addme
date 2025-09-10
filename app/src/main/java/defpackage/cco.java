package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cco {
    public static final /* synthetic */ int a = 0;

    static {
        new ccm("");
    }

    public static final List a(ccm ccmVar, int i, int i2, uiq uiqVar) {
        List list;
        if (i == i2 || (list = ccmVar.a) == null) {
            return null;
        }
        int i3 = 0;
        if (i == 0) {
            if (i2 >= ccmVar.b.length()) {
                if (uiqVar == null) {
                    return list;
                }
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                while (i3 < size) {
                    Object obj = list.get(i3);
                    if (((Boolean) uiqVar.a(((ccl) obj).a)).booleanValue()) {
                        arrayList.add(obj);
                    }
                    i3++;
                }
                return arrayList;
            }
            i = 0;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        while (i3 < size2) {
            ccl cclVar = (ccl) list.get(i3);
            if (uiqVar == null || ((Boolean) uiqVar.a(cclVar.a)).booleanValue()) {
                int i4 = cclVar.b;
                int i5 = cclVar.c;
                if (b(i, i2, i4, i5)) {
                    String str = cclVar.d;
                    arrayList2.add(new ccl((cci) cclVar.a, ukc.p(i4, i, i2) - i, ukc.p(i5, i, i2) - i, null));
                }
            }
            i3++;
        }
        return arrayList2;
    }

    public static final boolean b(int i, int i2, int i3, int i4) {
        return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
    }
}
