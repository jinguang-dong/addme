package defpackage;

import android.text.TextUtils;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cyr {
    public final String a;
    public final List b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final String g;
    public final String h;
    public final int i;
    public final List j;
    public final int k;
    public final int l;
    public final float m;
    public final int n;
    public final float o;
    public final cyp p;
    public final int q;
    public final int r;
    public final int s;
    private int t;

    static {
        new cyr(new cyq());
        cza.g(0);
        cza.g(1);
        cza.g(2);
        cza.g(3);
        cza.g(4);
        cza.g(5);
        cza.g(6);
        cza.g(7);
        cza.g(8);
        cza.g(9);
        cza.g(10);
        cza.g(11);
        cza.g(12);
        cza.g(13);
        cza.g(14);
        cza.g(15);
        cza.g(16);
        cza.g(17);
        cza.g(18);
        cza.g(19);
        cza.g(20);
        cza.g(21);
        cza.g(22);
        cza.g(23);
        cza.g(24);
        cza.g(25);
        cza.g(26);
        cza.g(27);
        cza.g(28);
        cza.g(29);
        cza.g(30);
        cza.g(31);
        cza.g(32);
        cza.g(33);
        cza.g(34);
        cza.g(35);
        cza.g(36);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public cyr(cyq cyqVar) {
        String strD;
        boolean z;
        this.a = cyqVar.a;
        String str = cyqVar.c;
        byte[] bArr = cza.a;
        if (str == null) {
            strD = null;
        } else {
            String strReplace = str.replace('_', '-');
            if (!strReplace.isEmpty() && !strReplace.equals("und")) {
                str = strReplace;
            }
            strD = rup.d(str);
            String str2 = strD.split("-", 2)[0];
            if (cza.b == null) {
                cza.b = cza.c();
            }
            String str3 = (String) cza.b.get(str2);
            if (str3 != null) {
                strD = str3.concat(String.valueOf(strD.substring(str2.length())));
                str2 = str3;
            }
            if ("no".equals(str2) || "i".equals(str2) || "zh".equals(str2)) {
                int i = 0;
                while (true) {
                    String[] strArr = cza.c;
                    int length = strArr.length;
                    if (i >= 18) {
                        break;
                    }
                    if (strD.startsWith(strArr[i])) {
                        strD = String.valueOf(strArr[i + 1]).concat(String.valueOf(strD.substring(strArr[i].length())));
                        break;
                    }
                    i += 2;
                }
            }
        }
        this.c = strD;
        cyqVar.b.isEmpty();
        if (!cyqVar.b.isEmpty()) {
            this.b = cyqVar.b;
            List list = cyqVar.b;
            sgk it = ((sbp) list).iterator();
            while (true) {
                if (!it.hasNext()) {
                    String str4 = ((cys) list.get(0)).b;
                    break;
                }
                cys cysVar = (cys) it.next();
                String str5 = cysVar.a;
                if (TextUtils.equals(null, strD)) {
                    String str6 = cysVar.b;
                    break;
                }
            }
        } else {
            if (cyqVar.b.isEmpty()) {
                z = true;
            } else {
                List list2 = cyqVar.b;
                if (((sex) list2).c > 0) {
                    String str7 = ((cys) list2.get(0)).b;
                    throw null;
                }
                z = false;
            }
            coi.x(z);
            this.b = cyqVar.b;
        }
        coi.y(true, "Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set");
        int i2 = cyqVar.d;
        this.d = i2;
        int i3 = cyqVar.e;
        this.e = i3;
        this.f = i3 != -1 ? i3 : i2;
        this.g = cyqVar.f;
        this.h = cyqVar.g;
        this.i = cyqVar.h;
        List list3 = cyqVar.i;
        this.j = list3 == null ? Collections.EMPTY_LIST : list3;
        this.k = cyqVar.j;
        this.l = cyqVar.k;
        this.m = cyqVar.l;
        int i4 = cyqVar.m;
        this.n = i4 != -1 ? i4 : 0;
        float f = cyqVar.n;
        this.o = f == -1.0f ? 1.0f : f;
        this.p = cyqVar.o;
        this.q = cyqVar.p;
        this.r = cyqVar.q;
        this.s = cyqVar.r;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cyr cyrVar = (cyr) obj;
            int i2 = this.t;
            if ((i2 == 0 || (i = cyrVar.t) == 0 || i2 == i) && this.d == cyrVar.d && this.e == cyrVar.e && this.i == cyrVar.i && this.k == cyrVar.k && this.l == cyrVar.l && this.n == cyrVar.n && this.q == cyrVar.q && this.r == cyrVar.r && this.s == cyrVar.s && Float.compare(this.m, cyrVar.m) == 0 && Float.compare(this.o, cyrVar.o) == 0 && Objects.equals(this.a, cyrVar.a) && Objects.equals(null, null) && ujp.aH(this.b, cyrVar.b) && Objects.equals(this.g, cyrVar.g) && Objects.equals(null, null) && Objects.equals(this.h, cyrVar.h) && Objects.equals(this.c, cyrVar.c) && Arrays.equals((byte[]) null, (byte[]) null) && Objects.equals(null, null) && Objects.equals(this.p, cyrVar.p) && Objects.equals(null, null)) {
                List list = this.j;
                List list2 = cyrVar.j;
                if (list.size() == list2.size()) {
                    int i3 = 0;
                    while (true) {
                        if (i3 < list.size()) {
                            if (!Arrays.equals((byte[]) list.get(i3), (byte[]) list2.get(i3))) {
                                break;
                            }
                            i3++;
                        } else if (Objects.equals(null, null)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.t;
        if (i != 0) {
            return i;
        }
        String str = this.a;
        int iHashCode = (((str == null ? 0 : str.hashCode()) + 527) * 961) + this.b.hashCode();
        String str2 = this.c;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i2 = iHashCode * 31;
        int i3 = this.d;
        int i4 = this.e;
        String str3 = this.g;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        int i5 = (((((i2 + iHashCode2) * 923521) + i3) * 31) + i4) * 31;
        int iHashCode4 = (((((((((((((((((((((((((((((((((((((i5 + iHashCode3) * 923521) + (this.h != null ? r3.hashCode() : 0)) * 31) + this.i) * 31) + ((int) Long.MAX_VALUE)) * 31) + this.k) * 31) + this.l) * 31) - 1) * 31) - 1) * 31) + Float.floatToIntBits(this.m)) * 31) + this.n) * 31) + Float.floatToIntBits(this.o)) * 31) - 1) * 31) - 1) * 31) + this.q) * 31) + this.r) * 31) + this.s) * 29791) - 1) * 31) - 1) * 31) - 1) * 31;
        this.t = iHashCode4;
        return iHashCode4;
    }

    public final String toString() {
        return "Format(" + this.a + ", null, null, " + this.h + ", " + this.g + ", " + this.f + ", " + this.c + ", [" + this.k + ", " + this.l + ", " + this.m + ", " + String.valueOf(this.p) + "], [" + this.q + ", " + this.r + "])";
    }
}
