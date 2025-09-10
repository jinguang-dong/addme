package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ccm implements CharSequence {
    public final List a;
    public final String b;
    public final List c;
    public final List d;

    public ccm(String str, List list) {
        this(true == list.isEmpty() ? null : list, str);
    }

    public final int a() {
        return this.b.length();
    }

    @Override // java.lang.CharSequence
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ccm subSequence(int i, int i2) {
        if (i > i2) {
            cgh.a("start (" + i + ") should be less or equal to end (" + i2 + ')');
        }
        if (i == 0 && i2 == this.b.length()) {
            return this;
        }
        String strSubstring = this.b.substring(i, i2);
        strSubstring.getClass();
        List list = this.a;
        int i3 = cco.a;
        if (i > i2) {
            cgh.a("start (" + i + ") should be less than or equal to end (" + i2 + ')');
        }
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                ccl cclVar = (ccl) list.get(i4);
                int i5 = cclVar.b;
                int i6 = cclVar.c;
                if (cco.b(i, i2, i5, i6)) {
                    Object obj = cclVar.a;
                    int iMax = Math.max(i, i5) - i;
                    int iMin = Math.min(i2, i6) - i;
                    String str = cclVar.d;
                    arrayList2.add(new ccl(obj, iMax, iMin, null));
                }
            }
            if (true != arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        return new ccm(arrayList, strSubstring);
    }

    public final List c(int i) {
        List list = this.a;
        if (list == null) {
            return ufw.a;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            ccl cclVar = (ccl) obj;
            if ((cclVar.a instanceof ccu) && cco.b(0, i, cclVar.b, cclVar.c)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i) {
        return this.b.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccm)) {
            return false;
        }
        ccm ccmVar = (ccm) obj;
        return a.ao(this.b, ccmVar.b) && a.ao(this.a, ccmVar.a);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        List list = this.a;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return a();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.b;
    }

    public /* synthetic */ ccm(String str) {
        this(str, ufw.a);
    }

    public ccm(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.a = list;
        this.b = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                ccl cclVar = (ccl) list.get(i);
                Object obj = cclVar.a;
                if (obj instanceof cdh) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    cclVar.getClass();
                    arrayList.add(cclVar);
                } else if (obj instanceof cdb) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    cclVar.getClass();
                    arrayList2.add(cclVar);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.c = arrayList;
        this.d = arrayList2;
        List listBM = arrayList2 != null ? ske.bM(arrayList2, new ccn(1)) : null;
        if (listBM == null || listBM.isEmpty()) {
            return;
        }
        yo yoVarA = yp.a(((ccl) ske.bB(listBM)).c);
        int size2 = listBM.size();
        for (int i2 = 1; i2 < size2; i2++) {
            ccl cclVar2 = (ccl) listBM.get(i2);
            while (true) {
                if (yoVarA.b == 0) {
                    break;
                }
                int iB = yoVarA.b();
                if (cclVar2.b >= iB) {
                    yoVarA.c(yoVarA.b - 1);
                } else if (cclVar2.c > iB) {
                    cgh.a("Paragraph overlap not allowed, end " + cclVar2.c + " should be less than or equal to " + iB);
                }
            }
            yoVarA.f(cclVar2.c);
        }
    }
}
